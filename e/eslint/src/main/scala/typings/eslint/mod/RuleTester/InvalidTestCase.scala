package typings.eslint.mod.RuleTester

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidTestCase extends ValidTestCase {
  var errors: Double | (js.Array[TestCaseError | String]) = js.native
  var output: js.UndefOr[String | Null] = js.native
}

object InvalidTestCase {
  @scala.inline
  def apply(code: String, errors: Double | (js.Array[TestCaseError | String])): InvalidTestCase = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidTestCase]
  }
  @scala.inline
  implicit class InvalidTestCaseOps[Self <: InvalidTestCase] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: (TestCaseError | String)*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: Double | (js.Array[TestCaseError | String])): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setOutputNull: Self = this.set("output", null)
  }
  
}

