package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptTeardownAction
  extends StObject
     with BackboneElement {
  
  /**
    * An operation would involve a REST request to a server.
    */
  var operation: TestScriptSetupActionOperation
}
object TestScriptTeardownAction {
  
  inline def apply(operation: TestScriptSetupActionOperation): TestScriptTeardownAction = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptTeardownAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptTeardownAction] (val x: Self) extends AnyVal {
    
    inline def setOperation(value: TestScriptSetupActionOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
