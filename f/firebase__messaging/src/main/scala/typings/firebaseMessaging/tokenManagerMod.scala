package typings.firebaseMessaging

import typings.firebaseMessaging.messagingServiceMod.MessagingService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenManagerMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/internals/token-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteTokenInternal(messaging: MessagingService): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTokenInternal")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def getTokenInternal(messaging: MessagingService): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTokenInternal")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
