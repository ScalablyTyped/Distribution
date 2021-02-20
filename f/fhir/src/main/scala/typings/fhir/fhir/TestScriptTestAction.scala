package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A test operation or assert to perform
  */
@js.native
trait TestScriptTestAction extends BackboneElement {
  
  /**
    * The setup assertion to perform
    */
  var assert: js.UndefOr[TestScriptSetupActionAssert] = js.native
  
  /**
    * The setup operation to perform
    */
  var operation: js.UndefOr[TestScriptSetupActionOperation] = js.native
}
object TestScriptTestAction {
  
  @scala.inline
  def apply(): TestScriptTestAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptTestAction]
  }
  
  @scala.inline
  implicit class TestScriptTestActionMutableBuilder[Self <: TestScriptTestAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssert(value: TestScriptSetupActionAssert): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
    
    @scala.inline
    def setOperation(value: TestScriptSetupActionOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
