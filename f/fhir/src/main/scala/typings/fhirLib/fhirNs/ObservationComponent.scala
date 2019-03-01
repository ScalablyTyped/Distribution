package typings
package fhirLib.fhirNs

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
  var valueString: js.UndefOr[java.lang.String] = js.undefined
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
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
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
    valueString: java.lang.String = null,
    valueTime: time = null
  ): ObservationComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_valueDateTime != null) __obj.updateDynamic("_valueDateTime")(_valueDateTime)
    if (_valueString != null) __obj.updateDynamic("_valueString")(_valueString)
    if (_valueTime != null) __obj.updateDynamic("_valueTime")(_valueTime)
    if (dataAbsentReason != null) __obj.updateDynamic("dataAbsentReason")(dataAbsentReason)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (interpretation != null) __obj.updateDynamic("interpretation")(interpretation)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (referenceRange != null) __obj.updateDynamic("referenceRange")(referenceRange)
    if (valueAttachment != null) __obj.updateDynamic("valueAttachment")(valueAttachment)
    if (valueCodeableConcept != null) __obj.updateDynamic("valueCodeableConcept")(valueCodeableConcept)
    if (valueDateTime != null) __obj.updateDynamic("valueDateTime")(valueDateTime)
    if (valuePeriod != null) __obj.updateDynamic("valuePeriod")(valuePeriod)
    if (valueQuantity != null) __obj.updateDynamic("valueQuantity")(valueQuantity)
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange)
    if (valueRatio != null) __obj.updateDynamic("valueRatio")(valueRatio)
    if (valueSampledData != null) __obj.updateDynamic("valueSampledData")(valueSampledData)
    if (valueString != null) __obj.updateDynamic("valueString")(valueString)
    if (valueTime != null) __obj.updateDynamic("valueTime")(valueTime)
    __obj.asInstanceOf[ObservationComponent]
  }
}

