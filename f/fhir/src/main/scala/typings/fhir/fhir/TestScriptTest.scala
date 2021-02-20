package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A test in this script
  */
@js.native
trait TestScriptTest extends BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * A test operation or assert to perform
    */
  var action: js.Array[TestScriptTestAction] = js.native
  
  /**
    * Tracking/reporting short description of the test
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Tracking/logging name of this test
    */
  var name: js.UndefOr[String] = js.native
}
object TestScriptTest {
  
  @scala.inline
  def apply(action: js.Array[TestScriptTestAction]): TestScriptTest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptTest]
  }
  
  @scala.inline
  implicit class TestScriptTestMutableBuilder[Self <: TestScriptTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Array[TestScriptTestAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionVarargs(value: TestScriptTestAction*): Self = StObject.set(x, "action", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
