package typings.firebaseMessaging

import typings.firebaseMessaging.distSrcInterfacesPublicTypesMod.GetTokenOptions
import typings.firebaseMessaging.distSrcMessagingServiceMod.MessagingService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiGetTokenMod {
  
  @JSImport("@firebase/messaging/dist/src/api/getToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getToken(messaging: MessagingService): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getToken(messaging: MessagingService, options: GetTokenOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(messaging.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
