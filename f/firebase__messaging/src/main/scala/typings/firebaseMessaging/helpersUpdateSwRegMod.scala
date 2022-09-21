package typings.firebaseMessaging

import typings.firebaseMessaging.srcMessagingServiceMod.MessagingService
import typings.std.ServiceWorkerRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersUpdateSwRegMod {
  
  @JSImport("@firebase/messaging/dist/src/helpers/updateSwReg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateSwReg(messaging: MessagingService): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSwReg")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def updateSwReg(messaging: MessagingService, swRegistration: ServiceWorkerRegistration): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSwReg")(messaging.asInstanceOf[js.Any], swRegistration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
