package typings.firebaseMessaging

import typings.firebaseMessaging.distSrcMessagingServiceMod.MessagingService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersRegisterDefaultSwMod {
  
  @JSImport("@firebase/messaging/dist/src/helpers/registerDefaultSw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerDefaultSw(messaging: MessagingService): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDefaultSw")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
