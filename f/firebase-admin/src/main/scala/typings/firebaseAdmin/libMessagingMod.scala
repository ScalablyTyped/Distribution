package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMessagingMod {
  
  @JSImport("firebase-admin/lib/messaging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/messaging", "Messaging")
  @js.native
  open class Messaging ()
    extends typings.firebaseAdmin.libMessagingMessagingMod.Messaging
  
  inline def getMessaging(): typings.firebaseAdmin.libMessagingMessagingMod.Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessaging")().asInstanceOf[typings.firebaseAdmin.libMessagingMessagingMod.Messaging]
  inline def getMessaging(app: App): typings.firebaseAdmin.libMessagingMessagingMod.Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessaging")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.libMessagingMessagingMod.Messaging]
}
