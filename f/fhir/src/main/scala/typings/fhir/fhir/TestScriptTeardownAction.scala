package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One or more teardown operations to perform
  */
@js.native
trait TestScriptTeardownAction extends BackboneElement {
  
  /**
    * The teardown operation to perform
    */
  var operation: TestScriptSetupActionOperation = js.native
}
object TestScriptTeardownAction {
  
  @scala.inline
  def apply(operation: TestScriptSetupActionOperation): TestScriptTeardownAction = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptTeardownAction]
  }
  
  @scala.inline
  implicit class TestScriptTeardownActionMutableBuilder[Self <: TestScriptTeardownAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: TestScriptSetupActionOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
