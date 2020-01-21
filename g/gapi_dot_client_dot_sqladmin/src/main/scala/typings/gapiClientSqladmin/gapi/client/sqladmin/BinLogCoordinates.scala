package typings.gapiClientSqladmin.gapi.client.sqladmin

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
    if (binLogFileName != null) __obj.updateDynamic("binLogFileName")(binLogFileName.asInstanceOf[js.Any])
    if (binLogPosition != null) __obj.updateDynamic("binLogPosition")(binLogPosition.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinLogCoordinates]
  }
}

