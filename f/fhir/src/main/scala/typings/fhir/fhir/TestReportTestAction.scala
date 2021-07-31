package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A test operation or assert that was performed
  */
trait TestReportTestAction
  extends StObject
     with BackboneElement {
  
  /**
    * The assertion performed
    */
  var assert: js.UndefOr[TestReportSetupActionAssert] = js.undefined
  
  /**
    * The operation performed
    */
  var operation: js.UndefOr[TestReportSetupActionOperation] = js.undefined
}
object TestReportTestAction {
  
  @scala.inline
  def apply(): TestReportTestAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestReportTestAction]
  }
  
  @scala.inline
  implicit class TestReportTestActionMutableBuilder[Self <: TestReportTestAction] (val x: Self) extends AnyVal {
    
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
