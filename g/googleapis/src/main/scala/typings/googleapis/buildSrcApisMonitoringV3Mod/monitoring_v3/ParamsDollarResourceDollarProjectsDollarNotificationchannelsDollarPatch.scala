package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarNotificationchannelsDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The full REST resource name for this channel. The syntax is:
    * projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID] The [CHANNEL_ID]
    * is automatically assigned by the server on creation.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$NotificationChannel] = js.native
  /**
    * The fields to update.
    */
  var updateMask: js.UndefOr[String] = js.native
}

