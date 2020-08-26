package typings.docxTemplates.anon

import typings.docxTemplates.docxTemplatesStrings.errors
import typings.docxTemplates.processTemplateMod.ReportOutput
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Errors extends ReportOutput {
  var errors: js.Array[Error] = js.native
  var status: errors = js.native
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[Error], status: errors): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  @scala.inline
  implicit class ErrorsOps[Self <: Errors] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: Error*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[Error]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: errors): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

