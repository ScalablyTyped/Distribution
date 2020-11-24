package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Source inputs to the mapping
  */
@js.native
trait StructureMapGroupRuleSource extends BackboneElement {
  
  /**
    * Contains extended information for property 'check'.
    */
  var _check: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'condition'.
    */
  var _condition: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'context'.
    */
  var _context: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'defaultValueBase64Binary'.
    */
  var _defaultValueBase64Binary: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'defaultValueBoolean'.
    */
  var _defaultValueBoolean: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'defaultValueCode'.
    */
  var _defaultValueCode: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'defaultValueDate'.
    */
  var _defaultValueDate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'defaultValueDateTime'.
    */
  var _defaultValueDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'defaultValueDecimal'.
    */
  var _defaultValueDecimal: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'defaultValueId'.
    */
  var _defaultValueId: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'defaultValueInstant'.
    */
  var _defaultValueInstant: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'defaultValueInteger'.
    */
  var _defaultValueInteger: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'defaultValueMarkdown'.
    */
  var _defaultValueMarkdown: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'defaultValueOid'.
    */
  var _defaultValueOid: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'defaultValuePositiveInt'.
    */
  var _defaultValuePositiveInt: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'defaultValueString'.
    */
  var _defaultValueString: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'defaultValueTime'.
    */
  var _defaultValueTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'defaultValueUnsignedInt'.
    */
  var _defaultValueUnsignedInt: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'defaultValueUri'.
    */
  var _defaultValueUri: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'element'.
    */
  var _element: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'listMode'.
    */
  var _listMode: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'variable'.
    */
  var _variable: js.UndefOr[Element] = js.native
  
  /**
    * FHIRPath expression  - must be true or the mapping engine throws an error instead of completing
    */
  var check: js.UndefOr[String] = js.native
  
  /**
    * FHIRPath expression  - must be true or the rule does not apply
    */
  var condition: js.UndefOr[String] = js.native
  
  /**
    * Type or variable this rule applies to
    */
  var context: id = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueAddress: js.UndefOr[Address] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueAge: js.UndefOr[Age] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueAnnotation: js.UndefOr[Annotation] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueAttachment: js.UndefOr[Attachment] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueBase64Binary: js.UndefOr[base64Binary] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueBoolean: js.UndefOr[Boolean] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueCode: js.UndefOr[code] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueCoding: js.UndefOr[Coding] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueContactPoint: js.UndefOr[ContactPoint] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueCount: js.UndefOr[Count] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueDate: js.UndefOr[date] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueDecimal: js.UndefOr[decimal] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueDistance: js.UndefOr[Distance] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueDuration: js.UndefOr[Duration] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueHumanName: js.UndefOr[HumanName] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueId: js.UndefOr[id] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueIdentifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueInstant: js.UndefOr[instant] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueInteger: js.UndefOr[integer] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueMarkdown: js.UndefOr[markdown] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueMeta: js.UndefOr[Meta] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueMoney: js.UndefOr[Money] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueOid: js.UndefOr[oid] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValuePeriod: js.UndefOr[Period] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValuePositiveInt: js.UndefOr[positiveInt] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueQuantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueRange: js.UndefOr[Range] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueRatio: js.UndefOr[Ratio] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueReference: js.UndefOr[Reference] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueSampledData: js.UndefOr[SampledData] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueSignature: js.UndefOr[Signature] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueString: js.UndefOr[String] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueTime: js.UndefOr[time] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueTiming: js.UndefOr[Timing] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueUnsignedInt: js.UndefOr[unsignedInt] = js.native
  
  /**
    * Default value if no value exists
    */
  var defaultValueUri: js.UndefOr[uri] = js.native
  
  /**
    * Optional field for this source
    */
  var element: js.UndefOr[String] = js.native
  
  /**
    * first | not_first | last | not_last | only_one
    */
  var listMode: js.UndefOr[code] = js.native
  
  /**
    * Specified maximum cardinality (number or *)
    */
  var max: js.UndefOr[String] = js.native
  
