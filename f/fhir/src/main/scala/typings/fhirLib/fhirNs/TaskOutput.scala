package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information produced as part of task
  */
trait TaskOutput extends BackboneElement {
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
    * Label for output
    */
  var `type`: CodeableConcept
  /**
    * Result of output
    */
  var valueAddress: js.UndefOr[Address] = js.undefined
  /**
    * Result of output
    */
  var valueAge: js.UndefOr[Age] = js.undefined
  /**
    * Result of output
    */
  var valueAnnotation: js.UndefOr[Annotation] = js.undefined
  /**
    * Result of output
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * Result of output
    */
  var valueBase64Binary: js.UndefOr[base64Binary] = js.undefined
  /**
    * Result of output
    */
  var valueBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Result of output
    */
  var valueCode: js.UndefOr[code] = js.undefined
  /**
    * Result of output
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Result of output
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  /**
    * Result of output
    */
  var valueContactPoint: js.UndefOr[ContactPoint] = js.undefined
  /**
    * Result of output
    */
  var valueCount: js.UndefOr[Count] = js.undefined
  /**
    * Result of output
    */
  var valueDate: js.UndefOr[date] = js.undefined
  /**
    * Result of output
    */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Result of output
    */
  var valueDecimal: js.UndefOr[decimal] = js.undefined
  /**
    * Result of output
    */
  var valueDistance: js.UndefOr[Distance] = js.undefined
  /**
    * Result of output
    */
  var valueDuration: js.UndefOr[Duration] = js.undefined
  /**
    * Result of output
    */
  var valueHumanName: js.UndefOr[HumanName] = js.undefined
  /**
    * Result of output
    */
  var valueId: js.UndefOr[id] = js.undefined
  /**
    * Result of output
    */
  var valueIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Result of output
    */
  var valueInstant: js.UndefOr[instant] = js.undefined
  /**
    * Result of output
    */
  var valueInteger: js.UndefOr[integer] = js.undefined
  /**
    * Result of output
    */
  var valueMarkdown: js.UndefOr[markdown] = js.undefined
  /**
    * Result of output
    */
  var valueMeta: js.UndefOr[Meta] = js.undefined
  /**
    * Result of output
    */
  var valueMoney: js.UndefOr[Money] = js.undefined
  /**
    * Result of output
    */
  var valueOid: js.UndefOr[oid] = js.undefined
  /**
    * Result of output
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
  /**
    * Result of output
    */
  var valuePositiveInt: js.UndefOr[positiveInt] = js.undefined
  /**
    * Result of output
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Result of output
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  /**
    * Result of output
    */
  var valueRatio: js.UndefOr[Ratio] = js.undefined
  /**
    * Result of output
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
  /**
    * Result of output
    */
  var valueSampledData: js.UndefOr[SampledData] = js.undefined
  /**
    * Result of output
    */
  var valueSignature: js.UndefOr[Signature] = js.undefined
  /**
    * Result of output
    */
  var valueString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Result of output
    */
  var valueTime: js.UndefOr[time] = js.undefined
  /**
    * Result of output
    */
  var valueTiming: js.UndefOr[Timing] = js.undefined
  /**
    * Result of output
    */
  var valueUnsignedInt: js.UndefOr[unsignedInt] = js.undefined
  /**
    * Result of output
    */
  var valueUri: js.UndefOr[uri] = js.undefined
}

