package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPlanTestCaseDependency
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Description of the criteria.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Link to predecessor test plans.
    */
  var predecessor: js.UndefOr[Reference] = js.undefined
}
object TestPlanTestCaseDependency {
  
  inline def apply(): TestPlanTestCaseDependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestPlanTestCaseDependency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestPlanTestCaseDependency] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPredecessor(value: Reference): Self = StObject.set(x, "predecessor", value.asInstanceOf[js.Any])
    
    inline def setPredecessorUndefined: Self = StObject.set(x, "predecessor", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
