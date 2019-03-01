package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearBasicFilterRequest extends js.Object {
  /** The sheet ID on which the basic filter should be cleared. */
  var sheetId: js.UndefOr[scala.Double] = js.undefined
}

object ClearBasicFilterRequest {
  @scala.inline
  def apply(sheetId: scala.Int | scala.Double = null): ClearBasicFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearBasicFilterRequest]
  }
}

