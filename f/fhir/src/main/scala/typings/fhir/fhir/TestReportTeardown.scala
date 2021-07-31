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
  
  @scala.inline
  def apply(action: js.Array[TestReportTeardownAction]): TestReportTeardown = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportTeardown]
  }
  
  @scala.inline
  implicit class TestReportTeardownMutableBuilder[Self <: TestReportTeardown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Array[TestReportTeardownAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionVarargs(value: TestReportTeardownAction*): Self = StObject.set(x, "action", js.Array(value :_*))
  }
}
