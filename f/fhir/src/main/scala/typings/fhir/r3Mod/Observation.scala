package typings.fhir.r3Mod

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
  
  var _comment: js.UndefOr[Element] = js.undefined
  
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  
  var _issued: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  
  var _valueString: js.UndefOr[Element] = js.undefined
  
  var _valueTime: js.UndefOr[Element] = js.undefined
  
  /**
    * A plan, proposal or order that is fulfilled in whole or in part by this event.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Only used if not implicit in code found in Observation.code.  In many systems, this may be represented as a related observation instead of an inline component.   If the use case requires BodySite to be handled as a separate resource (e.g. to identify and track separately) then use the standard extension[ body-site-instance](extension-body-site-instance.html).
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * In addition to the required category valueset, this element allows various categorization schemes based on the owner’s definition of the category and effectively multiple categories can be used at once.  The level of granularity is defined by the category concepts in the value set.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Describes what was observed. Sometimes this is called the observation "name".
    */
  var code: CodeableConcept
  
  /**
    * May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * For a discussion on the ways Observations can be assembled in groups together see [Notes](observation.html#notes) below.
    */
  var component: js.UndefOr[js.Array[ObservationComponent]] = js.undefined
  
  /**
    * This will typically be the encounter the event occurred within, but some events may be initiated prior to or after the official completion of an encounter or episode but still be tied to the context of the encounter or episode (e.g. pre-admission lab tests).
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Null or exceptional values can be represented two ways in FHIR Observations.  One way is to simply include them in the value set and represent the exceptions in the value.  For example, measurement values for a serology test could be  "detected", "not detected", "inconclusive", or  "specimen unsatisfactory".   The alternate way is to use the value element for actual observations and use the explicit dataAbsentReason element to record exceptional values.  For example, the dataAbsentReason code "error" could be used when the measurement was not completed. Note that an observation may only be reported if there are values to report. For example differential cell counts values may be reported only when > 0.  Because of these options, use-case agreements are required to interpret general observations for null or exceptional values.
    */
  var dataAbsentReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * An extension should be used if further typing of the device is needed.  Devices used to support obtaining an observation can be represented using either an extension or through the Observation.related element.
    */
  var device: js.UndefOr[Reference] = js.undefined
  
  /**
    * At least a date should be present unless this observation is a historical report.
    */
  var effectiveDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * At least a date should be present unless this observation is a historical report.
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * A unique identifier assigned to this observation.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The assessment made based on the result of the observation.  Intended as a simple compact code often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result. Otherwise known as abnormal flag.
    */
  var interpretation: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Updated when the result is updated.
    */
  var issued: js.UndefOr[String] = js.undefined
  
  /**
    * Only used if not implicit in code for Observation.code.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Who was responsible for asserting the observed value as "true".
    */
  var performer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Most observations only have one generic reference range. Systems MAY choose to restrict to only supplying the relevant reference range based on knowledge about the patient (e.g., specific to the patient's age, gender, weight and other factors), but this may not be possible or appropriate. Whenever more than one reference range is supplied, the differences between them SHOULD be provided in the reference range and/or age properties.
    */
  var referenceRange: js.UndefOr[js.Array[ObservationReferenceRange]] = js.undefined
  
  /**
    * For a discussion on the ways Observations can assembled in groups together see [Notes below](observation.html#4.20.4).
    */
  var related: js.UndefOr[js.Array[ObservationRelated]] = js.undefined
  
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
    * One would expect this element to be a cardinality  of 1..1.  The only circumstance in which the subject can be missing is when the observation is made by a device that does not know the patient. In this case, the observation SHALL be matched to a patient through some context/channel matching technique, and at this point, the observation should be updated.
    * If the target of the observation is different than the subject, the general extension [observation-focal-subject](extension-observation-focal-subject.html).  may be used.  However, the distinction between the patient's own value for an observation versus that of the fetus, or the donor or blood product unit, etc., are often specified in the observation code.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. This element has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueString, valueBoolean, valueRange, valueRatio, valueSampledData, valueAttachment, valueTime, valueDateTime, or valuePeriod. (The name format is "'value' + the type name" with a capital on the first letter of the type).
    *
    * If the data element is usually coded or if the type associated with the Observation.value defines a coded value, use CodeableConcept instead of string datatype even if the value is uncoded text.  A value set is bound to the ValueCodeableConcept element.    For further discussion and examples see the  [notes section](observation.html#notes) below.
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. This element has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueString, valueBoolean, valueRange, valueRatio, valueSampledData, valueAttachment, valueTime, valueDateTime, or valuePeriod. (The name format is "'value' + the type name" with a capital on the first letter of the type).
    *
    * If the data element is usually coded or if the type associated with the Observation.value defines a coded value, use CodeableConcept instead of string datatype even if the value is uncoded text.  A value set is bound to the ValueCodeableConcept element.    For further discussion and examples see the  [notes section](observation.html#notes) below.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. This element has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueString, valueBoolean, valueRange, valueRatio, valueSampledData, valueAttachment, valueTime, valueDateTime, or valuePeriod. (The name format is "'value' + the type name" with a capital on the first letter of the type).
    *
    * If the data element is usually coded or if the type associated with the Observation.value defines a coded value, use CodeableConcept instead of string datatype even if the value is uncoded text.  A value set is bound to the ValueCodeableConcept element.    For further discussion and examples see the  [notes section](observation.html#notes) below.
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. This element has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueString, valueBoolean, valueRange, valueRatio, valueSampledData, valueAttachment, valueTime, valueDateTime, or valuePeriod. (The name format is "'value' + the type name" with a capital on the first letter of the type).
    *
    * If the data element is usually coded or if the type associated with the Observation.value defines a coded value, use CodeableConcept instead of string datatype even if the value is uncoded text.  A value set is bound to the ValueCodeableConcept element.    For further discussion and examples see the  [notes section](observation.html#notes) below.
    */
  var valueDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. This element has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueString, valueBoolean, valueRange, valueRatio, valueSampledData, valueAttachment, valueTime, valueDateTime, or valuePeriod. (The name format is "'value' + the type name" with a capital on the first letter of the type).
    *
    * If the data element is usually coded or if the type associated with the Observation.value defines a coded value, use CodeableConcept instead of string datatype even if the value is uncoded text.  A value set is bound to the ValueCodeableConcept element.    For further discussion and examples see the  [notes section](observation.html#notes) below.
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. This element has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueString, valueBoolean, valueRange, valueRatio, valueSampledData, valueAttachment, valueTime, valueDateTime, or valuePeriod. (The name format is "'value' + the type name" with a capital on the first letter of the type).
    *
    * If the data element is usually coded or if the type associated with the Observation.value defines a coded value, use CodeableConcept instead of string datatype even if the value is uncoded text.  A value set is bound to the ValueCodeableConcept element.    For further discussion and examples see the  [notes section](observation.html#notes) below.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. This element has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueString, valueBoolean, valueRange, valueRatio, valueSampledData, valueAttachment, valueTime, valueDateTime, or valuePeriod. (The name format is "'value' + the type name" with a capital on the first letter of the type).
    *
    * If the data element is usually coded or if the type associated with the Observation.value defines a coded value, use CodeableConcept instead of string datatype even if the value is uncoded text.  A value set is bound to the ValueCodeableConcept element.    For further discussion and examples see the  [notes section](observation.html#notes) below.
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. This element has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueString, valueBoolean, valueRange, valueRatio, valueSampledData, valueAttachment, valueTime, valueDateTime, or valuePeriod. (The name format is "'value' + the type name" with a capital on the first letter of the type).
    *
    * If the data element is usually coded or if the type associated with the Observation.value defines a coded value, use CodeableConcept instead of string datatype even if the value is uncoded text.  A value set is bound to the ValueCodeableConcept element.    For further discussion and examples see the  [notes section](observation.html#notes) below.
    */
  var valueRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. This element has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueString, valueBoolean, valueRange, valueRatio, valueSampledData, valueAttachment, valueTime, valueDateTime, or valuePeriod. (The name format is "'value' + the type name" with a capital on the first letter of the type).
    *
    * If the data element is usually coded or if the type associated with the Observation.value defines a coded value, use CodeableConcept instead of string datatype even if the value is uncoded text.  A value set is bound to the ValueCodeableConcept element.    For further discussion and examples see the  [notes section](observation.html#notes) below.
    */
  var valueSampledData: js.UndefOr[SampledData] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. This element has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueString, valueBoolean, valueRange, valueRatio, valueSampledData, valueAttachment, valueTime, valueDateTime, or valuePeriod. (The name format is "'value' + the type name" with a capital on the first letter of the type).
    *
    * If the data element is usually coded or if the type associated with the Observation.value defines a coded value, use CodeableConcept instead of string datatype even if the value is uncoded text.  A value set is bound to the ValueCodeableConcept element.    For further discussion and examples see the  [notes section](observation.html#notes) below.
    */
  var valueString: js.UndefOr[String] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. This element has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueString, valueBoolean, valueRange, valueRatio, valueSampledData, valueAttachment, valueTime, valueDateTime, or valuePeriod. (The name format is "'value' + the type name" with a capital on the first letter of the type).
    *
    * If the data element is usually coded or if the type associated with the Observation.value defines a coded value, use CodeableConcept instead of string datatype even if the value is uncoded text.  A value set is bound to the ValueCodeableConcept element.    For further discussion and examples see the  [notes section](observation.html#notes) below.
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
  
  extension [Self <: Observation](x: Self) {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setComponent(value: js.Array[ObservationComponent]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setComponentVarargs(value: ObservationComponent*): Self = StObject.set(x, "component", js.Array(value*))
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDataAbsentReason(value: CodeableConcept): Self = StObject.set(x, "dataAbsentReason", value.asInstanceOf[js.Any])
    
    inline def setDataAbsentReasonUndefined: Self = StObject.set(x, "dataAbsentReason", js.undefined)
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setEffectiveDateTime(value: String): Self = StObject.set(x, "effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDateTimeUndefined: Self = StObject.set(x, "effectiveDateTime", js.undefined)
    
    inline def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInterpretation(value: CodeableConcept): Self = StObject.set(x, "interpretation", value.asInstanceOf[js.Any])
    
    inline def setInterpretationUndefined: Self = StObject.set(x, "interpretation", js.undefined)
    
    inline def setIssued(value: String): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    inline def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPerformer(value: js.Array[Reference]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: Reference*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setReferenceRange(value: js.Array[ObservationReferenceRange]): Self = StObject.set(x, "referenceRange", value.asInstanceOf[js.Any])
    
    inline def setReferenceRangeUndefined: Self = StObject.set(x, "referenceRange", js.undefined)
    
    inline def setReferenceRangeVarargs(value: ObservationReferenceRange*): Self = StObject.set(x, "referenceRange", js.Array(value*))
    
    inline def setRelated(value: js.Array[ObservationRelated]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    inline def setRelatedVarargs(value: ObservationRelated*): Self = StObject.set(x, "related", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Observation): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSpecimen(value: Reference): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    inline def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    inline def setStatus(
      value: registered | preliminary | `final` | amended | corrected | cancelled | `entered-in-error` | unknown
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setValueAttachment(value: Attachment): Self = StObject.set(x, "valueAttachment", value.asInstanceOf[js.Any])
    
    inline def setValueAttachmentUndefined: Self = StObject.set(x, "valueAttachment", js.undefined)
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueDateTime(value: String): Self = StObject.set(x, "valueDateTime", value.asInstanceOf[js.Any])
    
    inline def setValueDateTimeUndefined: Self = StObject.set(x, "valueDateTime", js.undefined)
    
    inline def setValuePeriod(value: Period): Self = StObject.set(x, "valuePeriod", value.asInstanceOf[js.Any])
    
    inline def setValuePeriodUndefined: Self = StObject.set(x, "valuePeriod", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    inline def setValueRatio(value: Ratio): Self = StObject.set(x, "valueRatio", value.asInstanceOf[js.Any])
    
    inline def setValueRatioUndefined: Self = StObject.set(x, "valueRatio", js.undefined)
    
    inline def setValueSampledData(value: SampledData): Self = StObject.set(x, "valueSampledData", value.asInstanceOf[js.Any])
    
    inline def setValueSampledDataUndefined: Self = StObject.set(x, "valueSampledData", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    inline def setValueTime(value: String): Self = StObject.set(x, "valueTime", value.asInstanceOf[js.Any])
    
    inline def setValueTimeUndefined: Self = StObject.set(x, "valueTime", js.undefined)
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    inline def set_effectiveDateTime(value: Element): Self = StObject.set(x, "_effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def set_effectiveDateTimeUndefined: Self = StObject.set(x, "_effectiveDateTime", js.undefined)
    
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
