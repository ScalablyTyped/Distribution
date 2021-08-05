package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * How the medication is/was taken or should be taken
  */
trait Dosage
  extends StObject
     with Element {
  
  /**
    * Contains extended information for property 'asNeededBoolean'.
    */
  var _asNeededBoolean: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'patientInstruction'.
    */
  var _patientInstruction: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Supplemental instruction - e.g. "with meals"
    */
  var additionalInstruction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Take "as needed" (for x)
    */
  var asNeededBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Take "as needed" (for x)
    */
  var asNeededCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Amount of medication per dose
    */
  var doseQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Amount of medication per dose
    */
  var doseRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Upper limit on medication per administration
    */
  var maxDosePerAdministration: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Upper limit on medication per lifetime of the patient
    */
  var maxDosePerLifetime: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Upper limit on medication per unit of time
    */
  var maxDosePerPeriod: js.UndefOr[Ratio] = js.undefined
  
  /**
    * Technique for administering medication
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Patient or consumer oriented instructions
    */
  var patientInstruction: js.UndefOr[String] = js.undefined
  
  /**
    * Amount of medication per unit of time
    */
  var rateQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Amount of medication per unit of time
    */
  var rateRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Amount of medication per unit of time
    */
  var rateRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * How drug should enter body
    */
  var route: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The order of the dosage instructions
    */
  var sequence: js.UndefOr[integer] = js.undefined
  
  /**
    * Body site to administer to
    */
  var site: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Free text dosage instructions e.g. SIG
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * When medication should be administered
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
    
    inline def setAdditionalInstructionVarargs(value: CodeableConcept*): Self = StObject.set(x, "additionalInstruction", js.Array(value :_*))
    
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
    
    inline def setSequence(value: integer): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
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
    
    inline def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    inline def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
