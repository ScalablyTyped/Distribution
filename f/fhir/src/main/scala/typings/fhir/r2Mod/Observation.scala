package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`final`
import typings.fhir.fhirStrings.amended
import typings.fhir.fhirStrings.cancelled
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
  
  var _comments: js.UndefOr[Element] = js.undefined
  
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  
  var _issued: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  
  var _valueString: js.UndefOr[Element] = js.undefined
  
  var _valueTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Knowing where the observation is made is important for tracking if multiple sites are possible.
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A code that classifies the general type of observation being made.  This is used  for searching, sorting and display purposes.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Knowing what kind of observation is being made is essential to understanding the observation.
    */
  var code: CodeableConcept
  
  /**
    * Need to be able to provide free text additional information.
    */
  var comments: js.UndefOr[String] = js.undefined
  
  /**
    * Component observations share the same attributes in the Observation resource as the primary observation and are always treated a part of a single observation (they are not separable).   However, the reference range for the primary observation value is not inherited by the component values and is required when appropriate for each component observation.
    */
  var component: js.UndefOr[js.Array[ObservationComponent]] = js.undefined
  
  /**
    * For many results it is necessary to handle exceptional values in measurements.
    */
  var dataAbsentReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The device used to generate the observation data.
    */
  var device: js.UndefOr[Reference] = js.undefined
  
  /**
    * Knowing when an observation was deemed true is important to its relevance as well as determining trends.
    */
  var effectiveDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Knowing when an observation was deemed true is important to its relevance as well as determining trends.
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * For some observations it may be important to know the link between an observation and a particular encounter.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Allows observations to be distinguished and referenced.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * For some results, particularly numeric results, an interpretation is necessary to fully understand the significance of a result.
    */
  var interpretation: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The date and time this observation was made available to providers, typically after the results have been reviewed and verified.
    */
  var issued: js.UndefOr[String] = js.undefined
  
  /**
    * In some cases, method can impact results and is thus used for determining whether results can be compared or determining significance of results.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * May give a degree of confidence in the observation and also indicates where follow-up questions should be directed.
    */
  var performer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Knowing what values are considered "normal" can help evaluate the significance of a particular result. Need to be able to provide multiple reference ranges for different contexts.
    */
  var referenceRange: js.UndefOr[js.Array[ObservationReferenceRange]] = js.undefined
  
  /**
    * Normally, an observation will have either a value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and a set of related observations or sometimes QuestionnaireResponse  from which the measure is derived.
    */
  var related: js.UndefOr[js.Array[ObservationRelated]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Observation: typings.fhir.fhirStrings.Observation
  
  /**
    * The specimen that was used when this observation was made.
    */
  var specimen: js.UndefOr[Reference] = js.undefined
  
  /**
    * Need to track the status of individual results. Some results are finalized before the whole report is finalized.
    */
  var status: registered | preliminary | `final` | amended | cancelled | `entered-in-error` | unknown
  
  /**
    * Observations have no value if you don't know who or what they're about.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * An observation exists to have a value, though it may not if it is in error, or it represents a group of observations.
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * An observation exists to have a value, though it may not if it is in error, or it represents a group of observations.
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * An observation exists to have a value, though it may not if it is in error, or it represents a group of observations.
    */
  var valueDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * An observation exists to have a value, though it may not if it is in error, or it represents a group of observations.
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * An observation exists to have a value, though it may not if it is in error, or it represents a group of observations.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * An observation exists to have a value, though it may not if it is in error, or it represents a group of observations.
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  
  /**
    * An observation exists to have a value, though it may not if it is in error, or it represents a group of observations.
    */
  var valueRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * An observation exists to have a value, though it may not if it is in error, or it represents a group of observations.
    */
  var valueSampledData: js.UndefOr[SampledData] = js.undefined
  
  /**
    * An observation exists to have a value, though it may not if it is in error, or it represents a group of observations.
    */
  var valueString: js.UndefOr[String] = js.undefined
  
  /**
    * An observation exists to have a value, though it may not if it is in error, or it represents a group of observations.
    */
  var valueTime: js.UndefOr[String] = js.undefined
}
object Observation {
  
  inline def apply(
    code: CodeableConcept,
    status: registered | preliminary | `final` | amended | cancelled | `entered-in-error` | unknown
  ): Observation = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "Observation", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Observation] (val x: Self) extends AnyVal {
    
    inline def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setComponent(value: js.Array[ObservationComponent]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setComponentVarargs(value: ObservationComponent*): Self = StObject.set(x, "component", js.Array(value*))
    
    inline def setDataAbsentReason(value: CodeableConcept): Self = StObject.set(x, "dataAbsentReason", value.asInstanceOf[js.Any])
    
    inline def setDataAbsentReasonUndefined: Self = StObject.set(x, "dataAbsentReason", js.undefined)
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setEffectiveDateTime(value: String): Self = StObject.set(x, "effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDateTimeUndefined: Self = StObject.set(x, "effectiveDateTime", js.undefined)
    
    inline def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
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
    
    inline def setStatus(value: registered | preliminary | `final` | amended | cancelled | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setValueAttachment(value: Attachment): Self = StObject.set(x, "valueAttachment", value.asInstanceOf[js.Any])
    
    inline def setValueAttachmentUndefined: Self = StObject.set(x, "valueAttachment", js.undefined)
    
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
    
    inline def set_comments(value: Element): Self = StObject.set(x, "_comments", value.asInstanceOf[js.Any])
    
    inline def set_commentsUndefined: Self = StObject.set(x, "_comments", js.undefined)
    
    inline def set_effectiveDateTime(value: Element): Self = StObject.set(x, "_effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def set_effectiveDateTimeUndefined: Self = StObject.set(x, "_effectiveDateTime", js.undefined)
    
    inline def set_issued(value: Element): Self = StObject.set(x, "_issued", value.asInstanceOf[js.Any])
    
    inline def set_issuedUndefined: Self = StObject.set(x, "_issued", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_valueDateTime(value: Element): Self = StObject.set(x, "_valueDateTime", value.asInstanceOf[js.Any])
    
    inline def set_valueDateTimeUndefined: Self = StObject.set(x, "_valueDateTime", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
    
    inline def set_valueTime(value: Element): Self = StObject.set(x, "_valueTime", value.asInstanceOf[js.Any])
    
    inline def set_valueTimeUndefined: Self = StObject.set(x, "_valueTime", js.undefined)
  }
}
