package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Definition of an element in a resource or extension
     */

trait ElementDefinition extends Element {
  /**
           * Contains extended information for property 'alias'.
           */
  var _alias: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'comment'.
           */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'condition'.
           */
  var _condition: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'contentReference'.
           */
  var _contentReference: js.UndefOr[Element] = js.undefined
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
           * Contains extended information for property 'definition'.
           */
  var _definition: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'fixedBase64Binary'.
           */
  var _fixedBase64Binary: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'fixedBoolean'.
           */
  var _fixedBoolean: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'fixedCode'.
           */
  var _fixedCode: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'fixedDate'.
           */
  var _fixedDate: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'fixedDateTime'.
           */
  var _fixedDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'fixedDecimal'.
           */
  var _fixedDecimal: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'fixedId'.
           */
  var _fixedId: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'fixedInstant'.
           */
  var _fixedInstant: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'fixedInteger'.
           */
  var _fixedInteger: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'fixedMarkdown'.
           */
  var _fixedMarkdown: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'fixedOid'.
           */
  var _fixedOid: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'fixedPositiveInt'.
           */
  var _fixedPositiveInt: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'fixedString'.
           */
  var _fixedString: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'fixedTime'.
           */
  var _fixedTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'fixedUnsignedInt'.
           */
  var _fixedUnsignedInt: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'fixedUri'.
           */
  var _fixedUri: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'isModifier'.
           */
  var _isModifier: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'isSummary'.
           */
  var _isSummary: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'label'.
           */
  var _label: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'max'.
           */
  var _max: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'maxLength'.
           */
  var _maxLength: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'maxValueDate'.
           */
  var _maxValueDate: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'maxValueDateTime'.
           */
  var _maxValueDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'maxValueDecimal'.
           */
  var _maxValueDecimal: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'maxValueInstant'.
           */
  var _maxValueInstant: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'maxValueInteger'.
           */
  var _maxValueInteger: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'maxValuePositiveInt'.
           */
  var _maxValuePositiveInt: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'maxValueTime'.
           */
  var _maxValueTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'maxValueUnsignedInt'.
           */
  var _maxValueUnsignedInt: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'meaningWhenMissing'.
           */
  var _meaningWhenMissing: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'min'.
           */
  var _min: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'minValueDate'.
           */
  var _minValueDate: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'minValueDateTime'.
           */
  var _minValueDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'minValueDecimal'.
           */
  var _minValueDecimal: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'minValueInstant'.
           */
  var _minValueInstant: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'minValueInteger'.
           */
  var _minValueInteger: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'minValuePositiveInt'.
           */
  var _minValuePositiveInt: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'minValueTime'.
           */
  var _minValueTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'minValueUnsignedInt'.
           */
  var _minValueUnsignedInt: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'mustSupport'.
           */
  var _mustSupport: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'orderMeaning'.
           */
  var _orderMeaning: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'path'.
           */
  var _path: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'patternBase64Binary'.
           */
  var _patternBase64Binary: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'patternBoolean'.
           */
  var _patternBoolean: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'patternCode'.
           */
  var _patternCode: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'patternDate'.
           */
  var _patternDate: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'patternDateTime'.
           */
  var _patternDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'patternDecimal'.
           */
  var _patternDecimal: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'patternId'.
           */
  var _patternId: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'patternInstant'.
           */
  var _patternInstant: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'patternInteger'.
           */
  var _patternInteger: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'patternMarkdown'.
           */
  var _patternMarkdown: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'patternOid'.
           */
  var _patternOid: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'patternPositiveInt'.
           */
  var _patternPositiveInt: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'patternString'.
           */
  var _patternString: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'patternTime'.
           */
  var _patternTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'patternUnsignedInt'.
           */
  var _patternUnsignedInt: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'patternUri'.
           */
  var _patternUri: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'representation'.
           */
  var _representation: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'requirements'.
           */
  var _requirements: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'short'.
           */
  var _short: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'sliceName'.
           */
  var _sliceName: js.UndefOr[Element] = js.undefined
  /**
           * Other names
           */
  var alias: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Base definition information for tools
           */
  var base: js.UndefOr[ElementDefinitionBase] = js.undefined
  /**
           * ValueSet details if this is coded
           */
  var binding: js.UndefOr[ElementDefinitionBinding] = js.undefined
  /**
           * Corresponding codes in terminologies
           */
  var code: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
           * Comments about the use of this element
           */
  var comment: js.UndefOr[markdown] = js.undefined
  /**
           * Reference to invariant about presence
           */
  var condition: js.UndefOr[js.Array[id]] = js.undefined
  /**
           * Condition that must evaluate to true
           */
  var constraint: js.UndefOr[js.Array[ElementDefinitionConstraint]] = js.undefined
  /**
           * Reference to definition of content for the element
           */
  var contentReference: js.UndefOr[uri] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueAddress: js.UndefOr[Address] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueAge: js.UndefOr[Age] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueAnnotation: js.UndefOr[Annotation] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueAttachment: js.UndefOr[Attachment] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueBase64Binary: js.UndefOr[base64Binary] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueCode: js.UndefOr[code] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueCoding: js.UndefOr[Coding] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueContactPoint: js.UndefOr[ContactPoint] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueCount: js.UndefOr[Count] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueDate: js.UndefOr[date] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueDecimal: js.UndefOr[decimal] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueDistance: js.UndefOr[Distance] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueDuration: js.UndefOr[Duration] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueHumanName: js.UndefOr[HumanName] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueId: js.UndefOr[id] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueInstant: js.UndefOr[instant] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueInteger: js.UndefOr[integer] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueMarkdown: js.UndefOr[markdown] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueMeta: js.UndefOr[Meta] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueMoney: js.UndefOr[Money] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueOid: js.UndefOr[oid] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValuePeriod: js.UndefOr[Period] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValuePositiveInt: js.UndefOr[positiveInt] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueRange: js.UndefOr[Range] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueRatio: js.UndefOr[Ratio] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueReference: js.UndefOr[Reference] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueSampledData: js.UndefOr[SampledData] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueSignature: js.UndefOr[Signature] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueString: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueTime: js.UndefOr[time] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueTiming: js.UndefOr[Timing] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueUnsignedInt: js.UndefOr[unsignedInt] = js.undefined
  /**
           * Specified value if missing from instance
           */
  var defaultValueUri: js.UndefOr[uri] = js.undefined
  /**
           * Full formal definition as narrative text
           */
  var definition: js.UndefOr[markdown] = js.undefined
  /**
           * Example value (as defined for type)
           */
  var example: js.UndefOr[js.Array[ElementDefinitionExample]] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedAddress: js.UndefOr[Address] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedAge: js.UndefOr[Age] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedAnnotation: js.UndefOr[Annotation] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedAttachment: js.UndefOr[Attachment] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedBase64Binary: js.UndefOr[base64Binary] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedCode: js.UndefOr[code] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedCoding: js.UndefOr[Coding] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedContactPoint: js.UndefOr[ContactPoint] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedCount: js.UndefOr[Count] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedDate: js.UndefOr[date] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedDecimal: js.UndefOr[decimal] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedDistance: js.UndefOr[Distance] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedDuration: js.UndefOr[Duration] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedHumanName: js.UndefOr[HumanName] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedId: js.UndefOr[id] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedInstant: js.UndefOr[instant] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedInteger: js.UndefOr[integer] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedMarkdown: js.UndefOr[markdown] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedMeta: js.UndefOr[Meta] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedMoney: js.UndefOr[Money] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedOid: js.UndefOr[oid] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedPeriod: js.UndefOr[Period] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedPositiveInt: js.UndefOr[positiveInt] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedQuantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedRange: js.UndefOr[Range] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedRatio: js.UndefOr[Ratio] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedReference: js.UndefOr[Reference] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedSampledData: js.UndefOr[SampledData] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedSignature: js.UndefOr[Signature] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedString: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedTime: js.UndefOr[time] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedTiming: js.UndefOr[Timing] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedUnsignedInt: js.UndefOr[unsignedInt] = js.undefined
  /**
           * Value must be exactly this
           */
  var fixedUri: js.UndefOr[uri] = js.undefined
  /**
           * If this modifies the meaning of other elements
           */
  var isModifier: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Include when _summary = true?
           */
  var isSummary: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Name for element to display with or prompt for element
           */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Map element to another set of definitions
           */
  var mapping: js.UndefOr[js.Array[ElementDefinitionMapping]] = js.undefined
  /**
           * Maximum Cardinality (a number or *)
           */
  var max: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Max length for strings
           */
  var maxLength: js.UndefOr[integer] = js.undefined
  /**
           * Maximum Allowed Value (for some types)
           */
  var maxValueDate: js.UndefOr[date] = js.undefined
  /**
           * Maximum Allowed Value (for some types)
           */
  var maxValueDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Maximum Allowed Value (for some types)
           */
  var maxValueDecimal: js.UndefOr[decimal] = js.undefined
  /**
           * Maximum Allowed Value (for some types)
           */
  var maxValueInstant: js.UndefOr[instant] = js.undefined
  /**
           * Maximum Allowed Value (for some types)
           */
  var maxValueInteger: js.UndefOr[integer] = js.undefined
  /**
           * Maximum Allowed Value (for some types)
           */
  var maxValuePositiveInt: js.UndefOr[positiveInt] = js.undefined
  /**
           * Maximum Allowed Value (for some types)
           */
  var maxValueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Maximum Allowed Value (for some types)
           */
  var maxValueTime: js.UndefOr[time] = js.undefined
  /**
           * Maximum Allowed Value (for some types)
           */
  var maxValueUnsignedInt: js.UndefOr[unsignedInt] = js.undefined
  /**
           * Implicit meaning when this element is missing
           */
  var meaningWhenMissing: js.UndefOr[markdown] = js.undefined
  /**
           * Minimum Cardinality
           */
  var min: js.UndefOr[unsignedInt] = js.undefined
  /**
           * Minimum Allowed Value (for some types)
           */
  var minValueDate: js.UndefOr[date] = js.undefined
  /**
           * Minimum Allowed Value (for some types)
           */
  var minValueDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Minimum Allowed Value (for some types)
           */
  var minValueDecimal: js.UndefOr[decimal] = js.undefined
  /**
           * Minimum Allowed Value (for some types)
           */
  var minValueInstant: js.UndefOr[instant] = js.undefined
  /**
           * Minimum Allowed Value (for some types)
           */
  var minValueInteger: js.UndefOr[integer] = js.undefined
  /**
           * Minimum Allowed Value (for some types)
           */
  var minValuePositiveInt: js.UndefOr[positiveInt] = js.undefined
  /**
           * Minimum Allowed Value (for some types)
           */
  var minValueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Minimum Allowed Value (for some types)
           */
  var minValueTime: js.UndefOr[time] = js.undefined
  /**
           * Minimum Allowed Value (for some types)
           */
  var minValueUnsignedInt: js.UndefOr[unsignedInt] = js.undefined
  /**
           * If the element must supported
           */
  var mustSupport: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * What the order of the elements means
           */
  var orderMeaning: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Path of the element in the hierarchy of elements
           */
  var path: java.lang.String
  /**
           * Value must have at least these property values
           */
  var patternAddress: js.UndefOr[Address] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternAge: js.UndefOr[Age] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternAnnotation: js.UndefOr[Annotation] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternAttachment: js.UndefOr[Attachment] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternBase64Binary: js.UndefOr[base64Binary] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternCode: js.UndefOr[code] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternCoding: js.UndefOr[Coding] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternContactPoint: js.UndefOr[ContactPoint] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternCount: js.UndefOr[Count] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternDate: js.UndefOr[date] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternDecimal: js.UndefOr[decimal] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternDistance: js.UndefOr[Distance] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternDuration: js.UndefOr[Duration] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternHumanName: js.UndefOr[HumanName] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternId: js.UndefOr[id] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternInstant: js.UndefOr[instant] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternInteger: js.UndefOr[integer] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternMarkdown: js.UndefOr[markdown] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternMeta: js.UndefOr[Meta] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternMoney: js.UndefOr[Money] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternOid: js.UndefOr[oid] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternPeriod: js.UndefOr[Period] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternPositiveInt: js.UndefOr[positiveInt] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternQuantity: js.UndefOr[Quantity] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternRange: js.UndefOr[Range] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternRatio: js.UndefOr[Ratio] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternReference: js.UndefOr[Reference] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternSampledData: js.UndefOr[SampledData] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternSignature: js.UndefOr[Signature] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternString: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternTime: js.UndefOr[time] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternTiming: js.UndefOr[Timing] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternUnsignedInt: js.UndefOr[unsignedInt] = js.undefined
  /**
           * Value must have at least these property values
           */
  var patternUri: js.UndefOr[uri] = js.undefined
  /**
           * xmlAttr | xmlText | typeAttr | cdaText | xhtml
           */
  var representation: js.UndefOr[js.Array[code]] = js.undefined
  /**
           * Why this resource has been created
           */
  var requirements: js.UndefOr[markdown] = js.undefined
  /**
           * Concise definition for space-constrained presentation
           */
  var short: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Name for this particular element (in a set of slices)
           */
  var sliceName: js.UndefOr[java.lang.String] = js.undefined
  /**
           * This element is sliced - slices follow
           */
  var slicing: js.UndefOr[ElementDefinitionSlicing] = js.undefined
  /**
           * Data type and Profile for this element
           */
  var `type`: js.UndefOr[js.Array[ElementDefinitionType]] = js.undefined
}

