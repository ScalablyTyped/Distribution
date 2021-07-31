package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Source inputs to the mapping
  */
trait StructureMapGroupRuleSource
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'check'.
    */
  var _check: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'condition'.
    */
  var _condition: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'context'.
    */
  var _context: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'defaultValueBase64Binary'.
    */
  var _defaultValueBase64Binary: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'defaultValueBoolean'.
    */
  var _defaultValueBoolean: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'defaultValueCode'.
    */
  var _defaultValueCode: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'defaultValueDate'.
    */
  var _defaultValueDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'defaultValueDateTime'.
    */
  var _defaultValueDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'defaultValueDecimal'.
    */
  var _defaultValueDecimal: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'defaultValueId'.
    */
  var _defaultValueId: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'defaultValueInstant'.
    */
  var _defaultValueInstant: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'defaultValueInteger'.
    */
  var _defaultValueInteger: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'defaultValueMarkdown'.
    */
  var _defaultValueMarkdown: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'defaultValueOid'.
    */
  var _defaultValueOid: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'defaultValuePositiveInt'.
    */
  var _defaultValuePositiveInt: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'defaultValueString'.
    */
  var _defaultValueString: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'defaultValueTime'.
    */
  var _defaultValueTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'defaultValueUnsignedInt'.
    */
  var _defaultValueUnsignedInt: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'defaultValueUri'.
    */
  var _defaultValueUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'element'.
    */
  var _element: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'listMode'.
    */
  var _listMode: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'variable'.
    */
  var _variable: js.UndefOr[Element] = js.undefined
  
  /**
    * FHIRPath expression  - must be true or the mapping engine throws an error instead of completing
    */
  var check: js.UndefOr[String] = js.undefined
  
  /**
    * FHIRPath expression  - must be true or the rule does not apply
    */
  var condition: js.UndefOr[String] = js.undefined
  
  /**
    * Type or variable this rule applies to
    */
  var context: id
  
  /**
    * Default value if no value exists
    */
  var defaultValueAddress: js.UndefOr[Address] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueAge: js.UndefOr[Age] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueAnnotation: js.UndefOr[Annotation] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueBase64Binary: js.UndefOr[base64Binary] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueCode: js.UndefOr[code] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueContactPoint: js.UndefOr[ContactPoint] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueCount: js.UndefOr[Count] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueDate: js.UndefOr[date] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueDecimal: js.UndefOr[decimal] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueDistance: js.UndefOr[Distance] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueHumanName: js.UndefOr[HumanName] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueId: js.UndefOr[id] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueInstant: js.UndefOr[instant] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueInteger: js.UndefOr[integer] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueMarkdown: js.UndefOr[markdown] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueMeta: js.UndefOr[Meta] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueMoney: js.UndefOr[Money] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueOid: js.UndefOr[oid] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValuePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValuePositiveInt: js.UndefOr[positiveInt] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueSampledData: js.UndefOr[SampledData] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueSignature: js.UndefOr[Signature] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueString: js.UndefOr[String] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueTime: js.UndefOr[time] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueUnsignedInt: js.UndefOr[unsignedInt] = js.undefined
  
  /**
    * Default value if no value exists
    */
  var defaultValueUri: js.UndefOr[uri] = js.undefined
  
  /**
    * Optional field for this source
    */
  var element: js.UndefOr[String] = js.undefined
  
  /**
    * first | not_first | last | not_last | only_one
    */
  var listMode: js.UndefOr[code] = js.undefined
  
  /**
    * Specified maximum cardinality (number or *)
    */
  var max: js.UndefOr[String] = js.undefined
  
  /**
    * Specified minimum cardinality
    */
  var min: js.UndefOr[integer] = js.undefined
  
  /**
    * Rule only applies if source has this type
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Named context for field, if a field is specified
    */
  var variable: js.UndefOr[id] = js.undefined
}
object StructureMapGroupRuleSource {
  
