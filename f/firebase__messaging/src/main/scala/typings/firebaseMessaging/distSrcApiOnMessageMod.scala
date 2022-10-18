package typings.firebaseMessaging

import typings.firebaseMessaging.distSrcInterfacesPublicTypesMod.MessagePayload
import typings.firebaseMessaging.distSrcMessagingServiceMod.MessagingService
import typings.firebaseUtil.mod.NextFn
import typings.firebaseUtil.mod.Observer
import typings.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiOnMessageMod {
  
  @JSImport("@firebase/messaging/dist/src/api/onMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onMessage(messaging: MessagingService, nextOrObserver: NextFn[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onMessage(messaging: MessagingService, nextOrObserver: Observer[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
}
