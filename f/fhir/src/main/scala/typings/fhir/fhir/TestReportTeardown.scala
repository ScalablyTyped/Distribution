package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The results of running the series of required clean up steps
  */
trait TestReportTeardown
  extends StObject
     with BackboneElement {
  
  /**
    * One or more teardown operations performed
    */
  var action: js.Array[TestReportTeardownAction]
}
object TestReportTeardown {
  
  inline def apply(action: js.Array[TestReportTeardownAction]): TestReportTeardown = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportTeardown]
  }
  
  extension [Self <: TestReportTeardown](x: Self) {
    
    inline def setAction(value: js.Array[TestReportTeardownAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: TestReportTeardownAction*): Self = StObject.set(x, "action", js.Array(value :_*))
  }
}
