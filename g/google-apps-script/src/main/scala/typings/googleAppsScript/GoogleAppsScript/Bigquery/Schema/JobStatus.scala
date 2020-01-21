package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatus extends js.Object {
  var errorResult: js.UndefOr[ErrorProto] = js.undefined
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object JobStatus {
  @scala.inline
  def apply(errorResult: ErrorProto = null, errors: js.Array[ErrorProto] = null, state: String = null): JobStatus = {
    val __obj = js.Dynamic.literal()
    if (errorResult != null) __obj.updateDynamic("errorResult")(errorResult.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobStatus]
  }
}

