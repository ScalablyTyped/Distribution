package typings
package fhirLib.fhirNs

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
  var asNeededBoolean: js.UndefOr[scala.Boolean] = js.undefined
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
  var patientInstruction: js.UndefOr[java.lang.String] = js.undefined
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
  var text: js.UndefOr[java.lang.String] = js.undefined
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
    asNeededBoolean: js.UndefOr[scala.Boolean] = js.undefined,
    asNeededCodeableConcept: CodeableConcept = null,
    doseQuantity: Quantity = null,
    doseRange: Range = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    maxDosePerAdministration: Quantity = null,
    maxDosePerLifetime: Quantity = null,
    maxDosePerPeriod: Ratio = null,
    method: CodeableConcept = null,
    patientInstruction: java.lang.String = null,
    rateQuantity: Quantity = null,
    rateRange: Range = null,
    rateRatio: Ratio = null,
    route: CodeableConcept = null,
    sequence: js.UndefOr[integer] = js.undefined,
    site: CodeableConcept = null,
    text: java.lang.String = null,
    timing: Timing = null
  ): Dosage = {
    val __obj = js.Dynamic.literal()
    if (_asNeededBoolean != null) __obj.updateDynamic("_asNeededBoolean")(_asNeededBoolean)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_patientInstruction != null) __obj.updateDynamic("_patientInstruction")(_patientInstruction)
    if (_sequence != null) __obj.updateDynamic("_sequence")(_sequence)
    if (_text != null) __obj.updateDynamic("_text")(_text)
    if (additionalInstruction != null) __obj.updateDynamic("additionalInstruction")(additionalInstruction)
    if (!js.isUndefined(asNeededBoolean)) __obj.updateDynamic("asNeededBoolean")(asNeededBoolean)
    if (asNeededCodeableConcept != null) __obj.updateDynamic("asNeededCodeableConcept")(asNeededCodeableConcept)
    if (doseQuantity != null) __obj.updateDynamic("doseQuantity")(doseQuantity)
    if (doseRange != null) __obj.updateDynamic("doseRange")(doseRange)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (maxDosePerAdministration != null) __obj.updateDynamic("maxDosePerAdministration")(maxDosePerAdministration)
    if (maxDosePerLifetime != null) __obj.updateDynamic("maxDosePerLifetime")(maxDosePerLifetime)
    if (maxDosePerPeriod != null) __obj.updateDynamic("maxDosePerPeriod")(maxDosePerPeriod)
    if (method != null) __obj.updateDynamic("method")(method)
    if (patientInstruction != null) __obj.updateDynamic("patientInstruction")(patientInstruction)
    if (rateQuantity != null) __obj.updateDynamic("rateQuantity")(rateQuantity)
    if (rateRange != null) __obj.updateDynamic("rateRange")(rateRange)
    if (rateRatio != null) __obj.updateDynamic("rateRatio")(rateRatio)
    if (route != null) __obj.updateDynamic("route")(route)
    if (!js.isUndefined(sequence)) __obj.updateDynamic("sequence")(sequence)
    if (site != null) __obj.updateDynamic("site")(site)
    if (text != null) __obj.updateDynamic("text")(text)
    if (timing != null) __obj.updateDynamic("timing")(timing)
    __obj.asInstanceOf[Dosage]
  }
}

