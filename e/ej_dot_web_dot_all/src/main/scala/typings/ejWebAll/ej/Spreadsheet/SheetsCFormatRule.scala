package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsCFormatRule extends js.Object {
  /** Specifies the conditions to apply for the range of cells in Spreadsheet.
    */
  var action: js.UndefOr[CFormatRule | String] = js.native
  /** Specifies the color to apply for the range of cell while conditional formatting.
    */
  var color: js.UndefOr[CFormatHighlightColor | String] = js.native
  /** Specifies the inputs for conditional formatting in Spreadsheet.
    * @Default {[]}
    */
  var inputs: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the range for conditional formatting in Spreadsheet.
    */
  var range: js.UndefOr[String] = js.native
}

object SheetsCFormatRule {
  @scala.inline
  def apply(): SheetsCFormatRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsCFormatRule]
  }
  @scala.inline
  implicit class SheetsCFormatRuleOps[Self <: SheetsCFormatRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: CFormatRule | String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setColor(value: CFormatHighlightColor | String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setInputsVarargs(value: js.Any*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[_]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    @scala.inline
    def setRange(value: String): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

