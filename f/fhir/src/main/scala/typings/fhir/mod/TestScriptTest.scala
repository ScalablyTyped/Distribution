package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptTest
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Action would contain either an operation or an assertion.
    */
  var action: js.Array[TestScriptTestAction]
  
  /**
    * A short description of the test used by test engines for tracking and reporting purposes.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
    */
  var metadata: js.UndefOr[TestScriptMetadata] = js.undefined
  
  /**
    * The name of this test used for tracking/logging purposes by test engines.
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
    
    inline def setActionVarargs(value: TestScriptTestAction*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMetadata(value: TestScriptMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
