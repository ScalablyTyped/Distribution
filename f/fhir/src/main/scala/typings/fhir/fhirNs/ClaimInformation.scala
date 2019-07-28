package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exceptions, special considerations, the condition, situation, prior or concurrent issues
  */
trait ClaimInformation extends BackboneElement {
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'timingDate'.
    */
  var _timingDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.undefined
  /**
    * General class of information
    */
  var category: CodeableConcept
  /**
    * Type of information
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Reason associated with the information
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Information instance identifier
    */
  var sequence: positiveInt
  /**
    * When it occurred
    */
  var timingDate: js.UndefOr[date] = js.undefined
  /**
    * When it occurred
    */
  var timingPeriod: js.UndefOr[Period] = js.undefined
  /**
    * Additional Data or supporting information
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * Additional Data or supporting information
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Additional Data or supporting information
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
  /**
    * Additional Data or supporting information
    */
  var valueString: js.UndefOr[String] = js.undefined
}

object ClaimInformation {
  @scala.inline
  def apply(
    category: CodeableConcept,
    sequence: positiveInt,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _sequence: Element = null,
    _timingDate: Element = null,
    _valueString: Element = null,
    code: CodeableConcept = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    reason: CodeableConcept = null,
    timingDate: date = null,
    timingPeriod: Period = null,
    valueAttachment: Attachment = null,
    valueQuantity: Quantity = null,
    valueReference: Reference = null,
    valueString: String = null
  ): ClaimInformation = {
    val __obj = js.Dynamic.literal(category = category, sequence = sequence)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_sequence != null) __obj.updateDynamic("_sequence")(_sequence)
    if (_timingDate != null) __obj.updateDynamic("_timingDate")(_timingDate)
    if (_valueString != null) __obj.updateDynamic("_valueString")(_valueString)
    if (code != null) __obj.updateDynamic("code")(code)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (timingDate != null) __obj.updateDynamic("timingDate")(timingDate)
    if (timingPeriod != null) __obj.updateDynamic("timingPeriod")(timingPeriod)
    if (valueAttachment != null) __obj.updateDynamic("valueAttachment")(valueAttachment)
    if (valueQuantity != null) __obj.updateDynamic("valueQuantity")(valueQuantity)
    if (valueReference != null) __obj.updateDynamic("valueReference")(valueReference)
    if (valueString != null) __obj.updateDynamic("valueString")(valueString)
    __obj.asInstanceOf[ClaimInformation]
  }
}

