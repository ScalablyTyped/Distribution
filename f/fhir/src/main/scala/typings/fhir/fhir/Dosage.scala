package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * How the medication is/was taken or should be taken
  */
trait Dosage extends Element {
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
  @scala.inline
  def apply(
    _asNeededBoolean: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _patientInstruction: Element = null,
    _sequence: Element = null,
    _text: Element = null,
    additionalInstruction: js.Array[CodeableConcept] = null,
    asNeededBoolean: js.UndefOr[Boolean] = js.undefined,
    asNeededCodeableConcept: CodeableConcept = null,
    doseQuantity: Quantity = null,
    doseRange: Range = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    maxDosePerAdministration: Quantity = null,
    maxDosePerLifetime: Quantity = null,
    maxDosePerPeriod: Ratio = null,
    method: CodeableConcept = null,
    patientInstruction: String = null,
    rateQuantity: Quantity = null,
    rateRange: Range = null,
    rateRatio: Ratio = null,
    route: CodeableConcept = null,
    sequence: Int | Double = null,
    site: CodeableConcept = null,
    text: String = null,
    timing: Timing = null
  ): Dosage = {
    val __obj = js.Dynamic.literal()
    if (_asNeededBoolean != null) __obj.updateDynamic("_asNeededBoolean")(_asNeededBoolean.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_patientInstruction != null) __obj.updateDynamic("_patientInstruction")(_patientInstruction.asInstanceOf[js.Any])
    if (_sequence != null) __obj.updateDynamic("_sequence")(_sequence.asInstanceOf[js.Any])
    if (_text != null) __obj.updateDynamic("_text")(_text.asInstanceOf[js.Any])
    if (additionalInstruction != null) __obj.updateDynamic("additionalInstruction")(additionalInstruction.asInstanceOf[js.Any])
    if (!js.isUndefined(asNeededBoolean)) __obj.updateDynamic("asNeededBoolean")(asNeededBoolean.asInstanceOf[js.Any])
    if (asNeededCodeableConcept != null) __obj.updateDynamic("asNeededCodeableConcept")(asNeededCodeableConcept.asInstanceOf[js.Any])
    if (doseQuantity != null) __obj.updateDynamic("doseQuantity")(doseQuantity.asInstanceOf[js.Any])
    if (doseRange != null) __obj.updateDynamic("doseRange")(doseRange.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxDosePerAdministration != null) __obj.updateDynamic("maxDosePerAdministration")(maxDosePerAdministration.asInstanceOf[js.Any])
    if (maxDosePerLifetime != null) __obj.updateDynamic("maxDosePerLifetime")(maxDosePerLifetime.asInstanceOf[js.Any])
    if (maxDosePerPeriod != null) __obj.updateDynamic("maxDosePerPeriod")(maxDosePerPeriod.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (patientInstruction != null) __obj.updateDynamic("patientInstruction")(patientInstruction.asInstanceOf[js.Any])
    if (rateQuantity != null) __obj.updateDynamic("rateQuantity")(rateQuantity.asInstanceOf[js.Any])
    if (rateRange != null) __obj.updateDynamic("rateRange")(rateRange.asInstanceOf[js.Any])
    if (rateRatio != null) __obj.updateDynamic("rateRatio")(rateRatio.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dosage]
  }
}

