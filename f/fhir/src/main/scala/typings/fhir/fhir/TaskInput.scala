package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information used to perform task
  */
@js.native
trait TaskInput extends BackboneElement {
  /**
    * Contains extended information for property 'valueBase64Binary'.
    */
  var _valueBase64Binary: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueCode'.
    */
  var _valueCode: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueDate'.
    */
  var _valueDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueDecimal'.
    */
  var _valueDecimal: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueId'.
    */
  var _valueId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueInstant'.
    */
  var _valueInstant: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueMarkdown'.
    */
  var _valueMarkdown: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueOid'.
    */
  var _valueOid: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valuePositiveInt'.
    */
  var _valuePositiveInt: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueTime'.
    */
  var _valueTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueUnsignedInt'.
    */
  var _valueUnsignedInt: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueUri'.
    */
  var _valueUri: js.UndefOr[Element] = js.native
  /**
    * Label for the input
    */
  var `type`: CodeableConcept = js.native
  /**
    * Content to use in performing the task
    */
  var valueAddress: js.UndefOr[Address] = js.native
  /**
    * Content to use in performing the task
    */
  var valueAge: js.UndefOr[Age] = js.native
  /**
    * Content to use in performing the task
    */
  var valueAnnotation: js.UndefOr[Annotation] = js.native
  /**
    * Content to use in performing the task
    */
  var valueAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Content to use in performing the task
    */
  var valueBase64Binary: js.UndefOr[base64Binary] = js.native
  /**
    * Content to use in performing the task
    */
  var valueBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Content to use in performing the task
    */
  var valueCode: js.UndefOr[code] = js.native
  /**
    * Content to use in performing the task
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Content to use in performing the task
    */
  var valueCoding: js.UndefOr[Coding] = js.native
  /**
    * Content to use in performing the task
    */
  var valueContactPoint: js.UndefOr[ContactPoint] = js.native
  /**
    * Content to use in performing the task
    */
  var valueCount: js.UndefOr[Count] = js.native
  /**
    * Content to use in performing the task
    */
  var valueDate: js.UndefOr[date] = js.native
  /**
    * Content to use in performing the task
    */
  var valueDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Content to use in performing the task
    */
  var valueDecimal: js.UndefOr[decimal] = js.native
  /**
    * Content to use in performing the task
    */
  var valueDistance: js.UndefOr[Distance] = js.native
  /**
    * Content to use in performing the task
    */
  var valueDuration: js.UndefOr[Duration] = js.native
  /**
    * Content to use in performing the task
    */
  var valueHumanName: js.UndefOr[HumanName] = js.native
  /**
    * Content to use in performing the task
    */
  var valueId: js.UndefOr[id] = js.native
  /**
    * Content to use in performing the task
    */
  var valueIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * Content to use in performing the task
    */
  var valueInstant: js.UndefOr[instant] = js.native
  /**
    * Content to use in performing the task
    */
  var valueInteger: js.UndefOr[integer] = js.native
  /**
    * Content to use in performing the task
    */
  var valueMarkdown: js.UndefOr[markdown] = js.native
  /**
    * Content to use in performing the task
    */
  var valueMeta: js.UndefOr[Meta] = js.native
  /**
    * Content to use in performing the task
    */
  var valueMoney: js.UndefOr[Money] = js.native
  /**
    * Content to use in performing the task
    */
  var valueOid: js.UndefOr[oid] = js.native
  /**
    * Content to use in performing the task
    */
  var valuePeriod: js.UndefOr[Period] = js.native
  /**
    * Content to use in performing the task
    */
  var valuePositiveInt: js.UndefOr[positiveInt] = js.native
  /**
    * Content to use in performing the task
    */
  var valueQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Content to use in performing the task
    */
  var valueRange: js.UndefOr[Range] = js.native
  /**
    * Content to use in performing the task
    */
  var valueRatio: js.UndefOr[Ratio] = js.native
  /**
    * Content to use in performing the task
    */
  var valueReference: js.UndefOr[Reference] = js.native
  /**
    * Content to use in performing the task
    */
  var valueSampledData: js.UndefOr[SampledData] = js.native
  /**
    * Content to use in performing the task
    */
  var valueSignature: js.UndefOr[Signature] = js.native
  /**
    * Content to use in performing the task
    */
  var valueString: js.UndefOr[String] = js.native
  /**
    * Content to use in performing the task
    */
  var valueTime: js.UndefOr[time] = js.native
  /**
    * Content to use in performing the task
    */
  var valueTiming: js.UndefOr[Timing] = js.native
  /**
    * Content to use in performing the task
    */
  var valueUnsignedInt: js.UndefOr[unsignedInt] = js.native
  /**
    * Content to use in performing the task
    */
  var valueUri: js.UndefOr[uri] = js.native
}

