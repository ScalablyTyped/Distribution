package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A series of required setup operations before tests are executed
  */
trait TestScriptSetup
  extends StObject
     with BackboneElement {
  
  /**
    * A setup operation or assert to perform
    */
  var action: js.Array[TestScriptSetupAction]
}
object TestScriptSetup {
  
  @scala.inline
  def apply(action: js.Array[TestScriptSetupAction]): TestScriptSetup = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetup]
  }
  
  @scala.inline
  implicit class TestScriptSetupMutableBuilder[Self <: TestScriptSetup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Array[TestScriptSetupAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionVarargs(value: TestScriptSetupAction*): Self = StObject.set(x, "action", js.Array(value :_*))
  }
}
