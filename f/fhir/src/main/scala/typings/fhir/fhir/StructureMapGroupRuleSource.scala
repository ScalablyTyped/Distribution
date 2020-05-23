package typings.fhir.fhir

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
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    if (_check != null) __obj.updateDynamic("_check")(_check.asInstanceOf[js.Any])
    if (_condition != null) __obj.updateDynamic("_condition")(_condition.asInstanceOf[js.Any])
    if (_context != null) __obj.updateDynamic("_context")(_context.asInstanceOf[js.Any])
    if (_defaultValueBase64Binary != null) __obj.updateDynamic("_defaultValueBase64Binary")(_defaultValueBase64Binary.asInstanceOf[js.Any])
    if (_defaultValueBoolean != null) __obj.updateDynamic("_defaultValueBoolean")(_defaultValueBoolean.asInstanceOf[js.Any])
    if (_defaultValueCode != null) __obj.updateDynamic("_defaultValueCode")(_defaultValueCode.asInstanceOf[js.Any])
    if (_defaultValueDate != null) __obj.updateDynamic("_defaultValueDate")(_defaultValueDate.asInstanceOf[js.Any])
    if (_defaultValueDateTime != null) __obj.updateDynamic("_defaultValueDateTime")(_defaultValueDateTime.asInstanceOf[js.Any])
    if (_defaultValueDecimal != null) __obj.updateDynamic("_defaultValueDecimal")(_defaultValueDecimal.asInstanceOf[js.Any])
    if (_defaultValueId != null) __obj.updateDynamic("_defaultValueId")(_defaultValueId.asInstanceOf[js.Any])
    if (_defaultValueInstant != null) __obj.updateDynamic("_defaultValueInstant")(_defaultValueInstant.asInstanceOf[js.Any])
    if (_defaultValueInteger != null) __obj.updateDynamic("_defaultValueInteger")(_defaultValueInteger.asInstanceOf[js.Any])
    if (_defaultValueMarkdown != null) __obj.updateDynamic("_defaultValueMarkdown")(_defaultValueMarkdown.asInstanceOf[js.Any])
    if (_defaultValueOid != null) __obj.updateDynamic("_defaultValueOid")(_defaultValueOid.asInstanceOf[js.Any])
    if (_defaultValuePositiveInt != null) __obj.updateDynamic("_defaultValuePositiveInt")(_defaultValuePositiveInt.asInstanceOf[js.Any])
    if (_defaultValueString != null) __obj.updateDynamic("_defaultValueString")(_defaultValueString.asInstanceOf[js.Any])
    if (_defaultValueTime != null) __obj.updateDynamic("_defaultValueTime")(_defaultValueTime.asInstanceOf[js.Any])
    if (_defaultValueUnsignedInt != null) __obj.updateDynamic("_defaultValueUnsignedInt")(_defaultValueUnsignedInt.asInstanceOf[js.Any])
    if (_defaultValueUri != null) __obj.updateDynamic("_defaultValueUri")(_defaultValueUri.asInstanceOf[js.Any])
    if (_element != null) __obj.updateDynamic("_element")(_element.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_listMode != null) __obj.updateDynamic("_listMode")(_listMode.asInstanceOf[js.Any])
    if (_max != null) __obj.updateDynamic("_max")(_max.asInstanceOf[js.Any])
    if (_min != null) __obj.updateDynamic("_min")(_min.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (_variable != null) __obj.updateDynamic("_variable")(_variable.asInstanceOf[js.Any])
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (defaultValueAddress != null) __obj.updateDynamic("defaultValueAddress")(defaultValueAddress.asInstanceOf[js.Any])
    if (defaultValueAge != null) __obj.updateDynamic("defaultValueAge")(defaultValueAge.asInstanceOf[js.Any])
    if (defaultValueAnnotation != null) __obj.updateDynamic("defaultValueAnnotation")(defaultValueAnnotation.asInstanceOf[js.Any])
    if (defaultValueAttachment != null) __obj.updateDynamic("defaultValueAttachment")(defaultValueAttachment.asInstanceOf[js.Any])
    if (defaultValueBase64Binary != null) __obj.updateDynamic("defaultValueBase64Binary")(defaultValueBase64Binary.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValueBoolean)) __obj.updateDynamic("defaultValueBoolean")(defaultValueBoolean.get.asInstanceOf[js.Any])
    if (defaultValueCode != null) __obj.updateDynamic("defaultValueCode")(defaultValueCode.asInstanceOf[js.Any])
    if (defaultValueCodeableConcept != null) __obj.updateDynamic("defaultValueCodeableConcept")(defaultValueCodeableConcept.asInstanceOf[js.Any])
    if (defaultValueCoding != null) __obj.updateDynamic("defaultValueCoding")(defaultValueCoding.asInstanceOf[js.Any])
    if (defaultValueContactPoint != null) __obj.updateDynamic("defaultValueContactPoint")(defaultValueContactPoint.asInstanceOf[js.Any])
    if (defaultValueCount != null) __obj.updateDynamic("defaultValueCount")(defaultValueCount.asInstanceOf[js.Any])
    if (defaultValueDate != null) __obj.updateDynamic("defaultValueDate")(defaultValueDate.asInstanceOf[js.Any])
    if (defaultValueDateTime != null) __obj.updateDynamic("defaultValueDateTime")(defaultValueDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValueDecimal)) __obj.updateDynamic("defaultValueDecimal")(defaultValueDecimal.get.asInstanceOf[js.Any])
    if (defaultValueDistance != null) __obj.updateDynamic("defaultValueDistance")(defaultValueDistance.asInstanceOf[js.Any])
    if (defaultValueDuration != null) __obj.updateDynamic("defaultValueDuration")(defaultValueDuration.asInstanceOf[js.Any])
    if (defaultValueHumanName != null) __obj.updateDynamic("defaultValueHumanName")(defaultValueHumanName.asInstanceOf[js.Any])
    if (defaultValueId != null) __obj.updateDynamic("defaultValueId")(defaultValueId.asInstanceOf[js.Any])
    if (defaultValueIdentifier != null) __obj.updateDynamic("defaultValueIdentifier")(defaultValueIdentifier.asInstanceOf[js.Any])
    if (defaultValueInstant != null) __obj.updateDynamic("defaultValueInstant")(defaultValueInstant.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValueInteger)) __obj.updateDynamic("defaultValueInteger")(defaultValueInteger.get.asInstanceOf[js.Any])
    if (defaultValueMarkdown != null) __obj.updateDynamic("defaultValueMarkdown")(defaultValueMarkdown.asInstanceOf[js.Any])
    if (defaultValueMeta != null) __obj.updateDynamic("defaultValueMeta")(defaultValueMeta.asInstanceOf[js.Any])
    if (defaultValueMoney != null) __obj.updateDynamic("defaultValueMoney")(defaultValueMoney.asInstanceOf[js.Any])
    if (defaultValueOid != null) __obj.updateDynamic("defaultValueOid")(defaultValueOid.asInstanceOf[js.Any])
    if (defaultValuePeriod != null) __obj.updateDynamic("defaultValuePeriod")(defaultValuePeriod.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValuePositiveInt)) __obj.updateDynamic("defaultValuePositiveInt")(defaultValuePositiveInt.get.asInstanceOf[js.Any])
    if (defaultValueQuantity != null) __obj.updateDynamic("defaultValueQuantity")(defaultValueQuantity.asInstanceOf[js.Any])
    if (defaultValueRange != null) __obj.updateDynamic("defaultValueRange")(defaultValueRange.asInstanceOf[js.Any])
    if (defaultValueRatio != null) __obj.updateDynamic("defaultValueRatio")(defaultValueRatio.asInstanceOf[js.Any])
    if (defaultValueReference != null) __obj.updateDynamic("defaultValueReference")(defaultValueReference.asInstanceOf[js.Any])
    if (defaultValueSampledData != null) __obj.updateDynamic("defaultValueSampledData")(defaultValueSampledData.asInstanceOf[js.Any])
    if (defaultValueSignature != null) __obj.updateDynamic("defaultValueSignature")(defaultValueSignature.asInstanceOf[js.Any])
    if (defaultValueString != null) __obj.updateDynamic("defaultValueString")(defaultValueString.asInstanceOf[js.Any])
    if (defaultValueTime != null) __obj.updateDynamic("defaultValueTime")(defaultValueTime.asInstanceOf[js.Any])
    if (defaultValueTiming != null) __obj.updateDynamic("defaultValueTiming")(defaultValueTiming.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValueUnsignedInt)) __obj.updateDynamic("defaultValueUnsignedInt")(defaultValueUnsignedInt.get.asInstanceOf[js.Any])
    if (defaultValueUri != null) __obj.updateDynamic("defaultValueUri")(defaultValueUri.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (listMode != null) __obj.updateDynamic("listMode")(listMode.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroupRuleSource]
  }
}

