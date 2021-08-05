package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One or more teardown operations to perform
  */
trait TestScriptTeardownAction
  extends StObject
     with BackboneElement {
  
  /**
    * The teardown operation to perform
    */
  var operation: TestScriptSetupActionOperation
}
object TestScriptTeardownAction {
  
  inline def apply(operation: TestScriptSetupActionOperation): TestScriptTeardownAction = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptTeardownAction]
  }
  
  extension [Self <: TestScriptTeardownAction](x: Self) {
    
    inline def setOperation(value: TestScriptSetupActionOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
