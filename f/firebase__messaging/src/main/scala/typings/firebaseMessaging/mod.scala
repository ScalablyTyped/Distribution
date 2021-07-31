package typings.firebaseMessaging

import typings.firebaseMessaging.anon.Call
import typings.firebaseMessagingTypes.mod.FirebaseMessaging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Define extension behavior of `registerMessaging`
  */
object mod {
  
  trait FirebaseApp extends StObject {
    
    def messaging(): FirebaseMessaging
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
  
  trait FirebaseNamespace extends StObject {
    
    def messaging(): FirebaseMessaging
    def messaging(app: FirebaseApp): FirebaseMessaging
    @JSName("messaging")
    var messaging_Original: Call
  }
  object FirebaseNamespace {
    
    @scala.inline
    def apply(messaging: Call): FirebaseNamespace = {
      val __obj = js.Dynamic.literal(messaging = messaging.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseNamespace]
    }
    
    @scala.inline
    implicit class FirebaseNamespaceMutableBuilder[Self <: FirebaseNamespace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessaging(value: Call): Self = StObject.set(x, "messaging", value.asInstanceOf[js.Any])
    }
  }
}
