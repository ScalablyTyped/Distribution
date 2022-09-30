package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagingMod {
  
  @JSImport("firebase-admin/lib/messaging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/messaging", "Messaging")
  @js.native
  open class Messaging ()
    extends typings.firebaseAdmin.messagingMessagingMod.Messaging
  
  inline def getMessaging(): typings.firebaseAdmin.messagingMessagingMod.Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessaging")().asInstanceOf[typings.firebaseAdmin.messagingMessagingMod.Messaging]
  inline def getMessaging(app: App): typings.firebaseAdmin.messagingMessagingMod.Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessaging")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.messagingMessagingMod.Messaging]
}
