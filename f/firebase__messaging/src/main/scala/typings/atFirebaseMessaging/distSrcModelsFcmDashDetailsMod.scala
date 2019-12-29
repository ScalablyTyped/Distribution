package typings.atFirebaseMessaging

import typings.atFirebaseMessaging.atFirebaseMessagingStrings.googleDotcDotaDotc_id
import typings.atFirebaseMessaging.atFirebaseMessagingStrings.googleDotcDotaDotc_l
import typings.atFirebaseMessaging.atFirebaseMessagingStrings.googleDotcDotaDote
import typings.atFirebaseMessaging.atFirebaseMessagingStrings.googleDotcDotaDotts
import typings.atFirebaseMessaging.atFirebaseMessagingStrings.httpsColonSlashSlashfcmregistrationsDotgoogleapisDotcomSlashv1
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/src/models/fcm-details", JSImport.Namespace)
@js.native
object distSrcModelsFcmDashDetailsMod extends js.Object {
  val DEFAULT_PUBLIC_VAPID_KEY: Uint8Array = js.native
  val ENDPOINT: httpsColonSlashSlashfcmregistrationsDotgoogleapisDotcomSlashv1 = js.native
  val FN_CAMPAIGN_ANALYTICS_ENABLED: googleDotcDotaDote = js.native
  val FN_CAMPAIGN_ID: googleDotcDotaDotc_id = js.native
  val FN_CAMPAIGN_NAME: googleDotcDotaDotc_l = js.native
  val FN_CAMPAIGN_TIME: googleDotcDotaDotts = js.native
  @js.native
  object SUBSCRIPTION_DETAILS extends js.Object {
    var applicationServerKey: Uint8Array = js.native
    var userVisibleOnly: Boolean = js.native
  }
  
}

