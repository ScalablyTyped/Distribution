package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransportInput
  extends StObject
     with BackboneElement {
  
  var _valueBase64Binary: js.UndefOr[Element] = js.undefined
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  var _valueCanonical: js.UndefOr[Element] = js.undefined
  
  var _valueCode: js.UndefOr[Element] = js.undefined
  
  var _valueDate: js.UndefOr[Element] = js.undefined
  
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  
  var _valueId: js.UndefOr[Element] = js.undefined
  
  var _valueInstant: js.UndefOr[Element] = js.undefined
  
  var _valueInteger64: js.UndefOr[Element] = js.undefined
  
  var _valueMarkdown: js.UndefOr[Element] = js.undefined
  
  var _valueOid: js.UndefOr[Element] = js.undefined
  
  var _valueString: js.UndefOr[Element] = js.undefined
  
  var _valueTime: js.UndefOr[Element] = js.undefined
  
  var _valueUri: js.UndefOr[Element] = js.undefined
  
  var _valueUrl: js.UndefOr[Element] = js.undefined
  
  var _valueUuid: js.UndefOr[Element] = js.undefined
  
  /**
    * If referencing a BPMN workflow or Protocol, the "system" is the URL for the workflow definition and the code is the "name" of the required input.
    */
  var `type`: CodeableConcept
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueAddress: js.UndefOr[Address] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueAge: js.UndefOr[Age] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueAnnotation: js.UndefOr[Annotation] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueAvailability: js.UndefOr[Availability] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueBase64Binary: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueCode: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueCodeableReference: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueContactDetail: js.UndefOr[ContactDetail] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueContactPoint: js.UndefOr[ContactPoint] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueCount: js.UndefOr[Count] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueDataRequirement: js.UndefOr[DataRequirement] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueDate: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueDecimal: js.UndefOr[Double] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueDistance: js.UndefOr[Distance] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueDosage: js.UndefOr[Dosage] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueExpression: js.UndefOr[Expression] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueExtendedContactDetail: js.UndefOr[ExtendedContactDetail] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueHumanName: js.UndefOr[HumanName] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueId: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueInstant: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueInteger64: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueMarkdown: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueMeta: js.UndefOr[Meta] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueMoney: js.UndefOr[Money] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueOid: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueParameterDefinition: js.UndefOr[ParameterDefinition] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valuePositiveInt: js.UndefOr[Double] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueRatioRange: js.UndefOr[RatioRange] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueRelatedArtifact: js.UndefOr[RelatedArtifact] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueSampledData: js.UndefOr[SampledData] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueSignature: js.UndefOr[Signature] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueString: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueTime: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueTriggerDefinition: js.UndefOr[TriggerDefinition] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueUnsignedInt: js.UndefOr[Double] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueUri: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueUsageContext: js.UndefOr[UsageContext] = js.undefined
  
  /**
    * The value of the input parameter as a basic type.
    */
  var valueUuid: js.UndefOr[String] = js.undefined
}
object TransportInput {
  
