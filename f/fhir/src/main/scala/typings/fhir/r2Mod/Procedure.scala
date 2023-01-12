package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.aborted
import typings.fhir.fhirStrings.completed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Procedure
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _notPerformed: js.UndefOr[Element] = js.undefined
  
  var _performedDateTime: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion.
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A code that classifies the procedure for searching, sorting and display purposes (e.g. "Surgical Procedure").
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g. "Laparoscopic Appendectomy").
    */
  var code: CodeableConcept
  
  /**
    * Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues.
    */
  var complication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The encounter during which the procedure was performed.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
    */
  var focalDevice: js.UndefOr[js.Array[ProcedureFocalDevice]] = js.undefined
  
  /**
    * If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or could potentially be more complex in which case the CarePlan resource can be used.
    */
  var followUp: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Need to allow connection to a wider workflow.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Ties a procedure to where the records are likely kept.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * Set this to true if the record is saying that the procedure was NOT performed.
    */
  var notPerformed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Any other notes about the procedure.  E.g. the operative notes.
    */
  var notes: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The outcome of the procedure - did it resolve reasons for the procedure being performed?
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
    */
  var performedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date(time)/period over which the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
    */
  var performedPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Limited to 'real' people rather than equipment.
    */
  var performer: js.UndefOr[js.Array[ProcedurePerformer]] = js.undefined
  
  /**
    * The reason why the procedure was performed. This may be due to a Condition, may be coded entity of some type, or may simply be present as text.
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A code indicating why the procedure was not performed.
    */
  var reasonNotPerformed: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The reason why the procedure was performed. This may be due to a Condition, may be coded entity of some type, or may simply be present as text.
    */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * This could be a histology result, pathology report, surgical report, etc..
    */
  var report: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A reference to a resource that contains details of the request for this procedure.
    */
  var request: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Procedure: typings.fhir.fhirStrings.Procedure
  
  /**
    * A code specifying the state of the procedure. Generally this will be in-progress or completed state.
    */
  var status: `in-progress` | aborted | completed | `entered-in-error`
  
  /**
    * The person, animal or group on which the procedure was performed.
    */
  var subject: Reference
  
  /**
    * Used for tracking contamination, etc.
    */
  var used: js.UndefOr[js.Array[Reference]] = js.undefined
}
object Procedure {
  
  inline def apply(
    code: CodeableConcept,
    status: `in-progress` | aborted | completed | `entered-in-error`,
    subject: Reference
  ): Procedure = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "Procedure", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Procedure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Procedure] (val x: Self) extends AnyVal {
    
    inline def setBodySite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setBodySiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "bodySite", js.Array(value*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setComplication(value: js.Array[CodeableConcept]): Self = StObject.set(x, "complication", value.asInstanceOf[js.Any])
    
    inline def setComplicationUndefined: Self = StObject.set(x, "complication", js.undefined)
    
    inline def setComplicationVarargs(value: CodeableConcept*): Self = StObject.set(x, "complication", js.Array(value*))
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setFocalDevice(value: js.Array[ProcedureFocalDevice]): Self = StObject.set(x, "focalDevice", value.asInstanceOf[js.Any])
    
    inline def setFocalDeviceUndefined: Self = StObject.set(x, "focalDevice", js.undefined)
    
    inline def setFocalDeviceVarargs(value: ProcedureFocalDevice*): Self = StObject.set(x, "focalDevice", js.Array(value*))
    
    inline def setFollowUp(value: js.Array[CodeableConcept]): Self = StObject.set(x, "followUp", value.asInstanceOf[js.Any])
    
    inline def setFollowUpUndefined: Self = StObject.set(x, "followUp", js.undefined)
    
    inline def setFollowUpVarargs(value: CodeableConcept*): Self = StObject.set(x, "followUp", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNotPerformed(value: Boolean): Self = StObject.set(x, "notPerformed", value.asInstanceOf[js.Any])
    
    inline def setNotPerformedUndefined: Self = StObject.set(x, "notPerformed", js.undefined)
    
    inline def setNotes(value: js.Array[Annotation]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: Annotation*): Self = StObject.set(x, "notes", js.Array(value*))
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setPerformedDateTime(value: String): Self = StObject.set(x, "performedDateTime", value.asInstanceOf[js.Any])
    
    inline def setPerformedDateTimeUndefined: Self = StObject.set(x, "performedDateTime", js.undefined)
    
    inline def setPerformedPeriod(value: Period): Self = StObject.set(x, "performedPeriod", value.asInstanceOf[js.Any])
    
    inline def setPerformedPeriodUndefined: Self = StObject.set(x, "performedPeriod", js.undefined)
    
    inline def setPerformer(value: js.Array[ProcedurePerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: ProcedurePerformer*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeableConceptUndefined: Self = StObject.set(x, "reasonCodeableConcept", js.undefined)
    
    inline def setReasonNotPerformed(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonNotPerformed", value.asInstanceOf[js.Any])
    
    inline def setReasonNotPerformedUndefined: Self = StObject.set(x, "reasonNotPerformed", js.undefined)
    
    inline def setReasonNotPerformedVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonNotPerformed", js.Array(value*))
    
    inline def setReasonReference(value: Reference): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setReport(value: js.Array[Reference]): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    
    inline def setReportVarargs(value: Reference*): Self = StObject.set(x, "report", js.Array(value*))
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Procedure): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: `in-progress` | aborted | completed | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setUsed(value: js.Array[Reference]): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    inline def setUsedUndefined: Self = StObject.set(x, "used", js.undefined)
    
    inline def setUsedVarargs(value: Reference*): Self = StObject.set(x, "used", js.Array(value*))
    
    inline def set_notPerformed(value: Element): Self = StObject.set(x, "_notPerformed", value.asInstanceOf[js.Any])
    
    inline def set_notPerformedUndefined: Self = StObject.set(x, "_notPerformed", js.undefined)
    
    inline def set_performedDateTime(value: Element): Self = StObject.set(x, "_performedDateTime", value.asInstanceOf[js.Any])
    
    inline def set_performedDateTimeUndefined: Self = StObject.set(x, "_performedDateTime", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
