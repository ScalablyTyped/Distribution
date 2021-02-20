package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class TestReportTeardownActionMutableBuilder[Self <: TestReportTeardownAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: TestReportSetupActionOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
