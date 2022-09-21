package typings.firebaseMessaging

import typings.firebaseMessaging.interfacesPublicTypesMod.MessagePayload
import typings.firebaseMessaging.srcMessagingServiceMod.MessagingService
import typings.firebaseUtil.mod.NextFn
import typings.firebaseUtil.mod.Observer
import typings.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiOnBackgroundMessageMod {
  
  @JSImport("@firebase/messaging/dist/src/api/onBackgroundMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onBackgroundMessage(messaging: MessagingService, nextOrObserver: NextFn[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onBackgroundMessage(messaging: MessagingService, nextOrObserver: Observer[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onBackgroundMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
}
