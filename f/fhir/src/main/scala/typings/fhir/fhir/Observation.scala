package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Measurements and simple assertions
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Observation extends DomainResource {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
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
    * Fulfills plan, proposal or order
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Observed body part
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Classification of  type of observation
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Type of observation (code / type)
    */
  var code: CodeableConcept
  /**
    * Comments about result
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * Component results
    */
  var component: js.UndefOr[js.Array[ObservationComponent]] = js.undefined
  /**
    * Healthcare event during which this observation is made
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Why the result is missing
    */
  var dataAbsentReason: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * (Measurement) Device
    */
  var device: js.UndefOr[Reference] = js.undefined
  /**
    * Clinically relevant time/time-period for observation
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Clinically relevant time/time-period for observation
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  /**
    * Business Identifier for observation
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * High, low, normal, etc.
    */
  var interpretation: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Date/Time this was made available
    */
  var issued: js.UndefOr[instant] = js.undefined
  /**
    * How it was done
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Who is responsible for the observation
    */
  var performer: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Provides guide for interpretation
    */
  var referenceRange: js.UndefOr[js.Array[ObservationReferenceRange]] = js.undefined
  /**
    * Resource related to this observation
    */
  var related: js.UndefOr[js.Array[ObservationRelated]] = js.undefined
  /**
    * Specimen used for this observation
    */
  var specimen: js.UndefOr[Reference] = js.undefined
  /**
    * registered | preliminary | final | amended +
    */
  var status: code
  /**
    * Who and/or what this is about
    */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
    * Actual result
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * Actual result
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  /**
    * Actual result
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Actual result
    */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Actual result
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
  /**
    * Actual result
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Actual result
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  /**
    * Actual result
    */
  var valueRatio: js.UndefOr[Ratio] = js.undefined
  /**
    * Actual result
    */
  var valueSampledData: js.UndefOr[SampledData] = js.undefined
  /**
    * Actual result
    */
  var valueString: js.UndefOr[String] = js.undefined
  /**
    * Actual result
    */
  var valueTime: js.UndefOr[time] = js.undefined
}

object Observation {
  @scala.inline
  def apply(
    code: CodeableConcept,
    status: code,
    _comment: Element = null,
    _effectiveDateTime: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _issued: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _valueBoolean: Element = null,
    _valueDateTime: Element = null,
    _valueString: Element = null,
    _valueTime: Element = null,
    basedOn: js.Array[Reference] = null,
    bodySite: CodeableConcept = null,
    category: js.Array[CodeableConcept] = null,
    comment: String = null,
    component: js.Array[ObservationComponent] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    dataAbsentReason: CodeableConcept = null,
    device: Reference = null,
    effectiveDateTime: dateTime = null,
    effectivePeriod: Period = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    interpretation: CodeableConcept = null,
    issued: instant = null,
    language: code = null,
    meta: Meta = null,
    method: CodeableConcept = null,
    modifierExtension: js.Array[Extension] = null,
    performer: js.Array[Reference] = null,
    referenceRange: js.Array[ObservationReferenceRange] = null,
    related: js.Array[ObservationRelated] = null,
    resourceType: code = null,
    specimen: Reference = null,
    subject: Reference = null,
    text: Narrative = null,
    valueAttachment: Attachment = null,
    valueBoolean: js.UndefOr[Boolean] = js.undefined,
    valueCodeableConcept: CodeableConcept = null,
    valueDateTime: dateTime = null,
    valuePeriod: Period = null,
    valueQuantity: Quantity = null,
    valueRange: Range = null,
    valueRatio: Ratio = null,
    valueSampledData: SampledData = null,
    valueString: String = null,
    valueTime: time = null
  ): Observation = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_comment != null) __obj.updateDynamic("_comment")(_comment.asInstanceOf[js.Any])
    if (_effectiveDateTime != null) __obj.updateDynamic("_effectiveDateTime")(_effectiveDateTime.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_issued != null) __obj.updateDynamic("_issued")(_issued.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_valueBoolean != null) __obj.updateDynamic("_valueBoolean")(_valueBoolean.asInstanceOf[js.Any])
    if (_valueDateTime != null) __obj.updateDynamic("_valueDateTime")(_valueDateTime.asInstanceOf[js.Any])
    if (_valueString != null) __obj.updateDynamic("_valueString")(_valueString.asInstanceOf[js.Any])
    if (_valueTime != null) __obj.updateDynamic("_valueTime")(_valueTime.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (bodySite != null) __obj.updateDynamic("bodySite")(bodySite.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (dataAbsentReason != null) __obj.updateDynamic("dataAbsentReason")(dataAbsentReason.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (effectiveDateTime != null) __obj.updateDynamic("effectiveDateTime")(effectiveDateTime.asInstanceOf[js.Any])
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (interpretation != null) __obj.updateDynamic("interpretation")(interpretation.asInstanceOf[js.Any])
    if (issued != null) __obj.updateDynamic("issued")(issued.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (referenceRange != null) __obj.updateDynamic("referenceRange")(referenceRange.asInstanceOf[js.Any])
    if (related != null) __obj.updateDynamic("related")(related.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (specimen != null) __obj.updateDynamic("specimen")(specimen.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (valueAttachment != null) __obj.updateDynamic("valueAttachment")(valueAttachment.asInstanceOf[js.Any])
    if (!js.isUndefined(valueBoolean)) __obj.updateDynamic("valueBoolean")(valueBoolean.get.asInstanceOf[js.Any])
    if (valueCodeableConcept != null) __obj.updateDynamic("valueCodeableConcept")(valueCodeableConcept.asInstanceOf[js.Any])
    if (valueDateTime != null) __obj.updateDynamic("valueDateTime")(valueDateTime.asInstanceOf[js.Any])
    if (valuePeriod != null) __obj.updateDynamic("valuePeriod")(valuePeriod.asInstanceOf[js.Any])
    if (valueQuantity != null) __obj.updateDynamic("valueQuantity")(valueQuantity.asInstanceOf[js.Any])
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange.asInstanceOf[js.Any])
    if (valueRatio != null) __obj.updateDynamic("valueRatio")(valueRatio.asInstanceOf[js.Any])
    if (valueSampledData != null) __obj.updateDynamic("valueSampledData")(valueSampledData.asInstanceOf[js.Any])
    if (valueString != null) __obj.updateDynamic("valueString")(valueString.asInstanceOf[js.Any])
    if (valueTime != null) __obj.updateDynamic("valueTime")(valueTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observation]
  }
}

