package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationRequestDispenseRequest
  extends StObject
     with BackboneElement {
  
  /**
    * The minimum period of time that must occur between dispenses of the medication.
    */
  var dispenseInterval: js.UndefOr[Duration] = js.undefined
  
  /**
    * In some situations, this attribute may be used instead of quantity to identify the amount supplied by how long it is expected to last, rather than the physical quantity issued, e.g. 90 days supply of medication (based on an ordered dosage). When possible, it is always better to specify quantity, as this tends to be more precise. expectedSupplyDuration will always be an estimate that can be influenced by external factors.
    */
  var expectedSupplyDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * If populating this element, either the quantity or the duration must be included.
    */
  var initialFill: js.UndefOr[MedicationRequestDispenseRequestInitialFill] = js.undefined
  
  /**
    * If displaying "number of authorized fills", add 1 to this number.
    */
  var numberOfRepeatsAllowed: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the intended dispensing Organization specified by the prescriber.
    */
  var performer: js.UndefOr[Reference] = js.undefined
  
  /**
    * The amount that is to be dispensed for one fill.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * It reflects the prescribers' perspective for the validity of the prescription. Dispenses must not be made against the prescription outside of this period. The lower-bound of the Dispensing Window signifies the earliest date that the prescription can be filled for the first time. If an upper-bound is not specified then the Prescription is open-ended or will default to a stale-date based on regulations.
    */
  var validityPeriod: js.UndefOr[Period] = js.undefined
}
object MedicationRequestDispenseRequest {
  
  inline def apply(): MedicationRequestDispenseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationRequestDispenseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationRequestDispenseRequest] (val x: Self) extends AnyVal {
    
    inline def setDispenseInterval(value: Duration): Self = StObject.set(x, "dispenseInterval", value.asInstanceOf[js.Any])
    
    inline def setDispenseIntervalUndefined: Self = StObject.set(x, "dispenseInterval", js.undefined)
    
    inline def setExpectedSupplyDuration(value: Duration): Self = StObject.set(x, "expectedSupplyDuration", value.asInstanceOf[js.Any])
    
    inline def setExpectedSupplyDurationUndefined: Self = StObject.set(x, "expectedSupplyDuration", js.undefined)
    
    inline def setInitialFill(value: MedicationRequestDispenseRequestInitialFill): Self = StObject.set(x, "initialFill", value.asInstanceOf[js.Any])
    
    inline def setInitialFillUndefined: Self = StObject.set(x, "initialFill", js.undefined)
    
    inline def setNumberOfRepeatsAllowed(value: Double): Self = StObject.set(x, "numberOfRepeatsAllowed", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRepeatsAllowedUndefined: Self = StObject.set(x, "numberOfRepeatsAllowed", js.undefined)
    
    inline def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setValidityPeriod(value: Period): Self = StObject.set(x, "validityPeriod", value.asInstanceOf[js.Any])
    
    inline def setValidityPeriodUndefined: Self = StObject.set(x, "validityPeriod", js.undefined)
  }
}
