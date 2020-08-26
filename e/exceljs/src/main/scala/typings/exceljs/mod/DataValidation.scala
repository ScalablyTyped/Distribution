package typings.exceljs.mod

import typings.exceljs.exceljsStrings.custom
import typings.exceljs.exceljsStrings.date
import typings.exceljs.exceljsStrings.decimal
import typings.exceljs.exceljsStrings.list
import typings.exceljs.exceljsStrings.textLength
import typings.exceljs.exceljsStrings.whole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataValidation extends js.Object {
  var allowBlank: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[String] = js.native
  var errorStyle: js.UndefOr[String] = js.native
  var errorTitle: js.UndefOr[String] = js.native
  var formulae: js.Array[_] = js.native
  var operator: js.UndefOr[DataValidationOperator] = js.native
  var prompt: js.UndefOr[String] = js.native
  var promptTitle: js.UndefOr[String] = js.native
  var showErrorMessage: js.UndefOr[Boolean] = js.native
  var showInputMessage: js.UndefOr[Boolean] = js.native
  var `type`: list | whole | decimal | date | textLength | custom = js.native
}

object DataValidation {
  @scala.inline
  def apply(formulae: js.Array[_], `type`: list | whole | decimal | date | textLength | custom): DataValidation = {
    val __obj = js.Dynamic.literal(formulae = formulae.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValidation]
  }
  @scala.inline
  implicit class DataValidationOps[Self <: DataValidation] (val x: Self) extends AnyVal {
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
    def setFormulaeVarargs(value: js.Any*): Self = this.set("formulae", js.Array(value :_*))
    @scala.inline
    def setFormulae(value: js.Array[_]): Self = this.set("formulae", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: list | whole | decimal | date | textLength | custom): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowBlank(value: Boolean): Self = this.set("allowBlank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowBlank: Self = this.set("allowBlank", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setErrorStyle(value: String): Self = this.set("errorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorStyle: Self = this.set("errorStyle", js.undefined)
    @scala.inline
    def setErrorTitle(value: String): Self = this.set("errorTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorTitle: Self = this.set("errorTitle", js.undefined)
    @scala.inline
    def setOperator(value: DataValidationOperator): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    @scala.inline
    def setPromptTitle(value: String): Self = this.set("promptTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromptTitle: Self = this.set("promptTitle", js.undefined)
    @scala.inline
    def setShowErrorMessage(value: Boolean): Self = this.set("showErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowErrorMessage: Self = this.set("showErrorMessage", js.undefined)
    @scala.inline
    def setShowInputMessage(value: Boolean): Self = this.set("showInputMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInputMessage: Self = this.set("showInputMessage", js.undefined)
  }
  
}

