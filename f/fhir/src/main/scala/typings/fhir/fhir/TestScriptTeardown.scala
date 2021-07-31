package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A series of required clean up steps
  */
trait TestScriptTeardown
  extends StObject
     with BackboneElement {
  
  /**
    * One or more teardown operations to perform
    */
  var action: js.Array[TestScriptTeardownAction]
}
object TestScriptTeardown {
  
  @scala.inline
  def apply(action: js.Array[TestScriptTeardownAction]): TestScriptTeardown = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptTeardown]
  }
  
  @scala.inline
  implicit class TestScriptTeardownMutableBuilder[Self <: TestScriptTeardown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Array[TestScriptTeardownAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionVarargs(value: TestScriptTeardownAction*): Self = StObject.set(x, "action", js.Array(value :_*))
  }
}
