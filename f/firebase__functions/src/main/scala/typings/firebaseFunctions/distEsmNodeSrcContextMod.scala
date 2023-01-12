package typings.firebaseFunctions

import typings.firebaseAppCheckInteropTypes.mod.AppCheckInternalComponentName
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseMessagingInteropTypes.mod.MessagingInternalComponentName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmNodeSrcContextMod {
  
  @JSImport("@firebase/functions/dist/esm-node/src/context", "ContextProvider")
  @js.native
  open class ContextProvider protected () extends StObject {
    def this(
      authProvider: Provider[FirebaseAuthInternalName],
      messagingProvider: Provider[MessagingInternalComponentName],
      appCheckProvider: Provider[AppCheckInternalComponentName]
    ) = this()
    
    /* private */ var appCheck: Any = js.native
    
    /* private */ var auth: Any = js.native
    
    def getAppCheckToken(): js.Promise[String | Null] = js.native
    
    def getAuthToken(): js.Promise[js.UndefOr[String]] = js.native
    
    def getContext(): js.Promise[Context] = js.native
    
    def getMessagingToken(): js.Promise[js.UndefOr[String]] = js.native
    
    /* private */ var messaging: Any = js.native
  }
  
  trait Context extends StObject {
    
    var appCheckToken: String | Null
    
    var authToken: js.UndefOr[String] = js.undefined
    
    var messagingToken: js.UndefOr[String] = js.undefined
  }
  object Context {
    
    inline def apply(): Context = {
      val __obj = js.Dynamic.literal(appCheckToken = null)
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setAppCheckToken(value: String): Self = StObject.set(x, "appCheckToken", value.asInstanceOf[js.Any])
      
      inline def setAppCheckTokenNull: Self = StObject.set(x, "appCheckToken", null)
      
      inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      inline def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
      
      inline def setMessagingToken(value: String): Self = StObject.set(x, "messagingToken", value.asInstanceOf[js.Any])
      
      inline def setMessagingTokenUndefined: Self = StObject.set(x, "messagingToken", js.undefined)
    }
  }
}
