package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`final`
import typings.fhir.fhirStrings.amended
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.corrected
import typings.fhir.fhirStrings.preliminary
import typings.fhir.fhirStrings.registered
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Observation
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  
  var _effectiveInstant: js.UndefOr[Element] = js.undefined
  
  var _instantiatesCanonical: js.UndefOr[Element] = js.undefined
  
  var _issued: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  
  var _valueString: js.UndefOr[Element] = js.undefined
  
  var _valueTime: js.UndefOr[Element] = js.undefined
  
  /**
    * A plan, proposal or order that is fulfilled in whole or in part by this event.  For example, a MedicationRequest may require a patient to have laboratory test performed before  it is dispensed.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Only used if not implicit in code found in Observation.code.  In many systems, this may be represented as a related observation instead of an inline component.
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Only used if not implicit in code found in Observation.code or bodySite is used. In many systems, this may be represented as a related observation instead of an inline component.
    */
  var bodyStructure: js.UndefOr[Reference] = js.undefined
  
  /**
    * In addition to the required category valueset, this element allows various categorization schemes based on the owner’s definition of the category and effectively multiple categories can be used at once.  The level of granularity is defined by the category concepts in the value set.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * *All* code-value and, if present, component.code-component.value pairs need to be taken into account to correctly understand the meaning of the observation.
    */
  var code: CodeableConcept
  
  /**
    * For a discussion on the ways Observations can be assembled in groups together see [Notes](observation.html#notes) below.
    */
  var component: js.UndefOr[js.Array[ObservationComponent]] = js.undefined
  
  /**
    * Null or exceptional values can be represented two ways in FHIR Observations.  One way is to simply include them in the value set and represent the exceptions in the value.  For example, measurement values for a serology test could be  "detected", "not detected", "inconclusive", or  "specimen unsatisfactory".
    * The alternate way is to use the value element for actual observations and use the explicit dataAbsentReason element to record exceptional values.  For example, the dataAbsentReason code "error" could be used when the measurement was not completed. Note that an observation may only be reported if there are values to report. For example differential cell counts values may be reported only when > 0.  Because of these options, use-case agreements are required to interpret general observations for null or exceptional values.
    */
  var dataAbsentReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * All the reference choices that are listed in this element can represent clinical observations and other measurements that may be the source for a derived value.  The most common reference will be another Observation.  For a discussion on the ways Observations can assembled in groups together, see [Notes](observation.html#obsgrouping) below.
    */
  var derivedFrom: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Note that this is not meant to represent a device involved in the transmission of the result, e.g., a gateway.  Such devices may be documented using the Provenance resource where relevant.
    */
  var device: js.UndefOr[Reference] = js.undefined
  
  /**
    * At least a date should be present unless this observation is a historical report.  For recording imprecise or "fuzzy" times (For example, a blood glucose measurement taken "after breakfast") use the [Timing](datatypes.html#timing) datatype which allow the measurement to be tied to regular life events.
    */
  var effectiveDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * At least a date should be present unless this observation is a historical report.  For recording imprecise or "fuzzy" times (For example, a blood glucose measurement taken "after breakfast") use the [Timing](datatypes.html#timing) datatype which allow the measurement to be tied to regular life events.
    */
  var effectiveInstant: js.UndefOr[String] = js.undefined
  
  /**
    * At least a date should be present unless this observation is a historical report.  For recording imprecise or "fuzzy" times (For example, a blood glucose measurement taken "after breakfast") use the [Timing](datatypes.html#timing) datatype which allow the measurement to be tied to regular life events.
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * At least a date should be present unless this observation is a historical report.  For recording imprecise or "fuzzy" times (For example, a blood glucose measurement taken "after breakfast") use the [Timing](datatypes.html#timing) datatype which allow the measurement to be tied to regular life events.
    */
  var effectiveTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * This will typically be the encounter the event occurred within, but some events may be initiated prior to or after the official completion of an encounter but still be tied to the context of the encounter (e.g. pre-admission laboratory tests).
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Typically, an observation is made about the subject - a patient, or group of patients, location, or device - and the distinction between the subject and what is directly measured for an observation is specified in the observation code itself ( e.g., "Blood Glucose") and does not need to be represented separately using this element.  Use `specimen` if a reference to a specimen is required.  If a code is required instead of a resource use either  `bodysite` for bodysites or the standard extension [http://hl7.org/fhir/StructureDefinition/observation-focusCode](http://hl7.org/fhir/extensions/StructureDefinition-observation-focusCode.html).
    */
  var focus: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * When using this element, an observation will typically have either a value or a set of related resources, although both may be present in some cases.  For a discussion on the ways Observations can assembled in groups together, see [Notes](observation.html#obsgrouping) below.  Note that a system may calculate results from [QuestionnaireResponse](questionnaireresponse.html)  into a final score and represent the score as an Observation.
    */
  var hasMember: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A unique identifier assigned to this observation.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * ObservationDefinition can be referenced by its canonical url using instantiatesCanonical, or by a name or an identifier using the appropriate sub-elements of instantiatesReference.
    */
  var instantiatesCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * ObservationDefinition can be referenced by its canonical url using instantiatesCanonical, or by a name or an identifier using the appropriate sub-elements of instantiatesReference.
    */
  var instantiatesReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Historically used for laboratory results (known as 'abnormal flag' ),  its use extends to other use cases where coded interpretations  are relevant.  Often reported as one or more simple compact codes this element is often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result.
    */
  var interpretation: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * For Observations that don't require review and verification, it may be the same as the [`lastUpdated` ](resource-definitions.html#Meta.lastUpdated) time of the resource itself.  For Observations that do require review and verification for certain updates, it might not be the same as the `lastUpdated` time of the resource itself due to a non-clinically significant update that doesn't require the new version to be reviewed and verified again.
    */
  var issued: js.UndefOr[String] = js.undefined
  
  /**
    * Only used if not implicit in code for Observation.code.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * May include general statements about the observation, or statements about significant, unexpected or unreliable results values, or information about its source when relevant to its interpretation.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * To link an Observation to an Encounter use `encounter`.  See the  [Notes](observation.html#obsgrouping) below for guidance on referencing another Observation.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Who was responsible for asserting the observed value as "true".
    */
  var performer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Most observations only have one generic reference range. Systems MAY choose to restrict to only supplying the relevant reference range based on knowledge about the patient (e.g., specific to the patient's age, gender, weight and other factors), but this might not be possible or appropriate. Whenever more than one reference range is supplied, the differences between them SHOULD be provided in the reference range and/or age properties.
    */
  var referenceRange: js.UndefOr[js.Array[ObservationReferenceRange]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Observation: typings.fhir.fhirStrings.Observation
  
  /**
    * Should only be used if not implicit in code found in `Observation.code`.  Observations are not made on specimens themselves; they are made on a subject, but in many cases by the means of a specimen. Note that although specimens are often involved, they are not always tracked and reported explicitly. Also note that observation resources may be used in contexts that track the specimen explicitly (e.g. Diagnostic Report).
    */
  var specimen: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: registered | preliminary | `final` | amended | corrected | cancelled | `entered-in-error` | unknown
  
  /**
    * One would expect this element to be a cardinality of 1..1. The only circumstance in which the subject can be missing is when the observation is made by a device that does not know the patient. In this case, the observation SHALL be matched to a patient through some context/channel matching technique, and at this point, the observation should be updated. The subject of an Observation may in some cases be a procedure.  This supports the regulatory inspection use case where observations are captured during inspections of a procedure that is being performed (independent of any particular patient or whether patient related at all).
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifies the observation(s) that triggered the performance of this observation.
    */
  var triggeredBy: js.UndefOr[js.Array[ObservationTriggeredBy]] = js.undefined
  
  /**
    * - An observation may have:
    *   1.  a single value here
    *   1.  both a value and a set of related or component values
    *   1.  only a set of related or component values.
    * -  If a value is present, the datatype for this element should be determined by the `code`.
    * -  *CodeableConcept* with just a text would be used instead of a string if the field was usually coded, or if the type associated with the `code` defines a coded value.
    * -  *Attachment* is used if the observation result value is a binary file such as an image.  If the observation result value is derived from the binary file (for example 'X' detected and here is the the proof in this image), the binary file may be directly represented using *DocumentReference* and referenced by `derivedFrom`.
    * - The usage of valueReference is restricted to the MolecularSequence resource when used as a definitional resource, not as a patient-specific finding. .
    * - For additional guidance, see the [Notes section](observation.html#notes) below.
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * - An observation may have:
    *   1.  a single value here
    *   1.  both a value and a set of related or component values
    *   1.  only a set of related or component values.
    * -  If a value is present, the datatype for this element should be determined by the `code`.
    * -  *CodeableConcept* with just a text would be used instead of a string if the field was usually coded, or if the type associated with the `code` defines a coded value.
    * -  *Attachment* is used if the observation result value is a binary file such as an image.  If the observation result value is derived from the binary file (for example 'X' detected and here is the the proof in this image), the binary file may be directly represented using *DocumentReference* and referenced by `derivedFrom`.
    * - The usage of valueReference is restricted to the MolecularSequence resource when used as a definitional resource, not as a patient-specific finding. .
    * - For additional guidance, see the [Notes section](observation.html#notes) below.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - An observation may have:
    *   1.  a single value here
    *   1.  both a value and a set of related or component values
    *   1.  only a set of related or component values.
    * -  If a value is present, the datatype for this element should be determined by the `code`.
    * -  *CodeableConcept* with just a text would be used instead of a string if the field was usually coded, or if the type associated with the `code` defines a coded value.
    * -  *Attachment* is used if the observation result value is a binary file such as an image.  If the observation result value is derived from the binary file (for example 'X' detected and here is the the proof in this image), the binary file may be directly represented using *DocumentReference* and referenced by `derivedFrom`.
    * - The usage of valueReference is restricted to the MolecularSequence resource when used as a definitional resource, not as a patient-specific finding. .
    * - For additional guidance, see the [Notes section](observation.html#notes) below.
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * - An observation may have:
    *   1.  a single value here
    *   1.  both a value and a set of related or component values
    *   1.  only a set of related or component values.
    * -  If a value is present, the datatype for this element should be determined by the `code`.
    * -  *CodeableConcept* with just a text would be used instead of a string if the field was usually coded, or if the type associated with the `code` defines a coded value.
    * -  *Attachment* is used if the observation result value is a binary file such as an image.  If the observation result value is derived from the binary file (for example 'X' detected and here is the the proof in this image), the binary file may be directly represented using *DocumentReference* and referenced by `derivedFrom`.
    * - The usage of valueReference is restricted to the MolecularSequence resource when used as a definitional resource, not as a patient-specific finding. .
    * - For additional guidance, see the [Notes section](observation.html#notes) below.
    */
  var valueDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * - An observation may have:
    *   1.  a single value here
    *   1.  both a value and a set of related or component values
    *   1.  only a set of related or component values.
    * -  If a value is present, the datatype for this element should be determined by the `code`.
    * -  *CodeableConcept* with just a text would be used instead of a string if the field was usually coded, or if the type associated with the `code` defines a coded value.
    * -  *Attachment* is used if the observation result value is a binary file such as an image.  If the observation result value is derived from the binary file (for example 'X' detected and here is the the proof in this image), the binary file may be directly represented using *DocumentReference* and referenced by `derivedFrom`.
    * - The usage of valueReference is restricted to the MolecularSequence resource when used as a definitional resource, not as a patient-specific finding. .
    * - For additional guidance, see the [Notes section](observation.html#notes) below.
    */
  var valueInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * - An observation may have:
    *   1.  a single value here
    *   1.  both a value and a set of related or component values
    *   1.  only a set of related or component values.
    * -  If a value is present, the datatype for this element should be determined by the `code`.
    * -  *CodeableConcept* with just a text would be used instead of a string if the field was usually coded, or if the type associated with the `code` defines a coded value.
    * -  *Attachment* is used if the observation result value is a binary file such as an image.  If the observation result value is derived from the binary file (for example 'X' detected and here is the the proof in this image), the binary file may be directly represented using *DocumentReference* and referenced by `derivedFrom`.
    * - The usage of valueReference is restricted to the MolecularSequence resource when used as a definitional resource, not as a patient-specific finding. .
    * - For additional guidance, see the [Notes section](observation.html#notes) below.
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * - An observation may have:
    *   1.  a single value here
    *   1.  both a value and a set of related or component values
    *   1.  only a set of related or component values.
    * -  If a value is present, the datatype for this element should be determined by the `code`.
    * -  *CodeableConcept* with just a text would be used instead of a string if the field was usually coded, or if the type associated with the `code` defines a coded value.
    * -  *Attachment* is used if the observation result value is a binary file such as an image.  If the observation result value is derived from the binary file (for example 'X' detected and here is the the proof in this image), the binary file may be directly represented using *DocumentReference* and referenced by `derivedFrom`.
    * - The usage of valueReference is restricted to the MolecularSequence resource when used as a definitional resource, not as a patient-specific finding. .
    * - For additional guidance, see the [Notes section](observation.html#notes) below.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * - An observation may have:
    *   1.  a single value here
    *   1.  both a value and a set of related or component values
    *   1.  only a set of related or component values.
    * -  If a value is present, the datatype for this element should be determined by the `code`.
    * -  *CodeableConcept* with just a text would be used instead of a string if the field was usually coded, or if the type associated with the `code` defines a coded value.
    * -  *Attachment* is used if the observation result value is a binary file such as an image.  If the observation result value is derived from the binary file (for example 'X' detected and here is the the proof in this image), the binary file may be directly represented using *DocumentReference* and referenced by `derivedFrom`.
    * - The usage of valueReference is restricted to the MolecularSequence resource when used as a definitional resource, not as a patient-specific finding. .
    * - For additional guidance, see the [Notes section](observation.html#notes) below.
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  
  /**
    * - An observation may have:
    *   1.  a single value here
    *   1.  both a value and a set of related or component values
    *   1.  only a set of related or component values.
    * -  If a value is present, the datatype for this element should be determined by the `code`.
    * -  *CodeableConcept* with just a text would be used instead of a string if the field was usually coded, or if the type associated with the `code` defines a coded value.
    * -  *Attachment* is used if the observation result value is a binary file such as an image.  If the observation result value is derived from the binary file (for example 'X' detected and here is the the proof in this image), the binary file may be directly represented using *DocumentReference* and referenced by `derivedFrom`.
    * - The usage of valueReference is restricted to the MolecularSequence resource when used as a definitional resource, not as a patient-specific finding. .
    * - For additional guidance, see the [Notes section](observation.html#notes) below.
    */
  var valueRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * - An observation may have:
    *   1.  a single value here
    *   1.  both a value and a set of related or component values
    *   1.  only a set of related or component values.
    * -  If a value is present, the datatype for this element should be determined by the `code`.
    * -  *CodeableConcept* with just a text would be used instead of a string if the field was usually coded, or if the type associated with the `code` defines a coded value.
    * -  *Attachment* is used if the observation result value is a binary file such as an image.  If the observation result value is derived from the binary file (for example 'X' detected and here is the the proof in this image), the binary file may be directly represented using *DocumentReference* and referenced by `derivedFrom`.
    * - The usage of valueReference is restricted to the MolecularSequence resource when used as a definitional resource, not as a patient-specific finding. .
    * - For additional guidance, see the [Notes section](observation.html#notes) below.
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * - An observation may have:
    *   1.  a single value here
    *   1.  both a value and a set of related or component values
    *   1.  only a set of related or component values.
    * -  If a value is present, the datatype for this element should be determined by the `code`.
    * -  *CodeableConcept* with just a text would be used instead of a string if the field was usually coded, or if the type associated with the `code` defines a coded value.
    * -  *Attachment* is used if the observation result value is a binary file such as an image.  If the observation result value is derived from the binary file (for example 'X' detected and here is the the proof in this image), the binary file may be directly represented using *DocumentReference* and referenced by `derivedFrom`.
    * - The usage of valueReference is restricted to the MolecularSequence resource when used as a definitional resource, not as a patient-specific finding. .
    * - For additional guidance, see the [Notes section](observation.html#notes) below.
    */
  var valueSampledData: js.UndefOr[SampledData] = js.undefined
  
  /**
    * - An observation may have:
    *   1.  a single value here
    *   1.  both a value and a set of related or component values
    *   1.  only a set of related or component values.
    * -  If a value is present, the datatype for this element should be determined by the `code`.
    * -  *CodeableConcept* with just a text would be used instead of a string if the field was usually coded, or if the type associated with the `code` defines a coded value.
    * -  *Attachment* is used if the observation result value is a binary file such as an image.  If the observation result value is derived from the binary file (for example 'X' detected and here is the the proof in this image), the binary file may be directly represented using *DocumentReference* and referenced by `derivedFrom`.
    * - The usage of valueReference is restricted to the MolecularSequence resource when used as a definitional resource, not as a patient-specific finding. .
    * - For additional guidance, see the [Notes section](observation.html#notes) below.
    */
  var valueString: js.UndefOr[String] = js.undefined
  
  /**
    * - An observation may have:
    *   1.  a single value here
    *   1.  both a value and a set of related or component values
    *   1.  only a set of related or component values.
    * -  If a value is present, the datatype for this element should be determined by the `code`.
    * -  *CodeableConcept* with just a text would be used instead of a string if the field was usually coded, or if the type associated with the `code` defines a coded value.
    * -  *Attachment* is used if the observation result value is a binary file such as an image.  If the observation result value is derived from the binary file (for example 'X' detected and here is the the proof in this image), the binary file may be directly represented using *DocumentReference* and referenced by `derivedFrom`.
    * - The usage of valueReference is restricted to the MolecularSequence resource when used as a definitional resource, not as a patient-specific finding. .
    * - For additional guidance, see the [Notes section](observation.html#notes) below.
    */
  var valueTime: js.UndefOr[String] = js.undefined
}
object Observation {
  
  inline def apply(
    code: CodeableConcept,
    status: registered | preliminary | `final` | amended | corrected | cancelled | `entered-in-error` | unknown
  ): Observation = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "Observation", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Observation] (val x: Self) extends AnyVal {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setBodyStructure(value: Reference): Self = StObject.set(x, "bodyStructure", value.asInstanceOf[js.Any])
    
    inline def setBodyStructureUndefined: Self = StObject.set(x, "bodyStructure", js.undefined)
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setComponent(value: js.Array[ObservationComponent]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setComponentVarargs(value: ObservationComponent*): Self = StObject.set(x, "component", js.Array(value*))
    
    inline def setDataAbsentReason(value: CodeableConcept): Self = StObject.set(x, "dataAbsentReason", value.asInstanceOf[js.Any])
    
    inline def setDataAbsentReasonUndefined: Self = StObject.set(x, "dataAbsentReason", js.undefined)
    
    inline def setDerivedFrom(value: js.Array[Reference]): Self = StObject.set(x, "derivedFrom", value.asInstanceOf[js.Any])
    
    inline def setDerivedFromUndefined: Self = StObject.set(x, "derivedFrom", js.undefined)
    
    inline def setDerivedFromVarargs(value: Reference*): Self = StObject.set(x, "derivedFrom", js.Array(value*))
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setEffectiveDateTime(value: String): Self = StObject.set(x, "effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDateTimeUndefined: Self = StObject.set(x, "effectiveDateTime", js.undefined)
    
    inline def setEffectiveInstant(value: String): Self = StObject.set(x, "effectiveInstant", value.asInstanceOf[js.Any])
    
    inline def setEffectiveInstantUndefined: Self = StObject.set(x, "effectiveInstant", js.undefined)
    
    inline def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    inline def setEffectiveTiming(value: Timing): Self = StObject.set(x, "effectiveTiming", value.asInstanceOf[js.Any])
    
    inline def setEffectiveTimingUndefined: Self = StObject.set(x, "effectiveTiming", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setFocus(value: js.Array[Reference]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setFocusVarargs(value: Reference*): Self = StObject.set(x, "focus", js.Array(value*))
    
    inline def setHasMember(value: js.Array[Reference]): Self = StObject.set(x, "hasMember", value.asInstanceOf[js.Any])
    
    inline def setHasMemberUndefined: Self = StObject.set(x, "hasMember", js.undefined)
    
    inline def setHasMemberVarargs(value: Reference*): Self = StObject.set(x, "hasMember", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInstantiatesCanonical(value: String): Self = StObject.set(x, "instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesCanonicalUndefined: Self = StObject.set(x, "instantiatesCanonical", js.undefined)
    
    inline def setInstantiatesReference(value: Reference): Self = StObject.set(x, "instantiatesReference", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesReferenceUndefined: Self = StObject.set(x, "instantiatesReference", js.undefined)
    
    inline def setInterpretation(value: js.Array[CodeableConcept]): Self = StObject.set(x, "interpretation", value.asInstanceOf[js.Any])
    
    inline def setInterpretationUndefined: Self = StObject.set(x, "interpretation", js.undefined)
    
    inline def setInterpretationVarargs(value: CodeableConcept*): Self = StObject.set(x, "interpretation", js.Array(value*))
    
    inline def setIssued(value: String): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    inline def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setPerformer(value: js.Array[Reference]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: Reference*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setReferenceRange(value: js.Array[ObservationReferenceRange]): Self = StObject.set(x, "referenceRange", value.asInstanceOf[js.Any])
    
    inline def setReferenceRangeUndefined: Self = StObject.set(x, "referenceRange", js.undefined)
    
    inline def setReferenceRangeVarargs(value: ObservationReferenceRange*): Self = StObject.set(x, "referenceRange", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Observation): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSpecimen(value: Reference): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    inline def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    inline def setStatus(
      value: registered | preliminary | `final` | amended | corrected | cancelled | `entered-in-error` | unknown
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTriggeredBy(value: js.Array[ObservationTriggeredBy]): Self = StObject.set(x, "triggeredBy", value.asInstanceOf[js.Any])
    
    inline def setTriggeredByUndefined: Self = StObject.set(x, "triggeredBy", js.undefined)
    
    inline def setTriggeredByVarargs(value: ObservationTriggeredBy*): Self = StObject.set(x, "triggeredBy", js.Array(value*))
    
    inline def setValueAttachment(value: Attachment): Self = StObject.set(x, "valueAttachment", value.asInstanceOf[js.Any])
    
    inline def setValueAttachmentUndefined: Self = StObject.set(x, "valueAttachment", js.undefined)
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueDateTime(value: String): Self = StObject.set(x, "valueDateTime", value.asInstanceOf[js.Any])
    
    inline def setValueDateTimeUndefined: Self = StObject.set(x, "valueDateTime", js.undefined)
    
    inline def setValueInteger(value: Double): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    inline def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    inline def setValuePeriod(value: Period): Self = StObject.set(x, "valuePeriod", value.asInstanceOf[js.Any])
    
    inline def setValuePeriodUndefined: Self = StObject.set(x, "valuePeriod", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    inline def setValueRatio(value: Ratio): Self = StObject.set(x, "valueRatio", value.asInstanceOf[js.Any])
    
    inline def setValueRatioUndefined: Self = StObject.set(x, "valueRatio", js.undefined)
    
    inline def setValueReference(value: Reference): Self = StObject.set(x, "valueReference", value.asInstanceOf[js.Any])
    
    inline def setValueReferenceUndefined: Self = StObject.set(x, "valueReference", js.undefined)
    
    inline def setValueSampledData(value: SampledData): Self = StObject.set(x, "valueSampledData", value.asInstanceOf[js.Any])
    
    inline def setValueSampledDataUndefined: Self = StObject.set(x, "valueSampledData", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    inline def setValueTime(value: String): Self = StObject.set(x, "valueTime", value.asInstanceOf[js.Any])
    
    inline def setValueTimeUndefined: Self = StObject.set(x, "valueTime", js.undefined)
    
    inline def set_effectiveDateTime(value: Element): Self = StObject.set(x, "_effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def set_effectiveDateTimeUndefined: Self = StObject.set(x, "_effectiveDateTime", js.undefined)
    
    inline def set_effectiveInstant(value: Element): Self = StObject.set(x, "_effectiveInstant", value.asInstanceOf[js.Any])
    
    inline def set_effectiveInstantUndefined: Self = StObject.set(x, "_effectiveInstant", js.undefined)
    
    inline def set_instantiatesCanonical(value: Element): Self = StObject.set(x, "_instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesCanonicalUndefined: Self = StObject.set(x, "_instantiatesCanonical", js.undefined)
    
    inline def set_issued(value: Element): Self = StObject.set(x, "_issued", value.asInstanceOf[js.Any])
    
    inline def set_issuedUndefined: Self = StObject.set(x, "_issued", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
    
    inline def set_valueDateTime(value: Element): Self = StObject.set(x, "_valueDateTime", value.asInstanceOf[js.Any])
    
    inline def set_valueDateTimeUndefined: Self = StObject.set(x, "_valueDateTime", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
    
    inline def set_valueTime(value: Element): Self = StObject.set(x, "_valueTime", value.asInstanceOf[js.Any])
    
    inline def set_valueTimeUndefined: Self = StObject.set(x, "_valueTime", js.undefined)
  }
}
