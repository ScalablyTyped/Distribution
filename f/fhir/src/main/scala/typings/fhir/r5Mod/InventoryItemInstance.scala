package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryItemInstance
  extends StObject
     with BackboneElement {
  
  var _expiry: js.UndefOr[Element] = js.undefined
  
  var _lotNumber: js.UndefOr[Element] = js.undefined
  
  /**
    * The expiry date or date and time for the product.
    */
  var expiry: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the physical instance, typically a serial number.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The location that the item is associated with.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * The lot or batch number of the item.
    */
  var lotNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The subject that the item is associated with.
    */
  var subject: js.UndefOr[Reference] = js.undefined
}
object InventoryItemInstance {
  
  inline def apply(): InventoryItemInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryItemInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryItemInstance] (val x: Self) extends AnyVal {
    
    inline def setExpiry(value: String): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLotNumber(value: String): Self = StObject.set(x, "lotNumber", value.asInstanceOf[js.Any])
    
    inline def setLotNumberUndefined: Self = StObject.set(x, "lotNumber", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def set_expiry(value: Element): Self = StObject.set(x, "_expiry", value.asInstanceOf[js.Any])
    
    inline def set_expiryUndefined: Self = StObject.set(x, "_expiry", js.undefined)
    
    inline def set_lotNumber(value: Element): Self = StObject.set(x, "_lotNumber", value.asInstanceOf[js.Any])
    
    inline def set_lotNumberUndefined: Self = StObject.set(x, "_lotNumber", js.undefined)
  }
}
