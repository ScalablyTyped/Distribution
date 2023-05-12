package typings.fhir.r4bMod

import typings.fhir.fhirStrings.actual
import typings.fhir.fhirStrings.allowed
import typings.fhir.fhirStrings.possible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngredientManufacturer
  extends StObject
     with BackboneElement {
  
  var _role: js.UndefOr[Element] = js.undefined
  
  /**
    * An organization that manufactures this ingredient.
    */
  var manufacturer: Reference
  
  /**
    * The way in which this manufacturer is associated with the ingredient. For example whether it is a possible one (others allowed), or an exclusive authorized one for this ingredient. Note that this is not the manufacturing process role.
    */
  var role: js.UndefOr[allowed | possible | actual] = js.undefined
}
object IngredientManufacturer {
  
  inline def apply(manufacturer: Reference): IngredientManufacturer = {
    val __obj = js.Dynamic.literal(manufacturer = manufacturer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngredientManufacturer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngredientManufacturer] (val x: Self) extends AnyVal {
    
    inline def setManufacturer(value: Reference): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setRole(value: allowed | possible | actual): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def set_role(value: Element): Self = StObject.set(x, "_role", value.asInstanceOf[js.Any])
    
    inline def set_roleUndefined: Self = StObject.set(x, "_role", js.undefined)
  }
}
