package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dosage
  extends StObject
     with Element {
  
  var _asNeededBoolean: js.UndefOr[Element] = js.undefined
  
  var _patientInstruction: js.UndefOr[Element] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Supplemental instruction - e.g. "with meals".
    */
  var additionalInstruction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Can express "as needed" without a reason by setting the Boolean = True.  In this case the CodeableConcept is not populated.  Or you can express "as needed" with a reason by including the CodeableConcept.  In this case the Boolean is assumed to be True.  If you set the Boolean to False, then the dose is given according to the schedule and is not "prn" or "as needed".
    */
  var asNeededBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Can express "as needed" without a reason by setting the Boolean = True.  In this case the CodeableConcept is not populated.  Or you can express "as needed" with a reason by including the CodeableConcept.  In this case the Boolean is assumed to be True.  If you set the Boolean to False, then the dose is given according to the schedule and is not "prn" or "as needed".
    */
  var asNeededCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Note that this specifies the quantity of the specified medication, not the quantity for each active ingredient(s). Each ingredient amount can be communicated in the Medication resource. For example, if one wants to communicate that a tablet was 375 mg, where the dose was one tablet, you can use the Medication resource to document that the tablet was comprised of 375 mg of drug XYZ. Alternatively if the dose was 375 mg, then you may only need to use the Medication resource to indicate this was a tablet. If the example were an IV such as dopamine and you wanted to communicate that 400mg of dopamine was mixed in 500 ml of some IV solution, then this would all be communicated in the Medication resource. If the administration is not intended to be instantaneous (rate is present or timing has a duration), this can be specified to convey the total amount to be administered over the period of time as indicated by the schedule e.g. 500 ml in dose, with timing used to convey that this should be done over 4 hours.
    */
  var doseQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Note that this specifies the quantity of the specified medication, not the quantity for each active ingredient(s). Each ingredient amount can be communicated in the Medication resource. For example, if one wants to communicate that a tablet was 375 mg, where the dose was one tablet, you can use the Medication resource to document that the tablet was comprised of 375 mg of drug XYZ. Alternatively if the dose was 375 mg, then you may only need to use the Medication resource to indicate this was a tablet. If the example were an IV such as dopamine and you wanted to communicate that 400mg of dopamine was mixed in 500 ml of some IV solution, then this would all be communicated in the Medication resource. If the administration is not intended to be instantaneous (rate is present or timing has a duration), this can be specified to convey the total amount to be administered over the period of time as indicated by the schedule e.g. 500 ml in dose, with timing used to convey that this should be done over 4 hours.
    */
  var doseRange: js.UndefOr[Range] = js.undefined
  
  /**
    * This is intended for use as an adjunct to the dosage when there is an upper cap.  For example, a body surface area related dose with a maximum amount, such as 1.5 mg/m2 (maximum 2 mg) IV over 5 – 10 minutes would have doseQuantity of 1.5 mg/m2 and maxDosePerAdministration of 2 mg.
    */
  var maxDosePerAdministration: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Upper limit on medication per lifetime of the patient.
    */
  var maxDosePerLifetime: js.UndefOr[Quantity] = js.undefined
  
  /**
    * This is intended for use as an adjunct to the dosage when there is an upper cap.  For example "2 tablets every 4 hours to a maximum of 8/day".
    */
  var maxDosePerPeriod: js.UndefOr[Ratio] = js.undefined
  
  /**
    * Terminologies used often pre-coordinate this term with the route and or form of administration.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Instructions in terms that are understood by the patient or consumer.
    */
  var patientInstruction: js.UndefOr[String] = js.undefined
  
  /**
    * It is possible to supply both a rate and a doseQuantity to provide full details about how the medication is to be administered and supplied. If the rate is intended to change over time, depending on local rules/regulations, each change should be captured as a new version of the MedicationRequest with an updated rate, or captured with a new MedicationRequest with the new rate.
    */
  var rateQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * It is possible to supply both a rate and a doseQuantity to provide full details about how the medication is to be administered and supplied. If the rate is intended to change over time, depending on local rules/regulations, each change should be captured as a new version of the MedicationRequest with an updated rate, or captured with a new MedicationRequest with the new rate.
    */
  var rateRange: js.UndefOr[Range] = js.undefined
  
  /**
    * It is possible to supply both a rate and a doseQuantity to provide full details about how the medication is to be administered and supplied. If the rate is intended to change over time, depending on local rules/regulations, each change should be captured as a new version of the MedicationRequest with an updated rate, or captured with a new MedicationRequest with the new rate.
    */
  var rateRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * How drug should enter body.
    */
  var route: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Indicates the order in which the dosage instructions should be applied or interpreted.
    */
  var sequence: js.UndefOr[Double] = js.undefined
  
  /**
    * If the use case requires attributes from the BodySite resource (e.g. to identify and track separately) then use the standard extension [body-site-instance](extension-body-site-instance.html).  May be a summary code, or a reference to a very precise definition of the location, or both.
    */
  var site: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Free text dosage instructions e.g. SIG.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * This attribute may not always be populated while the Dosage.text is expected to be populated.  If both are populated, then the Dosage.text should reflect the content of the Dosage.timing.
    */
  var timing: js.UndefOr[Timing] = js.undefined
}
object Dosage {
  
