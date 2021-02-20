package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class TestReportSetupActionMutableBuilder[Self <: TestReportSetupAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssert(value: TestReportSetupActionAssert): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
    
    @scala.inline
    def setOperation(value: TestReportSetupActionOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
