package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Measurements and simple assertions
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Observation extends DomainResource {
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueTime'.
    */
  var _valueTime: js.UndefOr[Element] = js.native
  
  /**
    * Fulfills plan, proposal or order
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Observed body part
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Classification of  type of observation
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Type of observation (code / type)
    */
  var code: CodeableConcept = js.native
  
  /**
    * Comments about result
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Component results
    */
  var component: js.UndefOr[js.Array[ObservationComponent]] = js.native
  
  /**
    * Healthcare event during which this observation is made
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * Why the result is missing
    */
  var dataAbsentReason: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * (Measurement) Device
    */
  var device: js.UndefOr[Reference] = js.native
  
  /**
    * Clinically relevant time/time-period for observation
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Clinically relevant time/time-period for observation
    */
  var effectivePeriod: js.UndefOr[Period] = js.native
  
  /**
    * Business Identifier for observation
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * High, low, normal, etc.
    */
  var interpretation: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Date/Time this was made available
    */
  var issued: js.UndefOr[instant] = js.native
  
  /**
    * How it was done
    */
  var method: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Who is responsible for the observation
    */
  var performer: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Provides guide for interpretation
    */
  var referenceRange: js.UndefOr[js.Array[ObservationReferenceRange]] = js.native
  
  /**
    * Resource related to this observation
    */
  var related: js.UndefOr[js.Array[ObservationRelated]] = js.native
  
  /**
    * Specimen used for this observation
    */
  var specimen: js.UndefOr[Reference] = js.native
  
  /**
    * registered | preliminary | final | amended +
    */
  var status: code = js.native
  
  /**
    * Who and/or what this is about
    */
  var subject: js.UndefOr[Reference] = js.native
  
  /**
    * Actual result
    */
  var valueAttachment: js.UndefOr[Attachment] = js.native
  
  /**
    * Actual result
    */
  var valueBoolean: js.UndefOr[Boolean] = js.native
  
  /**
    * Actual result
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Actual result
    */
  var valueDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Actual result
    */
  var valuePeriod: js.UndefOr[Period] = js.native
  
  /**
    * Actual result
    */
  var valueQuantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Actual result
    */
  var valueRange: js.UndefOr[Range] = js.native
  
  /**
    * Actual result
    */
  var valueRatio: js.UndefOr[Ratio] = js.native
  
  /**
    * Actual result
    */
  var valueSampledData: js.UndefOr[SampledData] = js.native
  
  /**
    * Actual result
    */
  var valueString: js.UndefOr[String] = js.native
  
  /**
    * Actual result
    */
  var valueTime: js.UndefOr[time] = js.native
}
object Observation {
  
