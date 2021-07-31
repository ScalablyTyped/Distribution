package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Measurements and simple assertions
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Observation
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueTime'.
    */
  var _valueTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Fulfills plan, proposal or order
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Observed body part
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Classification of  type of observation
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Type of observation (code / type)
    */
  var code: CodeableConcept
  
  /**
    * Comments about result
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Component results
    */
  var component: js.UndefOr[js.Array[ObservationComponent]] = js.undefined
  
  /**
    * Healthcare event during which this observation is made
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Why the result is missing
    */
  var dataAbsentReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * (Measurement) Device
    */
  var device: js.UndefOr[Reference] = js.undefined
  
  /**
    * Clinically relevant time/time-period for observation
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Clinically relevant time/time-period for observation
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Business Identifier for observation
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * High, low, normal, etc.
    */
  var interpretation: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Date/Time this was made available
    */
  var issued: js.UndefOr[instant] = js.undefined
  
  /**
    * How it was done
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Who is responsible for the observation
    */
  var performer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Provides guide for interpretation
    */
  var referenceRange: js.UndefOr[js.Array[ObservationReferenceRange]] = js.undefined
  
  /**
    * Resource related to this observation
    */
  var related: js.UndefOr[js.Array[ObservationRelated]] = js.undefined
  
  /**
    * Specimen used for this observation
    */
  var specimen: js.UndefOr[Reference] = js.undefined
  
  /**
    * registered | preliminary | final | amended +
    */
  var status: code
  
  /**
    * Who and/or what this is about
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Actual result
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Actual result
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Actual result
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Actual result
    */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Actual result
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Actual result
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Actual result
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Actual result
    */
  var valueRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * Actual result
    */
  var valueSampledData: js.UndefOr[SampledData] = js.undefined
  
  /**
    * Actual result
    */
  var valueString: js.UndefOr[String] = js.undefined
  
  /**
    * Actual result
    */
  var valueTime: js.UndefOr[time] = js.undefined
}
object Observation {
  
  @scala.inline
  def apply(code: CodeableConcept, status: code): Observation = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observation]
  }
  
  @scala.inline
  implicit class ObservationMutableBuilder[Self <: Observation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    @scala.inline
    def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value :_*))
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setComponent(value: js.Array[ObservationComponent]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setComponentVarargs(value: ObservationComponent*): Self = StObject.set(x, "component", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDataAbsentReason(value: CodeableConcept): Self = StObject.set(x, "dataAbsentReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAbsentReasonUndefined: Self = StObject.set(x, "dataAbsentReason", js.undefined)
    
    @scala.inline
    def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setEffectiveDateTime(value: dateTime): Self = StObject.set(x, "effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveDateTimeUndefined: Self = StObject.set(x, "effectiveDateTime", js.undefined)
    
    @scala.inline
    def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setInterpretation(value: CodeableConcept): Self = StObject.set(x, "interpretation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpretationUndefined: Self = StObject.set(x, "interpretation", js.undefined)
    
    @scala.inline
    def setIssued(value: instant): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    @scala.inline
    def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setPerformer(value: js.Array[Reference]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    @scala.inline
    def setPerformerVarargs(value: Reference*): Self = StObject.set(x, "performer", js.Array(value :_*))
    
    @scala.inline
    def setReferenceRange(value: js.Array[ObservationReferenceRange]): Self = StObject.set(x, "referenceRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceRangeUndefined: Self = StObject.set(x, "referenceRange", js.undefined)
    
    @scala.inline
    def setReferenceRangeVarargs(value: ObservationReferenceRange*): Self = StObject.set(x, "referenceRange", js.Array(value :_*))
    
    @scala.inline
    def setRelated(value: js.Array[ObservationRelated]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    @scala.inline
    def setRelatedVarargs(value: ObservationRelated*): Self = StObject.set(x, "related", js.Array(value :_*))
    
    @scala.inline
    def setSpecimen(value: Reference): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setValueAttachment(value: Attachment): Self = StObject.set(x, "valueAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAttachmentUndefined: Self = StObject.set(x, "valueAttachment", js.undefined)
    
    @scala.inline
    def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    @scala.inline
    def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    @scala.inline
    def setValueDateTime(value: dateTime): Self = StObject.set(x, "valueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDateTimeUndefined: Self = StObject.set(x, "valueDateTime", js.undefined)
    
    @scala.inline
    def setValuePeriod(value: Period): Self = StObject.set(x, "valuePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuePeriodUndefined: Self = StObject.set(x, "valuePeriod", js.undefined)
    
    @scala.inline
    def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    @scala.inline
    def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    @scala.inline
    def setValueRatio(value: Ratio): Self = StObject.set(x, "valueRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRatioUndefined: Self = StObject.set(x, "valueRatio", js.undefined)
    
    @scala.inline
    def setValueSampledData(value: SampledData): Self = StObject.set(x, "valueSampledData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSampledDataUndefined: Self = StObject.set(x, "valueSampledData", js.undefined)
    
    @scala.inline
    def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    @scala.inline
    def setValueTime(value: time): Self = StObject.set(x, "valueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTimeUndefined: Self = StObject.set(x, "valueTime", js.undefined)
    
    @scala.inline
    def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    @scala.inline
    def set_effectiveDateTime(value: Element): Self = StObject.set(x, "_effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_effectiveDateTimeUndefined: Self = StObject.set(x, "_effectiveDateTime", js.undefined)
    
    @scala.inline
    def set_issued(value: Element): Self = StObject.set(x, "_issued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_issuedUndefined: Self = StObject.set(x, "_issued", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
    
    @scala.inline
    def set_valueDateTime(value: Element): Self = StObject.set(x, "_valueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueDateTimeUndefined: Self = StObject.set(x, "_valueDateTime", js.undefined)
    
    @scala.inline
    def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
    
    @scala.inline
    def set_valueTime(value: Element): Self = StObject.set(x, "_valueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueTimeUndefined: Self = StObject.set(x, "_valueTime", js.undefined)
  }
}