  inline def apply(`type`: CodeableConcept): TransportInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransportInput] (val x: Self) extends AnyVal {
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueAddress(value: Address): Self = StObject.set(x, "valueAddress", value.asInstanceOf[js.Any])
    
    inline def setValueAddressUndefined: Self = StObject.set(x, "valueAddress", js.undefined)
    
    inline def setValueAge(value: Age): Self = StObject.set(x, "valueAge", value.asInstanceOf[js.Any])
    
    inline def setValueAgeUndefined: Self = StObject.set(x, "valueAge", js.undefined)
    
    inline def setValueAnnotation(value: Annotation): Self = StObject.set(x, "valueAnnotation", value.asInstanceOf[js.Any])
    
    inline def setValueAnnotationUndefined: Self = StObject.set(x, "valueAnnotation", js.undefined)
    
    inline def setValueAttachment(value: Attachment): Self = StObject.set(x, "valueAttachment", value.asInstanceOf[js.Any])
    
    inline def setValueAttachmentUndefined: Self = StObject.set(x, "valueAttachment", js.undefined)
    
    inline def setValueAvailability(value: Availability): Self = StObject.set(x, "valueAvailability", value.asInstanceOf[js.Any])
    
    inline def setValueAvailabilityUndefined: Self = StObject.set(x, "valueAvailability", js.undefined)
    
    inline def setValueBase64Binary(value: String): Self = StObject.set(x, "valueBase64Binary", value.asInstanceOf[js.Any])
    
    inline def setValueBase64BinaryUndefined: Self = StObject.set(x, "valueBase64Binary", js.undefined)
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCanonical(value: String): Self = StObject.set(x, "valueCanonical", value.asInstanceOf[js.Any])
    
    inline def setValueCanonicalUndefined: Self = StObject.set(x, "valueCanonical", js.undefined)
    
    inline def setValueCode(value: String): Self = StObject.set(x, "valueCode", value.asInstanceOf[js.Any])
    
    inline def setValueCodeUndefined: Self = StObject.set(x, "valueCode", js.undefined)
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueCodeableReference(value: CodeableReference): Self = StObject.set(x, "valueCodeableReference", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableReferenceUndefined: Self = StObject.set(x, "valueCodeableReference", js.undefined)
    
    inline def setValueCoding(value: Coding): Self = StObject.set(x, "valueCoding", value.asInstanceOf[js.Any])
    
    inline def setValueCodingUndefined: Self = StObject.set(x, "valueCoding", js.undefined)
    
    inline def setValueContactDetail(value: ContactDetail): Self = StObject.set(x, "valueContactDetail", value.asInstanceOf[js.Any])
    
    inline def setValueContactDetailUndefined: Self = StObject.set(x, "valueContactDetail", js.undefined)
    
    inline def setValueContactPoint(value: ContactPoint): Self = StObject.set(x, "valueContactPoint", value.asInstanceOf[js.Any])
    
    inline def setValueContactPointUndefined: Self = StObject.set(x, "valueContactPoint", js.undefined)
    
    inline def setValueCount(value: Count): Self = StObject.set(x, "valueCount", value.asInstanceOf[js.Any])
    
    inline def setValueCountUndefined: Self = StObject.set(x, "valueCount", js.undefined)
    
    inline def setValueDataRequirement(value: DataRequirement): Self = StObject.set(x, "valueDataRequirement", value.asInstanceOf[js.Any])
    
    inline def setValueDataRequirementUndefined: Self = StObject.set(x, "valueDataRequirement", js.undefined)
    
    inline def setValueDate(value: String): Self = StObject.set(x, "valueDate", value.asInstanceOf[js.Any])
    
    inline def setValueDateTime(value: String): Self = StObject.set(x, "valueDateTime", value.asInstanceOf[js.Any])
    
    inline def setValueDateTimeUndefined: Self = StObject.set(x, "valueDateTime", js.undefined)
    
    inline def setValueDateUndefined: Self = StObject.set(x, "valueDate", js.undefined)
    
    inline def setValueDecimal(value: Double): Self = StObject.set(x, "valueDecimal", value.asInstanceOf[js.Any])
    
    inline def setValueDecimalUndefined: Self = StObject.set(x, "valueDecimal", js.undefined)
    
    inline def setValueDistance(value: Distance): Self = StObject.set(x, "valueDistance", value.asInstanceOf[js.Any])
    
    inline def setValueDistanceUndefined: Self = StObject.set(x, "valueDistance", js.undefined)
    
    inline def setValueDosage(value: Dosage): Self = StObject.set(x, "valueDosage", value.asInstanceOf[js.Any])
    
    inline def setValueDosageUndefined: Self = StObject.set(x, "valueDosage", js.undefined)
    
    inline def setValueDuration(value: Duration): Self = StObject.set(x, "valueDuration", value.asInstanceOf[js.Any])
    
    inline def setValueDurationUndefined: Self = StObject.set(x, "valueDuration", js.undefined)
    
    inline def setValueExpression(value: Expression): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
    
    inline def setValueExtendedContactDetail(value: ExtendedContactDetail): Self = StObject.set(x, "valueExtendedContactDetail", value.asInstanceOf[js.Any])
    
    inline def setValueExtendedContactDetailUndefined: Self = StObject.set(x, "valueExtendedContactDetail", js.undefined)
    
    inline def setValueHumanName(value: HumanName): Self = StObject.set(x, "valueHumanName", value.asInstanceOf[js.Any])
    
    inline def setValueHumanNameUndefined: Self = StObject.set(x, "valueHumanName", js.undefined)
    
    inline def setValueId(value: String): Self = StObject.set(x, "valueId", value.asInstanceOf[js.Any])
    
    inline def setValueIdUndefined: Self = StObject.set(x, "valueId", js.undefined)
    
    inline def setValueIdentifier(value: Identifier): Self = StObject.set(x, "valueIdentifier", value.asInstanceOf[js.Any])
    
    inline def setValueIdentifierUndefined: Self = StObject.set(x, "valueIdentifier", js.undefined)
    
    inline def setValueInstant(value: String): Self = StObject.set(x, "valueInstant", value.asInstanceOf[js.Any])
    
    inline def setValueInstantUndefined: Self = StObject.set(x, "valueInstant", js.undefined)
    
    inline def setValueInteger(value: Double): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    inline def setValueInteger64(value: String): Self = StObject.set(x, "valueInteger64", value.asInstanceOf[js.Any])
    
    inline def setValueInteger64Undefined: Self = StObject.set(x, "valueInteger64", js.undefined)
    
    inline def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    inline def setValueMarkdown(value: String): Self = StObject.set(x, "valueMarkdown", value.asInstanceOf[js.Any])
    
    inline def setValueMarkdownUndefined: Self = StObject.set(x, "valueMarkdown", js.undefined)
    
    inline def setValueMeta(value: Meta): Self = StObject.set(x, "valueMeta", value.asInstanceOf[js.Any])
    
    inline def setValueMetaUndefined: Self = StObject.set(x, "valueMeta", js.undefined)
    
    inline def setValueMoney(value: Money): Self = StObject.set(x, "valueMoney", value.asInstanceOf[js.Any])
    
    inline def setValueMoneyUndefined: Self = StObject.set(x, "valueMoney", js.undefined)
    
    inline def setValueOid(value: String): Self = StObject.set(x, "valueOid", value.asInstanceOf[js.Any])
    
    inline def setValueOidUndefined: Self = StObject.set(x, "valueOid", js.undefined)
    
    inline def setValueParameterDefinition(value: ParameterDefinition): Self = StObject.set(x, "valueParameterDefinition", value.asInstanceOf[js.Any])
    
    inline def setValueParameterDefinitionUndefined: Self = StObject.set(x, "valueParameterDefinition", js.undefined)
    
    inline def setValuePeriod(value: Period): Self = StObject.set(x, "valuePeriod", value.asInstanceOf[js.Any])
    
    inline def setValuePeriodUndefined: Self = StObject.set(x, "valuePeriod", js.undefined)
    
    inline def setValuePositiveInt(value: Double): Self = StObject.set(x, "valuePositiveInt", value.asInstanceOf[js.Any])
    
    inline def setValuePositiveIntUndefined: Self = StObject.set(x, "valuePositiveInt", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    inline def setValueRatio(value: Ratio): Self = StObject.set(x, "valueRatio", value.asInstanceOf[js.Any])
    
    inline def setValueRatioRange(value: RatioRange): Self = StObject.set(x, "valueRatioRange", value.asInstanceOf[js.Any])
    
    inline def setValueRatioRangeUndefined: Self = StObject.set(x, "valueRatioRange", js.undefined)
    
    inline def setValueRatioUndefined: Self = StObject.set(x, "valueRatio", js.undefined)
    
    inline def setValueReference(value: Reference): Self = StObject.set(x, "valueReference", value.asInstanceOf[js.Any])
    
    inline def setValueReferenceUndefined: Self = StObject.set(x, "valueReference", js.undefined)
    
    inline def setValueRelatedArtifact(value: RelatedArtifact): Self = StObject.set(x, "valueRelatedArtifact", value.asInstanceOf[js.Any])
    
    inline def setValueRelatedArtifactUndefined: Self = StObject.set(x, "valueRelatedArtifact", js.undefined)
    
    inline def setValueSampledData(value: SampledData): Self = StObject.set(x, "valueSampledData", value.asInstanceOf[js.Any])
    
    inline def setValueSampledDataUndefined: Self = StObject.set(x, "valueSampledData", js.undefined)
    
    inline def setValueSignature(value: Signature): Self = StObject.set(x, "valueSignature", value.asInstanceOf[js.Any])
    
    inline def setValueSignatureUndefined: Self = StObject.set(x, "valueSignature", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    inline def setValueTime(value: String): Self = StObject.set(x, "valueTime", value.asInstanceOf[js.Any])
    
    inline def setValueTimeUndefined: Self = StObject.set(x, "valueTime", js.undefined)
    
    inline def setValueTiming(value: Timing): Self = StObject.set(x, "valueTiming", value.asInstanceOf[js.Any])
    
    inline def setValueTimingUndefined: Self = StObject.set(x, "valueTiming", js.undefined)
    
    inline def setValueTriggerDefinition(value: TriggerDefinition): Self = StObject.set(x, "valueTriggerDefinition", value.asInstanceOf[js.Any])
    
    inline def setValueTriggerDefinitionUndefined: Self = StObject.set(x, "valueTriggerDefinition", js.undefined)
    
    inline def setValueUnsignedInt(value: Double): Self = StObject.set(x, "valueUnsignedInt", value.asInstanceOf[js.Any])
    
    inline def setValueUnsignedIntUndefined: Self = StObject.set(x, "valueUnsignedInt", js.undefined)
    
    inline def setValueUri(value: String): Self = StObject.set(x, "valueUri", value.asInstanceOf[js.Any])
    
    inline def setValueUriUndefined: Self = StObject.set(x, "valueUri", js.undefined)
    
    inline def setValueUrl(value: String): Self = StObject.set(x, "valueUrl", value.asInstanceOf[js.Any])
    
    inline def setValueUrlUndefined: Self = StObject.set(x, "valueUrl", js.undefined)
    
    inline def setValueUsageContext(value: UsageContext): Self = StObject.set(x, "valueUsageContext", value.asInstanceOf[js.Any])
    
    inline def setValueUsageContextUndefined: Self = StObject.set(x, "valueUsageContext", js.undefined)
    
    inline def setValueUuid(value: String): Self = StObject.set(x, "valueUuid", value.asInstanceOf[js.Any])
    
    inline def setValueUuidUndefined: Self = StObject.set(x, "valueUuid", js.undefined)
    
    inline def set_valueBase64Binary(value: Element): Self = StObject.set(x, "_valueBase64Binary", value.asInstanceOf[js.Any])
    
    inline def set_valueBase64BinaryUndefined: Self = StObject.set(x, "_valueBase64Binary", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
    
    inline def set_valueCanonical(value: Element): Self = StObject.set(x, "_valueCanonical", value.asInstanceOf[js.Any])
    
    inline def set_valueCanonicalUndefined: Self = StObject.set(x, "_valueCanonical", js.undefined)
    
    inline def set_valueCode(value: Element): Self = StObject.set(x, "_valueCode", value.asInstanceOf[js.Any])
    
    inline def set_valueCodeUndefined: Self = StObject.set(x, "_valueCode", js.undefined)
    
    inline def set_valueDate(value: Element): Self = StObject.set(x, "_valueDate", value.asInstanceOf[js.Any])
    
    inline def set_valueDateTime(value: Element): Self = StObject.set(x, "_valueDateTime", value.asInstanceOf[js.Any])
    
    inline def set_valueDateTimeUndefined: Self = StObject.set(x, "_valueDateTime", js.undefined)
    
    inline def set_valueDateUndefined: Self = StObject.set(x, "_valueDate", js.undefined)
    
    inline def set_valueId(value: Element): Self = StObject.set(x, "_valueId", value.asInstanceOf[js.Any])
    
    inline def set_valueIdUndefined: Self = StObject.set(x, "_valueId", js.undefined)
    
    inline def set_valueInstant(value: Element): Self = StObject.set(x, "_valueInstant", value.asInstanceOf[js.Any])
    
    inline def set_valueInstantUndefined: Self = StObject.set(x, "_valueInstant", js.undefined)
    
    inline def set_valueInteger64(value: Element): Self = StObject.set(x, "_valueInteger64", value.asInstanceOf[js.Any])
    
    inline def set_valueInteger64Undefined: Self = StObject.set(x, "_valueInteger64", js.undefined)
    
    inline def set_valueMarkdown(value: Element): Self = StObject.set(x, "_valueMarkdown", value.asInstanceOf[js.Any])
    
    inline def set_valueMarkdownUndefined: Self = StObject.set(x, "_valueMarkdown", js.undefined)
    
    inline def set_valueOid(value: Element): Self = StObject.set(x, "_valueOid", value.asInstanceOf[js.Any])
    
    inline def set_valueOidUndefined: Self = StObject.set(x, "_valueOid", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
    
    inline def set_valueTime(value: Element): Self = StObject.set(x, "_valueTime", value.asInstanceOf[js.Any])
    
    inline def set_valueTimeUndefined: Self = StObject.set(x, "_valueTime", js.undefined)
    
    inline def set_valueUri(value: Element): Self = StObject.set(x, "_valueUri", value.asInstanceOf[js.Any])
    
    inline def set_valueUriUndefined: Self = StObject.set(x, "_valueUri", js.undefined)
    
    inline def set_valueUrl(value: Element): Self = StObject.set(x, "_valueUrl", value.asInstanceOf[js.Any])
    
    inline def set_valueUrlUndefined: Self = StObject.set(x, "_valueUrl", js.undefined)
    
    inline def set_valueUuid(value: Element): Self = StObject.set(x, "_valueUuid", value.asInstanceOf[js.Any])
    
    inline def set_valueUuidUndefined: Self = StObject.set(x, "_valueUuid", js.undefined)
  }
}
