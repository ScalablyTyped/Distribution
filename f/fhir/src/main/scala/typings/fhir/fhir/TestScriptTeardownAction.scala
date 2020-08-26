package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One or more teardown operations to perform
  */
@js.native
trait TestScriptTeardownAction extends BackboneElement {
  /**
    * The teardown operation to perform
    */
  var operation: TestScriptSetupActionOperation = js.native
}

object TestScriptTeardownAction {
  @scala.inline
  def apply(operation: TestScriptSetupActionOperation): TestScriptTeardownAction = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptTeardownAction]
  }
  @scala.inline
  implicit class TestScriptTeardownActionOps[Self <: TestScriptTeardownAction] (val x: Self) extends AnyVal {
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
    def setOperation(value: TestScriptSetupActionOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
  }
  
}

