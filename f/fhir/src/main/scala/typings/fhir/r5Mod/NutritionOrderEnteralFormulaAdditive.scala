package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionOrderEnteralFormulaAdditive
  extends StObject
     with BackboneElement {
  
  var _productName: js.UndefOr[Element] = js.undefined
  
  /**
    * The product or brand name of the type of modular component to be added to the formula.
    */
  var productName: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of additive to be given in addition or to be mixed in with the base formula.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula.
    */
  var `type`: js.UndefOr[CodeableReference] = js.undefined
}
object NutritionOrderEnteralFormulaAdditive {
  
  inline def apply(): NutritionOrderEnteralFormulaAdditive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderEnteralFormulaAdditive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NutritionOrderEnteralFormulaAdditive] (val x: Self) extends AnyVal {
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setType(value: CodeableReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_productName(value: Element): Self = StObject.set(x, "_productName", value.asInstanceOf[js.Any])
    
    inline def set_productNameUndefined: Self = StObject.set(x, "_productName", js.undefined)
  }
}
