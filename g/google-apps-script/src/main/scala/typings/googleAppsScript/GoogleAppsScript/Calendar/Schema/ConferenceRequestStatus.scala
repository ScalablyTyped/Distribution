package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceRequestStatus extends js.Object {
  var statusCode: js.UndefOr[String] = js.undefined
}

object ConferenceRequestStatus {
  @scala.inline
  def apply(statusCode: String = null): ConferenceRequestStatus = {
    val __obj = js.Dynamic.literal()
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConferenceRequestStatus]
  }
}

