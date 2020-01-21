package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsCFormatRule extends js.Object {
  /** Specifies the conditions to apply for the range of cells in Spreadsheet.
    */
  var action: js.UndefOr[CFormatRule | String] = js.undefined
  /** Specifies the color to apply for the range of cell while conditional formatting.
    */
  var color: js.UndefOr[CFormatHighlightColor | String] = js.undefined
  /** Specifies the inputs for conditional formatting in Spreadsheet.
    * @Default {[]}
    */
  var inputs: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the range for conditional formatting in Spreadsheet.
    */
  var range: js.UndefOr[String] = js.undefined
}

object SheetsCFormatRule {
  @scala.inline
  def apply(
    action: CFormatRule | String = null,
    color: CFormatHighlightColor | String = null,
    inputs: js.Array[_] = null,
    range: String = null
  ): SheetsCFormatRule = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsCFormatRule]
  }
}

