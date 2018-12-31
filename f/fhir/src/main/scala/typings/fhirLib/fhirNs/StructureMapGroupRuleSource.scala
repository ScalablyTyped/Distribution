package typings
package fhirLib.fhirNs

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
  var check: js.UndefOr[java.lang.String] = js.undefined
  /**
    * FHIRPath expression  - must be true or the rule does not apply
    */
  var condition: js.UndefOr[java.lang.String] = js.undefined
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
  var defaultValueBoolean: js.UndefOr[scala.Boolean] = js.undefined
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
  var defaultValueString: js.UndefOr[java.lang.String] = js.undefined
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
  var element: js.UndefOr[java.lang.String] = js.undefined
  /**
    * first | not_first | last | not_last | only_one
    */
  var listMode: js.UndefOr[code] = js.undefined
  /**
    * Specified maximum cardinality (number or *)
    */
  var max: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specified minimum cardinality
    */
  var min: js.UndefOr[integer] = js.undefined
  /**
    * Rule only applies if source has this type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Named context for field, if a field is specified
    */
  var variable: js.UndefOr[id] = js.undefined
}

