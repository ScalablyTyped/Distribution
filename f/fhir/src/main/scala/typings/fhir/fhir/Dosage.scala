package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * How the medication is/was taken or should be taken
  */
@js.native
trait Dosage extends Element {
  
  /**
    * Contains extended information for property 'asNeededBoolean'.
    */
  var _asNeededBoolean: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'patientInstruction'.
    */
  var _patientInstruction: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  
  /**
    * Supplemental instruction - e.g. "with meals"
    */
  var additionalInstruction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Take "as needed" (for x)
    */
  var asNeededBoolean: js.UndefOr[Boolean] = js.native
  
  /**
    * Take "as needed" (for x)
    */
  var asNeededCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Amount of medication per dose
    */
  var doseQuantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Amount of medication per dose
    */
  var doseRange: js.UndefOr[Range] = js.native
  
  /**
    * Upper limit on medication per administration
    */
  var maxDosePerAdministration: js.UndefOr[Quantity] = js.native
  
  /**
    * Upper limit on medication per lifetime of the patient
    */
  var maxDosePerLifetime: js.UndefOr[Quantity] = js.native
  
  /**
    * Upper limit on medication per unit of time
    */
  var maxDosePerPeriod: js.UndefOr[Ratio] = js.native
  
  /**
    * Technique for administering medication
    */
  var method: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Patient or consumer oriented instructions
    */
  var patientInstruction: js.UndefOr[String] = js.native
  
  /**
    * Amount of medication per unit of time
    */
  var rateQuantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Amount of medication per unit of time
    */
  var rateRange: js.UndefOr[Range] = js.native
  
  /**
    * Amount of medication per unit of time
    */
  var rateRatio: js.UndefOr[Ratio] = js.native
  
  /**
    * How drug should enter body
    */
  var route: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * The order of the dosage instructions
    */
  var sequence: js.UndefOr[integer] = js.native
  
  /**
    * Body site to administer to
    */
  var site: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Free text dosage instructions e.g. SIG
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * When medication should be administered
    */
  var timing: js.UndefOr[Timing] = js.native
}
object Dosage {
  
  @scala.inline
  def apply(): Dosage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dosage]
  }
  
  @scala.inline
  implicit class DosageOps[Self <: Dosage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_asNeededBoolean(value: Element): Self = this.set("_asNeededBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_asNeededBoolean: Self = this.set("_asNeededBoolean", js.undefined)
    
    @scala.inline
    def set_patientInstruction(value: Element): Self = this.set("_patientInstruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_patientInstruction: Self = this.set("_patientInstruction", js.undefined)
    
    @scala.inline
    def set_sequence(value: Element): Self = this.set("_sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_sequence: Self = this.set("_sequence", js.undefined)
    
    @scala.inline
    def set_text(value: Element): Self = this.set("_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_text: Self = this.set("_text", js.undefined)
    
    @scala.inline
    def setAdditionalInstructionVarargs(value: CodeableConcept*): Self = this.set("additionalInstruction", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalInstruction(value: js.Array[CodeableConcept]): Self = this.set("additionalInstruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalInstruction: Self = this.set("additionalInstruction", js.undefined)
    
    @scala.inline
    def setAsNeededBoolean(value: Boolean): Self = this.set("asNeededBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsNeededBoolean: Self = this.set("asNeededBoolean", js.undefined)
    
    @scala.inline
    def setAsNeededCodeableConcept(value: CodeableConcept): Self = this.set("asNeededCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsNeededCodeableConcept: Self = this.set("asNeededCodeableConcept", js.undefined)
    
    @scala.inline
    def setDoseQuantity(value: Quantity): Self = this.set("doseQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoseQuantity: Self = this.set("doseQuantity", js.undefined)
    
    @scala.inline
    def setDoseRange(value: Range): Self = this.set("doseRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoseRange: Self = this.set("doseRange", js.undefined)
    
    @scala.inline
    def setMaxDosePerAdministration(value: Quantity): Self = this.set("maxDosePerAdministration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDosePerAdministration: Self = this.set("maxDosePerAdministration", js.undefined)
    
    @scala.inline
    def setMaxDosePerLifetime(value: Quantity): Self = this.set("maxDosePerLifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDosePerLifetime: Self = this.set("maxDosePerLifetime", js.undefined)
    
    @scala.inline
    def setMaxDosePerPeriod(value: Ratio): Self = this.set("maxDosePerPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDosePerPeriod: Self = this.set("maxDosePerPeriod", js.undefined)
    
    @scala.inline
    def setMethod(value: CodeableConcept): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPatientInstruction(value: String): Self = this.set("patientInstruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatientInstruction: Self = this.set("patientInstruction", js.undefined)
    
    @scala.inline
    def setRateQuantity(value: Quantity): Self = this.set("rateQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateQuantity: Self = this.set("rateQuantity", js.undefined)
    
    @scala.inline
    def setRateRange(value: Range): Self = this.set("rateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateRange: Self = this.set("rateRange", js.undefined)
    
    @scala.inline
    def setRateRatio(value: Ratio): Self = this.set("rateRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateRatio: Self = this.set("rateRatio", js.undefined)
    
    @scala.inline
    def setRoute(value: CodeableConcept): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
    
    @scala.inline
    def setSequence(value: integer): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequence: Self = this.set("sequence", js.undefined)
    
    @scala.inline
    def setSite(value: CodeableConcept): Self = this.set("site", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSite: Self = this.set("site", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTiming(value: Timing): Self = this.set("timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTiming: Self = this.set("timing", js.undefined)
  }
}
