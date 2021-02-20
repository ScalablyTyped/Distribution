package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of how medication was taken
  */
@js.native
trait MedicationAdministrationDosage extends BackboneElement {
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  
  /**
    * Amount of medication per dose
    */
  var dose: js.UndefOr[Quantity] = js.native
  
  /**
    * How drug was administered
    */
  var method: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Dose quantity per unit of time
    */
  var rateQuantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Dose quantity per unit of time
    */
  var rateRatio: js.UndefOr[Ratio] = js.native
  
  /**
    * Path of substance into body
    */
  var route: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Body site administered to
    */
  var site: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Free text dosage instructions e.g. SIG
    */
  var text: js.UndefOr[String] = js.native
}
object MedicationAdministrationDosage {
  
  @scala.inline
  def apply(): MedicationAdministrationDosage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationAdministrationDosage]
  }
  
  @scala.inline
  implicit class MedicationAdministrationDosageMutableBuilder[Self <: MedicationAdministrationDosage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDose(value: Quantity): Self = StObject.set(x, "dose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoseUndefined: Self = StObject.set(x, "dose", js.undefined)
    
    @scala.inline
    def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setRateQuantity(value: Quantity): Self = StObject.set(x, "rateQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateQuantityUndefined: Self = StObject.set(x, "rateQuantity", js.undefined)
    
    @scala.inline
    def setRateRatio(value: Ratio): Self = StObject.set(x, "rateRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateRatioUndefined: Self = StObject.set(x, "rateRatio", js.undefined)
    
    @scala.inline
    def setRoute(value: CodeableConcept): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    @scala.inline
    def setSite(value: CodeableConcept): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
