package typings.firebaseMessaging

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseMessaging.distSrcInterfacesPublicTypesMod.GetTokenOptions
import typings.firebaseMessaging.distSrcInterfacesPublicTypesMod.MessagePayload
import typings.firebaseMessaging.distSrcInterfacesPublicTypesMod.Messaging
import typings.firebaseUtil.mod.NextFn
import typings.firebaseUtil.mod.Observer
import typings.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMod {
  
  @JSImport("@firebase/messaging/dist/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteToken(messaging: Messaging): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteToken")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def getMessaging(): Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessaging")().asInstanceOf[Messaging]
  inline def getMessaging(app: FirebaseApp): Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessaging")(app.asInstanceOf[js.Any]).asInstanceOf[Messaging]
  
  inline def getToken(messaging: Messaging): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getToken(messaging: Messaging, options: GetTokenOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(messaging.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def isSupported(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[js.Promise[Boolean]]
  
  inline def onMessage(messaging: Messaging, nextOrObserver: NextFn[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onMessage(messaging: Messaging, nextOrObserver: Observer[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var messaging: Messaging
    }
    object NameServiceMapping {
      
      inline def apply(messaging: Messaging): NameServiceMapping = {
        val __obj = js.Dynamic.literal(messaging = messaging.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setMessaging(value: Messaging): Self = StObject.set(x, "messaging", value.asInstanceOf[js.Any])
      }
    }
  }
}
