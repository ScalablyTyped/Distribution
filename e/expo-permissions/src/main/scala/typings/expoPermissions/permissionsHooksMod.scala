package typings.expoPermissions

import typings.expoPermissions.permissionsTypesMod.PermissionResponse
import typings.expoPermissions.permissionsTypesMod.PermissionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissionsHooksMod {
  
  @JSImport("expo-permissions/build/PermissionsHooks", "usePermissions")
  @js.native
  def usePermissions(`type`: js.Array[PermissionType]): js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ] = js.native
  @JSImport("expo-permissions/build/PermissionsHooks", "usePermissions")
  @js.native
  def usePermissions(`type`: js.Array[PermissionType], options: PermissionsOptions): js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ] = js.native
  @JSImport("expo-permissions/build/PermissionsHooks", "usePermissions")
  @js.native
  def usePermissions(`type`: PermissionType): js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ] = js.native
  @JSImport("expo-permissions/build/PermissionsHooks", "usePermissions")
  @js.native
  def usePermissions(`type`: PermissionType, options: PermissionsOptions): js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ] = js.native
  
  @js.native
  trait PermissionsOptions extends StObject {
    
    /** If it should ask the permissions when mounted, defaults to `false` */
    var ask: js.UndefOr[Boolean] = js.native
    
    /** If it should fetch information about the permissions when mounted, defaults to `true` */
    var get: js.UndefOr[Boolean] = js.native
  }
  object PermissionsOptions {
    
    @scala.inline
    def apply(): PermissionsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PermissionsOptions]
    }
    
    @scala.inline
    implicit class PermissionsOptionsMutableBuilder[Self <: PermissionsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsk(value: Boolean): Self = StObject.set(x, "ask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAskUndefined: Self = StObject.set(x, "ask", js.undefined)
      
      @scala.inline
      def setGet(value: Boolean): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    }
  }
}
