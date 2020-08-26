package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A series of required setup operations before tests are executed
  */
@js.native
trait TestScriptSetup extends BackboneElement {
  /**
    * A setup operation or assert to perform
    */
  var action: js.Array[TestScriptSetupAction] = js.native
}

object TestScriptSetup {
  @scala.inline
  def apply(action: js.Array[TestScriptSetupAction]): TestScriptSetup = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetup]
  }
  @scala.inline
  implicit class TestScriptSetupOps[Self <: TestScriptSetup] (val x: Self) extends AnyVal {
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
    def setActionVarargs(value: TestScriptSetupAction*): Self = this.set("action", js.Array(value :_*))
    @scala.inline
    def setAction(value: js.Array[TestScriptSetupAction]): Self = this.set("action", value.asInstanceOf[js.Any])
  }
  
}

