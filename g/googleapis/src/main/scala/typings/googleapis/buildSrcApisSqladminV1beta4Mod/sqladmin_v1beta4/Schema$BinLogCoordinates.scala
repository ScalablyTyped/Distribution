package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Binary log coordinates.
  */
@js.native
trait Schema$BinLogCoordinates extends js.Object {
  /**
    * Name of the binary log file for a Cloud SQL instance.
    */
  var binLogFileName: js.UndefOr[String] = js.native
  /**
    * Position (offset) within the binary log file.
    */
  var binLogPosition: js.UndefOr[String] = js.native
  /**
    * This is always sql#binLogCoordinates.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$BinLogCoordinates {
  @scala.inline
  def apply(binLogFileName: String = null, binLogPosition: String = null, kind: String = null): Schema$BinLogCoordinates = {
    val __obj = js.Dynamic.literal()
    if (binLogFileName != null) __obj.updateDynamic("binLogFileName")(binLogFileName.asInstanceOf[js.Any])
    if (binLogPosition != null) __obj.updateDynamic("binLogPosition")(binLogPosition.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BinLogCoordinates]
  }
}

