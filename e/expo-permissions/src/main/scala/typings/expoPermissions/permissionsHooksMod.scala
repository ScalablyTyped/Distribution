package typings.expoPermissions

import typings.expoPermissions.permissionsTypesMod.PermissionResponse
import typings.expoPermissions.permissionsTypesMod.PermissionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissionsHooksMod {
  
  @JSImport("expo-permissions/build/PermissionsHooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePermissions(`type`: js.Array[PermissionType]): js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePermissions")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ]]
  inline def usePermissions(`type`: js.Array[PermissionType], options: PermissionsOptions): js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("usePermissions")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ]]
  inline def usePermissions(`type`: PermissionType): js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePermissions")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ]]
  inline def usePermissions(`type`: PermissionType, options: PermissionsOptions): js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("usePermissions")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ]]
  
  trait PermissionsOptions extends StObject {
    
    /** If it should ask the permissions when mounted, defaults to `false` */
    var ask: js.UndefOr[Boolean] = js.undefined
    
    /** If it should fetch information about the permissions when mounted, defaults to `true` */
    var get: js.UndefOr[Boolean] = js.undefined
  }
  object PermissionsOptions {
    
    inline def apply(): PermissionsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PermissionsOptions]
    }
    
    extension [Self <: PermissionsOptions](x: Self) {
      
      inline def setAsk(value: Boolean): Self = StObject.set(x, "ask", value.asInstanceOf[js.Any])
      
      inline def setAskUndefined: Self = StObject.set(x, "ask", js.undefined)
      
      inline def setGet(value: Boolean): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    }
  }
}