  @scala.inline
  def apply(context: id): StructureMapGroupRuleSource = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroupRuleSource]
  }
  
  @scala.inline
  implicit class StructureMapGroupRuleSourceMutableBuilder[Self <: StructureMapGroupRuleSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheck(value: String): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setContext(value: id): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueAddress(value: Address): Self = StObject.set(x, "defaultValueAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueAddressUndefined: Self = StObject.set(x, "defaultValueAddress", js.undefined)
    
    @scala.inline
    def setDefaultValueAge(value: Age): Self = StObject.set(x, "defaultValueAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueAgeUndefined: Self = StObject.set(x, "defaultValueAge", js.undefined)
    
    @scala.inline
    def setDefaultValueAnnotation(value: Annotation): Self = StObject.set(x, "defaultValueAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueAnnotationUndefined: Self = StObject.set(x, "defaultValueAnnotation", js.undefined)
    
    @scala.inline
    def setDefaultValueAttachment(value: Attachment): Self = StObject.set(x, "defaultValueAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueAttachmentUndefined: Self = StObject.set(x, "defaultValueAttachment", js.undefined)
    
    @scala.inline
    def setDefaultValueBase64Binary(value: base64Binary): Self = StObject.set(x, "defaultValueBase64Binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueBase64BinaryUndefined: Self = StObject.set(x, "defaultValueBase64Binary", js.undefined)
    
    @scala.inline
    def setDefaultValueBoolean(value: Boolean): Self = StObject.set(x, "defaultValueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueBooleanUndefined: Self = StObject.set(x, "defaultValueBoolean", js.undefined)
    
    @scala.inline
    def setDefaultValueCode(value: code): Self = StObject.set(x, "defaultValueCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueCodeUndefined: Self = StObject.set(x, "defaultValueCode", js.undefined)
    
    @scala.inline
    def setDefaultValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "defaultValueCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueCodeableConceptUndefined: Self = StObject.set(x, "defaultValueCodeableConcept", js.undefined)
    
    @scala.inline
    def setDefaultValueCoding(value: Coding): Self = StObject.set(x, "defaultValueCoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueCodingUndefined: Self = StObject.set(x, "defaultValueCoding", js.undefined)
    
    @scala.inline
    def setDefaultValueContactPoint(value: ContactPoint): Self = StObject.set(x, "defaultValueContactPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueContactPointUndefined: Self = StObject.set(x, "defaultValueContactPoint", js.undefined)
    
    @scala.inline
    def setDefaultValueCount(value: Count): Self = StObject.set(x, "defaultValueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueCountUndefined: Self = StObject.set(x, "defaultValueCount", js.undefined)
    
    @scala.inline
    def setDefaultValueDate(value: date): Self = StObject.set(x, "defaultValueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueDateTime(value: dateTime): Self = StObject.set(x, "defaultValueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueDateTimeUndefined: Self = StObject.set(x, "defaultValueDateTime", js.undefined)
    
    @scala.inline
    def setDefaultValueDateUndefined: Self = StObject.set(x, "defaultValueDate", js.undefined)
    
    @scala.inline
    def setDefaultValueDecimal(value: decimal): Self = StObject.set(x, "defaultValueDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueDecimalUndefined: Self = StObject.set(x, "defaultValueDecimal", js.undefined)
    
    @scala.inline
    def setDefaultValueDistance(value: Distance): Self = StObject.set(x, "defaultValueDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueDistanceUndefined: Self = StObject.set(x, "defaultValueDistance", js.undefined)
    
    @scala.inline
    def setDefaultValueDuration(value: Duration): Self = StObject.set(x, "defaultValueDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueDurationUndefined: Self = StObject.set(x, "defaultValueDuration", js.undefined)
    
    @scala.inline
    def setDefaultValueHumanName(value: HumanName): Self = StObject.set(x, "defaultValueHumanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueHumanNameUndefined: Self = StObject.set(x, "defaultValueHumanName", js.undefined)
    
    @scala.inline
    def setDefaultValueId(value: id): Self = StObject.set(x, "defaultValueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueIdUndefined: Self = StObject.set(x, "defaultValueId", js.undefined)
    
    @scala.inline
    def setDefaultValueIdentifier(value: Identifier): Self = StObject.set(x, "defaultValueIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueIdentifierUndefined: Self = StObject.set(x, "defaultValueIdentifier", js.undefined)
    
    @scala.inline
    def setDefaultValueInstant(value: instant): Self = StObject.set(x, "defaultValueInstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueInstantUndefined: Self = StObject.set(x, "defaultValueInstant", js.undefined)
    
    @scala.inline
    def setDefaultValueInteger(value: integer): Self = StObject.set(x, "defaultValueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueIntegerUndefined: Self = StObject.set(x, "defaultValueInteger", js.undefined)
    
    @scala.inline
    def setDefaultValueMarkdown(value: markdown): Self = StObject.set(x, "defaultValueMarkdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueMarkdownUndefined: Self = StObject.set(x, "defaultValueMarkdown", js.undefined)
    
    @scala.inline
    def setDefaultValueMeta(value: Meta): Self = StObject.set(x, "defaultValueMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueMetaUndefined: Self = StObject.set(x, "defaultValueMeta", js.undefined)
    
    @scala.inline
    def setDefaultValueMoney(value: Money): Self = StObject.set(x, "defaultValueMoney", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueMoneyUndefined: Self = StObject.set(x, "defaultValueMoney", js.undefined)
    
    @scala.inline
    def setDefaultValueOid(value: oid): Self = StObject.set(x, "defaultValueOid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueOidUndefined: Self = StObject.set(x, "defaultValueOid", js.undefined)
    
    @scala.inline
    def setDefaultValuePeriod(value: Period): Self = StObject.set(x, "defaultValuePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValuePeriodUndefined: Self = StObject.set(x, "defaultValuePeriod", js.undefined)
    
    @scala.inline
    def setDefaultValuePositiveInt(value: positiveInt): Self = StObject.set(x, "defaultValuePositiveInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValuePositiveIntUndefined: Self = StObject.set(x, "defaultValuePositiveInt", js.undefined)
    
    @scala.inline
    def setDefaultValueQuantity(value: Quantity): Self = StObject.set(x, "defaultValueQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueQuantityUndefined: Self = StObject.set(x, "defaultValueQuantity", js.undefined)
    
    @scala.inline
    def setDefaultValueRange(value: Range): Self = StObject.set(x, "defaultValueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueRangeUndefined: Self = StObject.set(x, "defaultValueRange", js.undefined)
    
    @scala.inline
    def setDefaultValueRatio(value: Ratio): Self = StObject.set(x, "defaultValueRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueRatioUndefined: Self = StObject.set(x, "defaultValueRatio", js.undefined)
    
    @scala.inline
    def setDefaultValueReference(value: Reference): Self = StObject.set(x, "defaultValueReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueReferenceUndefined: Self = StObject.set(x, "defaultValueReference", js.undefined)
    
    @scala.inline
    def setDefaultValueSampledData(value: SampledData): Self = StObject.set(x, "defaultValueSampledData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueSampledDataUndefined: Self = StObject.set(x, "defaultValueSampledData", js.undefined)
    
    @scala.inline
    def setDefaultValueSignature(value: Signature): Self = StObject.set(x, "defaultValueSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueSignatureUndefined: Self = StObject.set(x, "defaultValueSignature", js.undefined)
    
    @scala.inline
    def setDefaultValueString(value: String): Self = StObject.set(x, "defaultValueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueStringUndefined: Self = StObject.set(x, "defaultValueString", js.undefined)
    
    @scala.inline
    def setDefaultValueTime(value: time): Self = StObject.set(x, "defaultValueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueTimeUndefined: Self = StObject.set(x, "defaultValueTime", js.undefined)
    
    @scala.inline
    def setDefaultValueTiming(value: Timing): Self = StObject.set(x, "defaultValueTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueTimingUndefined: Self = StObject.set(x, "defaultValueTiming", js.undefined)
    
    @scala.inline
    def setDefaultValueUnsignedInt(value: unsignedInt): Self = StObject.set(x, "defaultValueUnsignedInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUnsignedIntUndefined: Self = StObject.set(x, "defaultValueUnsignedInt", js.undefined)
    
    @scala.inline
    def setDefaultValueUri(value: uri): Self = StObject.set(x, "defaultValueUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUriUndefined: Self = StObject.set(x, "defaultValueUri", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setListMode(value: code): Self = StObject.set(x, "listMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListModeUndefined: Self = StObject.set(x, "listMode", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: integer): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVariable(value: id): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    @scala.inline
    def set_check(value: Element): Self = StObject.set(x, "_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_checkUndefined: Self = StObject.set(x, "_check", js.undefined)
    
    @scala.inline
    def set_condition(value: Element): Self = StObject.set(x, "_condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_conditionUndefined: Self = StObject.set(x, "_condition", js.undefined)
    
    @scala.inline
    def set_context(value: Element): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_contextUndefined: Self = StObject.set(x, "_context", js.undefined)
    
    @scala.inline
    def set_defaultValueBase64Binary(value: Element): Self = StObject.set(x, "_defaultValueBase64Binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValueBase64BinaryUndefined: Self = StObject.set(x, "_defaultValueBase64Binary", js.undefined)
    
    @scala.inline
    def set_defaultValueBoolean(value: Element): Self = StObject.set(x, "_defaultValueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValueBooleanUndefined: Self = StObject.set(x, "_defaultValueBoolean", js.undefined)
    
    @scala.inline
    def set_defaultValueCode(value: Element): Self = StObject.set(x, "_defaultValueCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValueCodeUndefined: Self = StObject.set(x, "_defaultValueCode", js.undefined)
    
    @scala.inline
    def set_defaultValueDate(value: Element): Self = StObject.set(x, "_defaultValueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValueDateTime(value: Element): Self = StObject.set(x, "_defaultValueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValueDateTimeUndefined: Self = StObject.set(x, "_defaultValueDateTime", js.undefined)
    
    @scala.inline
    def set_defaultValueDateUndefined: Self = StObject.set(x, "_defaultValueDate", js.undefined)
    
    @scala.inline
    def set_defaultValueDecimal(value: Element): Self = StObject.set(x, "_defaultValueDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValueDecimalUndefined: Self = StObject.set(x, "_defaultValueDecimal", js.undefined)
    
    @scala.inline
    def set_defaultValueId(value: Element): Self = StObject.set(x, "_defaultValueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValueIdUndefined: Self = StObject.set(x, "_defaultValueId", js.undefined)
    
    @scala.inline
    def set_defaultValueInstant(value: Element): Self = StObject.set(x, "_defaultValueInstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValueInstantUndefined: Self = StObject.set(x, "_defaultValueInstant", js.undefined)
    
    @scala.inline
    def set_defaultValueInteger(value: Element): Self = StObject.set(x, "_defaultValueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValueIntegerUndefined: Self = StObject.set(x, "_defaultValueInteger", js.undefined)
    
    @scala.inline
    def set_defaultValueMarkdown(value: Element): Self = StObject.set(x, "_defaultValueMarkdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValueMarkdownUndefined: Self = StObject.set(x, "_defaultValueMarkdown", js.undefined)
    
    @scala.inline
    def set_defaultValueOid(value: Element): Self = StObject.set(x, "_defaultValueOid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValueOidUndefined: Self = StObject.set(x, "_defaultValueOid", js.undefined)
    
    @scala.inline
    def set_defaultValuePositiveInt(value: Element): Self = StObject.set(x, "_defaultValuePositiveInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValuePositiveIntUndefined: Self = StObject.set(x, "_defaultValuePositiveInt", js.undefined)
    
    @scala.inline
    def set_defaultValueString(value: Element): Self = StObject.set(x, "_defaultValueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValueStringUndefined: Self = StObject.set(x, "_defaultValueString", js.undefined)
    
    @scala.inline
    def set_defaultValueTime(value: Element): Self = StObject.set(x, "_defaultValueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValueTimeUndefined: Self = StObject.set(x, "_defaultValueTime", js.undefined)
    
    @scala.inline
    def set_defaultValueUnsignedInt(value: Element): Self = StObject.set(x, "_defaultValueUnsignedInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValueUnsignedIntUndefined: Self = StObject.set(x, "_defaultValueUnsignedInt", js.undefined)
    
    @scala.inline
    def set_defaultValueUri(value: Element): Self = StObject.set(x, "_defaultValueUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_defaultValueUriUndefined: Self = StObject.set(x, "_defaultValueUri", js.undefined)
    
    @scala.inline
    def set_element(value: Element): Self = StObject.set(x, "_element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_elementUndefined: Self = StObject.set(x, "_element", js.undefined)
    
    @scala.inline
    def set_listMode(value: Element): Self = StObject.set(x, "_listMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_listModeUndefined: Self = StObject.set(x, "_listMode", js.undefined)
    
    @scala.inline
    def set_max(value: Element): Self = StObject.set(x, "_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_maxUndefined: Self = StObject.set(x, "_max", js.undefined)
    
    @scala.inline
    def set_min(value: Element): Self = StObject.set(x, "_min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_minUndefined: Self = StObject.set(x, "_min", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    @scala.inline
    def set_variable(value: Element): Self = StObject.set(x, "_variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_variableUndefined: Self = StObject.set(x, "_variable", js.undefined)
  }
}
