package typings.firebaseMessagingCompat

import typings.firebaseMessaging.mod.GetTokenOptions
import typings.firebaseMessaging.mod.MessagePayload
import typings.firebaseMessaging.mod.Messaging
import typings.firebaseMessagingCompat.appCompatMod.FirebaseApp
import typings.firebaseMessagingCompat.distSrcMessagingCompatMod.MessagingCompat
import typings.firebaseUtil.mod.NextFn
import typings.firebaseUtil.mod.Observer
import typings.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object messagingMod {
  
  @JSImport("@firebase/messaging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteToken(messaging: MessagingCompat): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteToken")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def getMessaging(app: js.UndefOr[FirebaseApp]): Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessaging")(app.asInstanceOf[js.Any]).asInstanceOf[Messaging]
  
  inline def getToken(messaging: MessagingCompat, options: js.UndefOr[GetTokenOptions]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(messaging.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def onMessage(messaging: MessagingCompat, nextOrObserver: NextFn[MessagePayload] | Observer[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
}