object TaskOutput {
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
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    valueAddress: Address = null,
    valueAge: Age = null,
    valueAnnotation: Annotation = null,
    valueAttachment: Attachment = null,
    valueBase64Binary: base64Binary = null,
    valueBoolean: js.UndefOr[scala.Boolean] = js.undefined,
    valueCode: code = null,
    valueCodeableConcept: CodeableConcept = null,
    valueCoding: Coding = null,
    valueContactPoint: ContactPoint = null,
    valueCount: Count = null,
    valueDate: date = null,
    valueDateTime: dateTime = null,
    valueDecimal: js.UndefOr[decimal] = js.undefined,
    valueDistance: Distance = null,
    valueDuration: Duration = null,
    valueHumanName: HumanName = null,
    valueId: id = null,
    valueIdentifier: Identifier = null,
    valueInstant: instant = null,
    valueInteger: js.UndefOr[integer] = js.undefined,
    valueMarkdown: markdown = null,
    valueMeta: Meta = null,
    valueMoney: Money = null,
    valueOid: oid = null,
    valuePeriod: Period = null,
    valuePositiveInt: js.UndefOr[positiveInt] = js.undefined,
    valueQuantity: Quantity = null,
    valueRange: Range = null,
    valueRatio: Ratio = null,
    valueReference: Reference = null,
    valueSampledData: SampledData = null,
    valueSignature: Signature = null,
    valueString: java.lang.String = null,
    valueTime: time = null,
    valueTiming: Timing = null,
    valueUnsignedInt: js.UndefOr[unsignedInt] = js.undefined,
    valueUri: uri = null
  ): TaskOutput = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_valueBase64Binary != null) __obj.updateDynamic("_valueBase64Binary")(_valueBase64Binary)
    if (_valueBoolean != null) __obj.updateDynamic("_valueBoolean")(_valueBoolean)
    if (_valueCode != null) __obj.updateDynamic("_valueCode")(_valueCode)
    if (_valueDate != null) __obj.updateDynamic("_valueDate")(_valueDate)
    if (_valueDateTime != null) __obj.updateDynamic("_valueDateTime")(_valueDateTime)
    if (_valueDecimal != null) __obj.updateDynamic("_valueDecimal")(_valueDecimal)
    if (_valueId != null) __obj.updateDynamic("_valueId")(_valueId)
    if (_valueInstant != null) __obj.updateDynamic("_valueInstant")(_valueInstant)
    if (_valueInteger != null) __obj.updateDynamic("_valueInteger")(_valueInteger)
    if (_valueMarkdown != null) __obj.updateDynamic("_valueMarkdown")(_valueMarkdown)
    if (_valueOid != null) __obj.updateDynamic("_valueOid")(_valueOid)
    if (_valuePositiveInt != null) __obj.updateDynamic("_valuePositiveInt")(_valuePositiveInt)
    if (_valueString != null) __obj.updateDynamic("_valueString")(_valueString)
    if (_valueTime != null) __obj.updateDynamic("_valueTime")(_valueTime)
    if (_valueUnsignedInt != null) __obj.updateDynamic("_valueUnsignedInt")(_valueUnsignedInt)
    if (_valueUri != null) __obj.updateDynamic("_valueUri")(_valueUri)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (valueAddress != null) __obj.updateDynamic("valueAddress")(valueAddress)
    if (valueAge != null) __obj.updateDynamic("valueAge")(valueAge)
    if (valueAnnotation != null) __obj.updateDynamic("valueAnnotation")(valueAnnotation)
    if (valueAttachment != null) __obj.updateDynamic("valueAttachment")(valueAttachment)
    if (valueBase64Binary != null) __obj.updateDynamic("valueBase64Binary")(valueBase64Binary)
    if (!js.isUndefined(valueBoolean)) __obj.updateDynamic("valueBoolean")(valueBoolean)
    if (valueCode != null) __obj.updateDynamic("valueCode")(valueCode)
    if (valueCodeableConcept != null) __obj.updateDynamic("valueCodeableConcept")(valueCodeableConcept)
    if (valueCoding != null) __obj.updateDynamic("valueCoding")(valueCoding)
    if (valueContactPoint != null) __obj.updateDynamic("valueContactPoint")(valueContactPoint)
    if (valueCount != null) __obj.updateDynamic("valueCount")(valueCount)
    if (valueDate != null) __obj.updateDynamic("valueDate")(valueDate)
    if (valueDateTime != null) __obj.updateDynamic("valueDateTime")(valueDateTime)
    if (!js.isUndefined(valueDecimal)) __obj.updateDynamic("valueDecimal")(valueDecimal)
    if (valueDistance != null) __obj.updateDynamic("valueDistance")(valueDistance)
    if (valueDuration != null) __obj.updateDynamic("valueDuration")(valueDuration)
    if (valueHumanName != null) __obj.updateDynamic("valueHumanName")(valueHumanName)
    if (valueId != null) __obj.updateDynamic("valueId")(valueId)
    if (valueIdentifier != null) __obj.updateDynamic("valueIdentifier")(valueIdentifier)
    if (valueInstant != null) __obj.updateDynamic("valueInstant")(valueInstant)
    if (!js.isUndefined(valueInteger)) __obj.updateDynamic("valueInteger")(valueInteger)
    if (valueMarkdown != null) __obj.updateDynamic("valueMarkdown")(valueMarkdown)
    if (valueMeta != null) __obj.updateDynamic("valueMeta")(valueMeta)
    if (valueMoney != null) __obj.updateDynamic("valueMoney")(valueMoney)
    if (valueOid != null) __obj.updateDynamic("valueOid")(valueOid)
    if (valuePeriod != null) __obj.updateDynamic("valuePeriod")(valuePeriod)
    if (!js.isUndefined(valuePositiveInt)) __obj.updateDynamic("valuePositiveInt")(valuePositiveInt)
    if (valueQuantity != null) __obj.updateDynamic("valueQuantity")(valueQuantity)
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange)
    if (valueRatio != null) __obj.updateDynamic("valueRatio")(valueRatio)
    if (valueReference != null) __obj.updateDynamic("valueReference")(valueReference)
    if (valueSampledData != null) __obj.updateDynamic("valueSampledData")(valueSampledData)
    if (valueSignature != null) __obj.updateDynamic("valueSignature")(valueSignature)
    if (valueString != null) __obj.updateDynamic("valueString")(valueString)
    if (valueTime != null) __obj.updateDynamic("valueTime")(valueTime)
    if (valueTiming != null) __obj.updateDynamic("valueTiming")(valueTiming)
    if (!js.isUndefined(valueUnsignedInt)) __obj.updateDynamic("valueUnsignedInt")(valueUnsignedInt)
    if (valueUri != null) __obj.updateDynamic("valueUri")(valueUri)
    __obj.asInstanceOf[TaskOutput]
  }
}

