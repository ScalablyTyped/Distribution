package typings.firebaseMessaging

import typings.firebaseMessaging.srcMessagingServiceMod.MessagingService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingFakesMessagingServiceMod {
  
  @JSImport("@firebase/messaging/dist/src/testing/fakes/messaging-service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFakeMessagingService(): MessagingService = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeMessagingService")().asInstanceOf[MessagingService]
}
