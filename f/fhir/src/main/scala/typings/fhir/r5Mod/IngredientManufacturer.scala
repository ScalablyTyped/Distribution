package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngredientManufacturer
  extends StObject
     with BackboneElement {
  
  /**
    * An organization that manufactures this ingredient.
    */
  var manufacturer: Reference
  
  /**
    * The way in which this manufacturer is associated with the ingredient. For example whether it is a possible one (others allowed), or an exclusive authorized one for this ingredient. Note that this is not the manufacturing process role.
    */
  var role: js.UndefOr[Coding] = js.undefined
}
object IngredientManufacturer {
  
  inline def apply(manufacturer: Reference): IngredientManufacturer = {
    val __obj = js.Dynamic.literal(manufacturer = manufacturer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngredientManufacturer]
  }
  
  extension [Self <: IngredientManufacturer](x: Self) {
    
    inline def setManufacturer(value: Reference): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setRole(value: Coding): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
