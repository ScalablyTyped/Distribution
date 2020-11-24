package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A series of required clean up steps
  */
@js.native
trait TestScriptTeardown extends BackboneElement {
  
  /**
    * One or more teardown operations to perform
    */
  var action: js.Array[TestScriptTeardownAction] = js.native
}
object TestScriptTeardown {
  
  @scala.inline
  def apply(action: js.Array[TestScriptTeardownAction]): TestScriptTeardown = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptTeardown]
  }
  
  @scala.inline
  implicit class TestScriptTeardownOps[Self <: TestScriptTeardown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionVarargs(value: TestScriptTeardownAction*): Self = this.set("action", js.Array(value :_*))
    
    @scala.inline
    def setAction(value: js.Array[TestScriptTeardownAction]): Self = this.set("action", value.asInstanceOf[js.Any])
  }
}
