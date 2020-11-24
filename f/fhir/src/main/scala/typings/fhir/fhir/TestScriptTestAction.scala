package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A test operation or assert to perform
  */
@js.native
trait TestScriptTestAction extends BackboneElement {
  
  /**
    * The setup assertion to perform
    */
  var assert: js.UndefOr[TestScriptSetupActionAssert] = js.native
  
  /**
    * The setup operation to perform
    */
  var operation: js.UndefOr[TestScriptSetupActionOperation] = js.native
}
object TestScriptTestAction {
  
  @scala.inline
  def apply(): TestScriptTestAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptTestAction]
  }
  
  @scala.inline
  implicit class TestScriptTestActionOps[Self <: TestScriptTestAction] (val x: Self) extends AnyVal {
    
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
    def setAssert(value: TestScriptSetupActionAssert): Self = this.set("assert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssert: Self = this.set("assert", js.undefined)
    
    @scala.inline
    def setOperation(value: TestScriptSetupActionOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
  }
}
