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

