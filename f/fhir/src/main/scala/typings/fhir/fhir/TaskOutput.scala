package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information produced as part of task
  */
@js.native
trait TaskOutput extends BackboneElement {
  
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
    * Label for output
    */
  var `type`: CodeableConcept = js.native
  
  /**
    * Result of output
    */
  var valueAddress: js.UndefOr[Address] = js.native
  
  /**
    * Result of output
    */
  var valueAge: js.UndefOr[Age] = js.native
  
  /**
    * Result of output
    */
  var valueAnnotation: js.UndefOr[Annotation] = js.native
  
  /**
    * Result of output
    */
  var valueAttachment: js.UndefOr[Attachment] = js.native
  
  /**
    * Result of output
    */
  var valueBase64Binary: js.UndefOr[base64Binary] = js.native
  
  /**
    * Result of output
    */
  var valueBoolean: js.UndefOr[Boolean] = js.native
  
  /**
    * Result of output
    */
  var valueCode: js.UndefOr[code] = js.native
  
  /**
    * Result of output
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Result of output
    */
  var valueCoding: js.UndefOr[Coding] = js.native
  
  /**
    * Result of output
    */
  var valueContactPoint: js.UndefOr[ContactPoint] = js.native
  
  /**
    * Result of output
    */
  var valueCount: js.UndefOr[Count] = js.native
  
  /**
    * Result of output
    */
  var valueDate: js.UndefOr[date] = js.native
  
  /**
    * Result of output
    */
  var valueDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Result of output
    */
  var valueDecimal: js.UndefOr[decimal] = js.native
  
  /**
    * Result of output
    */
  var valueDistance: js.UndefOr[Distance] = js.native
  
  /**
    * Result of output
    */
  var valueDuration: js.UndefOr[Duration] = js.native
  
  /**
    * Result of output
    */
  var valueHumanName: js.UndefOr[HumanName] = js.native
  
  /**
    * Result of output
    */
  var valueId: js.UndefOr[id] = js.native
  
  /**
    * Result of output
    */
  var valueIdentifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Result of output
    */
  var valueInstant: js.UndefOr[instant] = js.native
  
  /**
    * Result of output
    */
  var valueInteger: js.UndefOr[integer] = js.native
  
  /**
    * Result of output
    */
  var valueMarkdown: js.UndefOr[markdown] = js.native
  
  /**
    * Result of output
    */
  var valueMeta: js.UndefOr[Meta] = js.native
  
  /**
    * Result of output
    */
  var valueMoney: js.UndefOr[Money] = js.native
  
  /**
    * Result of output
    */
  var valueOid: js.UndefOr[oid] = js.native
  
  /**
    * Result of output
    */
  var valuePeriod: js.UndefOr[Period] = js.native
  
  /**
    * Result of output
    */
  var valuePositiveInt: js.UndefOr[positiveInt] = js.native
  
  /**
    * Result of output
    */
  var valueQuantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Result of output
    */
  var valueRange: js.UndefOr[Range] = js.native
  
  /**
    * Result of output
    */
  var valueRatio: js.UndefOr[Ratio] = js.native
  
  /**
    * Result of output
    */
  var valueReference: js.UndefOr[Reference] = js.native
  
  /**
    * Result of output
    */
  var valueSampledData: js.UndefOr[SampledData] = js.native
  
  /**
    * Result of output
    */
  var valueSignature: js.UndefOr[Signature] = js.native
  
  /**
    * Result of output
    */
  var valueString: js.UndefOr[String] = js.native
  
  /**
    * Result of output
    */
  var valueTime: js.UndefOr[time] = js.native
  
  /**
    * Result of output
    */
  var valueTiming: js.UndefOr[Timing] = js.native
  
  /**
    * Result of output
    */
  var valueUnsignedInt: js.UndefOr[unsignedInt] = js.native
  
  /**
    * Result of output
    */
  var valueUri: js.UndefOr[uri] = js.native
}
object TaskOutput {
  
