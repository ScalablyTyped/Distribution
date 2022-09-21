package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationProductBatch
  extends StObject
     with BackboneElement {
  
  var _expirationDate: js.UndefOr[Element] = js.undefined
  
  var _lotNumber: js.UndefOr[Element] = js.undefined
  
  /**
    * When this specific batch of product will expire.
    */
  var expirationDate: js.UndefOr[String] = js.undefined
  
  /**
    * The assigned lot number of a batch of the specified product.
    */
  var lotNumber: js.UndefOr[String] = js.undefined
}
object MedicationProductBatch {
  
  inline def apply(): MedicationProductBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationProductBatch]
  }
  
  extension [Self <: MedicationProductBatch](x: Self) {
    
    inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setLotNumber(value: String): Self = StObject.set(x, "lotNumber", value.asInstanceOf[js.Any])
    
    inline def setLotNumberUndefined: Self = StObject.set(x, "lotNumber", js.undefined)
    
    inline def set_expirationDate(value: Element): Self = StObject.set(x, "_expirationDate", value.asInstanceOf[js.Any])
    
    inline def set_expirationDateUndefined: Self = StObject.set(x, "_expirationDate", js.undefined)
    
    inline def set_lotNumber(value: Element): Self = StObject.set(x, "_lotNumber", value.asInstanceOf[js.Any])
    
    inline def set_lotNumberUndefined: Self = StObject.set(x, "_lotNumber", js.undefined)
  }
}
