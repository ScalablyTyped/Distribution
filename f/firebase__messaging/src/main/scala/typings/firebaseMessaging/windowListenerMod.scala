package typings.firebaseMessaging

import typings.firebaseMessaging.messagingServiceMod.MessagingService
import typings.std.MessageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowListenerMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/listeners/window-listener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def messageEventListener(messaging: MessagingService, event: MessageEvent[Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("messageEventListener")(messaging.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
