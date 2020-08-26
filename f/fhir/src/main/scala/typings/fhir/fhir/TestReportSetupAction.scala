package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A setup operation or assert that was executed
  */
@js.native
trait TestReportSetupAction extends BackboneElement {
  /**
    * The assertion to perform
    */
  var assert: js.UndefOr[TestReportSetupActionAssert] = js.native
  /**
    * The operation to perform
    */
  var operation: js.UndefOr[TestReportSetupActionOperation] = js.native
}

object TestReportSetupAction {
  @scala.inline
  def apply(): TestReportSetupAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestReportSetupAction]
  }
  @scala.inline
  implicit class TestReportSetupActionOps[Self <: TestReportSetupAction] (val x: Self) extends AnyVal {
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
    def setAssert(value: TestReportSetupActionAssert): Self = this.set("assert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssert: Self = this.set("assert", js.undefined)
    @scala.inline
    def setOperation(value: TestReportSetupActionOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
  }
  
}

