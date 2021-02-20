package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Medication supply authorization
  */
@js.native
trait MedicationRequestDispenseRequest extends BackboneElement {
  
  /**
    * Contains extended information for property 'numberOfRepeatsAllowed'.
    */
  var _numberOfRepeatsAllowed: js.UndefOr[Element] = js.native
  
  /**
    * Number of days supply per dispense
    */
  var expectedSupplyDuration: js.UndefOr[Duration] = js.native
  
  /**
    * Number of refills authorized
    */
  var numberOfRepeatsAllowed: js.UndefOr[positiveInt] = js.native
  
  /**
    * Intended dispenser
    */
  var performer: js.UndefOr[Reference] = js.native
  
  /**
    * Amount of medication to supply per dispense
    */
  var quantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Time period supply is authorized for
    */
  var validityPeriod: js.UndefOr[Period] = js.native
}
object MedicationRequestDispenseRequest {
  
  @scala.inline
  def apply(): MedicationRequestDispenseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationRequestDispenseRequest]
  }
  
  @scala.inline
  implicit class MedicationRequestDispenseRequestMutableBuilder[Self <: MedicationRequestDispenseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpectedSupplyDuration(value: Duration): Self = StObject.set(x, "expectedSupplyDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedSupplyDurationUndefined: Self = StObject.set(x, "expectedSupplyDuration", js.undefined)
    
    @scala.inline
    def setNumberOfRepeatsAllowed(value: positiveInt): Self = StObject.set(x, "numberOfRepeatsAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfRepeatsAllowedUndefined: Self = StObject.set(x, "numberOfRepeatsAllowed", js.undefined)
    
    @scala.inline
    def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    @scala.inline
    def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setValidityPeriod(value: Period): Self = StObject.set(x, "validityPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidityPeriodUndefined: Self = StObject.set(x, "validityPeriod", js.undefined)
    
    @scala.inline
    def set_numberOfRepeatsAllowed(value: Element): Self = StObject.set(x, "_numberOfRepeatsAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_numberOfRepeatsAllowedUndefined: Self = StObject.set(x, "_numberOfRepeatsAllowed", js.undefined)
  }
}
