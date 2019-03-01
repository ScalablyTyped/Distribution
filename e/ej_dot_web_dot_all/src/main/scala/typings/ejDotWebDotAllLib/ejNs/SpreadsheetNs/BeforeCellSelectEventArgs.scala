package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeCellSelectEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the current cell range.
    */
  var currRange: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the previous cell range.
    */
  var prevRange: js.UndefOr[js.Array[_]] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BeforeCellSelectEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    currRange: js.Array[_] = null,
    model: Model = null,
    prevRange: js.Array[_] = null,
    `type`: java.lang.String = null
  ): BeforeCellSelectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currRange != null) __obj.updateDynamic("currRange")(currRange)
    if (model != null) __obj.updateDynamic("model")(model)
    if (prevRange != null) __obj.updateDynamic("prevRange")(prevRange)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeCellSelectEventArgs]
  }
}

