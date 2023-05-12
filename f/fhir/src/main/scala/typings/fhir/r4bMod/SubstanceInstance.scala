package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceInstance
  extends StObject
     with BackboneElement {
  
  var _expiry: js.UndefOr[Element] = js.undefined
  
  /**
    * When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.
    */
  var expiry: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier associated with the package/container (usually a label affixed directly).
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The amount of the substance.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
}
object SubstanceInstance {
  
  inline def apply(): SubstanceInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceInstance] (val x: Self) extends AnyVal {
    
    inline def setExpiry(value: String): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def set_expiry(value: Element): Self = StObject.set(x, "_expiry", value.asInstanceOf[js.Any])
    
    inline def set_expiryUndefined: Self = StObject.set(x, "_expiry", js.undefined)
  }
}
