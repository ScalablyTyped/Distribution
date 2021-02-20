package typings.firebaseMessaging

import typings.firebaseMessaging.anon.Call
import typings.firebaseMessagingTypes.mod.FirebaseMessaging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Define extension behavior of `registerMessaging`
  */
object mod {
  
  @js.native
  trait FirebaseApp extends StObject {
    
    def messaging(): FirebaseMessaging = js.native
  }
  object FirebaseApp {
    
    @scala.inline
    def apply(messaging: () => FirebaseMessaging): FirebaseApp = {
      val __obj = js.Dynamic.literal(messaging = js.Any.fromFunction0(messaging))
      __obj.asInstanceOf[FirebaseApp]
    }
    
    @scala.inline
    implicit class FirebaseAppMutableBuilder[Self <: FirebaseApp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessaging(value: () => FirebaseMessaging): Self = StObject.set(x, "messaging", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FirebaseNamespace extends StObject {
    
    def messaging(): FirebaseMessaging = js.native
    def messaging(app: FirebaseApp): FirebaseMessaging = js.native
    @JSName("messaging")
    var messaging_Original: Call = js.native
  }
}
