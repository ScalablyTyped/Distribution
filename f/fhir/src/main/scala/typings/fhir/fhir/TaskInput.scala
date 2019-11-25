package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information used to perform task
  */
trait TaskInput extends BackboneElement {
  /**
    * Contains extended information for property 'valueBase64Binary'.
    */
  var _valueBase64Binary: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueCode'.
    */
  var _valueCode: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueDate'.
    */
  var _valueDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueDecimal'.
    */
  var _valueDecimal: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueId'.
    */
  var _valueId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueInstant'.
    */
  var _valueInstant: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueMarkdown'.
    */
  var _valueMarkdown: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueOid'.
    */
  var _valueOid: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valuePositiveInt'.
    */
  var _valuePositiveInt: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueTime'.
    */
  var _valueTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueUnsignedInt'.
    */
  var _valueUnsignedInt: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueUri'.
    */
  var _valueUri: js.UndefOr[Element] = js.undefined
  /**
    * Label for the input
    */
  var `type`: CodeableConcept
  /**
    * Content to use in performing the task
    */
  var valueAddress: js.UndefOr[Address] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueAge: js.UndefOr[Age] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueAnnotation: js.UndefOr[Annotation] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueBase64Binary: js.UndefOr[base64Binary] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueCode: js.UndefOr[code] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueContactPoint: js.UndefOr[ContactPoint] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueCount: js.UndefOr[Count] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueDate: js.UndefOr[date] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueDecimal: js.UndefOr[decimal] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueDistance: js.UndefOr[Distance] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueDuration: js.UndefOr[Duration] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueHumanName: js.UndefOr[HumanName] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueId: js.UndefOr[id] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueInstant: js.UndefOr[instant] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueInteger: js.UndefOr[integer] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueMarkdown: js.UndefOr[markdown] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueMeta: js.UndefOr[Meta] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueMoney: js.UndefOr[Money] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueOid: js.UndefOr[oid] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valuePositiveInt: js.UndefOr[positiveInt] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueRatio: js.UndefOr[Ratio] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueSampledData: js.UndefOr[SampledData] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueSignature: js.UndefOr[Signature] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueString: js.UndefOr[String] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueTime: js.UndefOr[time] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueTiming: js.UndefOr[Timing] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueUnsignedInt: js.UndefOr[unsignedInt] = js.undefined
  /**
    * Content to use in performing the task
    */
  var valueUri: js.UndefOr[uri] = js.undefined
}

