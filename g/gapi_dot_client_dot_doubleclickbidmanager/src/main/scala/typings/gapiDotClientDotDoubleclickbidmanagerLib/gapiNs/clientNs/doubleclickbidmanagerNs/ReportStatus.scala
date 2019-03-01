package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportStatus extends js.Object {
  /** If the report failed, this records the cause. */
  var failure: js.UndefOr[ReportFailure] = js.undefined
  /** The time when this report either completed successfully or failed. */
  var finishTimeMs: js.UndefOr[java.lang.String] = js.undefined
  /** The file type of the report. */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** The state of the report. */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object ReportStatus {
  @scala.inline
  def apply(
    failure: ReportFailure = null,
    finishTimeMs: java.lang.String = null,
    format: java.lang.String = null,
    state: java.lang.String = null
  ): ReportStatus = {
    val __obj = js.Dynamic.literal()
    if (failure != null) __obj.updateDynamic("failure")(failure)
    if (finishTimeMs != null) __obj.updateDynamic("finishTimeMs")(finishTimeMs)
    if (format != null) __obj.updateDynamic("format")(format)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ReportStatus]
  }
}

