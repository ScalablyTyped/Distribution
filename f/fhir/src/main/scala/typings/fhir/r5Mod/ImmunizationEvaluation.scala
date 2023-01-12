package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.completed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmunizationEvaluation
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _doseNumber: js.UndefOr[Element] = js.undefined
  
  var _series: js.UndefOr[Element] = js.undefined
  
  var _seriesDoses: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates the authority who published the protocol (e.g. ACIP).
    */
  var authority: js.UndefOr[Reference] = js.undefined
  
  /**
    * The date the evaluation of the vaccine administration event was performed.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Additional information about the evaluation.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The use of an integer is preferred if known. A string should only be used in cases where an integer is not available (such as when documenting a recurring booster dose).
    */
  var doseNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if the dose is valid or not valid with respect to the published recommendations.
    */
  var doseStatus: CodeableConcept
  
  /**
    * Provides an explanation as to why the vaccine administration event is valid or not relative to the published recommendations.
    */
  var doseStatusReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A unique identifier assigned to this immunization evaluation record.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The vaccine administration event being evaluated.
    */
  var immunizationEvent: Reference
  
  /**
    * The individual for whom the evaluation is being done.
    */
  var patient: Reference
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ImmunizationEvaluation: typings.fhir.fhirStrings.ImmunizationEvaluation
  
  /**
    * One possible path to achieve presumed immunity against a disease - within the context of an authority.
    */
  var series: js.UndefOr[String] = js.undefined
  
  /**
    * The use of an integer is preferred if known.
    */
  var seriesDoses: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the current status of the evaluation of the vaccination administration event.
    */
  var status: completed | `entered-in-error`
  
  /**
    * The vaccine preventable disease the dose is being evaluated against.
    */
  var targetDisease: CodeableConcept
}
object ImmunizationEvaluation {
  
  inline def apply(
    doseStatus: CodeableConcept,
    immunizationEvent: Reference,
    patient: Reference,
    status: completed | `entered-in-error`,
    targetDisease: CodeableConcept
  ): ImmunizationEvaluation = {
    val __obj = js.Dynamic.literal(doseStatus = doseStatus.asInstanceOf[js.Any], immunizationEvent = immunizationEvent.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], resourceType = "ImmunizationEvaluation", status = status.asInstanceOf[js.Any], targetDisease = targetDisease.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationEvaluation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImmunizationEvaluation] (val x: Self) extends AnyVal {
    
    inline def setAuthority(value: Reference): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDoseNumber(value: String): Self = StObject.set(x, "doseNumber", value.asInstanceOf[js.Any])
    
    inline def setDoseNumberUndefined: Self = StObject.set(x, "doseNumber", js.undefined)
    
    inline def setDoseStatus(value: CodeableConcept): Self = StObject.set(x, "doseStatus", value.asInstanceOf[js.Any])
    
    inline def setDoseStatusReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "doseStatusReason", value.asInstanceOf[js.Any])
    
    inline def setDoseStatusReasonUndefined: Self = StObject.set(x, "doseStatusReason", js.undefined)
    
    inline def setDoseStatusReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "doseStatusReason", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setImmunizationEvent(value: Reference): Self = StObject.set(x, "immunizationEvent", value.asInstanceOf[js.Any])
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ImmunizationEvaluation): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesDoses(value: String): Self = StObject.set(x, "seriesDoses", value.asInstanceOf[js.Any])
    
    inline def setSeriesDosesUndefined: Self = StObject.set(x, "seriesDoses", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setStatus(value: completed | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTargetDisease(value: CodeableConcept): Self = StObject.set(x, "targetDisease", value.asInstanceOf[js.Any])
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_doseNumber(value: Element): Self = StObject.set(x, "_doseNumber", value.asInstanceOf[js.Any])
    
    inline def set_doseNumberUndefined: Self = StObject.set(x, "_doseNumber", js.undefined)
    
    inline def set_series(value: Element): Self = StObject.set(x, "_series", value.asInstanceOf[js.Any])
    
    inline def set_seriesDoses(value: Element): Self = StObject.set(x, "_seriesDoses", value.asInstanceOf[js.Any])
    
    inline def set_seriesDosesUndefined: Self = StObject.set(x, "_seriesDoses", js.undefined)
    
    inline def set_seriesUndefined: Self = StObject.set(x, "_series", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
