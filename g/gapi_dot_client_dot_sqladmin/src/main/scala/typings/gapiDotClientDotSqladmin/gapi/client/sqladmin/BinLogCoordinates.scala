package typings.gapiDotClientDotSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinLogCoordinates extends js.Object {
  /** Name of the binary log file for a Cloud SQL instance. */
  var binLogFileName: js.UndefOr[String] = js.undefined
  /** Position (offset) within the binary log file. */
  var binLogPosition: js.UndefOr[String] = js.undefined
  /** This is always sql#binLogCoordinates. */
  var kind: js.UndefOr[String] = js.undefined
}

object BinLogCoordinates {
  @scala.inline
  def apply(binLogFileName: String = null, binLogPosition: String = null, kind: String = null): BinLogCoordinates = {
    val __obj = js.Dynamic.literal()
    if (binLogFileName != null) __obj.updateDynamic("binLogFileName")(binLogFileName)
    if (binLogPosition != null) __obj.updateDynamic("binLogPosition")(binLogPosition)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[BinLogCoordinates]
  }
}

