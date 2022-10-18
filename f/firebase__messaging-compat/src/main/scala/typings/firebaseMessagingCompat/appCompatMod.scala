package typings.firebaseMessagingCompat

import typings.firebaseMessagingCompat.anon.Call
import typings.firebaseMessagingCompat.distSrcMessagingCompatMod.MessagingCompat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Define extension behavior of `registerMessaging`
  */
/* augmented module */
object appCompatMod {
  
  trait FirebaseApp extends StObject {
    
    def messaging(): MessagingCompat
  }
  object FirebaseApp {
    
    inline def apply(messaging: () => MessagingCompat): FirebaseApp = {
      val __obj = js.Dynamic.literal(messaging = js.Any.fromFunction0(messaging))
      __obj.asInstanceOf[FirebaseApp]
    }
    
    extension [Self <: FirebaseApp](x: Self) {
      
      inline def setMessaging(value: () => MessagingCompat): Self = StObject.set(x, "messaging", js.Any.fromFunction0(value))
    }
  }
  
  trait FirebaseNamespace extends StObject {
    
    def messaging(): MessagingCompat
    def messaging(app: FirebaseApp): MessagingCompat
    @JSName("messaging")
    var messaging_Original: Call
  }
  object FirebaseNamespace {
    
    inline def apply(messaging: Call): FirebaseNamespace = {
      val __obj = js.Dynamic.literal(messaging = messaging.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseNamespace]
    }
    
    extension [Self <: FirebaseNamespace](x: Self) {
      
      inline def setMessaging(value: Call): Self = StObject.set(x, "messaging", value.asInstanceOf[js.Any])
    }
  }
}
