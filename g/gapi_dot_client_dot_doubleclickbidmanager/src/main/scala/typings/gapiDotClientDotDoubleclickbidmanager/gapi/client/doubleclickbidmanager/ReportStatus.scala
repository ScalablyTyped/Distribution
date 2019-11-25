package typings.gapiDotClientDotDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportStatus extends js.Object {
  /** If the report failed, this records the cause. */
  var failure: js.UndefOr[ReportFailure] = js.undefined
  /** The time when this report either completed successfully or failed. */
  var finishTimeMs: js.UndefOr[String] = js.undefined
  /** The file type of the report. */
  var format: js.UndefOr[String] = js.undefined
  /** The state of the report. */
  var state: js.UndefOr[String] = js.undefined
}

object ReportStatus {
  @scala.inline
  def apply(
    failure: ReportFailure = null,
    finishTimeMs: String = null,
    format: String = null,
    state: String = null
  ): ReportStatus = {
    val __obj = js.Dynamic.literal()
    if (failure != null) __obj.updateDynamic("failure")(failure.asInstanceOf[js.Any])
    if (finishTimeMs != null) __obj.updateDynamic("finishTimeMs")(finishTimeMs.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportStatus]
  }
}

