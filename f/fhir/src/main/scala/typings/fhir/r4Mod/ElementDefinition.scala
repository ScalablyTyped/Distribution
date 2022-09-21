package typings.fhir.r4Mod

import typings.fhir.fhirStrings.cdaText
import typings.fhir.fhirStrings.typeAttr
import typings.fhir.fhirStrings.xhtml
import typings.fhir.fhirStrings.xmlAttr
import typings.fhir.fhirStrings.xmlText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementDefinition
  extends StObject
     with BackboneElement {
  
  var _alias: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _comment: js.UndefOr[Element] = js.undefined
  
  var _condition: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _contentReference: js.UndefOr[Element] = js.undefined
  
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
  
  var _definition: js.UndefOr[Element] = js.undefined
  
  var _fixedBase64Binary: js.UndefOr[Element] = js.undefined
  
  var _fixedBoolean: js.UndefOr[Element] = js.undefined
  
  var _fixedCanonical: js.UndefOr[Element] = js.undefined
  
  var _fixedCode: js.UndefOr[Element] = js.undefined
  
  var _fixedDate: js.UndefOr[Element] = js.undefined
  
  var _fixedDateTime: js.UndefOr[Element] = js.undefined
  
  var _fixedId: js.UndefOr[Element] = js.undefined
  
  var _fixedInstant: js.UndefOr[Element] = js.undefined
  
  var _fixedMarkdown: js.UndefOr[Element] = js.undefined
  
  var _fixedOid: js.UndefOr[Element] = js.undefined
  
  var _fixedString: js.UndefOr[Element] = js.undefined
  
  var _fixedTime: js.UndefOr[Element] = js.undefined
  
  var _fixedUri: js.UndefOr[Element] = js.undefined
  
  var _fixedUrl: js.UndefOr[Element] = js.undefined
  
  var _fixedUuid: js.UndefOr[Element] = js.undefined
  
  var _isModifier: js.UndefOr[Element] = js.undefined
  
  var _isModifierReason: js.UndefOr[Element] = js.undefined
  
  var _isSummary: js.UndefOr[Element] = js.undefined
  
  var _label: js.UndefOr[Element] = js.undefined
  
  var _max: js.UndefOr[Element] = js.undefined
  
  var _maxValueDate: js.UndefOr[Element] = js.undefined
  
  var _maxValueDateTime: js.UndefOr[Element] = js.undefined
  
  var _maxValueInstant: js.UndefOr[Element] = js.undefined
  
  var _maxValueTime: js.UndefOr[Element] = js.undefined
  
  var _meaningWhenMissing: js.UndefOr[Element] = js.undefined
  
  var _minValueDate: js.UndefOr[Element] = js.undefined
  
  var _minValueDateTime: js.UndefOr[Element] = js.undefined
  
  var _minValueInstant: js.UndefOr[Element] = js.undefined
  
  var _minValueTime: js.UndefOr[Element] = js.undefined
  
  var _mustSupport: js.UndefOr[Element] = js.undefined
  
  var _orderMeaning: js.UndefOr[Element] = js.undefined
  
  var _path: js.UndefOr[Element] = js.undefined
  
  var _patternBase64Binary: js.UndefOr[Element] = js.undefined
  
  var _patternBoolean: js.UndefOr[Element] = js.undefined
  
  var _patternCanonical: js.UndefOr[Element] = js.undefined
  
  var _patternCode: js.UndefOr[Element] = js.undefined
  
  var _patternDate: js.UndefOr[Element] = js.undefined
  
  var _patternDateTime: js.UndefOr[Element] = js.undefined
  
  var _patternId: js.UndefOr[Element] = js.undefined
  
  var _patternInstant: js.UndefOr[Element] = js.undefined
  
  var _patternMarkdown: js.UndefOr[Element] = js.undefined
  
  var _patternOid: js.UndefOr[Element] = js.undefined
  
  var _patternString: js.UndefOr[Element] = js.undefined
  
  var _patternTime: js.UndefOr[Element] = js.undefined
  
  var _patternUri: js.UndefOr[Element] = js.undefined
  
  var _patternUrl: js.UndefOr[Element] = js.undefined
  
  var _patternUuid: js.UndefOr[Element] = js.undefined
  
  var _representation: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _requirements: js.UndefOr[Element] = js.undefined
  
  var _short: js.UndefOr[Element] = js.undefined
  
  var _sliceIsConstraining: js.UndefOr[Element] = js.undefined
  
  var _sliceName: js.UndefOr[Element] = js.undefined
  
  /**
    * Identifies additional names by which this element might also be known.
    */
  var alias: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The base information does not carry any information that could not be determined from the path and related profiles, but making this determination requires both that the related profiles are available, and that the algorithm to determine them be available. For tooling simplicity, the base information must always be populated in element definitions in snap shots, even if it is the same.
    */
  var base: js.UndefOr[ElementDefinitionBase] = js.undefined
  
  /**
    * For a CodeableConcept, when no codes are allowed - only text, use a binding of strength "required" with a description explaining that no coded values are allowed and what sort of information to put in the "text" element.
    */
  var binding: js.UndefOr[ElementDefinitionBinding] = js.undefined
  
  /**
    * The concept SHALL be properly aligned with the data element definition and other constraints, as defined in the code system, including relationships, of any code listed here.  Where multiple codes exist in a terminology that could correspond to the data element, the most granular code(s) should be selected, so long as they are not more restrictive than the data element itself. The mappings may be used to provide more or less granular or structured equivalences in the code system.
    */
  var code: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * If it is possible to capture usage rules using constraints, that mechanism should be used in preference to this element.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to an invariant that may make additional statements about the cardinality or value in the instance.
    */
  var condition: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Constraints should be declared on the "context" element - the lowest element in the hierarchy that is common to all nodes referenced by the constraint.
    */
  var constraint: js.UndefOr[js.Array[ElementDefinitionConstraint]] = js.undefined
  
  /**
    * ContentReferences can only be defined in specializations, not constrained types, and they cannot be changed and always reference the non-constrained definition.
    */
  var contentReference: js.UndefOr[String] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueAddress: js.UndefOr[Address] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueAge: js.UndefOr[Age] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueAnnotation: js.UndefOr[Annotation] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueBase64Binary: js.UndefOr[String] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueCode: js.UndefOr[String] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueCodeableReference: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueContactDetail: js.UndefOr[ContactDetail] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueContactPoint: js.UndefOr[ContactPoint] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueContributor: js.UndefOr[Contributor] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueCount: js.UndefOr[Count] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueDataRequirement: js.UndefOr[DataRequirement] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueDate: js.UndefOr[String] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueDecimal: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueDistance: js.UndefOr[Distance] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueDosage: js.UndefOr[Dosage] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueExpression: js.UndefOr[Expression] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueHumanName: js.UndefOr[HumanName] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueInstant: js.UndefOr[String] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueMarkdown: js.UndefOr[String] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueMeta: js.UndefOr[Meta] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueMoney: js.UndefOr[Money] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueOid: js.UndefOr[String] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueParameterDefinition: js.UndefOr[ParameterDefinition] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValuePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValuePositiveInt: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueRatioRange: js.UndefOr[RatioRange] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueRelatedArtifact: js.UndefOr[RelatedArtifact] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueSampledData: js.UndefOr[SampledData] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueSignature: js.UndefOr[Signature] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueString: js.UndefOr[String] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueTime: js.UndefOr[String] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueTriggerDefinition: js.UndefOr[TriggerDefinition] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueUnsignedInt: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueUri: js.UndefOr[String] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueUsageContext: js.UndefOr[UsageContext] = js.undefined
  
  /**
    * Specifying a default value means that the property can never been unknown - it must always have a value. Further, the default value can never be changed, or changed in constraints on content models. Defining default values creates many difficulties in implementation (e.g. when is a value missing?). For these reasons, default values are (and should be) used extremely sparingly.
    * No default values are ever defined in the FHIR specification, nor can they be defined in constraints ("profiles") on data types or resources. This element only exists so that default values may be defined in logical models.
    */
  var defaultValueUuid: js.UndefOr[String] = js.undefined
  
  /**
    * It is easy for a different definition to change the meaning of an element and this can have nasty downstream consequences. Please be careful when providing definitions in a profile.
    */
  var definition: js.UndefOr[String] = js.undefined
  
  /**
    * Examples will most commonly be present for data where it's not implicitly obvious from either the data type or value set what the values might be.  (I.e. Example values for dates or quantities would generally be unnecessary.)  If the example value is fully populated, the publication tool can generate an instance automatically.
    */
  var example: js.UndefOr[js.Array[ElementDefinitionExample]] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedAddress: js.UndefOr[Address] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedAge: js.UndefOr[Age] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedAnnotation: js.UndefOr[Annotation] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedBase64Binary: js.UndefOr[String] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedCode: js.UndefOr[String] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedCodeableReference: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedContactDetail: js.UndefOr[ContactDetail] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedContactPoint: js.UndefOr[ContactPoint] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedContributor: js.UndefOr[Contributor] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedCount: js.UndefOr[Count] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedDataRequirement: js.UndefOr[DataRequirement] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedDate: js.UndefOr[String] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedDecimal: js.UndefOr[Double] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedDistance: js.UndefOr[Distance] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedDosage: js.UndefOr[Dosage] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedExpression: js.UndefOr[Expression] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedHumanName: js.UndefOr[HumanName] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedId: js.UndefOr[String] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedInstant: js.UndefOr[String] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedMarkdown: js.UndefOr[String] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedMeta: js.UndefOr[Meta] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedMoney: js.UndefOr[Money] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedOid: js.UndefOr[String] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedParameterDefinition: js.UndefOr[ParameterDefinition] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedPositiveInt: js.UndefOr[Double] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedRange: js.UndefOr[Range] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedRatioRange: js.UndefOr[RatioRange] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedRelatedArtifact: js.UndefOr[RelatedArtifact] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedSampledData: js.UndefOr[SampledData] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedSignature: js.UndefOr[Signature] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedString: js.UndefOr[String] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedTime: js.UndefOr[String] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedTriggerDefinition: js.UndefOr[TriggerDefinition] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedUnsignedInt: js.UndefOr[Double] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedUri: js.UndefOr[String] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedUrl: js.UndefOr[String] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedUsageContext: js.UndefOr[UsageContext] = js.undefined
  
  /**
    * This is not recommended for Coding and CodeableConcept since these often have highly contextual properties such as version or display.
    */
  var fixedUuid: js.UndefOr[String] = js.undefined
  
  /**
    * Only the definition of an element can set IsModifier true - either the specification itself or where an extension is originally defined. Once set, it cannot be changed in derived profiles. An element/extension that has isModifier=true SHOULD also have a minimum cardinality of 1, so that there is no lack of clarity about what to do if it is missing. If it can be missing, the definition SHALL make the meaning of a missing element clear.
    */
  var isModifier: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Explains how that element affects the interpretation of the resource or element that contains it.
    */
  var isModifierReason: js.UndefOr[String] = js.undefined
  
  /**
    * Some resources include a set of simple metadata, and some very large data. This element is used to reduce the quantity of data returned in searches. Note that servers may pre-cache summarized resources for optimal performance, so servers might not support per-profile use of the isSummary flag. When a request is made with _summary=true, serailisers only include elements marked as 'isSummary = true'. Other than Attachment.data, all data type properties are included in the summary form. In resource and data type definitions, if an element is at the root or has a parent that is 'mustSupport' and the minimum cardinality is 1 or the element is a modifier, it must be marked as isSummary=true.
    */
  var isSummary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * See also the extension (http://hl7.org/fhir/StructureDefinition/elementdefinition-question)[extension-elementdefinition-question.html].
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Mappings are not necessarily specific enough for safe translation.
    */
  var mapping: js.UndefOr[js.Array[ElementDefinitionMapping]] = js.undefined
  
  /**
    * The maximum number of times this element is permitted to appear in the instance.
    */
  var max: js.UndefOr[String] = js.undefined
  
  /**
    * Receivers are not required to reject instances that exceed the maximum length.  The full length could be stored.  In some cases, data might be truncated, though truncation should be undertaken with care and an understanding of the consequences of doing so. If not specified, there is no conformance expectation for length support.
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the maxValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of maxValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is added to the current clock to determine the maximum allowable value.   A maximum value for a Quantity is interpreted as an canonical maximum - e.g. you cannot provide 10g if the maximum value is 50mg.
    */
  var maxValueDate: js.UndefOr[String] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the maxValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of maxValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is added to the current clock to determine the maximum allowable value.   A maximum value for a Quantity is interpreted as an canonical maximum - e.g. you cannot provide 10g if the maximum value is 50mg.
    */
  var maxValueDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the maxValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of maxValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is added to the current clock to determine the maximum allowable value.   A maximum value for a Quantity is interpreted as an canonical maximum - e.g. you cannot provide 10g if the maximum value is 50mg.
    */
  var maxValueDecimal: js.UndefOr[Double] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the maxValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of maxValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is added to the current clock to determine the maximum allowable value.   A maximum value for a Quantity is interpreted as an canonical maximum - e.g. you cannot provide 10g if the maximum value is 50mg.
    */
  var maxValueInstant: js.UndefOr[String] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the maxValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of maxValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is added to the current clock to determine the maximum allowable value.   A maximum value for a Quantity is interpreted as an canonical maximum - e.g. you cannot provide 10g if the maximum value is 50mg.
    */
  var maxValueInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the maxValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of maxValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is added to the current clock to determine the maximum allowable value.   A maximum value for a Quantity is interpreted as an canonical maximum - e.g. you cannot provide 10g if the maximum value is 50mg.
    */
  var maxValuePositiveInt: js.UndefOr[Double] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the maxValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of maxValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is added to the current clock to determine the maximum allowable value.   A maximum value for a Quantity is interpreted as an canonical maximum - e.g. you cannot provide 10g if the maximum value is 50mg.
    */
  var maxValueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the maxValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of maxValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is added to the current clock to determine the maximum allowable value.   A maximum value for a Quantity is interpreted as an canonical maximum - e.g. you cannot provide 10g if the maximum value is 50mg.
    */
  var maxValueTime: js.UndefOr[String] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the maxValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of maxValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is added to the current clock to determine the maximum allowable value.   A maximum value for a Quantity is interpreted as an canonical maximum - e.g. you cannot provide 10g if the maximum value is 50mg.
    */
  var maxValueUnsignedInt: js.UndefOr[Double] = js.undefined
  
  /**
    * Implicit meanings for missing values can only be specified on a resource, data type, or extension definition, and never in a profile that applies to one of these. An implicit meaning for a missing value can never be changed, and specifying one has the consequence that constraining its use in profiles eliminates use cases as possibilities, not merely moving them out of scope.
    */
  var meaningWhenMissing: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum number of times this element SHALL appear in the instance.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the minValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of minValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is subtracted from the current clock to determine the minimum allowable value.   A minimum value for a Quantity is interpreted as an canonical minimum - e.g. you cannot provide 100mg if the minimum value is 10g.
    */
  var minValueDate: js.UndefOr[String] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the minValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of minValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is subtracted from the current clock to determine the minimum allowable value.   A minimum value for a Quantity is interpreted as an canonical minimum - e.g. you cannot provide 100mg if the minimum value is 10g.
    */
  var minValueDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the minValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of minValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is subtracted from the current clock to determine the minimum allowable value.   A minimum value for a Quantity is interpreted as an canonical minimum - e.g. you cannot provide 100mg if the minimum value is 10g.
    */
  var minValueDecimal: js.UndefOr[Double] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the minValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of minValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is subtracted from the current clock to determine the minimum allowable value.   A minimum value for a Quantity is interpreted as an canonical minimum - e.g. you cannot provide 100mg if the minimum value is 10g.
    */
  var minValueInstant: js.UndefOr[String] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the minValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of minValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is subtracted from the current clock to determine the minimum allowable value.   A minimum value for a Quantity is interpreted as an canonical minimum - e.g. you cannot provide 100mg if the minimum value is 10g.
    */
  var minValueInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the minValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of minValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is subtracted from the current clock to determine the minimum allowable value.   A minimum value for a Quantity is interpreted as an canonical minimum - e.g. you cannot provide 100mg if the minimum value is 10g.
    */
  var minValuePositiveInt: js.UndefOr[Double] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the minValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of minValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is subtracted from the current clock to determine the minimum allowable value.   A minimum value for a Quantity is interpreted as an canonical minimum - e.g. you cannot provide 100mg if the minimum value is 10g.
    */
  var minValueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the minValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of minValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is subtracted from the current clock to determine the minimum allowable value.   A minimum value for a Quantity is interpreted as an canonical minimum - e.g. you cannot provide 100mg if the minimum value is 10g.
    */
  var minValueTime: js.UndefOr[String] = js.undefined
  
  /**
    * Except for date/date/instant, the type of the minValue[x] SHALL be the same as the specified type of the element. For the date/dateTime/instant values, the type of minValue[x] SHALL be either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit to the current time. The duration value is positive, and is subtracted from the current clock to determine the minimum allowable value.   A minimum value for a Quantity is interpreted as an canonical minimum - e.g. you cannot provide 100mg if the minimum value is 10g.
    */
  var minValueUnsignedInt: js.UndefOr[Double] = js.undefined
  
  /**
    * "Something useful" is context dependent and impossible to describe in the base FHIR specification. For this reason, tue mustSupport flag is never set to true by the FHIR specification itself - it is only set to true in profiles.  A profile on a type can always make musSupport = true if it is false in the base type but cannot make mustSupport = false if it is true in the base type.   This is done in [Resource Profiles](profiling.html#mustsupport), where the profile labels an element as mustSupport=true. When a profile does this, it SHALL also make clear exactly what kind of "support" is required, as this can mean many things.    Note that an element that has the property IsModifier is not necessarily a "key" element (e.g. one of the important elements to make use of the resource), nor is it automatically mustSupport - however both of these things are more likely to be true for IsModifier elements than for other elements.
    */
  var mustSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This element can only be asserted on repeating elements and can only be introduced when defining resources or data types.  It can be further refined profiled elements but if absent in the base type, a profile cannot assert meaning.
    */
  var orderMeaning: js.UndefOr[String] = js.undefined
  
  /**
    * The path identifies the element and is expressed as a "."-separated list of ancestor elements, beginning with the name of the resource or extension.
    */
  var path: String
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternAddress: js.UndefOr[Address] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternAge: js.UndefOr[Age] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternAnnotation: js.UndefOr[Annotation] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternBase64Binary: js.UndefOr[String] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternCode: js.UndefOr[String] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternCodeableReference: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternContactDetail: js.UndefOr[ContactDetail] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternContactPoint: js.UndefOr[ContactPoint] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternContributor: js.UndefOr[Contributor] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternCount: js.UndefOr[Count] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternDataRequirement: js.UndefOr[DataRequirement] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternDate: js.UndefOr[String] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternDecimal: js.UndefOr[Double] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternDistance: js.UndefOr[Distance] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternDosage: js.UndefOr[Dosage] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternExpression: js.UndefOr[Expression] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternHumanName: js.UndefOr[HumanName] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternId: js.UndefOr[String] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternInstant: js.UndefOr[String] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternMarkdown: js.UndefOr[String] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternMeta: js.UndefOr[Meta] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternMoney: js.UndefOr[Money] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternOid: js.UndefOr[String] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternParameterDefinition: js.UndefOr[ParameterDefinition] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternPositiveInt: js.UndefOr[Double] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternRatioRange: js.UndefOr[RatioRange] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternRelatedArtifact: js.UndefOr[RelatedArtifact] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternSampledData: js.UndefOr[SampledData] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternSignature: js.UndefOr[Signature] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternString: js.UndefOr[String] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternTime: js.UndefOr[String] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternTriggerDefinition: js.UndefOr[TriggerDefinition] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternUnsignedInt: js.UndefOr[Double] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternUri: js.UndefOr[String] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternUsageContext: js.UndefOr[UsageContext] = js.undefined
  
  /**
    * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for use with primitive types, where is has the same meaning as fixed[x].
    */
  var patternUuid: js.UndefOr[String] = js.undefined
  
  /**
    * In resources, this is rarely used except for special cases where the representation deviates from the normal, and can only be done in the base standard (and profiles must reproduce what the base standard does). This element is used quite commonly in Logical models when the logical models represent a specific serialization format (e.g. CDA, v2 etc.).
    */
  var representation: js.UndefOr[js.Array[xmlAttr | xmlText | typeAttr | cdaText | xhtml]] = js.undefined
  
  /**
    * This element does not describe the usage of the element (that's done in comments), rather it's for traceability of *why* the element is either needed or why the constraints exist as they do.  This may be used to point to source materials or specifications that drove the structure of this data element.
    */
  var requirements: js.UndefOr[String] = js.undefined
  
  /**
    * It is easy for a different short definition to change the meaning of an element and this can have nasty downstream consequences. Please be careful when providing short definitions in a profile.
    */
  var short: js.UndefOr[String] = js.undefined
  
  /**
    * If set to true, an ancestor profile SHALL have a slicing definition with this name.  If set to false, no ancestor profile is permitted to have a slicing definition with this name.
    */
  var sliceIsConstraining: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name SHALL be unique within the structure within the context of the constrained resource element.  (Though to avoid confusion, uniqueness across all elements is recommended.).
    */
  var sliceName: js.UndefOr[String] = js.undefined
  
  /**
    * The first element in the sequence, the one that carries the slicing, is the definition that applies to all the slices. This is based on the unconstrained element, but can apply any constraints as appropriate. This may include the common constraints on the children of the element.
    */
  var slicing: js.UndefOr[ElementDefinitionSlicing] = js.undefined
  
  /**
    * The Type of the element can be left blank in a differential constraint, in which case the type is inherited from the resource. Abstract types are not permitted to appear as a type when multiple types are listed.  (I.e. Abstract types cannot be part of a choice).
    */
  var `type`: js.UndefOr[js.Array[ElementDefinitionType]] = js.undefined
}
object ElementDefinition {
  
  inline def apply(path: String): ElementDefinition = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinition]
  }
  
  extension [Self <: ElementDefinition](x: Self) {
    
    inline def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
    
    inline def setBase(value: ElementDefinitionBase): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setBinding(value: ElementDefinitionBinding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    inline def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
    
    inline def setCode(value: js.Array[Coding]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: Coding*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCondition(value: js.Array[String]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: String*): Self = StObject.set(x, "condition", js.Array(value*))
    
    inline def setConstraint(value: js.Array[ElementDefinitionConstraint]): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    inline def setConstraintVarargs(value: ElementDefinitionConstraint*): Self = StObject.set(x, "constraint", js.Array(value*))
    
    inline def setContentReference(value: String): Self = StObject.set(x, "contentReference", value.asInstanceOf[js.Any])
    
    inline def setContentReferenceUndefined: Self = StObject.set(x, "contentReference", js.undefined)
    
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
    
    inline def setDefaultValueCodeableReference(value: CodeableReference): Self = StObject.set(x, "defaultValueCodeableReference", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueCodeableReferenceUndefined: Self = StObject.set(x, "defaultValueCodeableReference", js.undefined)
    
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
    
    inline def setDefaultValueRatioRange(value: RatioRange): Self = StObject.set(x, "defaultValueRatioRange", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueRatioRangeUndefined: Self = StObject.set(x, "defaultValueRatioRange", js.undefined)
    
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
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setExample(value: js.Array[ElementDefinitionExample]): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    inline def setExampleVarargs(value: ElementDefinitionExample*): Self = StObject.set(x, "example", js.Array(value*))
    
    inline def setFixedAddress(value: Address): Self = StObject.set(x, "fixedAddress", value.asInstanceOf[js.Any])
    
    inline def setFixedAddressUndefined: Self = StObject.set(x, "fixedAddress", js.undefined)
    
    inline def setFixedAge(value: Age): Self = StObject.set(x, "fixedAge", value.asInstanceOf[js.Any])
    
    inline def setFixedAgeUndefined: Self = StObject.set(x, "fixedAge", js.undefined)
    
    inline def setFixedAnnotation(value: Annotation): Self = StObject.set(x, "fixedAnnotation", value.asInstanceOf[js.Any])
    
    inline def setFixedAnnotationUndefined: Self = StObject.set(x, "fixedAnnotation", js.undefined)
    
    inline def setFixedAttachment(value: Attachment): Self = StObject.set(x, "fixedAttachment", value.asInstanceOf[js.Any])
    
    inline def setFixedAttachmentUndefined: Self = StObject.set(x, "fixedAttachment", js.undefined)
    
    inline def setFixedBase64Binary(value: String): Self = StObject.set(x, "fixedBase64Binary", value.asInstanceOf[js.Any])
    
    inline def setFixedBase64BinaryUndefined: Self = StObject.set(x, "fixedBase64Binary", js.undefined)
    
    inline def setFixedBoolean(value: Boolean): Self = StObject.set(x, "fixedBoolean", value.asInstanceOf[js.Any])
    
    inline def setFixedBooleanUndefined: Self = StObject.set(x, "fixedBoolean", js.undefined)
    
    inline def setFixedCanonical(value: String): Self = StObject.set(x, "fixedCanonical", value.asInstanceOf[js.Any])
    
    inline def setFixedCanonicalUndefined: Self = StObject.set(x, "fixedCanonical", js.undefined)
    
    inline def setFixedCode(value: String): Self = StObject.set(x, "fixedCode", value.asInstanceOf[js.Any])
    
    inline def setFixedCodeUndefined: Self = StObject.set(x, "fixedCode", js.undefined)
    
    inline def setFixedCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "fixedCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setFixedCodeableConceptUndefined: Self = StObject.set(x, "fixedCodeableConcept", js.undefined)
    
    inline def setFixedCodeableReference(value: CodeableReference): Self = StObject.set(x, "fixedCodeableReference", value.asInstanceOf[js.Any])
    
    inline def setFixedCodeableReferenceUndefined: Self = StObject.set(x, "fixedCodeableReference", js.undefined)
    
    inline def setFixedCoding(value: Coding): Self = StObject.set(x, "fixedCoding", value.asInstanceOf[js.Any])
    
    inline def setFixedCodingUndefined: Self = StObject.set(x, "fixedCoding", js.undefined)
    
    inline def setFixedContactDetail(value: ContactDetail): Self = StObject.set(x, "fixedContactDetail", value.asInstanceOf[js.Any])
    
    inline def setFixedContactDetailUndefined: Self = StObject.set(x, "fixedContactDetail", js.undefined)
    
    inline def setFixedContactPoint(value: ContactPoint): Self = StObject.set(x, "fixedContactPoint", value.asInstanceOf[js.Any])
    
    inline def setFixedContactPointUndefined: Self = StObject.set(x, "fixedContactPoint", js.undefined)
    
    inline def setFixedContributor(value: Contributor): Self = StObject.set(x, "fixedContributor", value.asInstanceOf[js.Any])
    
    inline def setFixedContributorUndefined: Self = StObject.set(x, "fixedContributor", js.undefined)
    
    inline def setFixedCount(value: Count): Self = StObject.set(x, "fixedCount", value.asInstanceOf[js.Any])
    
    inline def setFixedCountUndefined: Self = StObject.set(x, "fixedCount", js.undefined)
    
    inline def setFixedDataRequirement(value: DataRequirement): Self = StObject.set(x, "fixedDataRequirement", value.asInstanceOf[js.Any])
    
    inline def setFixedDataRequirementUndefined: Self = StObject.set(x, "fixedDataRequirement", js.undefined)
    
    inline def setFixedDate(value: String): Self = StObject.set(x, "fixedDate", value.asInstanceOf[js.Any])
    
    inline def setFixedDateTime(value: String): Self = StObject.set(x, "fixedDateTime", value.asInstanceOf[js.Any])
    
    inline def setFixedDateTimeUndefined: Self = StObject.set(x, "fixedDateTime", js.undefined)
    
    inline def setFixedDateUndefined: Self = StObject.set(x, "fixedDate", js.undefined)
    
    inline def setFixedDecimal(value: Double): Self = StObject.set(x, "fixedDecimal", value.asInstanceOf[js.Any])
    
    inline def setFixedDecimalUndefined: Self = StObject.set(x, "fixedDecimal", js.undefined)
    
    inline def setFixedDistance(value: Distance): Self = StObject.set(x, "fixedDistance", value.asInstanceOf[js.Any])
    
    inline def setFixedDistanceUndefined: Self = StObject.set(x, "fixedDistance", js.undefined)
    
    inline def setFixedDosage(value: Dosage): Self = StObject.set(x, "fixedDosage", value.asInstanceOf[js.Any])
    
    inline def setFixedDosageUndefined: Self = StObject.set(x, "fixedDosage", js.undefined)
    
    inline def setFixedDuration(value: Duration): Self = StObject.set(x, "fixedDuration", value.asInstanceOf[js.Any])
    
    inline def setFixedDurationUndefined: Self = StObject.set(x, "fixedDuration", js.undefined)
    
    inline def setFixedExpression(value: Expression): Self = StObject.set(x, "fixedExpression", value.asInstanceOf[js.Any])
    
    inline def setFixedExpressionUndefined: Self = StObject.set(x, "fixedExpression", js.undefined)
    
    inline def setFixedHumanName(value: HumanName): Self = StObject.set(x, "fixedHumanName", value.asInstanceOf[js.Any])
    
    inline def setFixedHumanNameUndefined: Self = StObject.set(x, "fixedHumanName", js.undefined)
    
    inline def setFixedId(value: String): Self = StObject.set(x, "fixedId", value.asInstanceOf[js.Any])
    
    inline def setFixedIdUndefined: Self = StObject.set(x, "fixedId", js.undefined)
    
    inline def setFixedIdentifier(value: Identifier): Self = StObject.set(x, "fixedIdentifier", value.asInstanceOf[js.Any])
    
    inline def setFixedIdentifierUndefined: Self = StObject.set(x, "fixedIdentifier", js.undefined)
    
    inline def setFixedInstant(value: String): Self = StObject.set(x, "fixedInstant", value.asInstanceOf[js.Any])
    
    inline def setFixedInstantUndefined: Self = StObject.set(x, "fixedInstant", js.undefined)
    
    inline def setFixedInteger(value: Double): Self = StObject.set(x, "fixedInteger", value.asInstanceOf[js.Any])
    
    inline def setFixedIntegerUndefined: Self = StObject.set(x, "fixedInteger", js.undefined)
    
    inline def setFixedMarkdown(value: String): Self = StObject.set(x, "fixedMarkdown", value.asInstanceOf[js.Any])
    
    inline def setFixedMarkdownUndefined: Self = StObject.set(x, "fixedMarkdown", js.undefined)
    
    inline def setFixedMeta(value: Meta): Self = StObject.set(x, "fixedMeta", value.asInstanceOf[js.Any])
    
    inline def setFixedMetaUndefined: Self = StObject.set(x, "fixedMeta", js.undefined)
    
    inline def setFixedMoney(value: Money): Self = StObject.set(x, "fixedMoney", value.asInstanceOf[js.Any])
    
    inline def setFixedMoneyUndefined: Self = StObject.set(x, "fixedMoney", js.undefined)
    
    inline def setFixedOid(value: String): Self = StObject.set(x, "fixedOid", value.asInstanceOf[js.Any])
    
    inline def setFixedOidUndefined: Self = StObject.set(x, "fixedOid", js.undefined)
    
    inline def setFixedParameterDefinition(value: ParameterDefinition): Self = StObject.set(x, "fixedParameterDefinition", value.asInstanceOf[js.Any])
    
    inline def setFixedParameterDefinitionUndefined: Self = StObject.set(x, "fixedParameterDefinition", js.undefined)
    
    inline def setFixedPeriod(value: Period): Self = StObject.set(x, "fixedPeriod", value.asInstanceOf[js.Any])
    
    inline def setFixedPeriodUndefined: Self = StObject.set(x, "fixedPeriod", js.undefined)
    
    inline def setFixedPositiveInt(value: Double): Self = StObject.set(x, "fixedPositiveInt", value.asInstanceOf[js.Any])
    
    inline def setFixedPositiveIntUndefined: Self = StObject.set(x, "fixedPositiveInt", js.undefined)
    
    inline def setFixedQuantity(value: Quantity): Self = StObject.set(x, "fixedQuantity", value.asInstanceOf[js.Any])
    
    inline def setFixedQuantityUndefined: Self = StObject.set(x, "fixedQuantity", js.undefined)
    
    inline def setFixedRange(value: Range): Self = StObject.set(x, "fixedRange", value.asInstanceOf[js.Any])
    
    inline def setFixedRangeUndefined: Self = StObject.set(x, "fixedRange", js.undefined)
    
    inline def setFixedRatio(value: Ratio): Self = StObject.set(x, "fixedRatio", value.asInstanceOf[js.Any])
    
    inline def setFixedRatioRange(value: RatioRange): Self = StObject.set(x, "fixedRatioRange", value.asInstanceOf[js.Any])
    
    inline def setFixedRatioRangeUndefined: Self = StObject.set(x, "fixedRatioRange", js.undefined)
    
    inline def setFixedRatioUndefined: Self = StObject.set(x, "fixedRatio", js.undefined)
    
    inline def setFixedReference(value: Reference): Self = StObject.set(x, "fixedReference", value.asInstanceOf[js.Any])
    
    inline def setFixedReferenceUndefined: Self = StObject.set(x, "fixedReference", js.undefined)
    
    inline def setFixedRelatedArtifact(value: RelatedArtifact): Self = StObject.set(x, "fixedRelatedArtifact", value.asInstanceOf[js.Any])
    
    inline def setFixedRelatedArtifactUndefined: Self = StObject.set(x, "fixedRelatedArtifact", js.undefined)
    
    inline def setFixedSampledData(value: SampledData): Self = StObject.set(x, "fixedSampledData", value.asInstanceOf[js.Any])
    
    inline def setFixedSampledDataUndefined: Self = StObject.set(x, "fixedSampledData", js.undefined)
    
    inline def setFixedSignature(value: Signature): Self = StObject.set(x, "fixedSignature", value.asInstanceOf[js.Any])
    
    inline def setFixedSignatureUndefined: Self = StObject.set(x, "fixedSignature", js.undefined)
    
    inline def setFixedString(value: String): Self = StObject.set(x, "fixedString", value.asInstanceOf[js.Any])
    
    inline def setFixedStringUndefined: Self = StObject.set(x, "fixedString", js.undefined)
    
    inline def setFixedTime(value: String): Self = StObject.set(x, "fixedTime", value.asInstanceOf[js.Any])
    
    inline def setFixedTimeUndefined: Self = StObject.set(x, "fixedTime", js.undefined)
    
    inline def setFixedTiming(value: Timing): Self = StObject.set(x, "fixedTiming", value.asInstanceOf[js.Any])
    
    inline def setFixedTimingUndefined: Self = StObject.set(x, "fixedTiming", js.undefined)
    
    inline def setFixedTriggerDefinition(value: TriggerDefinition): Self = StObject.set(x, "fixedTriggerDefinition", value.asInstanceOf[js.Any])
    
    inline def setFixedTriggerDefinitionUndefined: Self = StObject.set(x, "fixedTriggerDefinition", js.undefined)
    
    inline def setFixedUnsignedInt(value: Double): Self = StObject.set(x, "fixedUnsignedInt", value.asInstanceOf[js.Any])
    
    inline def setFixedUnsignedIntUndefined: Self = StObject.set(x, "fixedUnsignedInt", js.undefined)
    
    inline def setFixedUri(value: String): Self = StObject.set(x, "fixedUri", value.asInstanceOf[js.Any])
    
    inline def setFixedUriUndefined: Self = StObject.set(x, "fixedUri", js.undefined)
    
    inline def setFixedUrl(value: String): Self = StObject.set(x, "fixedUrl", value.asInstanceOf[js.Any])
    
    inline def setFixedUrlUndefined: Self = StObject.set(x, "fixedUrl", js.undefined)
    
    inline def setFixedUsageContext(value: UsageContext): Self = StObject.set(x, "fixedUsageContext", value.asInstanceOf[js.Any])
    
    inline def setFixedUsageContextUndefined: Self = StObject.set(x, "fixedUsageContext", js.undefined)
    
    inline def setFixedUuid(value: String): Self = StObject.set(x, "fixedUuid", value.asInstanceOf[js.Any])
    
    inline def setFixedUuidUndefined: Self = StObject.set(x, "fixedUuid", js.undefined)
    
    inline def setIsModifier(value: Boolean): Self = StObject.set(x, "isModifier", value.asInstanceOf[js.Any])
    
    inline def setIsModifierReason(value: String): Self = StObject.set(x, "isModifierReason", value.asInstanceOf[js.Any])
    
    inline def setIsModifierReasonUndefined: Self = StObject.set(x, "isModifierReason", js.undefined)
    
    inline def setIsModifierUndefined: Self = StObject.set(x, "isModifier", js.undefined)
    
    inline def setIsSummary(value: Boolean): Self = StObject.set(x, "isSummary", value.asInstanceOf[js.Any])
    
    inline def setIsSummaryUndefined: Self = StObject.set(x, "isSummary", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMapping(value: js.Array[ElementDefinitionMapping]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setMappingVarargs(value: ElementDefinitionMapping*): Self = StObject.set(x, "mapping", js.Array(value*))
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxValueDate(value: String): Self = StObject.set(x, "maxValueDate", value.asInstanceOf[js.Any])
    
    inline def setMaxValueDateTime(value: String): Self = StObject.set(x, "maxValueDateTime", value.asInstanceOf[js.Any])
    
    inline def setMaxValueDateTimeUndefined: Self = StObject.set(x, "maxValueDateTime", js.undefined)
    
    inline def setMaxValueDateUndefined: Self = StObject.set(x, "maxValueDate", js.undefined)
    
    inline def setMaxValueDecimal(value: Double): Self = StObject.set(x, "maxValueDecimal", value.asInstanceOf[js.Any])
    
    inline def setMaxValueDecimalUndefined: Self = StObject.set(x, "maxValueDecimal", js.undefined)
    
    inline def setMaxValueInstant(value: String): Self = StObject.set(x, "maxValueInstant", value.asInstanceOf[js.Any])
    
    inline def setMaxValueInstantUndefined: Self = StObject.set(x, "maxValueInstant", js.undefined)
    
    inline def setMaxValueInteger(value: Double): Self = StObject.set(x, "maxValueInteger", value.asInstanceOf[js.Any])
    
    inline def setMaxValueIntegerUndefined: Self = StObject.set(x, "maxValueInteger", js.undefined)
    
    inline def setMaxValuePositiveInt(value: Double): Self = StObject.set(x, "maxValuePositiveInt", value.asInstanceOf[js.Any])
    
    inline def setMaxValuePositiveIntUndefined: Self = StObject.set(x, "maxValuePositiveInt", js.undefined)
    
    inline def setMaxValueQuantity(value: Quantity): Self = StObject.set(x, "maxValueQuantity", value.asInstanceOf[js.Any])
    
    inline def setMaxValueQuantityUndefined: Self = StObject.set(x, "maxValueQuantity", js.undefined)
    
    inline def setMaxValueTime(value: String): Self = StObject.set(x, "maxValueTime", value.asInstanceOf[js.Any])
    
    inline def setMaxValueTimeUndefined: Self = StObject.set(x, "maxValueTime", js.undefined)
    
    inline def setMaxValueUnsignedInt(value: Double): Self = StObject.set(x, "maxValueUnsignedInt", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUnsignedIntUndefined: Self = StObject.set(x, "maxValueUnsignedInt", js.undefined)
    
    inline def setMeaningWhenMissing(value: String): Self = StObject.set(x, "meaningWhenMissing", value.asInstanceOf[js.Any])
    
    inline def setMeaningWhenMissingUndefined: Self = StObject.set(x, "meaningWhenMissing", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinValueDate(value: String): Self = StObject.set(x, "minValueDate", value.asInstanceOf[js.Any])
    
    inline def setMinValueDateTime(value: String): Self = StObject.set(x, "minValueDateTime", value.asInstanceOf[js.Any])
    
    inline def setMinValueDateTimeUndefined: Self = StObject.set(x, "minValueDateTime", js.undefined)
    
    inline def setMinValueDateUndefined: Self = StObject.set(x, "minValueDate", js.undefined)
    
    inline def setMinValueDecimal(value: Double): Self = StObject.set(x, "minValueDecimal", value.asInstanceOf[js.Any])
    
    inline def setMinValueDecimalUndefined: Self = StObject.set(x, "minValueDecimal", js.undefined)
    
    inline def setMinValueInstant(value: String): Self = StObject.set(x, "minValueInstant", value.asInstanceOf[js.Any])
    
    inline def setMinValueInstantUndefined: Self = StObject.set(x, "minValueInstant", js.undefined)
    
    inline def setMinValueInteger(value: Double): Self = StObject.set(x, "minValueInteger", value.asInstanceOf[js.Any])
    
    inline def setMinValueIntegerUndefined: Self = StObject.set(x, "minValueInteger", js.undefined)
    
    inline def setMinValuePositiveInt(value: Double): Self = StObject.set(x, "minValuePositiveInt", value.asInstanceOf[js.Any])
    
    inline def setMinValuePositiveIntUndefined: Self = StObject.set(x, "minValuePositiveInt", js.undefined)
    
    inline def setMinValueQuantity(value: Quantity): Self = StObject.set(x, "minValueQuantity", value.asInstanceOf[js.Any])
    
    inline def setMinValueQuantityUndefined: Self = StObject.set(x, "minValueQuantity", js.undefined)
    
    inline def setMinValueTime(value: String): Self = StObject.set(x, "minValueTime", value.asInstanceOf[js.Any])
    
    inline def setMinValueTimeUndefined: Self = StObject.set(x, "minValueTime", js.undefined)
    
    inline def setMinValueUnsignedInt(value: Double): Self = StObject.set(x, "minValueUnsignedInt", value.asInstanceOf[js.Any])
    
    inline def setMinValueUnsignedIntUndefined: Self = StObject.set(x, "minValueUnsignedInt", js.undefined)
    
    inline def setMustSupport(value: Boolean): Self = StObject.set(x, "mustSupport", value.asInstanceOf[js.Any])
    
    inline def setMustSupportUndefined: Self = StObject.set(x, "mustSupport", js.undefined)
    
    inline def setOrderMeaning(value: String): Self = StObject.set(x, "orderMeaning", value.asInstanceOf[js.Any])
    
    inline def setOrderMeaningUndefined: Self = StObject.set(x, "orderMeaning", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPatternAddress(value: Address): Self = StObject.set(x, "patternAddress", value.asInstanceOf[js.Any])
    
    inline def setPatternAddressUndefined: Self = StObject.set(x, "patternAddress", js.undefined)
    
    inline def setPatternAge(value: Age): Self = StObject.set(x, "patternAge", value.asInstanceOf[js.Any])
    
    inline def setPatternAgeUndefined: Self = StObject.set(x, "patternAge", js.undefined)
    
    inline def setPatternAnnotation(value: Annotation): Self = StObject.set(x, "patternAnnotation", value.asInstanceOf[js.Any])
    
    inline def setPatternAnnotationUndefined: Self = StObject.set(x, "patternAnnotation", js.undefined)
    
    inline def setPatternAttachment(value: Attachment): Self = StObject.set(x, "patternAttachment", value.asInstanceOf[js.Any])
    
    inline def setPatternAttachmentUndefined: Self = StObject.set(x, "patternAttachment", js.undefined)
    
    inline def setPatternBase64Binary(value: String): Self = StObject.set(x, "patternBase64Binary", value.asInstanceOf[js.Any])
    
    inline def setPatternBase64BinaryUndefined: Self = StObject.set(x, "patternBase64Binary", js.undefined)
    
    inline def setPatternBoolean(value: Boolean): Self = StObject.set(x, "patternBoolean", value.asInstanceOf[js.Any])
    
    inline def setPatternBooleanUndefined: Self = StObject.set(x, "patternBoolean", js.undefined)
    
    inline def setPatternCanonical(value: String): Self = StObject.set(x, "patternCanonical", value.asInstanceOf[js.Any])
    
    inline def setPatternCanonicalUndefined: Self = StObject.set(x, "patternCanonical", js.undefined)
    
    inline def setPatternCode(value: String): Self = StObject.set(x, "patternCode", value.asInstanceOf[js.Any])
    
    inline def setPatternCodeUndefined: Self = StObject.set(x, "patternCode", js.undefined)
    
    inline def setPatternCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "patternCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setPatternCodeableConceptUndefined: Self = StObject.set(x, "patternCodeableConcept", js.undefined)
    
    inline def setPatternCodeableReference(value: CodeableReference): Self = StObject.set(x, "patternCodeableReference", value.asInstanceOf[js.Any])
    
    inline def setPatternCodeableReferenceUndefined: Self = StObject.set(x, "patternCodeableReference", js.undefined)
    
    inline def setPatternCoding(value: Coding): Self = StObject.set(x, "patternCoding", value.asInstanceOf[js.Any])
    
    inline def setPatternCodingUndefined: Self = StObject.set(x, "patternCoding", js.undefined)
    
    inline def setPatternContactDetail(value: ContactDetail): Self = StObject.set(x, "patternContactDetail", value.asInstanceOf[js.Any])
    
    inline def setPatternContactDetailUndefined: Self = StObject.set(x, "patternContactDetail", js.undefined)
    
    inline def setPatternContactPoint(value: ContactPoint): Self = StObject.set(x, "patternContactPoint", value.asInstanceOf[js.Any])
    
    inline def setPatternContactPointUndefined: Self = StObject.set(x, "patternContactPoint", js.undefined)
    
    inline def setPatternContributor(value: Contributor): Self = StObject.set(x, "patternContributor", value.asInstanceOf[js.Any])
    
    inline def setPatternContributorUndefined: Self = StObject.set(x, "patternContributor", js.undefined)
    
    inline def setPatternCount(value: Count): Self = StObject.set(x, "patternCount", value.asInstanceOf[js.Any])
    
    inline def setPatternCountUndefined: Self = StObject.set(x, "patternCount", js.undefined)
    
    inline def setPatternDataRequirement(value: DataRequirement): Self = StObject.set(x, "patternDataRequirement", value.asInstanceOf[js.Any])
    
    inline def setPatternDataRequirementUndefined: Self = StObject.set(x, "patternDataRequirement", js.undefined)
    
    inline def setPatternDate(value: String): Self = StObject.set(x, "patternDate", value.asInstanceOf[js.Any])
    
    inline def setPatternDateTime(value: String): Self = StObject.set(x, "patternDateTime", value.asInstanceOf[js.Any])
    
    inline def setPatternDateTimeUndefined: Self = StObject.set(x, "patternDateTime", js.undefined)
    
    inline def setPatternDateUndefined: Self = StObject.set(x, "patternDate", js.undefined)
    
    inline def setPatternDecimal(value: Double): Self = StObject.set(x, "patternDecimal", value.asInstanceOf[js.Any])
    
    inline def setPatternDecimalUndefined: Self = StObject.set(x, "patternDecimal", js.undefined)
    
    inline def setPatternDistance(value: Distance): Self = StObject.set(x, "patternDistance", value.asInstanceOf[js.Any])
    
    inline def setPatternDistanceUndefined: Self = StObject.set(x, "patternDistance", js.undefined)
    
    inline def setPatternDosage(value: Dosage): Self = StObject.set(x, "patternDosage", value.asInstanceOf[js.Any])
    
    inline def setPatternDosageUndefined: Self = StObject.set(x, "patternDosage", js.undefined)
    
    inline def setPatternDuration(value: Duration): Self = StObject.set(x, "patternDuration", value.asInstanceOf[js.Any])
    
    inline def setPatternDurationUndefined: Self = StObject.set(x, "patternDuration", js.undefined)
    
    inline def setPatternExpression(value: Expression): Self = StObject.set(x, "patternExpression", value.asInstanceOf[js.Any])
    
    inline def setPatternExpressionUndefined: Self = StObject.set(x, "patternExpression", js.undefined)
    
    inline def setPatternHumanName(value: HumanName): Self = StObject.set(x, "patternHumanName", value.asInstanceOf[js.Any])
    
    inline def setPatternHumanNameUndefined: Self = StObject.set(x, "patternHumanName", js.undefined)
    
    inline def setPatternId(value: String): Self = StObject.set(x, "patternId", value.asInstanceOf[js.Any])
    
    inline def setPatternIdUndefined: Self = StObject.set(x, "patternId", js.undefined)
    
    inline def setPatternIdentifier(value: Identifier): Self = StObject.set(x, "patternIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPatternIdentifierUndefined: Self = StObject.set(x, "patternIdentifier", js.undefined)
    
    inline def setPatternInstant(value: String): Self = StObject.set(x, "patternInstant", value.asInstanceOf[js.Any])
    
    inline def setPatternInstantUndefined: Self = StObject.set(x, "patternInstant", js.undefined)
    
    inline def setPatternInteger(value: Double): Self = StObject.set(x, "patternInteger", value.asInstanceOf[js.Any])
    
    inline def setPatternIntegerUndefined: Self = StObject.set(x, "patternInteger", js.undefined)
    
    inline def setPatternMarkdown(value: String): Self = StObject.set(x, "patternMarkdown", value.asInstanceOf[js.Any])
    
    inline def setPatternMarkdownUndefined: Self = StObject.set(x, "patternMarkdown", js.undefined)
    
    inline def setPatternMeta(value: Meta): Self = StObject.set(x, "patternMeta", value.asInstanceOf[js.Any])
    
    inline def setPatternMetaUndefined: Self = StObject.set(x, "patternMeta", js.undefined)
    
    inline def setPatternMoney(value: Money): Self = StObject.set(x, "patternMoney", value.asInstanceOf[js.Any])
    
    inline def setPatternMoneyUndefined: Self = StObject.set(x, "patternMoney", js.undefined)
    
    inline def setPatternOid(value: String): Self = StObject.set(x, "patternOid", value.asInstanceOf[js.Any])
    
    inline def setPatternOidUndefined: Self = StObject.set(x, "patternOid", js.undefined)
    
    inline def setPatternParameterDefinition(value: ParameterDefinition): Self = StObject.set(x, "patternParameterDefinition", value.asInstanceOf[js.Any])
    
    inline def setPatternParameterDefinitionUndefined: Self = StObject.set(x, "patternParameterDefinition", js.undefined)
    
    inline def setPatternPeriod(value: Period): Self = StObject.set(x, "patternPeriod", value.asInstanceOf[js.Any])
    
    inline def setPatternPeriodUndefined: Self = StObject.set(x, "patternPeriod", js.undefined)
    
    inline def setPatternPositiveInt(value: Double): Self = StObject.set(x, "patternPositiveInt", value.asInstanceOf[js.Any])
    
    inline def setPatternPositiveIntUndefined: Self = StObject.set(x, "patternPositiveInt", js.undefined)
    
    inline def setPatternQuantity(value: Quantity): Self = StObject.set(x, "patternQuantity", value.asInstanceOf[js.Any])
    
    inline def setPatternQuantityUndefined: Self = StObject.set(x, "patternQuantity", js.undefined)
    
    inline def setPatternRange(value: Range): Self = StObject.set(x, "patternRange", value.asInstanceOf[js.Any])
    
    inline def setPatternRangeUndefined: Self = StObject.set(x, "patternRange", js.undefined)
    
    inline def setPatternRatio(value: Ratio): Self = StObject.set(x, "patternRatio", value.asInstanceOf[js.Any])
    
    inline def setPatternRatioRange(value: RatioRange): Self = StObject.set(x, "patternRatioRange", value.asInstanceOf[js.Any])
    
    inline def setPatternRatioRangeUndefined: Self = StObject.set(x, "patternRatioRange", js.undefined)
    
    inline def setPatternRatioUndefined: Self = StObject.set(x, "patternRatio", js.undefined)
    
    inline def setPatternReference(value: Reference): Self = StObject.set(x, "patternReference", value.asInstanceOf[js.Any])
    
    inline def setPatternReferenceUndefined: Self = StObject.set(x, "patternReference", js.undefined)
    
    inline def setPatternRelatedArtifact(value: RelatedArtifact): Self = StObject.set(x, "patternRelatedArtifact", value.asInstanceOf[js.Any])
    
    inline def setPatternRelatedArtifactUndefined: Self = StObject.set(x, "patternRelatedArtifact", js.undefined)
    
    inline def setPatternSampledData(value: SampledData): Self = StObject.set(x, "patternSampledData", value.asInstanceOf[js.Any])
    
    inline def setPatternSampledDataUndefined: Self = StObject.set(x, "patternSampledData", js.undefined)
    
    inline def setPatternSignature(value: Signature): Self = StObject.set(x, "patternSignature", value.asInstanceOf[js.Any])
    
    inline def setPatternSignatureUndefined: Self = StObject.set(x, "patternSignature", js.undefined)
    
    inline def setPatternString(value: String): Self = StObject.set(x, "patternString", value.asInstanceOf[js.Any])
    
    inline def setPatternStringUndefined: Self = StObject.set(x, "patternString", js.undefined)
    
    inline def setPatternTime(value: String): Self = StObject.set(x, "patternTime", value.asInstanceOf[js.Any])
    
    inline def setPatternTimeUndefined: Self = StObject.set(x, "patternTime", js.undefined)
    
    inline def setPatternTiming(value: Timing): Self = StObject.set(x, "patternTiming", value.asInstanceOf[js.Any])
    
    inline def setPatternTimingUndefined: Self = StObject.set(x, "patternTiming", js.undefined)
    
    inline def setPatternTriggerDefinition(value: TriggerDefinition): Self = StObject.set(x, "patternTriggerDefinition", value.asInstanceOf[js.Any])
    
    inline def setPatternTriggerDefinitionUndefined: Self = StObject.set(x, "patternTriggerDefinition", js.undefined)
    
    inline def setPatternUnsignedInt(value: Double): Self = StObject.set(x, "patternUnsignedInt", value.asInstanceOf[js.Any])
    
    inline def setPatternUnsignedIntUndefined: Self = StObject.set(x, "patternUnsignedInt", js.undefined)
    
    inline def setPatternUri(value: String): Self = StObject.set(x, "patternUri", value.asInstanceOf[js.Any])
    
    inline def setPatternUriUndefined: Self = StObject.set(x, "patternUri", js.undefined)
    
    inline def setPatternUrl(value: String): Self = StObject.set(x, "patternUrl", value.asInstanceOf[js.Any])
    
    inline def setPatternUrlUndefined: Self = StObject.set(x, "patternUrl", js.undefined)
    
    inline def setPatternUsageContext(value: UsageContext): Self = StObject.set(x, "patternUsageContext", value.asInstanceOf[js.Any])
    
    inline def setPatternUsageContextUndefined: Self = StObject.set(x, "patternUsageContext", js.undefined)
    
    inline def setPatternUuid(value: String): Self = StObject.set(x, "patternUuid", value.asInstanceOf[js.Any])
    
    inline def setPatternUuidUndefined: Self = StObject.set(x, "patternUuid", js.undefined)
    
    inline def setRepresentation(value: js.Array[xmlAttr | xmlText | typeAttr | cdaText | xhtml]): Self = StObject.set(x, "representation", value.asInstanceOf[js.Any])
    
    inline def setRepresentationUndefined: Self = StObject.set(x, "representation", js.undefined)
    
    inline def setRepresentationVarargs(value: (xmlAttr | xmlText | typeAttr | cdaText | xhtml)*): Self = StObject.set(x, "representation", js.Array(value*))
    
    inline def setRequirements(value: String): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    
    inline def setSliceIsConstraining(value: Boolean): Self = StObject.set(x, "sliceIsConstraining", value.asInstanceOf[js.Any])
    
    inline def setSliceIsConstrainingUndefined: Self = StObject.set(x, "sliceIsConstraining", js.undefined)
    
    inline def setSliceName(value: String): Self = StObject.set(x, "sliceName", value.asInstanceOf[js.Any])
    
    inline def setSliceNameUndefined: Self = StObject.set(x, "sliceName", js.undefined)
    
    inline def setSlicing(value: ElementDefinitionSlicing): Self = StObject.set(x, "slicing", value.asInstanceOf[js.Any])
    
    inline def setSlicingUndefined: Self = StObject.set(x, "slicing", js.undefined)
    
    inline def setType(value: js.Array[ElementDefinitionType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: ElementDefinitionType*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_alias(value: js.Array[Element]): Self = StObject.set(x, "_alias", value.asInstanceOf[js.Any])
    
    inline def set_aliasUndefined: Self = StObject.set(x, "_alias", js.undefined)
    
    inline def set_aliasVarargs(value: Element*): Self = StObject.set(x, "_alias", js.Array(value*))
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    inline def set_condition(value: js.Array[Element]): Self = StObject.set(x, "_condition", value.asInstanceOf[js.Any])
    
    inline def set_conditionUndefined: Self = StObject.set(x, "_condition", js.undefined)
    
    inline def set_conditionVarargs(value: Element*): Self = StObject.set(x, "_condition", js.Array(value*))
    
    inline def set_contentReference(value: Element): Self = StObject.set(x, "_contentReference", value.asInstanceOf[js.Any])
    
    inline def set_contentReferenceUndefined: Self = StObject.set(x, "_contentReference", js.undefined)
    
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
    
    inline def set_definition(value: Element): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    inline def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    inline def set_fixedBase64Binary(value: Element): Self = StObject.set(x, "_fixedBase64Binary", value.asInstanceOf[js.Any])
    
    inline def set_fixedBase64BinaryUndefined: Self = StObject.set(x, "_fixedBase64Binary", js.undefined)
    
    inline def set_fixedBoolean(value: Element): Self = StObject.set(x, "_fixedBoolean", value.asInstanceOf[js.Any])
    
    inline def set_fixedBooleanUndefined: Self = StObject.set(x, "_fixedBoolean", js.undefined)
    
    inline def set_fixedCanonical(value: Element): Self = StObject.set(x, "_fixedCanonical", value.asInstanceOf[js.Any])
    
    inline def set_fixedCanonicalUndefined: Self = StObject.set(x, "_fixedCanonical", js.undefined)
    
    inline def set_fixedCode(value: Element): Self = StObject.set(x, "_fixedCode", value.asInstanceOf[js.Any])
    
    inline def set_fixedCodeUndefined: Self = StObject.set(x, "_fixedCode", js.undefined)
    
    inline def set_fixedDate(value: Element): Self = StObject.set(x, "_fixedDate", value.asInstanceOf[js.Any])
    
    inline def set_fixedDateTime(value: Element): Self = StObject.set(x, "_fixedDateTime", value.asInstanceOf[js.Any])
    
    inline def set_fixedDateTimeUndefined: Self = StObject.set(x, "_fixedDateTime", js.undefined)
    
    inline def set_fixedDateUndefined: Self = StObject.set(x, "_fixedDate", js.undefined)
    
    inline def set_fixedId(value: Element): Self = StObject.set(x, "_fixedId", value.asInstanceOf[js.Any])
    
    inline def set_fixedIdUndefined: Self = StObject.set(x, "_fixedId", js.undefined)
    
    inline def set_fixedInstant(value: Element): Self = StObject.set(x, "_fixedInstant", value.asInstanceOf[js.Any])
    
    inline def set_fixedInstantUndefined: Self = StObject.set(x, "_fixedInstant", js.undefined)
    
    inline def set_fixedMarkdown(value: Element): Self = StObject.set(x, "_fixedMarkdown", value.asInstanceOf[js.Any])
    
    inline def set_fixedMarkdownUndefined: Self = StObject.set(x, "_fixedMarkdown", js.undefined)
    
    inline def set_fixedOid(value: Element): Self = StObject.set(x, "_fixedOid", value.asInstanceOf[js.Any])
    
    inline def set_fixedOidUndefined: Self = StObject.set(x, "_fixedOid", js.undefined)
    
    inline def set_fixedString(value: Element): Self = StObject.set(x, "_fixedString", value.asInstanceOf[js.Any])
    
    inline def set_fixedStringUndefined: Self = StObject.set(x, "_fixedString", js.undefined)
    
    inline def set_fixedTime(value: Element): Self = StObject.set(x, "_fixedTime", value.asInstanceOf[js.Any])
    
    inline def set_fixedTimeUndefined: Self = StObject.set(x, "_fixedTime", js.undefined)
    
    inline def set_fixedUri(value: Element): Self = StObject.set(x, "_fixedUri", value.asInstanceOf[js.Any])
    
    inline def set_fixedUriUndefined: Self = StObject.set(x, "_fixedUri", js.undefined)
    
    inline def set_fixedUrl(value: Element): Self = StObject.set(x, "_fixedUrl", value.asInstanceOf[js.Any])
    
    inline def set_fixedUrlUndefined: Self = StObject.set(x, "_fixedUrl", js.undefined)
    
    inline def set_fixedUuid(value: Element): Self = StObject.set(x, "_fixedUuid", value.asInstanceOf[js.Any])
    
    inline def set_fixedUuidUndefined: Self = StObject.set(x, "_fixedUuid", js.undefined)
    
    inline def set_isModifier(value: Element): Self = StObject.set(x, "_isModifier", value.asInstanceOf[js.Any])
    
    inline def set_isModifierReason(value: Element): Self = StObject.set(x, "_isModifierReason", value.asInstanceOf[js.Any])
    
    inline def set_isModifierReasonUndefined: Self = StObject.set(x, "_isModifierReason", js.undefined)
    
    inline def set_isModifierUndefined: Self = StObject.set(x, "_isModifier", js.undefined)
    
    inline def set_isSummary(value: Element): Self = StObject.set(x, "_isSummary", value.asInstanceOf[js.Any])
    
    inline def set_isSummaryUndefined: Self = StObject.set(x, "_isSummary", js.undefined)
    
    inline def set_label(value: Element): Self = StObject.set(x, "_label", value.asInstanceOf[js.Any])
    
    inline def set_labelUndefined: Self = StObject.set(x, "_label", js.undefined)
    
    inline def set_max(value: Element): Self = StObject.set(x, "_max", value.asInstanceOf[js.Any])
    
    inline def set_maxUndefined: Self = StObject.set(x, "_max", js.undefined)
    
    inline def set_maxValueDate(value: Element): Self = StObject.set(x, "_maxValueDate", value.asInstanceOf[js.Any])
    
    inline def set_maxValueDateTime(value: Element): Self = StObject.set(x, "_maxValueDateTime", value.asInstanceOf[js.Any])
    
    inline def set_maxValueDateTimeUndefined: Self = StObject.set(x, "_maxValueDateTime", js.undefined)
    
    inline def set_maxValueDateUndefined: Self = StObject.set(x, "_maxValueDate", js.undefined)
    
    inline def set_maxValueInstant(value: Element): Self = StObject.set(x, "_maxValueInstant", value.asInstanceOf[js.Any])
    
    inline def set_maxValueInstantUndefined: Self = StObject.set(x, "_maxValueInstant", js.undefined)
    
    inline def set_maxValueTime(value: Element): Self = StObject.set(x, "_maxValueTime", value.asInstanceOf[js.Any])
    
    inline def set_maxValueTimeUndefined: Self = StObject.set(x, "_maxValueTime", js.undefined)
    
    inline def set_meaningWhenMissing(value: Element): Self = StObject.set(x, "_meaningWhenMissing", value.asInstanceOf[js.Any])
    
    inline def set_meaningWhenMissingUndefined: Self = StObject.set(x, "_meaningWhenMissing", js.undefined)
    
    inline def set_minValueDate(value: Element): Self = StObject.set(x, "_minValueDate", value.asInstanceOf[js.Any])
    
    inline def set_minValueDateTime(value: Element): Self = StObject.set(x, "_minValueDateTime", value.asInstanceOf[js.Any])
    
    inline def set_minValueDateTimeUndefined: Self = StObject.set(x, "_minValueDateTime", js.undefined)
    
    inline def set_minValueDateUndefined: Self = StObject.set(x, "_minValueDate", js.undefined)
    
    inline def set_minValueInstant(value: Element): Self = StObject.set(x, "_minValueInstant", value.asInstanceOf[js.Any])
    
    inline def set_minValueInstantUndefined: Self = StObject.set(x, "_minValueInstant", js.undefined)
    
    inline def set_minValueTime(value: Element): Self = StObject.set(x, "_minValueTime", value.asInstanceOf[js.Any])
    
    inline def set_minValueTimeUndefined: Self = StObject.set(x, "_minValueTime", js.undefined)
    
    inline def set_mustSupport(value: Element): Self = StObject.set(x, "_mustSupport", value.asInstanceOf[js.Any])
    
    inline def set_mustSupportUndefined: Self = StObject.set(x, "_mustSupport", js.undefined)
    
    inline def set_orderMeaning(value: Element): Self = StObject.set(x, "_orderMeaning", value.asInstanceOf[js.Any])
    
    inline def set_orderMeaningUndefined: Self = StObject.set(x, "_orderMeaning", js.undefined)
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
    
    inline def set_patternBase64Binary(value: Element): Self = StObject.set(x, "_patternBase64Binary", value.asInstanceOf[js.Any])
    
    inline def set_patternBase64BinaryUndefined: Self = StObject.set(x, "_patternBase64Binary", js.undefined)
    
    inline def set_patternBoolean(value: Element): Self = StObject.set(x, "_patternBoolean", value.asInstanceOf[js.Any])
    
    inline def set_patternBooleanUndefined: Self = StObject.set(x, "_patternBoolean", js.undefined)
    
    inline def set_patternCanonical(value: Element): Self = StObject.set(x, "_patternCanonical", value.asInstanceOf[js.Any])
    
    inline def set_patternCanonicalUndefined: Self = StObject.set(x, "_patternCanonical", js.undefined)
    
    inline def set_patternCode(value: Element): Self = StObject.set(x, "_patternCode", value.asInstanceOf[js.Any])
    
    inline def set_patternCodeUndefined: Self = StObject.set(x, "_patternCode", js.undefined)
    
    inline def set_patternDate(value: Element): Self = StObject.set(x, "_patternDate", value.asInstanceOf[js.Any])
    
    inline def set_patternDateTime(value: Element): Self = StObject.set(x, "_patternDateTime", value.asInstanceOf[js.Any])
    
    inline def set_patternDateTimeUndefined: Self = StObject.set(x, "_patternDateTime", js.undefined)
    
    inline def set_patternDateUndefined: Self = StObject.set(x, "_patternDate", js.undefined)
    
    inline def set_patternId(value: Element): Self = StObject.set(x, "_patternId", value.asInstanceOf[js.Any])
    
    inline def set_patternIdUndefined: Self = StObject.set(x, "_patternId", js.undefined)
    
    inline def set_patternInstant(value: Element): Self = StObject.set(x, "_patternInstant", value.asInstanceOf[js.Any])
    
    inline def set_patternInstantUndefined: Self = StObject.set(x, "_patternInstant", js.undefined)
    
    inline def set_patternMarkdown(value: Element): Self = StObject.set(x, "_patternMarkdown", value.asInstanceOf[js.Any])
    
    inline def set_patternMarkdownUndefined: Self = StObject.set(x, "_patternMarkdown", js.undefined)
    
    inline def set_patternOid(value: Element): Self = StObject.set(x, "_patternOid", value.asInstanceOf[js.Any])
    
    inline def set_patternOidUndefined: Self = StObject.set(x, "_patternOid", js.undefined)
    
    inline def set_patternString(value: Element): Self = StObject.set(x, "_patternString", value.asInstanceOf[js.Any])
    
    inline def set_patternStringUndefined: Self = StObject.set(x, "_patternString", js.undefined)
    
    inline def set_patternTime(value: Element): Self = StObject.set(x, "_patternTime", value.asInstanceOf[js.Any])
    
    inline def set_patternTimeUndefined: Self = StObject.set(x, "_patternTime", js.undefined)
    
    inline def set_patternUri(value: Element): Self = StObject.set(x, "_patternUri", value.asInstanceOf[js.Any])
    
    inline def set_patternUriUndefined: Self = StObject.set(x, "_patternUri", js.undefined)
    
    inline def set_patternUrl(value: Element): Self = StObject.set(x, "_patternUrl", value.asInstanceOf[js.Any])
    
    inline def set_patternUrlUndefined: Self = StObject.set(x, "_patternUrl", js.undefined)
    
    inline def set_patternUuid(value: Element): Self = StObject.set(x, "_patternUuid", value.asInstanceOf[js.Any])
    
    inline def set_patternUuidUndefined: Self = StObject.set(x, "_patternUuid", js.undefined)
    
    inline def set_representation(value: js.Array[Element]): Self = StObject.set(x, "_representation", value.asInstanceOf[js.Any])
    
    inline def set_representationUndefined: Self = StObject.set(x, "_representation", js.undefined)
    
    inline def set_representationVarargs(value: Element*): Self = StObject.set(x, "_representation", js.Array(value*))
    
    inline def set_requirements(value: Element): Self = StObject.set(x, "_requirements", value.asInstanceOf[js.Any])
    
    inline def set_requirementsUndefined: Self = StObject.set(x, "_requirements", js.undefined)
    
    inline def set_short(value: Element): Self = StObject.set(x, "_short", value.asInstanceOf[js.Any])
    
    inline def set_shortUndefined: Self = StObject.set(x, "_short", js.undefined)
    
    inline def set_sliceIsConstraining(value: Element): Self = StObject.set(x, "_sliceIsConstraining", value.asInstanceOf[js.Any])
    
    inline def set_sliceIsConstrainingUndefined: Self = StObject.set(x, "_sliceIsConstraining", js.undefined)
    
    inline def set_sliceName(value: Element): Self = StObject.set(x, "_sliceName", value.asInstanceOf[js.Any])
    
    inline def set_sliceNameUndefined: Self = StObject.set(x, "_sliceName", js.undefined)
  }
}
