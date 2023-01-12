package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionProductInstance
  extends StObject
     with BackboneElement {
  
  var _expiry: js.UndefOr[Element] = js.undefined
  
  var _lotNumber: js.UndefOr[Element] = js.undefined
  
  var _useBy: js.UndefOr[Element] = js.undefined
  
  /**
    * The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.
    */
  var expiry: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the physical instance, typically a serial number.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The identification of the batch or lot of the product.
    */
  var lotNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of items or instances that the resource considers, for instance when referring to 2 identical units together.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.
    */
  var useBy: js.UndefOr[String] = js.undefined
}
object NutritionProductInstance {
  
  inline def apply(): NutritionProductInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionProductInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NutritionProductInstance] (val x: Self) extends AnyVal {
    
    inline def setExpiry(value: String): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLotNumber(value: String): Self = StObject.set(x, "lotNumber", value.asInstanceOf[js.Any])
    
    inline def setLotNumberUndefined: Self = StObject.set(x, "lotNumber", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setUseBy(value: String): Self = StObject.set(x, "useBy", value.asInstanceOf[js.Any])
    
    inline def setUseByUndefined: Self = StObject.set(x, "useBy", js.undefined)
    
    inline def set_expiry(value: Element): Self = StObject.set(x, "_expiry", value.asInstanceOf[js.Any])
    
    inline def set_expiryUndefined: Self = StObject.set(x, "_expiry", js.undefined)
    
    inline def set_lotNumber(value: Element): Self = StObject.set(x, "_lotNumber", value.asInstanceOf[js.Any])
    
    inline def set_lotNumberUndefined: Self = StObject.set(x, "_lotNumber", js.undefined)
    
    inline def set_useBy(value: Element): Self = StObject.set(x, "_useBy", value.asInstanceOf[js.Any])
    
    inline def set_useByUndefined: Self = StObject.set(x, "_useBy", js.undefined)
  }
}
