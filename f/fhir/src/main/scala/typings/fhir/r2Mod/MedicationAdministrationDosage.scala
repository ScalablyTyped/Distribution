package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationAdministrationDosage
  extends StObject
     with BackboneElement {
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The amount of the medication given at one administration event.   Use this value when the administration is essentially an instantaneous event such as a swallowing a tablet or giving an injection.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Currently we do not specify a default of '1' in the denominator, but this is being discussed.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.
    */
  var rateRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Identifies the speed with which the medication was or will be introduced into the patient.  Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.  Currently we do not specify a default of '1' in the denominator, but this is being discussed.  Other examples:  200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours.
    */
  var rateRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * A code specifying the route or physiological path of administration of a therapeutic agent into or onto the patient.  For example, topical, intravenous, etc.
    */
  var route: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A coded specification of the anatomic site where the medication first entered the body.  For example, "left arm".
    */
  var siteCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A coded specification of the anatomic site where the medication first entered the body.  For example, "left arm".
    */
  var siteReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Free text dosage instructions can be used for cases where the instructions are too complex to code. When coded instructions are present, the free text instructions may still be present for display to humans taking or administering the medication.
    */
  var text: js.UndefOr[String] = js.undefined
}
object MedicationAdministrationDosage {
  
  inline def apply(): MedicationAdministrationDosage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationAdministrationDosage]
  }
  
  extension [Self <: MedicationAdministrationDosage](x: Self) {
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setRateRange(value: Range): Self = StObject.set(x, "rateRange", value.asInstanceOf[js.Any])
    
    inline def setRateRangeUndefined: Self = StObject.set(x, "rateRange", js.undefined)
    
    inline def setRateRatio(value: Ratio): Self = StObject.set(x, "rateRatio", value.asInstanceOf[js.Any])
    
    inline def setRateRatioUndefined: Self = StObject.set(x, "rateRatio", js.undefined)
    
    inline def setRoute(value: CodeableConcept): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setSiteCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "siteCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setSiteCodeableConceptUndefined: Self = StObject.set(x, "siteCodeableConcept", js.undefined)
    
    inline def setSiteReference(value: Reference): Self = StObject.set(x, "siteReference", value.asInstanceOf[js.Any])
    
    inline def setSiteReferenceUndefined: Self = StObject.set(x, "siteReference", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
