package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestPlanDependency
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * A textual description of the criterium - what is needed for the dependency to be considered met.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Predecessor test plans - those that are expected to be successfully performed as a dependency for the execution of this test plan.
    */
  var predecessor: js.UndefOr[Reference] = js.undefined
}
object TestPlanDependency {
  
  inline def apply(): TestPlanDependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestPlanDependency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestPlanDependency] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPredecessor(value: Reference): Self = StObject.set(x, "predecessor", value.asInstanceOf[js.Any])
    
    inline def setPredecessorUndefined: Self = StObject.set(x, "predecessor", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
