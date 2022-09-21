package typings.firebaseMessaging

import typings.firebaseMessaging.messagingServiceMod.MessagingService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerDefaultSwMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/helpers/registerDefaultSw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerDefaultSw(messaging: MessagingService): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDefaultSw")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
