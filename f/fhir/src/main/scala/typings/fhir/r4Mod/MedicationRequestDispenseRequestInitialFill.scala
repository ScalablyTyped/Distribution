package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationRequestDispenseRequestInitialFill
  extends StObject
     with BackboneElement {
  
  /**
    * The length of time that the first dispense is expected to last.
    */
  var duration: js.UndefOr[Duration] = js.undefined
  
  /**
    * The amount or quantity to provide as part of the first dispense.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
}
object MedicationRequestDispenseRequestInitialFill {
  
  inline def apply(): MedicationRequestDispenseRequestInitialFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationRequestDispenseRequestInitialFill]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationRequestDispenseRequestInitialFill] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
