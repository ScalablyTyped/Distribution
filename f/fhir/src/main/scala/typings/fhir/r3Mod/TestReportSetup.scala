package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestReportSetup
  extends StObject
     with BackboneElement {
  
  /**
    * An action should contain either an operation or an assertion but not both.  It can contain any number of variables.
    */
  var action: js.Array[TestReportSetupAction]
}
object TestReportSetup {
  
  inline def apply(action: js.Array[TestReportSetupAction]): TestReportSetup = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportSetup]
  }
  
  extension [Self <: TestReportSetup](x: Self) {
    
    inline def setAction(value: js.Array[TestReportSetupAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: TestReportSetupAction*): Self = StObject.set(x, "action", js.Array(value*))
  }
}
