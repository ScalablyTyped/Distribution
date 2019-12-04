package typings.atFirebaseMessaging

import typings.atFirebaseMessaging.atFirebaseMessagingStrings.`https://fcmregistrationsDOTgoogleapisDOTcom/v1`
import typings.atFirebaseMessaging.atFirebaseMessagingStrings.googleDOTcDOTaDOTc_id
import typings.atFirebaseMessaging.atFirebaseMessagingStrings.googleDOTcDOTaDOTc_l
import typings.atFirebaseMessaging.atFirebaseMessagingStrings.googleDOTcDOTaDOTe
import typings.atFirebaseMessaging.atFirebaseMessagingStrings.googleDOTcDOTaDOTts
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/src/models/fcm-details", JSImport.Namespace)
@js.native
object distSrcModelsFcmDashDetailsMod extends js.Object {
  val DEFAULT_PUBLIC_VAPID_KEY: Uint8Array = js.native
  val ENDPOINT: `https://fcmregistrationsDOTgoogleapisDOTcom/v1` = js.native
  val FN_CAMPAIGN_ANALYTICS_ENABLED: googleDOTcDOTaDOTe = js.native
  val FN_CAMPAIGN_ID: googleDOTcDOTaDOTc_id = js.native
  val FN_CAMPAIGN_NAME: googleDOTcDOTaDOTc_l = js.native
  val FN_CAMPAIGN_TIME: googleDOTcDOTaDOTts = js.native
  @js.native
  object SUBSCRIPTION_DETAILS extends js.Object {
    var applicationServerKey: Uint8Array = js.native
    var userVisibleOnly: Boolean = js.native
  }
  
}

