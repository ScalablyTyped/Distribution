package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A test in this script
  */
trait TestScriptTest
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * A test operation or assert to perform
    */
  var action: js.Array[TestScriptTestAction]
  
  /**
    * Tracking/reporting short description of the test
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Tracking/logging name of this test
    */
  var name: js.UndefOr[String] = js.undefined
}
object TestScriptTest {
  
  inline def apply(action: js.Array[TestScriptTestAction]): TestScriptTest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptTest]
  }
  
  extension [Self <: TestScriptTest](x: Self) {
    
    inline def setAction(value: js.Array[TestScriptTestAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: TestScriptTestAction*): Self = StObject.set(x, "action", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
