package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestReportTest
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * An action should contain either an operation or an assertion but not both.  It can contain any number of variables.
    */
  var action: js.Array[TestReportTestAction]
  
  /**
    * A short description of the test used by test engines for tracking and reporting purposes.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of this test used for tracking/logging purposes by test engines.
    */
  var name: js.UndefOr[String] = js.undefined
}
object TestReportTest {
  
  inline def apply(action: js.Array[TestReportTestAction]): TestReportTest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportTest]
  }
  
  extension [Self <: TestReportTest](x: Self) {
    
    inline def setAction(value: js.Array[TestReportTestAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: TestReportTestAction*): Self = StObject.set(x, "action", js.Array(value*))
    
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
