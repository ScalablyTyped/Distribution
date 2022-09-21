package typings.firebaseMessaging

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseMessaging.interfacesPublicTypesMod.MessagePayload
import typings.firebaseMessaging.interfacesPublicTypesMod.Messaging
import typings.firebaseUtil.mod.NextFn
import typings.firebaseUtil.mod.Observer
import typings.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexDotswMod {
  
  @JSImport("@firebase/messaging/dist/src/index.sw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def experimentalSetDeliveryMetricsExportedToBigQueryEnabled(messaging: Messaging, enable: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("experimentalSetDeliveryMetricsExportedToBigQueryEnabled")(messaging.asInstanceOf[js.Any], enable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getMessaging(): Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessaging")().asInstanceOf[Messaging]
  inline def getMessaging(app: FirebaseApp): Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessaging")(app.asInstanceOf[js.Any]).asInstanceOf[Messaging]
  
  inline def isSupported(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[js.Promise[Boolean]]
  
  inline def onBackgroundMessage(messaging: Messaging, nextOrObserver: NextFn[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onBackgroundMessage(messaging: Messaging, nextOrObserver: Observer[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var messaging: typings.firebaseMessaging.publicTypesMod.Messaging
    }
    object NameServiceMapping {
      
      inline def apply(messaging: typings.firebaseMessaging.publicTypesMod.Messaging): NameServiceMapping = {
        val __obj = js.Dynamic.literal(messaging = messaging.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setMessaging(value: typings.firebaseMessaging.publicTypesMod.Messaging): Self = StObject.set(x, "messaging", value.asInstanceOf[js.Any])
      }
    }
  }
}
