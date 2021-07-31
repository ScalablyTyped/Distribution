package typings.firebaseFunctions

import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseMessagingTypes.mod.FirebaseMessagingName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("@firebase/functions/dist/src/context", "ContextProvider")
  @js.native
  class ContextProvider protected () extends StObject {
    def this(
      authProvider: Provider[FirebaseAuthInternalName],
      messagingProvider: Provider[FirebaseMessagingName]
    ) = this()
    
    var auth: js.Any = js.native
    
    def getAuthToken(): js.Promise[js.UndefOr[String]] = js.native
    
    def getContext(): js.Promise[Context] = js.native
    
    def getInstanceIdToken(): js.Promise[js.UndefOr[String]] = js.native
    
    var messaging: js.Any = js.native
  }
  
  trait Context extends StObject {
    
    var authToken: js.UndefOr[String] = js.undefined
    
    var instanceIdToken: js.UndefOr[String] = js.undefined
  }
  object Context {
    
    @scala.inline
    def apply(): Context = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
      
      @scala.inline
      def setInstanceIdToken(value: String): Self = StObject.set(x, "instanceIdToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdTokenUndefined: Self = StObject.set(x, "instanceIdToken", js.undefined)
    }
  }
}
