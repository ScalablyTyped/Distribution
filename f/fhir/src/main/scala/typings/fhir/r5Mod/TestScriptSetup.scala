package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptSetup
  extends StObject
     with BackboneElement {
  
  /**
    * An action should contain either an operation or an assertion but not both.  It can contain any number of variables.
    */
  var action: js.Array[TestScriptSetupAction]
}
object TestScriptSetup {
  
  inline def apply(action: js.Array[TestScriptSetupAction]): TestScriptSetup = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetup]
  }
  
  extension [Self <: TestScriptSetup](x: Self) {
    
    inline def setAction(value: js.Array[TestScriptSetupAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: TestScriptSetupAction*): Self = StObject.set(x, "action", js.Array(value*))
  }
}
