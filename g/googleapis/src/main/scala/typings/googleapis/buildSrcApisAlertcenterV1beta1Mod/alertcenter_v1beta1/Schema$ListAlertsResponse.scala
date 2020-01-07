package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for an alert listing request.
  */
@js.native
trait Schema$ListAlertsResponse extends js.Object {
  /**
    * The list of alerts.
    */
  var alerts: js.UndefOr[js.Array[Schema$Alert]] = js.native
  /**
    * The token for the next page. If not empty, indicates that there may be
    * more alerts that match the listing request; this value can be used in a
    * subsequent ListAlertsRequest to get alerts continuing from last result of
    * the current list call.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListAlertsResponse {
  @scala.inline
  def apply(alerts: js.Array[Schema$Alert] = null, nextPageToken: String = null): Schema$ListAlertsResponse = {
    val __obj = js.Dynamic.literal()
    if (alerts != null) __obj.updateDynamic("alerts")(alerts.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAlertsResponse]
  }
}

