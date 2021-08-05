package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One or more teardown operations performed
  */
trait TestReportTeardownAction
  extends StObject
     with BackboneElement {
  
  /**
    * The teardown operation performed
    */
  var operation: TestReportSetupActionOperation
}
object TestReportTeardownAction {
  
  inline def apply(operation: TestReportSetupActionOperation): TestReportTeardownAction = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportTeardownAction]
  }
  
  extension [Self <: TestReportTeardownAction](x: Self) {
    
    inline def setOperation(value: TestReportSetupActionOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