object TaskInput {
  @scala.inline
  def apply(
    `type`: CodeableConcept,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _valueBase64Binary: Element = null,
    _valueBoolean: Element = null,
    _valueCode: Element = null,
    _valueDate: Element = null,
    _valueDateTime: Element = null,
    _valueDecimal: Element = null,
    _valueId: Element = null,
    _valueInstant: Element = null,
    _valueInteger: Element = null,
    _valueMarkdown: Element = null,
    _valueOid: Element = null,
    _valuePositiveInt: Element = null,
    _valueString: Element = null,
    _valueTime: Element = null,
    _valueUnsignedInt: Element = null,
    _valueUri: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    valueAddress: Address = null,
    valueAge: Age = null,
    valueAnnotation: Annotation = null,
    valueAttachment: Attachment = null,
    valueBase64Binary: base64Binary = null,
    valueBoolean: js.UndefOr[Boolean] = js.undefined,
    valueCode: code = null,
    valueCodeableConcept: CodeableConcept = null,
    valueCoding: Coding = null,
    valueContactPoint: ContactPoint = null,
    valueCount: Count = null,
    valueDate: date = null,
    valueDateTime: dateTime = null,
    valueDecimal: Int | Double = null,
    valueDistance: Distance = null,
    valueDuration: Duration = null,
    valueHumanName: HumanName = null,
    valueId: id = null,
    valueIdentifier: Identifier = null,
    valueInstant: instant = null,
    valueInteger: Int | Double = null,
    valueMarkdown: markdown = null,
    valueMeta: Meta = null,
    valueMoney: Money = null,
    valueOid: oid = null,
    valuePeriod: Period = null,
    valuePositiveInt: Int | Double = null,
    valueQuantity: Quantity = null,
    valueRange: Range = null,
    valueRatio: Ratio = null,
    valueReference: Reference = null,
    valueSampledData: SampledData = null,
    valueSignature: Signature = null,
    valueString: String = null,
    valueTime: time = null,
    valueTiming: Timing = null,
    valueUnsignedInt: Int | Double = null,
    valueUri: uri = null
  ): TaskInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_valueBase64Binary != null) __obj.updateDynamic("_valueBase64Binary")(_valueBase64Binary.asInstanceOf[js.Any])
    if (_valueBoolean != null) __obj.updateDynamic("_valueBoolean")(_valueBoolean.asInstanceOf[js.Any])
    if (_valueCode != null) __obj.updateDynamic("_valueCode")(_valueCode.asInstanceOf[js.Any])
    if (_valueDate != null) __obj.updateDynamic("_valueDate")(_valueDate.asInstanceOf[js.Any])
    if (_valueDateTime != null) __obj.updateDynamic("_valueDateTime")(_valueDateTime.asInstanceOf[js.Any])
    if (_valueDecimal != null) __obj.updateDynamic("_valueDecimal")(_valueDecimal.asInstanceOf[js.Any])
    if (_valueId != null) __obj.updateDynamic("_valueId")(_valueId.asInstanceOf[js.Any])
    if (_valueInstant != null) __obj.updateDynamic("_valueInstant")(_valueInstant.asInstanceOf[js.Any])
    if (_valueInteger != null) __obj.updateDynamic("_valueInteger")(_valueInteger.asInstanceOf[js.Any])
    if (_valueMarkdown != null) __obj.updateDynamic("_valueMarkdown")(_valueMarkdown.asInstanceOf[js.Any])
    if (_valueOid != null) __obj.updateDynamic("_valueOid")(_valueOid.asInstanceOf[js.Any])
    if (_valuePositiveInt != null) __obj.updateDynamic("_valuePositiveInt")(_valuePositiveInt.asInstanceOf[js.Any])
    if (_valueString != null) __obj.updateDynamic("_valueString")(_valueString.asInstanceOf[js.Any])
    if (_valueTime != null) __obj.updateDynamic("_valueTime")(_valueTime.asInstanceOf[js.Any])
    if (_valueUnsignedInt != null) __obj.updateDynamic("_valueUnsignedInt")(_valueUnsignedInt.asInstanceOf[js.Any])
    if (_valueUri != null) __obj.updateDynamic("_valueUri")(_valueUri.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (valueAddress != null) __obj.updateDynamic("valueAddress")(valueAddress.asInstanceOf[js.Any])
    if (valueAge != null) __obj.updateDynamic("valueAge")(valueAge.asInstanceOf[js.Any])
    if (valueAnnotation != null) __obj.updateDynamic("valueAnnotation")(valueAnnotation.asInstanceOf[js.Any])
    if (valueAttachment != null) __obj.updateDynamic("valueAttachment")(valueAttachment.asInstanceOf[js.Any])
    if (valueBase64Binary != null) __obj.updateDynamic("valueBase64Binary")(valueBase64Binary.asInstanceOf[js.Any])
    if (!js.isUndefined(valueBoolean)) __obj.updateDynamic("valueBoolean")(valueBoolean.asInstanceOf[js.Any])
    if (valueCode != null) __obj.updateDynamic("valueCode")(valueCode.asInstanceOf[js.Any])
    if (valueCodeableConcept != null) __obj.updateDynamic("valueCodeableConcept")(valueCodeableConcept.asInstanceOf[js.Any])
    if (valueCoding != null) __obj.updateDynamic("valueCoding")(valueCoding.asInstanceOf[js.Any])
    if (valueContactPoint != null) __obj.updateDynamic("valueContactPoint")(valueContactPoint.asInstanceOf[js.Any])
    if (valueCount != null) __obj.updateDynamic("valueCount")(valueCount.asInstanceOf[js.Any])
    if (valueDate != null) __obj.updateDynamic("valueDate")(valueDate.asInstanceOf[js.Any])
    if (valueDateTime != null) __obj.updateDynamic("valueDateTime")(valueDateTime.asInstanceOf[js.Any])
    if (valueDecimal != null) __obj.updateDynamic("valueDecimal")(valueDecimal.asInstanceOf[js.Any])
    if (valueDistance != null) __obj.updateDynamic("valueDistance")(valueDistance.asInstanceOf[js.Any])
    if (valueDuration != null) __obj.updateDynamic("valueDuration")(valueDuration.asInstanceOf[js.Any])
    if (valueHumanName != null) __obj.updateDynamic("valueHumanName")(valueHumanName.asInstanceOf[js.Any])
    if (valueId != null) __obj.updateDynamic("valueId")(valueId.asInstanceOf[js.Any])
    if (valueIdentifier != null) __obj.updateDynamic("valueIdentifier")(valueIdentifier.asInstanceOf[js.Any])
    if (valueInstant != null) __obj.updateDynamic("valueInstant")(valueInstant.asInstanceOf[js.Any])
    if (valueInteger != null) __obj.updateDynamic("valueInteger")(valueInteger.asInstanceOf[js.Any])
    if (valueMarkdown != null) __obj.updateDynamic("valueMarkdown")(valueMarkdown.asInstanceOf[js.Any])
    if (valueMeta != null) __obj.updateDynamic("valueMeta")(valueMeta.asInstanceOf[js.Any])
    if (valueMoney != null) __obj.updateDynamic("valueMoney")(valueMoney.asInstanceOf[js.Any])
    if (valueOid != null) __obj.updateDynamic("valueOid")(valueOid.asInstanceOf[js.Any])
    if (valuePeriod != null) __obj.updateDynamic("valuePeriod")(valuePeriod.asInstanceOf[js.Any])
    if (valuePositiveInt != null) __obj.updateDynamic("valuePositiveInt")(valuePositiveInt.asInstanceOf[js.Any])
    if (valueQuantity != null) __obj.updateDynamic("valueQuantity")(valueQuantity.asInstanceOf[js.Any])
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange.asInstanceOf[js.Any])
    if (valueRatio != null) __obj.updateDynamic("valueRatio")(valueRatio.asInstanceOf[js.Any])
    if (valueReference != null) __obj.updateDynamic("valueReference")(valueReference.asInstanceOf[js.Any])
    if (valueSampledData != null) __obj.updateDynamic("valueSampledData")(valueSampledData.asInstanceOf[js.Any])
    if (valueSignature != null) __obj.updateDynamic("valueSignature")(valueSignature.asInstanceOf[js.Any])
    if (valueString != null) __obj.updateDynamic("valueString")(valueString.asInstanceOf[js.Any])
    if (valueTime != null) __obj.updateDynamic("valueTime")(valueTime.asInstanceOf[js.Any])
    if (valueTiming != null) __obj.updateDynamic("valueTiming")(valueTiming.asInstanceOf[js.Any])
    if (valueUnsignedInt != null) __obj.updateDynamic("valueUnsignedInt")(valueUnsignedInt.asInstanceOf[js.Any])
    if (valueUri != null) __obj.updateDynamic("valueUri")(valueUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskInput]
  }
}

