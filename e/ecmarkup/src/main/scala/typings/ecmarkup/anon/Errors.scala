package typings.ecmarkup.anon

import typings.ecmarkup.algorithmErrorReporterTypeMod.LintingError
import typings.ecmarkup.collectNodesMod.CollectNodesReturnType
import typings.ecmarkup.ecmarkupBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Errors extends CollectNodesReturnType {
  var errors: js.Array[LintingError] = js.native
  var success: `false` = js.native
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[LintingError], success: `false`): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
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
    def setErrorsVarargs(value: LintingError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[LintingError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: `false`): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

