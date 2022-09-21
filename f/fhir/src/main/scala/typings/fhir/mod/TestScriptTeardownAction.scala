package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptTeardownAction
  extends StObject
     with BackboneElement {
  
  /**
    * An operation would involve a REST request to a server.
    */
  var operation: js.UndefOr[TestScriptSetupActionOperation] = js.undefined
}
object TestScriptTeardownAction {
  
  inline def apply(): TestScriptTeardownAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptTeardownAction]
  }
  
  extension [Self <: TestScriptTeardownAction](x: Self) {
    
    inline def setOperation(value: TestScriptSetupActionOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
