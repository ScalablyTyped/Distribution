package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One or more teardown operations performed
  */
@js.native
trait TestReportTeardownAction extends BackboneElement {
  /**
    * The teardown operation performed
    */
  var operation: TestReportSetupActionOperation = js.native
}

object TestReportTeardownAction {
  @scala.inline
  def apply(operation: TestReportSetupActionOperation): TestReportTeardownAction = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportTeardownAction]
  }
  @scala.inline
  implicit class TestReportTeardownActionOps[Self <: TestReportTeardownAction] (val x: Self) extends AnyVal {
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
    def setOperation(value: TestReportSetupActionOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
  }
  
}

