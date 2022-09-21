package typings.expoModulesCore

import typings.expoModulesCore.permissionsInterfaceMod.PermissionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissionsHookMod {
  
  @JSImport("expo-modules-core/build/PermissionsHook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPermissionHook[Permission /* <: PermissionResponse */, Options /* <: js.Object */](methods: PermissionHookMethods[Permission, Options]): js.Function1[
    /* options */ js.UndefOr[PermissionHookOptions[Options]], 
    js.Tuple3[
      Permission | Null, 
      RequestPermissionMethod[Permission], 
      GetPermissionMethod[Permission]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPermissionHook")(methods.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* options */ js.UndefOr[PermissionHookOptions[Options]], 
    js.Tuple3[
      Permission | Null, 
      RequestPermissionMethod[Permission], 
      GetPermissionMethod[Permission]
    ]
  ]]
  
  type GetPermissionMethod[Permission /* <: PermissionResponse */] = js.Function0[js.Promise[Permission]]
  
  trait PermissionHookBehavior extends StObject {
    
    /** If the hook should automatically fetch the current permission status, without asking the user. */
    var get: js.UndefOr[Boolean] = js.undefined
    
    /** If the hook should automatically request the user to grant permission. */
    var request: js.UndefOr[Boolean] = js.undefined
  }
  object PermissionHookBehavior {
    
    inline def apply(): PermissionHookBehavior = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PermissionHookBehavior]
    }
    
    extension [Self <: PermissionHookBehavior](x: Self) {
      
      inline def setGet(value: Boolean): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setRequest(value: Boolean): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    }
  }
  
  @js.native
  trait PermissionHookMethods[Permission /* <: PermissionResponse */, Options] extends StObject {
    
    /** The permission method that only fetches the current permission status. */
    def getMethod(): js.Promise[Permission] = js.native
    def getMethod(options: Options): js.Promise[Permission] = js.native
    
    /** The permission method that requests the user to grant permission. */
    def requestMethod(): js.Promise[Permission] = js.native
    def requestMethod(options: Options): js.Promise[Permission] = js.native
  }
  
  type PermissionHookOptions[Options /* <: js.Object */] = PermissionHookBehavior & Options
  
  type RequestPermissionMethod[Permission /* <: PermissionResponse */] = js.Function0[js.Promise[Permission]]
}