  inline def apply(): Dosage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dosage]
  }
  
  extension [Self <: Dosage](x: Self) {
    
    inline def setAdditionalInstruction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "additionalInstruction", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInstructionUndefined: Self = StObject.set(x, "additionalInstruction", js.undefined)
    
    inline def setAdditionalInstructionVarargs(value: CodeableConcept*): Self = StObject.set(x, "additionalInstruction", js.Array(value*))
    
    inline def setAsNeededBoolean(value: Boolean): Self = StObject.set(x, "asNeededBoolean", value.asInstanceOf[js.Any])
    
    inline def setAsNeededBooleanUndefined: Self = StObject.set(x, "asNeededBoolean", js.undefined)
    
    inline def setAsNeededCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "asNeededCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setAsNeededCodeableConceptUndefined: Self = StObject.set(x, "asNeededCodeableConcept", js.undefined)
    
    inline def setDoseQuantity(value: Quantity): Self = StObject.set(x, "doseQuantity", value.asInstanceOf[js.Any])
    
    inline def setDoseQuantityUndefined: Self = StObject.set(x, "doseQuantity", js.undefined)
    
    inline def setDoseRange(value: Range): Self = StObject.set(x, "doseRange", value.asInstanceOf[js.Any])
    
    inline def setDoseRangeUndefined: Self = StObject.set(x, "doseRange", js.undefined)
    
    inline def setMaxDosePerAdministration(value: Quantity): Self = StObject.set(x, "maxDosePerAdministration", value.asInstanceOf[js.Any])
    
    inline def setMaxDosePerAdministrationUndefined: Self = StObject.set(x, "maxDosePerAdministration", js.undefined)
    
    inline def setMaxDosePerLifetime(value: Quantity): Self = StObject.set(x, "maxDosePerLifetime", value.asInstanceOf[js.Any])
    
    inline def setMaxDosePerLifetimeUndefined: Self = StObject.set(x, "maxDosePerLifetime", js.undefined)
    
    inline def setMaxDosePerPeriod(value: Ratio): Self = StObject.set(x, "maxDosePerPeriod", value.asInstanceOf[js.Any])
    
    inline def setMaxDosePerPeriodUndefined: Self = StObject.set(x, "maxDosePerPeriod", js.undefined)
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPatientInstruction(value: String): Self = StObject.set(x, "patientInstruction", value.asInstanceOf[js.Any])
    
    inline def setPatientInstructionUndefined: Self = StObject.set(x, "patientInstruction", js.undefined)
    
    inline def setRateQuantity(value: Quantity): Self = StObject.set(x, "rateQuantity", value.asInstanceOf[js.Any])
    
    inline def setRateQuantityUndefined: Self = StObject.set(x, "rateQuantity", js.undefined)
    
    inline def setRateRange(value: Range): Self = StObject.set(x, "rateRange", value.asInstanceOf[js.Any])
    
    inline def setRateRangeUndefined: Self = StObject.set(x, "rateRange", js.undefined)
    
    inline def setRateRatio(value: Ratio): Self = StObject.set(x, "rateRatio", value.asInstanceOf[js.Any])
    
    inline def setRateRatioUndefined: Self = StObject.set(x, "rateRatio", js.undefined)
    
    inline def setRoute(value: CodeableConcept): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setSite(value: CodeableConcept): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTiming(value: Timing): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
    
    inline def set_asNeededBoolean(value: Element): Self = StObject.set(x, "_asNeededBoolean", value.asInstanceOf[js.Any])
    
    inline def set_asNeededBooleanUndefined: Self = StObject.set(x, "_asNeededBoolean", js.undefined)
    
    inline def set_patientInstruction(value: Element): Self = StObject.set(x, "_patientInstruction", value.asInstanceOf[js.Any])
    
    inline def set_patientInstructionUndefined: Self = StObject.set(x, "_patientInstruction", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
