package typings.firebaseMessaging

import typings.firebaseMessaging.distSrcMessagingServiceMod.MessagingService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersUpdateVapidKeyMod {
  
  @JSImport("@firebase/messaging/dist/src/helpers/updateVapidKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateVapidKey(messaging: MessagingService): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateVapidKey")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def updateVapidKey(messaging: MessagingService, vapidKey: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateVapidKey")(messaging.asInstanceOf[js.Any], vapidKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
