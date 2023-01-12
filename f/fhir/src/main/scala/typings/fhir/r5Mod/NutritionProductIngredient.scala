package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionProductIngredient
  extends StObject
     with BackboneElement {
  
  /**
    * The amount of ingredient that is in the product.
    */
  var amount: js.UndefOr[js.Array[Ratio]] = js.undefined
  
  /**
    * The ingredient contained in the product.
    */
  var item: CodeableReference
}
object NutritionProductIngredient {
  
  inline def apply(item: CodeableReference): NutritionProductIngredient = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[NutritionProductIngredient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NutritionProductIngredient] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: js.Array[Ratio]): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setAmountVarargs(value: Ratio*): Self = StObject.set(x, "amount", js.Array(value*))
    
    inline def setItem(value: CodeableReference): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
