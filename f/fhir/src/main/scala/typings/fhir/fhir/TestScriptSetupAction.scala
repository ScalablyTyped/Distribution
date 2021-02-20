package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A setup operation or assert to perform
  */
@js.native
trait TestScriptSetupAction extends BackboneElement {
  
  /**
    * The assertion to perform
    */
  var assert: js.UndefOr[TestScriptSetupActionAssert] = js.native
  
  /**
    * The setup operation to perform
    */
  var operation: js.UndefOr[TestScriptSetupActionOperation] = js.native
}
object TestScriptSetupAction {
  
  @scala.inline
  def apply(): TestScriptSetupAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptSetupAction]
  }
  
  @scala.inline
  implicit class TestScriptSetupActionMutableBuilder[Self <: TestScriptSetupAction] (val x: Self) extends AnyVal {
    
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
