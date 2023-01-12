package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptSetupAction
  extends StObject
     with BackboneElement {
  
  /**
    * Evaluates the results of previous operations to determine if the server under test behaves appropriately.
    */
  var assert: js.UndefOr[TestScriptSetupActionAssert] = js.undefined
  
  /**
    * The operation to perform.
    */
  var operation: js.UndefOr[TestScriptSetupActionOperation] = js.undefined
}
object TestScriptSetupAction {
  
  inline def apply(): TestScriptSetupAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptSetupAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptSetupAction] (val x: Self) extends AnyVal {
    
    inline def setAssert(value: TestScriptSetupActionAssert): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    inline def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
    
    inline def setOperation(value: TestScriptSetupActionOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
