package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionProductNutrient
  extends StObject
     with BackboneElement {
  
  /**
    * The amount of nutrient expressed in one or more units: X per pack / per serving / per dose.
    */
  var amount: js.UndefOr[js.Array[Ratio]] = js.undefined
  
  /**
    * The (relevant) nutrients in the product.
    */
  var item: js.UndefOr[CodeableReference] = js.undefined
}
object NutritionProductNutrient {
  
  inline def apply(): NutritionProductNutrient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionProductNutrient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NutritionProductNutrient] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: js.Array[Ratio]): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setAmountVarargs(value: Ratio*): Self = StObject.set(x, "amount", js.Array(value*))
    
    inline def setItem(value: CodeableReference): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
