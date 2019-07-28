package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Source inputs to the mapping
  */
trait StructureMapGroupRuleSource extends BackboneElement {
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
  def apply(
    context: id,
    _check: Element = null,
    _condition: Element = null,
    _context: Element = null,
    _defaultValueBase64Binary: Element = null,
    _defaultValueBoolean: Element = null,
    _defaultValueCode: Element = null,
    _defaultValueDate: Element = null,
    _defaultValueDateTime: Element = null,
    _defaultValueDecimal: Element = null,
    _defaultValueId: Element = null,
    _defaultValueInstant: Element = null,
    _defaultValueInteger: Element = null,
    _defaultValueMarkdown: Element = null,
    _defaultValueOid: Element = null,
    _defaultValuePositiveInt: Element = null,
    _defaultValueString: Element = null,
    _defaultValueTime: Element = null,
    _defaultValueUnsignedInt: Element = null,
    _defaultValueUri: Element = null,
    _element: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _listMode: Element = null,
    _max: Element = null,
    _min: Element = null,
    _type: Element = null,
    _variable: Element = null,
    check: String = null,
    condition: String = null,
    defaultValueAddress: Address = null,
    defaultValueAge: Age = null,
    defaultValueAnnotation: Annotation = null,
    defaultValueAttachment: Attachment = null,
    defaultValueBase64Binary: base64Binary = null,
    defaultValueBoolean: js.UndefOr[Boolean] = js.undefined,
    defaultValueCode: code = null,
    defaultValueCodeableConcept: CodeableConcept = null,
    defaultValueCoding: Coding = null,
    defaultValueContactPoint: ContactPoint = null,
    defaultValueCount: Count = null,
    defaultValueDate: date = null,
    defaultValueDateTime: dateTime = null,
    defaultValueDecimal: js.UndefOr[decimal] = js.undefined,
    defaultValueDistance: Distance = null,
    defaultValueDuration: Duration = null,
    defaultValueHumanName: HumanName = null,
    defaultValueId: id = null,
    defaultValueIdentifier: Identifier = null,
    defaultValueInstant: instant = null,
    defaultValueInteger: js.UndefOr[integer] = js.undefined,
    defaultValueMarkdown: markdown = null,
    defaultValueMeta: Meta = null,
    defaultValueMoney: Money = null,
    defaultValueOid: oid = null,
    defaultValuePeriod: Period = null,
    defaultValuePositiveInt: js.UndefOr[positiveInt] = js.undefined,
    defaultValueQuantity: Quantity = null,
    defaultValueRange: Range = null,
    defaultValueRatio: Ratio = null,
    defaultValueReference: Reference = null,
    defaultValueSampledData: SampledData = null,
    defaultValueSignature: Signature = null,
    defaultValueString: String = null,
    defaultValueTime: time = null,
    defaultValueTiming: Timing = null,
    defaultValueUnsignedInt: js.UndefOr[unsignedInt] = js.undefined,
    defaultValueUri: uri = null,
    element: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    listMode: code = null,
    max: String = null,
    min: js.UndefOr[integer] = js.undefined,
    modifierExtension: js.Array[Extension] = null,
    `type`: String = null,
    variable: id = null
  ): StructureMapGroupRuleSource = {
    val __obj = js.Dynamic.literal(context = context)
    if (_check != null) __obj.updateDynamic("_check")(_check)
    if (_condition != null) __obj.updateDynamic("_condition")(_condition)
    if (_context != null) __obj.updateDynamic("_context")(_context)
    if (_defaultValueBase64Binary != null) __obj.updateDynamic("_defaultValueBase64Binary")(_defaultValueBase64Binary)
    if (_defaultValueBoolean != null) __obj.updateDynamic("_defaultValueBoolean")(_defaultValueBoolean)
    if (_defaultValueCode != null) __obj.updateDynamic("_defaultValueCode")(_defaultValueCode)
    if (_defaultValueDate != null) __obj.updateDynamic("_defaultValueDate")(_defaultValueDate)
    if (_defaultValueDateTime != null) __obj.updateDynamic("_defaultValueDateTime")(_defaultValueDateTime)
    if (_defaultValueDecimal != null) __obj.updateDynamic("_defaultValueDecimal")(_defaultValueDecimal)
    if (_defaultValueId != null) __obj.updateDynamic("_defaultValueId")(_defaultValueId)
    if (_defaultValueInstant != null) __obj.updateDynamic("_defaultValueInstant")(_defaultValueInstant)
    if (_defaultValueInteger != null) __obj.updateDynamic("_defaultValueInteger")(_defaultValueInteger)
    if (_defaultValueMarkdown != null) __obj.updateDynamic("_defaultValueMarkdown")(_defaultValueMarkdown)
    if (_defaultValueOid != null) __obj.updateDynamic("_defaultValueOid")(_defaultValueOid)
    if (_defaultValuePositiveInt != null) __obj.updateDynamic("_defaultValuePositiveInt")(_defaultValuePositiveInt)
    if (_defaultValueString != null) __obj.updateDynamic("_defaultValueString")(_defaultValueString)
    if (_defaultValueTime != null) __obj.updateDynamic("_defaultValueTime")(_defaultValueTime)
    if (_defaultValueUnsignedInt != null) __obj.updateDynamic("_defaultValueUnsignedInt")(_defaultValueUnsignedInt)
    if (_defaultValueUri != null) __obj.updateDynamic("_defaultValueUri")(_defaultValueUri)
    if (_element != null) __obj.updateDynamic("_element")(_element)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_listMode != null) __obj.updateDynamic("_listMode")(_listMode)
    if (_max != null) __obj.updateDynamic("_max")(_max)
    if (_min != null) __obj.updateDynamic("_min")(_min)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (_variable != null) __obj.updateDynamic("_variable")(_variable)
    if (check != null) __obj.updateDynamic("check")(check)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (defaultValueAddress != null) __obj.updateDynamic("defaultValueAddress")(defaultValueAddress)
    if (defaultValueAge != null) __obj.updateDynamic("defaultValueAge")(defaultValueAge)
    if (defaultValueAnnotation != null) __obj.updateDynamic("defaultValueAnnotation")(defaultValueAnnotation)
    if (defaultValueAttachment != null) __obj.updateDynamic("defaultValueAttachment")(defaultValueAttachment)
    if (defaultValueBase64Binary != null) __obj.updateDynamic("defaultValueBase64Binary")(defaultValueBase64Binary)
    if (!js.isUndefined(defaultValueBoolean)) __obj.updateDynamic("defaultValueBoolean")(defaultValueBoolean)
    if (defaultValueCode != null) __obj.updateDynamic("defaultValueCode")(defaultValueCode)
    if (defaultValueCodeableConcept != null) __obj.updateDynamic("defaultValueCodeableConcept")(defaultValueCodeableConcept)
    if (defaultValueCoding != null) __obj.updateDynamic("defaultValueCoding")(defaultValueCoding)
    if (defaultValueContactPoint != null) __obj.updateDynamic("defaultValueContactPoint")(defaultValueContactPoint)
    if (defaultValueCount != null) __obj.updateDynamic("defaultValueCount")(defaultValueCount)
    if (defaultValueDate != null) __obj.updateDynamic("defaultValueDate")(defaultValueDate)
    if (defaultValueDateTime != null) __obj.updateDynamic("defaultValueDateTime")(defaultValueDateTime)
    if (!js.isUndefined(defaultValueDecimal)) __obj.updateDynamic("defaultValueDecimal")(defaultValueDecimal)
    if (defaultValueDistance != null) __obj.updateDynamic("defaultValueDistance")(defaultValueDistance)
    if (defaultValueDuration != null) __obj.updateDynamic("defaultValueDuration")(defaultValueDuration)
    if (defaultValueHumanName != null) __obj.updateDynamic("defaultValueHumanName")(defaultValueHumanName)
    if (defaultValueId != null) __obj.updateDynamic("defaultValueId")(defaultValueId)
    if (defaultValueIdentifier != null) __obj.updateDynamic("defaultValueIdentifier")(defaultValueIdentifier)
    if (defaultValueInstant != null) __obj.updateDynamic("defaultValueInstant")(defaultValueInstant)
    if (!js.isUndefined(defaultValueInteger)) __obj.updateDynamic("defaultValueInteger")(defaultValueInteger)
    if (defaultValueMarkdown != null) __obj.updateDynamic("defaultValueMarkdown")(defaultValueMarkdown)
    if (defaultValueMeta != null) __obj.updateDynamic("defaultValueMeta")(defaultValueMeta)
    if (defaultValueMoney != null) __obj.updateDynamic("defaultValueMoney")(defaultValueMoney)
    if (defaultValueOid != null) __obj.updateDynamic("defaultValueOid")(defaultValueOid)
    if (defaultValuePeriod != null) __obj.updateDynamic("defaultValuePeriod")(defaultValuePeriod)
    if (!js.isUndefined(defaultValuePositiveInt)) __obj.updateDynamic("defaultValuePositiveInt")(defaultValuePositiveInt)
    if (defaultValueQuantity != null) __obj.updateDynamic("defaultValueQuantity")(defaultValueQuantity)
    if (defaultValueRange != null) __obj.updateDynamic("defaultValueRange")(defaultValueRange)
    if (defaultValueRatio != null) __obj.updateDynamic("defaultValueRatio")(defaultValueRatio)
    if (defaultValueReference != null) __obj.updateDynamic("defaultValueReference")(defaultValueReference)
    if (defaultValueSampledData != null) __obj.updateDynamic("defaultValueSampledData")(defaultValueSampledData)
    if (defaultValueSignature != null) __obj.updateDynamic("defaultValueSignature")(defaultValueSignature)
    if (defaultValueString != null) __obj.updateDynamic("defaultValueString")(defaultValueString)
    if (defaultValueTime != null) __obj.updateDynamic("defaultValueTime")(defaultValueTime)
    if (defaultValueTiming != null) __obj.updateDynamic("defaultValueTiming")(defaultValueTiming)
    if (!js.isUndefined(defaultValueUnsignedInt)) __obj.updateDynamic("defaultValueUnsignedInt")(defaultValueUnsignedInt)
    if (defaultValueUri != null) __obj.updateDynamic("defaultValueUri")(defaultValueUri)
    if (element != null) __obj.updateDynamic("element")(element)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (listMode != null) __obj.updateDynamic("listMode")(listMode)
    if (max != null) __obj.updateDynamic("max")(max)
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (variable != null) __obj.updateDynamic("variable")(variable)
    __obj.asInstanceOf[StructureMapGroupRuleSource]
  }
}

