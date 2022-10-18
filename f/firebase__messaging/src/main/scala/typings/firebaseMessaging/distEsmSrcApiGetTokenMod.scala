package typings.firebaseMessaging

import typings.firebaseMessaging.distEsmSrcInterfacesPublicTypesMod.GetTokenOptions
import typings.firebaseMessaging.distEsmSrcMessagingServiceMod.MessagingService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcApiGetTokenMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/api/getToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getToken(messaging: MessagingService): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getToken(messaging: MessagingService, options: GetTokenOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(messaging.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
