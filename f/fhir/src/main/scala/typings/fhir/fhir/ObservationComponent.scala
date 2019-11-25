package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Component results
  */
trait ObservationComponent extends BackboneElement {
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueTime'.
    */
  var _valueTime: js.UndefOr[Element] = js.undefined
  /**
    * Type of component observation (code / type)
    */
  var code: CodeableConcept
  /**
    * Why the component result is missing
    */
  var dataAbsentReason: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * High, low, normal, etc.
    */
  var interpretation: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Provides guide for interpretation of component result
    */
  var referenceRange: js.UndefOr[js.Array[ObservationReferenceRange]] = js.undefined
  /**
    * Actual component result
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * Actual component result
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Actual component result
    */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Actual component result
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
  /**
    * Actual component result
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Actual component result
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  /**
    * Actual component result
    */
  var valueRatio: js.UndefOr[Ratio] = js.undefined
  /**
    * Actual component result
    */
  var valueSampledData: js.UndefOr[SampledData] = js.undefined
  /**
    * Actual component result
    */
  var valueString: js.UndefOr[String] = js.undefined
  /**
    * Actual component result
    */
  var valueTime: js.UndefOr[time] = js.undefined
}

object ObservationComponent {
  @scala.inline
  def apply(
    code: CodeableConcept,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _valueDateTime: Element = null,
    _valueString: Element = null,
    _valueTime: Element = null,
    dataAbsentReason: CodeableConcept = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    interpretation: CodeableConcept = null,
    modifierExtension: js.Array[Extension] = null,
    referenceRange: js.Array[ObservationReferenceRange] = null,
    valueAttachment: Attachment = null,
    valueCodeableConcept: CodeableConcept = null,
    valueDateTime: dateTime = null,
    valuePeriod: Period = null,
    valueQuantity: Quantity = null,
    valueRange: Range = null,
    valueRatio: Ratio = null,
    valueSampledData: SampledData = null,
    valueString: String = null,
    valueTime: time = null
  ): ObservationComponent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_valueDateTime != null) __obj.updateDynamic("_valueDateTime")(_valueDateTime.asInstanceOf[js.Any])
    if (_valueString != null) __obj.updateDynamic("_valueString")(_valueString.asInstanceOf[js.Any])
    if (_valueTime != null) __obj.updateDynamic("_valueTime")(_valueTime.asInstanceOf[js.Any])
    if (dataAbsentReason != null) __obj.updateDynamic("dataAbsentReason")(dataAbsentReason.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (interpretation != null) __obj.updateDynamic("interpretation")(interpretation.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (referenceRange != null) __obj.updateDynamic("referenceRange")(referenceRange.asInstanceOf[js.Any])
    if (valueAttachment != null) __obj.updateDynamic("valueAttachment")(valueAttachment.asInstanceOf[js.Any])
    if (valueCodeableConcept != null) __obj.updateDynamic("valueCodeableConcept")(valueCodeableConcept.asInstanceOf[js.Any])
    if (valueDateTime != null) __obj.updateDynamic("valueDateTime")(valueDateTime.asInstanceOf[js.Any])
    if (valuePeriod != null) __obj.updateDynamic("valuePeriod")(valuePeriod.asInstanceOf[js.Any])
    if (valueQuantity != null) __obj.updateDynamic("valueQuantity")(valueQuantity.asInstanceOf[js.Any])
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange.asInstanceOf[js.Any])
    if (valueRatio != null) __obj.updateDynamic("valueRatio")(valueRatio.asInstanceOf[js.Any])
    if (valueSampledData != null) __obj.updateDynamic("valueSampledData")(valueSampledData.asInstanceOf[js.Any])
    if (valueString != null) __obj.updateDynamic("valueString")(valueString.asInstanceOf[js.Any])
    if (valueTime != null) __obj.updateDynamic("valueTime")(valueTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservationComponent]
  }
}

