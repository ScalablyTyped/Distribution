package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaConferenceRequestStatus extends js.Object {
  /**
    * The current status of the conference create request. Read-only. The
    * possible values are:   - &quot;pending&quot;: the conference create
    * request is still being processed. - &quot;success&quot;: the conference
    * create request succeeded, the entry points are populated. -
    * &quot;failure&quot;: the conference create request failed, there are no
    * entry points.
    */
  var statusCode: js.UndefOr[String] = js.native
}

object SchemaConferenceRequestStatus {
  @scala.inline
  def apply(statusCode: String = null): SchemaConferenceRequestStatus = {
    val __obj = js.Dynamic.literal()
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConferenceRequestStatus]
  }
}

