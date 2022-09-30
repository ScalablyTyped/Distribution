package typings.firebaseAdmin

import typings.firebaseAdmin.messagingApiMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagingInternalMod {
  
  @JSImport("firebase-admin/lib/messaging/messaging-internal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/messaging/messaging-internal", "BLACKLISTED_DATA_PAYLOAD_KEYS")
  @js.native
  val BLACKLISTED_DATA_PAYLOAD_KEYS: js.Array[String] = js.native
  
  @JSImport("firebase-admin/lib/messaging/messaging-internal", "BLACKLISTED_OPTIONS_KEYS")
  @js.native
  val BLACKLISTED_OPTIONS_KEYS: js.Array[String] = js.native
  
  inline def validateMessage(message: Message): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateMessage")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
