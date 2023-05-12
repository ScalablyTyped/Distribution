package typings.fhir.r4bMod

import typings.fhir.fhirStrings.first
import typings.fhir.fhirStrings.last
import typings.fhir.fhirStrings.not_first
import typings.fhir.fhirStrings.not_last
import typings.fhir.fhirStrings.only_one
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructureMapGroupRuleSource
  extends StObject
     with BackboneElement {
  
  var _check: js.UndefOr[Element] = js.undefined
  
  var _condition: js.UndefOr[Element] = js.undefined
  
  var _context: js.UndefOr[Element] = js.undefined
  
  var _defaultValueBase64Binary: js.UndefOr[Element] = js.undefined
  
  var _defaultValueBoolean: js.UndefOr[Element] = js.undefined
  
  var _defaultValueCanonical: js.UndefOr[Element] = js.undefined
  
  var _defaultValueCode: js.UndefOr[Element] = js.undefined
  
  var _defaultValueDate: js.UndefOr[Element] = js.undefined
  
  var _defaultValueDateTime: js.UndefOr[Element] = js.undefined
  
  var _defaultValueId: js.UndefOr[Element] = js.undefined
  
  var _defaultValueInstant: js.UndefOr[Element] = js.undefined
  
  var _defaultValueMarkdown: js.UndefOr[Element] = js.undefined
  
  var _defaultValueOid: js.UndefOr[Element] = js.undefined
  
  var _defaultValueString: js.UndefOr[Element] = js.undefined
  
  var _defaultValueTime: js.UndefOr[Element] = js.undefined
  
  var _defaultValueUri: js.UndefOr[Element] = js.undefined
  
  var _defaultValueUrl: js.UndefOr[Element] = js.undefined
  
  var _defaultValueUuid: js.UndefOr[Element] = js.undefined
  
  var _element: js.UndefOr[Element] = js.undefined
  
  var _listMode: js.UndefOr[Element] = js.undefined
  
  var _logMessage: js.UndefOr[Element] = js.undefined
  
  var _max: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _variable: js.UndefOr[Element] = js.undefined
  
  /**
    * FHIRPath expression  - must be true or the mapping engine throws an error instead of completing.
    */
  var check: js.UndefOr[String] = js.undefined
  
  /**
    * FHIRPath expression  - must be true or the rule does not apply.
    */
  var condition: js.UndefOr[String] = js.undefined
  
  /**
    * Type or variable this rule applies to.
    */
  var context: String
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueAddress: js.UndefOr[Address] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueAge: js.UndefOr[Age] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueAnnotation: js.UndefOr[Annotation] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueBase64Binary: js.UndefOr[String] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueCode: js.UndefOr[String] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueContactDetail: js.UndefOr[ContactDetail] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueContactPoint: js.UndefOr[ContactPoint] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueContributor: js.UndefOr[Contributor] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueCount: js.UndefOr[Count] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueDataRequirement: js.UndefOr[DataRequirement] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueDate: js.UndefOr[String] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueDecimal: js.UndefOr[Double] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueDistance: js.UndefOr[Distance] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueDosage: js.UndefOr[Dosage] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueExpression: js.UndefOr[Expression] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueHumanName: js.UndefOr[HumanName] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueId: js.UndefOr[String] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueInstant: js.UndefOr[String] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueMarkdown: js.UndefOr[String] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueMeta: js.UndefOr[Meta] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueMoney: js.UndefOr[Money] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueOid: js.UndefOr[String] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueParameterDefinition: js.UndefOr[ParameterDefinition] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValuePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValuePositiveInt: js.UndefOr[Double] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueRange: js.UndefOr[Range] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueRelatedArtifact: js.UndefOr[RelatedArtifact] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueSampledData: js.UndefOr[SampledData] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueSignature: js.UndefOr[Signature] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueString: js.UndefOr[String] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueTime: js.UndefOr[String] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueTriggerDefinition: js.UndefOr[TriggerDefinition] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueUnsignedInt: js.UndefOr[Double] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueUri: js.UndefOr[String] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueUrl: js.UndefOr[String] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueUsageContext: js.UndefOr[UsageContext] = js.undefined
  
  /**
    * If there's a default value on an item that can repeat, it will only be used once.
    */
  var defaultValueUuid: js.UndefOr[String] = js.undefined
  
  /**
    * Optional field for this source.
    */
  var element: js.UndefOr[String] = js.undefined
  
  /**
    * How to handle the list mode for this element.
    */
  var listMode: js.UndefOr[first | not_first | last | not_last | only_one] = js.undefined
  
  /**
    * This is typically used for recording that something Is not transformed to the target for some reason.
    */
  var logMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Specified maximum cardinality for the element - a number or a "*". This is optional; if present, it acts an implicit check on the input content (* just serves as documentation; it's the default value).
    */
  var max: js.UndefOr[String] = js.undefined
  
  /**
    * Specified minimum cardinality for the element. This is optional; if present, it acts an implicit check on the input content.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Specified type for the element. This works as a condition on the mapping - use for polymorphic elements.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Named context for field, if a field is specified.
    */
  var variable: js.UndefOr[String] = js.undefined
}
object StructureMapGroupRuleSource {
  
  inline def apply(context: String): StructureMapGroupRuleSource = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroupRuleSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StructureMapGroupRuleSource] (val x: Self) extends AnyVal {
    
    inline def setCheck(value: String): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
    
    inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueAddress(value: Address): Self = StObject.set(x, "defaultValueAddress", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueAddressUndefined: Self = StObject.set(x, "defaultValueAddress", js.undefined)
    
    inline def setDefaultValueAge(value: Age): Self = StObject.set(x, "defaultValueAge", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueAgeUndefined: Self = StObject.set(x, "defaultValueAge", js.undefined)
    
    inline def setDefaultValueAnnotation(value: Annotation): Self = StObject.set(x, "defaultValueAnnotation", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueAnnotationUndefined: Self = StObject.set(x, "defaultValueAnnotation", js.undefined)
    
    inline def setDefaultValueAttachment(value: Attachment): Self = StObject.set(x, "defaultValueAttachment", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueAttachmentUndefined: Self = StObject.set(x, "defaultValueAttachment", js.undefined)
    
    inline def setDefaultValueBase64Binary(value: String): Self = StObject.set(x, "defaultValueBase64Binary", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueBase64BinaryUndefined: Self = StObject.set(x, "defaultValueBase64Binary", js.undefined)
    
    inline def setDefaultValueBoolean(value: Boolean): Self = StObject.set(x, "defaultValueBoolean", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueBooleanUndefined: Self = StObject.set(x, "defaultValueBoolean", js.undefined)
    
    inline def setDefaultValueCanonical(value: String): Self = StObject.set(x, "defaultValueCanonical", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueCanonicalUndefined: Self = StObject.set(x, "defaultValueCanonical", js.undefined)
    
    inline def setDefaultValueCode(value: String): Self = StObject.set(x, "defaultValueCode", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueCodeUndefined: Self = StObject.set(x, "defaultValueCode", js.undefined)
    
    inline def setDefaultValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "defaultValueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueCodeableConceptUndefined: Self = StObject.set(x, "defaultValueCodeableConcept", js.undefined)
    
    inline def setDefaultValueCoding(value: Coding): Self = StObject.set(x, "defaultValueCoding", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueCodingUndefined: Self = StObject.set(x, "defaultValueCoding", js.undefined)
    
    inline def setDefaultValueContactDetail(value: ContactDetail): Self = StObject.set(x, "defaultValueContactDetail", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueContactDetailUndefined: Self = StObject.set(x, "defaultValueContactDetail", js.undefined)
    
    inline def setDefaultValueContactPoint(value: ContactPoint): Self = StObject.set(x, "defaultValueContactPoint", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueContactPointUndefined: Self = StObject.set(x, "defaultValueContactPoint", js.undefined)
    
    inline def setDefaultValueContributor(value: Contributor): Self = StObject.set(x, "defaultValueContributor", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueContributorUndefined: Self = StObject.set(x, "defaultValueContributor", js.undefined)
    
    inline def setDefaultValueCount(value: Count): Self = StObject.set(x, "defaultValueCount", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueCountUndefined: Self = StObject.set(x, "defaultValueCount", js.undefined)
    
    inline def setDefaultValueDataRequirement(value: DataRequirement): Self = StObject.set(x, "defaultValueDataRequirement", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueDataRequirementUndefined: Self = StObject.set(x, "defaultValueDataRequirement", js.undefined)
    
    inline def setDefaultValueDate(value: String): Self = StObject.set(x, "defaultValueDate", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueDateTime(value: String): Self = StObject.set(x, "defaultValueDateTime", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueDateTimeUndefined: Self = StObject.set(x, "defaultValueDateTime", js.undefined)
    
    inline def setDefaultValueDateUndefined: Self = StObject.set(x, "defaultValueDate", js.undefined)
    
    inline def setDefaultValueDecimal(value: Double): Self = StObject.set(x, "defaultValueDecimal", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueDecimalUndefined: Self = StObject.set(x, "defaultValueDecimal", js.undefined)
    
    inline def setDefaultValueDistance(value: Distance): Self = StObject.set(x, "defaultValueDistance", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueDistanceUndefined: Self = StObject.set(x, "defaultValueDistance", js.undefined)
    
    inline def setDefaultValueDosage(value: Dosage): Self = StObject.set(x, "defaultValueDosage", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueDosageUndefined: Self = StObject.set(x, "defaultValueDosage", js.undefined)
    
    inline def setDefaultValueDuration(value: Duration): Self = StObject.set(x, "defaultValueDuration", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueDurationUndefined: Self = StObject.set(x, "defaultValueDuration", js.undefined)
    
    inline def setDefaultValueExpression(value: Expression): Self = StObject.set(x, "defaultValueExpression", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueExpressionUndefined: Self = StObject.set(x, "defaultValueExpression", js.undefined)
    
    inline def setDefaultValueHumanName(value: HumanName): Self = StObject.set(x, "defaultValueHumanName", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueHumanNameUndefined: Self = StObject.set(x, "defaultValueHumanName", js.undefined)
    
    inline def setDefaultValueId(value: String): Self = StObject.set(x, "defaultValueId", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueIdUndefined: Self = StObject.set(x, "defaultValueId", js.undefined)
    
    inline def setDefaultValueIdentifier(value: Identifier): Self = StObject.set(x, "defaultValueIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueIdentifierUndefined: Self = StObject.set(x, "defaultValueIdentifier", js.undefined)
    
    inline def setDefaultValueInstant(value: String): Self = StObject.set(x, "defaultValueInstant", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueInstantUndefined: Self = StObject.set(x, "defaultValueInstant", js.undefined)
    
    inline def setDefaultValueInteger(value: Double): Self = StObject.set(x, "defaultValueInteger", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueIntegerUndefined: Self = StObject.set(x, "defaultValueInteger", js.undefined)
    
    inline def setDefaultValueMarkdown(value: String): Self = StObject.set(x, "defaultValueMarkdown", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueMarkdownUndefined: Self = StObject.set(x, "defaultValueMarkdown", js.undefined)
    
    inline def setDefaultValueMeta(value: Meta): Self = StObject.set(x, "defaultValueMeta", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueMetaUndefined: Self = StObject.set(x, "defaultValueMeta", js.undefined)
    
    inline def setDefaultValueMoney(value: Money): Self = StObject.set(x, "defaultValueMoney", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueMoneyUndefined: Self = StObject.set(x, "defaultValueMoney", js.undefined)
    
    inline def setDefaultValueOid(value: String): Self = StObject.set(x, "defaultValueOid", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueOidUndefined: Self = StObject.set(x, "defaultValueOid", js.undefined)
    
    inline def setDefaultValueParameterDefinition(value: ParameterDefinition): Self = StObject.set(x, "defaultValueParameterDefinition", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueParameterDefinitionUndefined: Self = StObject.set(x, "defaultValueParameterDefinition", js.undefined)
    
    inline def setDefaultValuePeriod(value: Period): Self = StObject.set(x, "defaultValuePeriod", value.asInstanceOf[js.Any])
    
    inline def setDefaultValuePeriodUndefined: Self = StObject.set(x, "defaultValuePeriod", js.undefined)
    
    inline def setDefaultValuePositiveInt(value: Double): Self = StObject.set(x, "defaultValuePositiveInt", value.asInstanceOf[js.Any])
    
    inline def setDefaultValuePositiveIntUndefined: Self = StObject.set(x, "defaultValuePositiveInt", js.undefined)
    
    inline def setDefaultValueQuantity(value: Quantity): Self = StObject.set(x, "defaultValueQuantity", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueQuantityUndefined: Self = StObject.set(x, "defaultValueQuantity", js.undefined)
    
    inline def setDefaultValueRange(value: Range): Self = StObject.set(x, "defaultValueRange", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueRangeUndefined: Self = StObject.set(x, "defaultValueRange", js.undefined)
    
    inline def setDefaultValueRatio(value: Ratio): Self = StObject.set(x, "defaultValueRatio", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueRatioUndefined: Self = StObject.set(x, "defaultValueRatio", js.undefined)
    
    inline def setDefaultValueReference(value: Reference): Self = StObject.set(x, "defaultValueReference", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueReferenceUndefined: Self = StObject.set(x, "defaultValueReference", js.undefined)
    
    inline def setDefaultValueRelatedArtifact(value: RelatedArtifact): Self = StObject.set(x, "defaultValueRelatedArtifact", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueRelatedArtifactUndefined: Self = StObject.set(x, "defaultValueRelatedArtifact", js.undefined)
    
    inline def setDefaultValueSampledData(value: SampledData): Self = StObject.set(x, "defaultValueSampledData", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueSampledDataUndefined: Self = StObject.set(x, "defaultValueSampledData", js.undefined)
    
    inline def setDefaultValueSignature(value: Signature): Self = StObject.set(x, "defaultValueSignature", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueSignatureUndefined: Self = StObject.set(x, "defaultValueSignature", js.undefined)
    
    inline def setDefaultValueString(value: String): Self = StObject.set(x, "defaultValueString", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueStringUndefined: Self = StObject.set(x, "defaultValueString", js.undefined)
    
    inline def setDefaultValueTime(value: String): Self = StObject.set(x, "defaultValueTime", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueTimeUndefined: Self = StObject.set(x, "defaultValueTime", js.undefined)
    
    inline def setDefaultValueTiming(value: Timing): Self = StObject.set(x, "defaultValueTiming", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueTimingUndefined: Self = StObject.set(x, "defaultValueTiming", js.undefined)
    
    inline def setDefaultValueTriggerDefinition(value: TriggerDefinition): Self = StObject.set(x, "defaultValueTriggerDefinition", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueTriggerDefinitionUndefined: Self = StObject.set(x, "defaultValueTriggerDefinition", js.undefined)
    
    inline def setDefaultValueUnsignedInt(value: Double): Self = StObject.set(x, "defaultValueUnsignedInt", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUnsignedIntUndefined: Self = StObject.set(x, "defaultValueUnsignedInt", js.undefined)
    
    inline def setDefaultValueUri(value: String): Self = StObject.set(x, "defaultValueUri", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUriUndefined: Self = StObject.set(x, "defaultValueUri", js.undefined)
    
    inline def setDefaultValueUrl(value: String): Self = StObject.set(x, "defaultValueUrl", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUrlUndefined: Self = StObject.set(x, "defaultValueUrl", js.undefined)
    
    inline def setDefaultValueUsageContext(value: UsageContext): Self = StObject.set(x, "defaultValueUsageContext", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUsageContextUndefined: Self = StObject.set(x, "defaultValueUsageContext", js.undefined)
    
    inline def setDefaultValueUuid(value: String): Self = StObject.set(x, "defaultValueUuid", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUuidUndefined: Self = StObject.set(x, "defaultValueUuid", js.undefined)
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setListMode(value: first | not_first | last | not_last | only_one): Self = StObject.set(x, "listMode", value.asInstanceOf[js.Any])
    
    inline def setListModeUndefined: Self = StObject.set(x, "listMode", js.undefined)
    
    inline def setLogMessage(value: String): Self = StObject.set(x, "logMessage", value.asInstanceOf[js.Any])
    
    inline def setLogMessageUndefined: Self = StObject.set(x, "logMessage", js.undefined)
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    inline def set_check(value: Element): Self = StObject.set(x, "_check", value.asInstanceOf[js.Any])
    
    inline def set_checkUndefined: Self = StObject.set(x, "_check", js.undefined)
    
    inline def set_condition(value: Element): Self = StObject.set(x, "_condition", value.asInstanceOf[js.Any])
    
    inline def set_conditionUndefined: Self = StObject.set(x, "_condition", js.undefined)
    
    inline def set_context(value: Element): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
    
    inline def set_contextUndefined: Self = StObject.set(x, "_context", js.undefined)
    
    inline def set_defaultValueBase64Binary(value: Element): Self = StObject.set(x, "_defaultValueBase64Binary", value.asInstanceOf[js.Any])
    
    inline def set_defaultValueBase64BinaryUndefined: Self = StObject.set(x, "_defaultValueBase64Binary", js.undefined)
    
    inline def set_defaultValueBoolean(value: Element): Self = StObject.set(x, "_defaultValueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_defaultValueBooleanUndefined: Self = StObject.set(x, "_defaultValueBoolean", js.undefined)
    
    inline def set_defaultValueCanonical(value: Element): Self = StObject.set(x, "_defaultValueCanonical", value.asInstanceOf[js.Any])
    
    inline def set_defaultValueCanonicalUndefined: Self = StObject.set(x, "_defaultValueCanonical", js.undefined)
    
    inline def set_defaultValueCode(value: Element): Self = StObject.set(x, "_defaultValueCode", value.asInstanceOf[js.Any])
    
    inline def set_defaultValueCodeUndefined: Self = StObject.set(x, "_defaultValueCode", js.undefined)
    
    inline def set_defaultValueDate(value: Element): Self = StObject.set(x, "_defaultValueDate", value.asInstanceOf[js.Any])
    
    inline def set_defaultValueDateTime(value: Element): Self = StObject.set(x, "_defaultValueDateTime", value.asInstanceOf[js.Any])
    
    inline def set_defaultValueDateTimeUndefined: Self = StObject.set(x, "_defaultValueDateTime", js.undefined)
    
    inline def set_defaultValueDateUndefined: Self = StObject.set(x, "_defaultValueDate", js.undefined)
    
    inline def set_defaultValueId(value: Element): Self = StObject.set(x, "_defaultValueId", value.asInstanceOf[js.Any])
    
    inline def set_defaultValueIdUndefined: Self = StObject.set(x, "_defaultValueId", js.undefined)
    
    inline def set_defaultValueInstant(value: Element): Self = StObject.set(x, "_defaultValueInstant", value.asInstanceOf[js.Any])
    
    inline def set_defaultValueInstantUndefined: Self = StObject.set(x, "_defaultValueInstant", js.undefined)
    
    inline def set_defaultValueMarkdown(value: Element): Self = StObject.set(x, "_defaultValueMarkdown", value.asInstanceOf[js.Any])
    
    inline def set_defaultValueMarkdownUndefined: Self = StObject.set(x, "_defaultValueMarkdown", js.undefined)
    
    inline def set_defaultValueOid(value: Element): Self = StObject.set(x, "_defaultValueOid", value.asInstanceOf[js.Any])
    
    inline def set_defaultValueOidUndefined: Self = StObject.set(x, "_defaultValueOid", js.undefined)
    
    inline def set_defaultValueString(value: Element): Self = StObject.set(x, "_defaultValueString", value.asInstanceOf[js.Any])
    
    inline def set_defaultValueStringUndefined: Self = StObject.set(x, "_defaultValueString", js.undefined)
    
    inline def set_defaultValueTime(value: Element): Self = StObject.set(x, "_defaultValueTime", value.asInstanceOf[js.Any])
    
    inline def set_defaultValueTimeUndefined: Self = StObject.set(x, "_defaultValueTime", js.undefined)
    
    inline def set_defaultValueUri(value: Element): Self = StObject.set(x, "_defaultValueUri", value.asInstanceOf[js.Any])
    
    inline def set_defaultValueUriUndefined: Self = StObject.set(x, "_defaultValueUri", js.undefined)
    
    inline def set_defaultValueUrl(value: Element): Self = StObject.set(x, "_defaultValueUrl", value.asInstanceOf[js.Any])
    
    inline def set_defaultValueUrlUndefined: Self = StObject.set(x, "_defaultValueUrl", js.undefined)
    
    inline def set_defaultValueUuid(value: Element): Self = StObject.set(x, "_defaultValueUuid", value.asInstanceOf[js.Any])
    
    inline def set_defaultValueUuidUndefined: Self = StObject.set(x, "_defaultValueUuid", js.undefined)
    
    inline def set_element(value: Element): Self = StObject.set(x, "_element", value.asInstanceOf[js.Any])
    
    inline def set_elementUndefined: Self = StObject.set(x, "_element", js.undefined)
    
    inline def set_listMode(value: Element): Self = StObject.set(x, "_listMode", value.asInstanceOf[js.Any])
    
    inline def set_listModeUndefined: Self = StObject.set(x, "_listMode", js.undefined)
    
    inline def set_logMessage(value: Element): Self = StObject.set(x, "_logMessage", value.asInstanceOf[js.Any])
    
    inline def set_logMessageUndefined: Self = StObject.set(x, "_logMessage", js.undefined)
    
    inline def set_max(value: Element): Self = StObject.set(x, "_max", value.asInstanceOf[js.Any])
    
    inline def set_maxUndefined: Self = StObject.set(x, "_max", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_variable(value: Element): Self = StObject.set(x, "_variable", value.asInstanceOf[js.Any])
    
    inline def set_variableUndefined: Self = StObject.set(x, "_variable", js.undefined)
  }
}