  @scala.inline
  def apply(`type`: CodeableConcept): TaskOutput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOutput]
  }
  
  @scala.inline
  implicit class TaskOutputMutableBuilder[Self <: TaskOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAddress(value: Address): Self = StObject.set(x, "valueAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAddressUndefined: Self = StObject.set(x, "valueAddress", js.undefined)
    
    @scala.inline
    def setValueAge(value: Age): Self = StObject.set(x, "valueAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAgeUndefined: Self = StObject.set(x, "valueAge", js.undefined)
    
    @scala.inline
    def setValueAnnotation(value: Annotation): Self = StObject.set(x, "valueAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAnnotationUndefined: Self = StObject.set(x, "valueAnnotation", js.undefined)
    
    @scala.inline
    def setValueAttachment(value: Attachment): Self = StObject.set(x, "valueAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAttachmentUndefined: Self = StObject.set(x, "valueAttachment", js.undefined)
    
    @scala.inline
    def setValueBase64Binary(value: base64Binary): Self = StObject.set(x, "valueBase64Binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueBase64BinaryUndefined: Self = StObject.set(x, "valueBase64Binary", js.undefined)
    
    @scala.inline
    def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    @scala.inline
    def setValueCode(value: code): Self = StObject.set(x, "valueCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueCodeUndefined: Self = StObject.set(x, "valueCode", js.undefined)
    
    @scala.inline
    def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    @scala.inline
    def setValueCoding(value: Coding): Self = StObject.set(x, "valueCoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueCodingUndefined: Self = StObject.set(x, "valueCoding", js.undefined)
    
    @scala.inline
    def setValueContactPoint(value: ContactPoint): Self = StObject.set(x, "valueContactPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueContactPointUndefined: Self = StObject.set(x, "valueContactPoint", js.undefined)
    
    @scala.inline
    def setValueCount(value: Count): Self = StObject.set(x, "valueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueCountUndefined: Self = StObject.set(x, "valueCount", js.undefined)
    
    @scala.inline
    def setValueDate(value: date): Self = StObject.set(x, "valueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDateTime(value: dateTime): Self = StObject.set(x, "valueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDateTimeUndefined: Self = StObject.set(x, "valueDateTime", js.undefined)
    
    @scala.inline
    def setValueDateUndefined: Self = StObject.set(x, "valueDate", js.undefined)
    
    @scala.inline
    def setValueDecimal(value: decimal): Self = StObject.set(x, "valueDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDecimalUndefined: Self = StObject.set(x, "valueDecimal", js.undefined)
    
    @scala.inline
    def setValueDistance(value: Distance): Self = StObject.set(x, "valueDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDistanceUndefined: Self = StObject.set(x, "valueDistance", js.undefined)
    
    @scala.inline
    def setValueDuration(value: Duration): Self = StObject.set(x, "valueDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDurationUndefined: Self = StObject.set(x, "valueDuration", js.undefined)
    
    @scala.inline
    def setValueHumanName(value: HumanName): Self = StObject.set(x, "valueHumanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueHumanNameUndefined: Self = StObject.set(x, "valueHumanName", js.undefined)
    
    @scala.inline
    def setValueId(value: id): Self = StObject.set(x, "valueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueIdUndefined: Self = StObject.set(x, "valueId", js.undefined)
    
    @scala.inline
    def setValueIdentifier(value: Identifier): Self = StObject.set(x, "valueIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueIdentifierUndefined: Self = StObject.set(x, "valueIdentifier", js.undefined)
    
    @scala.inline
    def setValueInstant(value: instant): Self = StObject.set(x, "valueInstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueInstantUndefined: Self = StObject.set(x, "valueInstant", js.undefined)
    
    @scala.inline
    def setValueInteger(value: integer): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    @scala.inline
    def setValueMarkdown(value: markdown): Self = StObject.set(x, "valueMarkdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueMarkdownUndefined: Self = StObject.set(x, "valueMarkdown", js.undefined)
    
    @scala.inline
    def setValueMeta(value: Meta): Self = StObject.set(x, "valueMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueMetaUndefined: Self = StObject.set(x, "valueMeta", js.undefined)
    
    @scala.inline
    def setValueMoney(value: Money): Self = StObject.set(x, "valueMoney", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueMoneyUndefined: Self = StObject.set(x, "valueMoney", js.undefined)
    
    @scala.inline
    def setValueOid(value: oid): Self = StObject.set(x, "valueOid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueOidUndefined: Self = StObject.set(x, "valueOid", js.undefined)
    
    @scala.inline
    def setValuePeriod(value: Period): Self = StObject.set(x, "valuePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuePeriodUndefined: Self = StObject.set(x, "valuePeriod", js.undefined)
    
    @scala.inline
    def setValuePositiveInt(value: positiveInt): Self = StObject.set(x, "valuePositiveInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuePositiveIntUndefined: Self = StObject.set(x, "valuePositiveInt", js.undefined)
    
    @scala.inline
    def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    @scala.inline
    def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    @scala.inline
    def setValueRatio(value: Ratio): Self = StObject.set(x, "valueRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRatioUndefined: Self = StObject.set(x, "valueRatio", js.undefined)
    
    @scala.inline
    def setValueReference(value: Reference): Self = StObject.set(x, "valueReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueReferenceUndefined: Self = StObject.set(x, "valueReference", js.undefined)
    
    @scala.inline
    def setValueSampledData(value: SampledData): Self = StObject.set(x, "valueSampledData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSampledDataUndefined: Self = StObject.set(x, "valueSampledData", js.undefined)
    
    @scala.inline
    def setValueSignature(value: Signature): Self = StObject.set(x, "valueSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSignatureUndefined: Self = StObject.set(x, "valueSignature", js.undefined)
    
    @scala.inline
    def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    @scala.inline
    def setValueTime(value: time): Self = StObject.set(x, "valueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTimeUndefined: Self = StObject.set(x, "valueTime", js.undefined)
    
    @scala.inline
    def setValueTiming(value: Timing): Self = StObject.set(x, "valueTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTimingUndefined: Self = StObject.set(x, "valueTiming", js.undefined)
    
    @scala.inline
    def setValueUnsignedInt(value: unsignedInt): Self = StObject.set(x, "valueUnsignedInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUnsignedIntUndefined: Self = StObject.set(x, "valueUnsignedInt", js.undefined)
    
    @scala.inline
    def setValueUri(value: uri): Self = StObject.set(x, "valueUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUriUndefined: Self = StObject.set(x, "valueUri", js.undefined)
    
    @scala.inline
    def set_valueBase64Binary(value: Element): Self = StObject.set(x, "_valueBase64Binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueBase64BinaryUndefined: Self = StObject.set(x, "_valueBase64Binary", js.undefined)
    
    @scala.inline
    def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
    
    @scala.inline
    def set_valueCode(value: Element): Self = StObject.set(x, "_valueCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueCodeUndefined: Self = StObject.set(x, "_valueCode", js.undefined)
    
    @scala.inline
    def set_valueDate(value: Element): Self = StObject.set(x, "_valueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueDateTime(value: Element): Self = StObject.set(x, "_valueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueDateTimeUndefined: Self = StObject.set(x, "_valueDateTime", js.undefined)
    
    @scala.inline
    def set_valueDateUndefined: Self = StObject.set(x, "_valueDate", js.undefined)
    
    @scala.inline
    def set_valueDecimal(value: Element): Self = StObject.set(x, "_valueDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueDecimalUndefined: Self = StObject.set(x, "_valueDecimal", js.undefined)
    
    @scala.inline
    def set_valueId(value: Element): Self = StObject.set(x, "_valueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueIdUndefined: Self = StObject.set(x, "_valueId", js.undefined)
    
    @scala.inline
    def set_valueInstant(value: Element): Self = StObject.set(x, "_valueInstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueInstantUndefined: Self = StObject.set(x, "_valueInstant", js.undefined)
    
    @scala.inline
    def set_valueInteger(value: Element): Self = StObject.set(x, "_valueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueIntegerUndefined: Self = StObject.set(x, "_valueInteger", js.undefined)
    
    @scala.inline
    def set_valueMarkdown(value: Element): Self = StObject.set(x, "_valueMarkdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueMarkdownUndefined: Self = StObject.set(x, "_valueMarkdown", js.undefined)
    
    @scala.inline
    def set_valueOid(value: Element): Self = StObject.set(x, "_valueOid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueOidUndefined: Self = StObject.set(x, "_valueOid", js.undefined)
    
    @scala.inline
    def set_valuePositiveInt(value: Element): Self = StObject.set(x, "_valuePositiveInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valuePositiveIntUndefined: Self = StObject.set(x, "_valuePositiveInt", js.undefined)
    
    @scala.inline
    def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
    
    @scala.inline
    def set_valueTime(value: Element): Self = StObject.set(x, "_valueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueTimeUndefined: Self = StObject.set(x, "_valueTime", js.undefined)
    
    @scala.inline
    def set_valueUnsignedInt(value: Element): Self = StObject.set(x, "_valueUnsignedInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueUnsignedIntUndefined: Self = StObject.set(x, "_valueUnsignedInt", js.undefined)
    
    @scala.inline
    def set_valueUri(value: Element): Self = StObject.set(x, "_valueUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueUriUndefined: Self = StObject.set(x, "_valueUri", js.undefined)
  }
}
