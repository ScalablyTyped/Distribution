package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptTeardown
  extends StObject
     with BackboneElement {
  
  /**
    * An action should contain either an operation or an assertion but not both.  It can contain any number of variables.
    */
  var action: js.Array[TestScriptTeardownAction]
}
object TestScriptTeardown {
  
  inline def apply(action: js.Array[TestScriptTeardownAction]): TestScriptTeardown = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptTeardown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptTeardown] (val x: Self) extends AnyVal {
    
    inline def setAction(value: js.Array[TestScriptTeardownAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: TestScriptTeardownAction*): Self = StObject.set(x, "action", js.Array(value*))
  }
}
