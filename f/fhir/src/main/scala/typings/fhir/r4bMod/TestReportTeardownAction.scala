package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestReportTeardownAction
  extends StObject
     with BackboneElement {
  
  /**
    * An operation would involve a REST request to a server.
    */
  var operation: TestReportSetupActionOperation
}
object TestReportTeardownAction {
  
  inline def apply(operation: TestReportSetupActionOperation): TestReportTeardownAction = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportTeardownAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestReportTeardownAction] (val x: Self) extends AnyVal {
    
    inline def setOperation(value: TestReportSetupActionOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