  @scala.inline
  def apply(code: CodeableConcept, status: code): Observation = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observation]
  }
  
  @scala.inline
  implicit class ObservationOps[Self <: Observation] (val x: Self) extends AnyVal {
    
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
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_comment(value: Element): Self = this.set("_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_comment: Self = this.set("_comment", js.undefined)
    
    @scala.inline
    def set_effectiveDateTime(value: Element): Self = this.set("_effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_effectiveDateTime: Self = this.set("_effectiveDateTime", js.undefined)
    
    @scala.inline
    def set_issued(value: Element): Self = this.set("_issued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_issued: Self = this.set("_issued", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def set_valueBoolean(value: Element): Self = this.set("_valueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_valueBoolean: Self = this.set("_valueBoolean", js.undefined)
    
    @scala.inline
    def set_valueDateTime(value: Element): Self = this.set("_valueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_valueDateTime: Self = this.set("_valueDateTime", js.undefined)
    
    @scala.inline
    def set_valueString(value: Element): Self = this.set("_valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_valueString: Self = this.set("_valueString", js.undefined)
    
    @scala.inline
    def set_valueTime(value: Element): Self = this.set("_valueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_valueTime: Self = this.set("_valueTime", js.undefined)
    
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = this.set("basedOn", js.Array(value :_*))
    
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = this.set("basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasedOn: Self = this.set("basedOn", js.undefined)
    
    @scala.inline
    def setBodySite(value: CodeableConcept): Self = this.set("bodySite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodySite: Self = this.set("bodySite", js.undefined)
    
    @scala.inline
    def setCategoryVarargs(value: CodeableConcept*): Self = this.set("category", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setComponentVarargs(value: ObservationComponent*): Self = this.set("component", js.Array(value :_*))
    
    @scala.inline
    def setComponent(value: js.Array[ObservationComponent]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDataAbsentReason(value: CodeableConcept): Self = this.set("dataAbsentReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataAbsentReason: Self = this.set("dataAbsentReason", js.undefined)
    
    @scala.inline
    def setDevice(value: Reference): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setEffectiveDateTime(value: dateTime): Self = this.set("effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveDateTime: Self = this.set("effectiveDateTime", js.undefined)
    
    @scala.inline
    def setEffectivePeriod(value: Period): Self = this.set("effectivePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectivePeriod: Self = this.set("effectivePeriod", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setInterpretation(value: CodeableConcept): Self = this.set("interpretation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpretation: Self = this.set("interpretation", js.undefined)
    
    @scala.inline
    def setIssued(value: instant): Self = this.set("issued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssued: Self = this.set("issued", js.undefined)
    
    @scala.inline
    def setMethod(value: CodeableConcept): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPerformerVarargs(value: Reference*): Self = this.set("performer", js.Array(value :_*))
    
    @scala.inline
    def setPerformer(value: js.Array[Reference]): Self = this.set("performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformer: Self = this.set("performer", js.undefined)
    
    @scala.inline
    def setReferenceRangeVarargs(value: ObservationReferenceRange*): Self = this.set("referenceRange", js.Array(value :_*))
    
    @scala.inline
    def setReferenceRange(value: js.Array[ObservationReferenceRange]): Self = this.set("referenceRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceRange: Self = this.set("referenceRange", js.undefined)
    
    @scala.inline
    def setRelatedVarargs(value: ObservationRelated*): Self = this.set("related", js.Array(value :_*))
    
    @scala.inline
    def setRelated(value: js.Array[ObservationRelated]): Self = this.set("related", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelated: Self = this.set("related", js.undefined)
    
    @scala.inline
    def setSpecimen(value: Reference): Self = this.set("specimen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecimen: Self = this.set("specimen", js.undefined)
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setValueAttachment(value: Attachment): Self = this.set("valueAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueAttachment: Self = this.set("valueAttachment", js.undefined)
    
    @scala.inline
    def setValueBoolean(value: Boolean): Self = this.set("valueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueBoolean: Self = this.set("valueBoolean", js.undefined)
    
    @scala.inline
    def setValueCodeableConcept(value: CodeableConcept): Self = this.set("valueCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueCodeableConcept: Self = this.set("valueCodeableConcept", js.undefined)
    
    @scala.inline
    def setValueDateTime(value: dateTime): Self = this.set("valueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueDateTime: Self = this.set("valueDateTime", js.undefined)
    
    @scala.inline
    def setValuePeriod(value: Period): Self = this.set("valuePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuePeriod: Self = this.set("valuePeriod", js.undefined)
    
    @scala.inline
    def setValueQuantity(value: Quantity): Self = this.set("valueQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueQuantity: Self = this.set("valueQuantity", js.undefined)
    
    @scala.inline
    def setValueRange(value: Range): Self = this.set("valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueRange: Self = this.set("valueRange", js.undefined)
    
    @scala.inline
    def setValueRatio(value: Ratio): Self = this.set("valueRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueRatio: Self = this.set("valueRatio", js.undefined)
    
    @scala.inline
    def setValueSampledData(value: SampledData): Self = this.set("valueSampledData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueSampledData: Self = this.set("valueSampledData", js.undefined)
    
    @scala.inline
    def setValueString(value: String): Self = this.set("valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueString: Self = this.set("valueString", js.undefined)
    
    @scala.inline
    def setValueTime(value: time): Self = this.set("valueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueTime: Self = this.set("valueTime", js.undefined)
  }
}
