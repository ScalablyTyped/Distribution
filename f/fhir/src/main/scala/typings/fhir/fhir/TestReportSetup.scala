package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The results of the series of required setup operations before the tests were executed
  */
@js.native
trait TestReportSetup extends BackboneElement {
  
  /**
    * A setup operation or assert that was executed
    */
  var action: js.Array[TestReportSetupAction] = js.native
}
object TestReportSetup {
  
  @scala.inline
  def apply(action: js.Array[TestReportSetupAction]): TestReportSetup = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportSetup]
  }
  
  @scala.inline
  implicit class TestReportSetupMutableBuilder[Self <: TestReportSetup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Array[TestReportSetupAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionVarargs(value: TestReportSetupAction*): Self = StObject.set(x, "action", js.Array(value :_*))
  }
}
