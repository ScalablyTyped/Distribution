package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptTeardown
  extends StObject
     with BackboneElement {
  
  /**
    * The teardown action will only contain an operation.
    */
  var action: js.Array[TestScriptTeardownAction]
}
object TestScriptTeardown {
  
  inline def apply(action: js.Array[TestScriptTeardownAction]): TestScriptTeardown = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptTeardown]
  }
  
  extension [Self <: TestScriptTeardown](x: Self) {
    
    inline def setAction(value: js.Array[TestScriptTeardownAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: TestScriptTeardownAction*): Self = StObject.set(x, "action", js.Array(value*))
  }
}
