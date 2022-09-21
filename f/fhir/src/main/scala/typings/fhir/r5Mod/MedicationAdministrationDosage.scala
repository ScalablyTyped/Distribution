package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationAdministrationDosage
  extends StObject
     with BackboneElement {
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * If the administration is not instantaneous (rate is present), this can be specified to convey the total amount administered over period of time of a single administration.
    */
  var dose: js.UndefOr[Quantity] = js.undefined
  
  /**
    * One of the reasons this attribute is not used often, is that the method is often pre-coordinated with the route and/or form of administration.  This means the codes used in route or form may pre-coordinate the method in the route code or the form code.  The implementation decision about what coding system to use for route or form code will determine how frequently the method code will be populated e.g. if route or form code pre-coordinate method code, then this attribute will not be populated often; if there is no pre-coordination then method code may  be used frequently.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * If the rate changes over time, and you want to capture this in MedicationAdministration, then each change should be captured as a distinct MedicationAdministration, with a specific MedicationAdministration.dosage.rate, and the date time when the rate change occurred. Typically, the MedicationAdministration.dosage.rate element is not used to convey an average rate.
    */
  var rateQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * If the rate changes over time, and you want to capture this in MedicationAdministration, then each change should be captured as a distinct MedicationAdministration, with a specific MedicationAdministration.dosage.rate, and the date time when the rate change occurred. Typically, the MedicationAdministration.dosage.rate element is not used to convey an average rate.
    */
  var rateRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * A code specifying the route or physiological path of administration of a therapeutic agent into or onto the patient.  For example, topical, intravenous, etc.
    */
  var route: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * If the use case requires attributes from the BodySite resource (e.g. to identify and track separately) then use the standard extension [bodySite](extension-bodysite.html).  May be a summary code, or a reference to a very precise definition of the location, or both.
    */
  var site: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Free text dosage can be used for cases where the dosage administered is too complex to code. When coded dosage is present, the free text dosage may still be present for display to humans.
    * The dosage instructions should reflect the dosage of the medication that was administered.
    */
  var text: js.UndefOr[String] = js.undefined
}
object MedicationAdministrationDosage {
  
  inline def apply(): MedicationAdministrationDosage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationAdministrationDosage]
  }
  
  extension [Self <: MedicationAdministrationDosage](x: Self) {
    
    inline def setDose(value: Quantity): Self = StObject.set(x, "dose", value.asInstanceOf[js.Any])
    
    inline def setDoseUndefined: Self = StObject.set(x, "dose", js.undefined)
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setRateQuantity(value: Quantity): Self = StObject.set(x, "rateQuantity", value.asInstanceOf[js.Any])
    
    inline def setRateQuantityUndefined: Self = StObject.set(x, "rateQuantity", js.undefined)
    
    inline def setRateRatio(value: Ratio): Self = StObject.set(x, "rateRatio", value.asInstanceOf[js.Any])
    
    inline def setRateRatioUndefined: Self = StObject.set(x, "rateRatio", js.undefined)
    
    inline def setRoute(value: CodeableConcept): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setSite(value: CodeableConcept): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
