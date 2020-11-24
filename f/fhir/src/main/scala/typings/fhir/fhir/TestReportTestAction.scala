package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A test operation or assert that was performed
  */
@js.native
trait TestReportTestAction extends BackboneElement {
  
  /**
    * The assertion performed
    */
  var assert: js.UndefOr[TestReportSetupActionAssert] = js.native
  
  /**
    * The operation performed
    */
  var operation: js.UndefOr[TestReportSetupActionOperation] = js.native
}
object TestReportTestAction {
  
  @scala.inline
  def apply(): TestReportTestAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestReportTestAction]
  }
  
  @scala.inline
  implicit class TestReportTestActionOps[Self <: TestReportTestAction] (val x: Self) extends AnyVal {
    
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
