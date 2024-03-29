package typings.firebaseAuth

import typings.firebaseAuth.distBrowserCjsSrcModelAuthMod.AuthInternal
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsSrcCoreAuthFirebaseInternalMod {
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/core/auth/firebase_internal", "AuthInterop")
  @js.native
  open class AuthInterop protected ()
    extends StObject
       with FirebaseAuthInternal {
    def this(auth: AuthInternal) = this()
    
    /* private */ var assertAuthConfigured: Any = js.native
    
    /* private */ val auth: Any = js.native
    
    /* private */ val internalListeners: Any = js.native
    
    /* private */ var updateProactiveRefresh: Any = js.native
  }
  
  type TokenListener = js.Function1[/* tok */ String | Null, Any]
}
