package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceIngredient
  extends StObject
     with BackboneElement {
  
  /**
    * The amount of the ingredient in the substance - a concentration ratio.
    */
  var quantity: js.UndefOr[Ratio] = js.undefined
  
  /**
    * Another substance that is a component of this substance.
    */
  var substance: Reference
}
object SubstanceIngredient {
  
  inline def apply(substance: Reference): SubstanceIngredient = {
    val __obj = js.Dynamic.literal(substance = substance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubstanceIngredient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceIngredient] (val x: Self) extends AnyVal {
    
    inline def setQuantity(value: Ratio): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setSubstance(value: Reference): Self = StObject.set(x, "substance", value.asInstanceOf[js.Any])
  }
}
