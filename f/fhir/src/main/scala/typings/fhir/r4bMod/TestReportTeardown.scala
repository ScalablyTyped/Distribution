package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestReportTeardown
  extends StObject
     with BackboneElement {
  
  /**
    * An action should contain either an operation or an assertion but not both.  It can contain any number of variables.
    */
  var action: js.Array[TestReportTeardownAction]
}
object TestReportTeardown {
  
  inline def apply(action: js.Array[TestReportTeardownAction]): TestReportTeardown = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportTeardown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestReportTeardown] (val x: Self) extends AnyVal {
    
    inline def setAction(value: js.Array[TestReportTeardownAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: TestReportTeardownAction*): Self = StObject.set(x, "action", js.Array(value*))
  }
}