  /**
    * Specified minimum cardinality
    */
  var min: js.UndefOr[integer] = js.native
  
  /**
    * Rule only applies if source has this type
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Named context for field, if a field is specified
    */
  var variable: js.UndefOr[id] = js.native
}
object StructureMapGroupRuleSource {
  
  @scala.inline
  def apply(context: id): StructureMapGroupRuleSource = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroupRuleSource]
  }
  
  @scala.inline
  implicit class StructureMapGroupRuleSourceOps[Self <: StructureMapGroupRuleSource] (val x: Self) extends AnyVal {
    
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
    def setContext(value: id): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_check(value: Element): Self = this.set("_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_check: Self = this.set("_check", js.undefined)
    
    @scala.inline
    def set_condition(value: Element): Self = this.set("_condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_condition: Self = this.set("_condition", js.undefined)
    
    @scala.inline
    def set_context(value: Element): Self = this.set("_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_context: Self = this.set("_context", js.undefined)
    
    @scala.inline
    def set_defaultValueBase64Binary(value: Element): Self = this.set("_defaultValueBase64Binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultValueBase64Binary: Self = this.set("_defaultValueBase64Binary", js.undefined)
    
    @scala.inline
    def set_defaultValueBoolean(value: Element): Self = this.set("_defaultValueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultValueBoolean: Self = this.set("_defaultValueBoolean", js.undefined)
    
    @scala.inline
    def set_defaultValueCode(value: Element): Self = this.set("_defaultValueCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultValueCode: Self = this.set("_defaultValueCode", js.undefined)
    
    @scala.inline
    def set_defaultValueDate(value: Element): Self = this.set("_defaultValueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultValueDate: Self = this.set("_defaultValueDate", js.undefined)
    
    @scala.inline
    def set_defaultValueDateTime(value: Element): Self = this.set("_defaultValueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultValueDateTime: Self = this.set("_defaultValueDateTime", js.undefined)
    
    @scala.inline
    def set_defaultValueDecimal(value: Element): Self = this.set("_defaultValueDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultValueDecimal: Self = this.set("_defaultValueDecimal", js.undefined)
    
    @scala.inline
    def set_defaultValueId(value: Element): Self = this.set("_defaultValueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultValueId: Self = this.set("_defaultValueId", js.undefined)
    
    @scala.inline
    def set_defaultValueInstant(value: Element): Self = this.set("_defaultValueInstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultValueInstant: Self = this.set("_defaultValueInstant", js.undefined)
    
    @scala.inline
    def set_defaultValueInteger(value: Element): Self = this.set("_defaultValueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultValueInteger: Self = this.set("_defaultValueInteger", js.undefined)
    
    @scala.inline
    def set_defaultValueMarkdown(value: Element): Self = this.set("_defaultValueMarkdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultValueMarkdown: Self = this.set("_defaultValueMarkdown", js.undefined)
    
    @scala.inline
    def set_defaultValueOid(value: Element): Self = this.set("_defaultValueOid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultValueOid: Self = this.set("_defaultValueOid", js.undefined)
    
    @scala.inline
    def set_defaultValuePositiveInt(value: Element): Self = this.set("_defaultValuePositiveInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultValuePositiveInt: Self = this.set("_defaultValuePositiveInt", js.undefined)
    
    @scala.inline
    def set_defaultValueString(value: Element): Self = this.set("_defaultValueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultValueString: Self = this.set("_defaultValueString", js.undefined)
    
    @scala.inline
    def set_defaultValueTime(value: Element): Self = this.set("_defaultValueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultValueTime: Self = this.set("_defaultValueTime", js.undefined)
    
    @scala.inline
    def set_defaultValueUnsignedInt(value: Element): Self = this.set("_defaultValueUnsignedInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultValueUnsignedInt: Self = this.set("_defaultValueUnsignedInt", js.undefined)
    
    @scala.inline
    def set_defaultValueUri(value: Element): Self = this.set("_defaultValueUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_defaultValueUri: Self = this.set("_defaultValueUri", js.undefined)
    
    @scala.inline
    def set_element(value: Element): Self = this.set("_element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_element: Self = this.set("_element", js.undefined)
    
    @scala.inline
    def set_listMode(value: Element): Self = this.set("_listMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_listMode: Self = this.set("_listMode", js.undefined)
    
    @scala.inline
    def set_max(value: Element): Self = this.set("_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_max: Self = this.set("_max", js.undefined)
    
    @scala.inline
    def set_min(value: Element): Self = this.set("_min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_min: Self = this.set("_min", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    
    @scala.inline
    def set_variable(value: Element): Self = this.set("_variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_variable: Self = this.set("_variable", js.undefined)
    
    @scala.inline
    def setCheck(value: String): Self = this.set("check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    
    @scala.inline
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setDefaultValueAddress(value: Address): Self = this.set("defaultValueAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueAddress: Self = this.set("defaultValueAddress", js.undefined)
    
    @scala.inline
    def setDefaultValueAge(value: Age): Self = this.set("defaultValueAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueAge: Self = this.set("defaultValueAge", js.undefined)
    
    @scala.inline
    def setDefaultValueAnnotation(value: Annotation): Self = this.set("defaultValueAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueAnnotation: Self = this.set("defaultValueAnnotation", js.undefined)
    
    @scala.inline
    def setDefaultValueAttachment(value: Attachment): Self = this.set("defaultValueAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueAttachment: Self = this.set("defaultValueAttachment", js.undefined)
    
    @scala.inline
    def setDefaultValueBase64Binary(value: base64Binary): Self = this.set("defaultValueBase64Binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueBase64Binary: Self = this.set("defaultValueBase64Binary", js.undefined)
    
    @scala.inline
    def setDefaultValueBoolean(value: Boolean): Self = this.set("defaultValueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueBoolean: Self = this.set("defaultValueBoolean", js.undefined)
    
    @scala.inline
    def setDefaultValueCode(value: code): Self = this.set("defaultValueCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueCode: Self = this.set("defaultValueCode", js.undefined)
    
    @scala.inline
    def setDefaultValueCodeableConcept(value: CodeableConcept): Self = this.set("defaultValueCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueCodeableConcept: Self = this.set("defaultValueCodeableConcept", js.undefined)
    
    @scala.inline
    def setDefaultValueCoding(value: Coding): Self = this.set("defaultValueCoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueCoding: Self = this.set("defaultValueCoding", js.undefined)
    
    @scala.inline
    def setDefaultValueContactPoint(value: ContactPoint): Self = this.set("defaultValueContactPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueContactPoint: Self = this.set("defaultValueContactPoint", js.undefined)
    
    @scala.inline
    def setDefaultValueCount(value: Count): Self = this.set("defaultValueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueCount: Self = this.set("defaultValueCount", js.undefined)
    
    @scala.inline
    def setDefaultValueDate(value: date): Self = this.set("defaultValueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueDate: Self = this.set("defaultValueDate", js.undefined)
    
    @scala.inline
    def setDefaultValueDateTime(value: dateTime): Self = this.set("defaultValueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueDateTime: Self = this.set("defaultValueDateTime", js.undefined)
    
    @scala.inline
    def setDefaultValueDecimal(value: decimal): Self = this.set("defaultValueDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueDecimal: Self = this.set("defaultValueDecimal", js.undefined)
    
    @scala.inline
    def setDefaultValueDistance(value: Distance): Self = this.set("defaultValueDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueDistance: Self = this.set("defaultValueDistance", js.undefined)
    
    @scala.inline
    def setDefaultValueDuration(value: Duration): Self = this.set("defaultValueDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueDuration: Self = this.set("defaultValueDuration", js.undefined)
    
    @scala.inline
    def setDefaultValueHumanName(value: HumanName): Self = this.set("defaultValueHumanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueHumanName: Self = this.set("defaultValueHumanName", js.undefined)
    
    @scala.inline
    def setDefaultValueId(value: id): Self = this.set("defaultValueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueId: Self = this.set("defaultValueId", js.undefined)
    
    @scala.inline
    def setDefaultValueIdentifier(value: Identifier): Self = this.set("defaultValueIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueIdentifier: Self = this.set("defaultValueIdentifier", js.undefined)
    
    @scala.inline
    def setDefaultValueInstant(value: instant): Self = this.set("defaultValueInstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueInstant: Self = this.set("defaultValueInstant", js.undefined)
    
    @scala.inline
    def setDefaultValueInteger(value: integer): Self = this.set("defaultValueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueInteger: Self = this.set("defaultValueInteger", js.undefined)
    
    @scala.inline
    def setDefaultValueMarkdown(value: markdown): Self = this.set("defaultValueMarkdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueMarkdown: Self = this.set("defaultValueMarkdown", js.undefined)
    
    @scala.inline
    def setDefaultValueMeta(value: Meta): Self = this.set("defaultValueMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueMeta: Self = this.set("defaultValueMeta", js.undefined)
    
    @scala.inline
    def setDefaultValueMoney(value: Money): Self = this.set("defaultValueMoney", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueMoney: Self = this.set("defaultValueMoney", js.undefined)
    
    @scala.inline
    def setDefaultValueOid(value: oid): Self = this.set("defaultValueOid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueOid: Self = this.set("defaultValueOid", js.undefined)
    
    @scala.inline
    def setDefaultValuePeriod(value: Period): Self = this.set("defaultValuePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValuePeriod: Self = this.set("defaultValuePeriod", js.undefined)
    
    @scala.inline
    def setDefaultValuePositiveInt(value: positiveInt): Self = this.set("defaultValuePositiveInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValuePositiveInt: Self = this.set("defaultValuePositiveInt", js.undefined)
    
    @scala.inline
    def setDefaultValueQuantity(value: Quantity): Self = this.set("defaultValueQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueQuantity: Self = this.set("defaultValueQuantity", js.undefined)
    
    @scala.inline
    def setDefaultValueRange(value: Range): Self = this.set("defaultValueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueRange: Self = this.set("defaultValueRange", js.undefined)
    
    @scala.inline
    def setDefaultValueRatio(value: Ratio): Self = this.set("defaultValueRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueRatio: Self = this.set("defaultValueRatio", js.undefined)
    
    @scala.inline
    def setDefaultValueReference(value: Reference): Self = this.set("defaultValueReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueReference: Self = this.set("defaultValueReference", js.undefined)
    
    @scala.inline
    def setDefaultValueSampledData(value: SampledData): Self = this.set("defaultValueSampledData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueSampledData: Self = this.set("defaultValueSampledData", js.undefined)
    
    @scala.inline
    def setDefaultValueSignature(value: Signature): Self = this.set("defaultValueSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueSignature: Self = this.set("defaultValueSignature", js.undefined)
    
    @scala.inline
    def setDefaultValueString(value: String): Self = this.set("defaultValueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueString: Self = this.set("defaultValueString", js.undefined)
    
    @scala.inline
    def setDefaultValueTime(value: time): Self = this.set("defaultValueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueTime: Self = this.set("defaultValueTime", js.undefined)
    
    @scala.inline
    def setDefaultValueTiming(value: Timing): Self = this.set("defaultValueTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueTiming: Self = this.set("defaultValueTiming", js.undefined)
    
    @scala.inline
    def setDefaultValueUnsignedInt(value: unsignedInt): Self = this.set("defaultValueUnsignedInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueUnsignedInt: Self = this.set("defaultValueUnsignedInt", js.undefined)
    
    @scala.inline
    def setDefaultValueUri(value: uri): Self = this.set("defaultValueUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueUri: Self = this.set("defaultValueUri", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setListMode(value: code): Self = this.set("listMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListMode: Self = this.set("listMode", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: integer): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVariable(value: id): Self = this.set("variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariable: Self = this.set("variable", js.undefined)
  }
}