object TaskInput {
  @scala.inline
  def apply(`type`: CodeableConcept): TaskInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskInput]
  }
  @scala.inline
  implicit class TaskInputOps[Self <: TaskInput] (val x: Self) extends AnyVal {
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
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_valueBase64Binary(value: Element): Self = this.set("_valueBase64Binary", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueBase64Binary: Self = this.set("_valueBase64Binary", js.undefined)
    @scala.inline
    def set_valueBoolean(value: Element): Self = this.set("_valueBoolean", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueBoolean: Self = this.set("_valueBoolean", js.undefined)
    @scala.inline
    def set_valueCode(value: Element): Self = this.set("_valueCode", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueCode: Self = this.set("_valueCode", js.undefined)
    @scala.inline
    def set_valueDate(value: Element): Self = this.set("_valueDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueDate: Self = this.set("_valueDate", js.undefined)
    @scala.inline
    def set_valueDateTime(value: Element): Self = this.set("_valueDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueDateTime: Self = this.set("_valueDateTime", js.undefined)
    @scala.inline
    def set_valueDecimal(value: Element): Self = this.set("_valueDecimal", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueDecimal: Self = this.set("_valueDecimal", js.undefined)
    @scala.inline
    def set_valueId(value: Element): Self = this.set("_valueId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueId: Self = this.set("_valueId", js.undefined)
    @scala.inline
    def set_valueInstant(value: Element): Self = this.set("_valueInstant", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueInstant: Self = this.set("_valueInstant", js.undefined)
    @scala.inline
    def set_valueInteger(value: Element): Self = this.set("_valueInteger", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueInteger: Self = this.set("_valueInteger", js.undefined)
    @scala.inline
    def set_valueMarkdown(value: Element): Self = this.set("_valueMarkdown", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueMarkdown: Self = this.set("_valueMarkdown", js.undefined)
    @scala.inline
    def set_valueOid(value: Element): Self = this.set("_valueOid", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueOid: Self = this.set("_valueOid", js.undefined)
    @scala.inline
    def set_valuePositiveInt(value: Element): Self = this.set("_valuePositiveInt", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valuePositiveInt: Self = this.set("_valuePositiveInt", js.undefined)
    @scala.inline
    def set_valueString(value: Element): Self = this.set("_valueString", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueString: Self = this.set("_valueString", js.undefined)
    @scala.inline
    def set_valueTime(value: Element): Self = this.set("_valueTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueTime: Self = this.set("_valueTime", js.undefined)
    @scala.inline
    def set_valueUnsignedInt(value: Element): Self = this.set("_valueUnsignedInt", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueUnsignedInt: Self = this.set("_valueUnsignedInt", js.undefined)
    @scala.inline
    def set_valueUri(value: Element): Self = this.set("_valueUri", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueUri: Self = this.set("_valueUri", js.undefined)
    @scala.inline
    def setValueAddress(value: Address): Self = this.set("valueAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueAddress: Self = this.set("valueAddress", js.undefined)
    @scala.inline
    def setValueAge(value: Age): Self = this.set("valueAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueAge: Self = this.set("valueAge", js.undefined)
    @scala.inline
    def setValueAnnotation(value: Annotation): Self = this.set("valueAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueAnnotation: Self = this.set("valueAnnotation", js.undefined)
    @scala.inline
    def setValueAttachment(value: Attachment): Self = this.set("valueAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueAttachment: Self = this.set("valueAttachment", js.undefined)
    @scala.inline
    def setValueBase64Binary(value: base64Binary): Self = this.set("valueBase64Binary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueBase64Binary: Self = this.set("valueBase64Binary", js.undefined)
    @scala.inline
    def setValueBoolean(value: Boolean): Self = this.set("valueBoolean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueBoolean: Self = this.set("valueBoolean", js.undefined)
    @scala.inline
    def setValueCode(value: code): Self = this.set("valueCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueCode: Self = this.set("valueCode", js.undefined)
    @scala.inline
    def setValueCodeableConcept(value: CodeableConcept): Self = this.set("valueCodeableConcept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueCodeableConcept: Self = this.set("valueCodeableConcept", js.undefined)
    @scala.inline
    def setValueCoding(value: Coding): Self = this.set("valueCoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueCoding: Self = this.set("valueCoding", js.undefined)
    @scala.inline
    def setValueContactPoint(value: ContactPoint): Self = this.set("valueContactPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueContactPoint: Self = this.set("valueContactPoint", js.undefined)
    @scala.inline
    def setValueCount(value: Count): Self = this.set("valueCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueCount: Self = this.set("valueCount", js.undefined)
    @scala.inline
    def setValueDate(value: date): Self = this.set("valueDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDate: Self = this.set("valueDate", js.undefined)
    @scala.inline
    def setValueDateTime(value: dateTime): Self = this.set("valueDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDateTime: Self = this.set("valueDateTime", js.undefined)
    @scala.inline
    def setValueDecimal(value: decimal): Self = this.set("valueDecimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDecimal: Self = this.set("valueDecimal", js.undefined)
    @scala.inline
    def setValueDistance(value: Distance): Self = this.set("valueDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDistance: Self = this.set("valueDistance", js.undefined)
    @scala.inline
    def setValueDuration(value: Duration): Self = this.set("valueDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDuration: Self = this.set("valueDuration", js.undefined)
    @scala.inline
    def setValueHumanName(value: HumanName): Self = this.set("valueHumanName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueHumanName: Self = this.set("valueHumanName", js.undefined)
    @scala.inline
    def setValueId(value: id): Self = this.set("valueId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueId: Self = this.set("valueId", js.undefined)
    @scala.inline
    def setValueIdentifier(value: Identifier): Self = this.set("valueIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueIdentifier: Self = this.set("valueIdentifier", js.undefined)
    @scala.inline
    def setValueInstant(value: instant): Self = this.set("valueInstant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueInstant: Self = this.set("valueInstant", js.undefined)
    @scala.inline
    def setValueInteger(value: integer): Self = this.set("valueInteger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueInteger: Self = this.set("valueInteger", js.undefined)
    @scala.inline
    def setValueMarkdown(value: markdown): Self = this.set("valueMarkdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueMarkdown: Self = this.set("valueMarkdown", js.undefined)
    @scala.inline
    def setValueMeta(value: Meta): Self = this.set("valueMeta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueMeta: Self = this.set("valueMeta", js.undefined)
    @scala.inline
    def setValueMoney(value: Money): Self = this.set("valueMoney", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueMoney: Self = this.set("valueMoney", js.undefined)
    @scala.inline
    def setValueOid(value: oid): Self = this.set("valueOid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueOid: Self = this.set("valueOid", js.undefined)
    @scala.inline
    def setValuePeriod(value: Period): Self = this.set("valuePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValuePeriod: Self = this.set("valuePeriod", js.undefined)
    @scala.inline
    def setValuePositiveInt(value: positiveInt): Self = this.set("valuePositiveInt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValuePositiveInt: Self = this.set("valuePositiveInt", js.undefined)
    @scala.inline
    def setValueQuantity(value: Quantity): Self = this.set("valueQuantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueQuantity: Self = this.set("valueQuantity", js.undefined)
    @scala.inline
    def setValueRange(value: Range): Self = this.set("valueRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueRange: Self = this.set("valueRange", js.undefined)
    @scala.inline
    def setValueRatio(value: Ratio): Self = this.set("valueRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueRatio: Self = this.set("valueRatio", js.undefined)
    @scala.inline
    def setValueReference(value: Reference): Self = this.set("valueReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueReference: Self = this.set("valueReference", js.undefined)
    @scala.inline
    def setValueSampledData(value: SampledData): Self = this.set("valueSampledData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueSampledData: Self = this.set("valueSampledData", js.undefined)
    @scala.inline
    def setValueSignature(value: Signature): Self = this.set("valueSignature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueSignature: Self = this.set("valueSignature", js.undefined)
    @scala.inline
    def setValueString(value: String): Self = this.set("valueString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueString: Self = this.set("valueString", js.undefined)
    @scala.inline
    def setValueTime(value: time): Self = this.set("valueTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueTime: Self = this.set("valueTime", js.undefined)
    @scala.inline
    def setValueTiming(value: Timing): Self = this.set("valueTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueTiming: Self = this.set("valueTiming", js.undefined)
    @scala.inline
    def setValueUnsignedInt(value: unsignedInt): Self = this.set("valueUnsignedInt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueUnsignedInt: Self = this.set("valueUnsignedInt", js.undefined)
    @scala.inline
    def setValueUri(value: uri): Self = this.set("valueUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueUri: Self = this.set("valueUri", js.undefined)
  }
  
}

