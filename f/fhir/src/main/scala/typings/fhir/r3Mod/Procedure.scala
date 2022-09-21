package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.aborted
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.preparation
import typings.fhir.fhirStrings.suspended
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Procedure
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _notDone: js.UndefOr[Element] = js.undefined
  
  var _performedDateTime: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * A reference to a resource that contains details of the request for this procedure.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
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
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * If complications are only expressed by the narrative text, they can be captured using the CodeableConcept.text.
    */
  var complication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Any complications that occurred during the procedure, or in the immediate post-performance period.
    */
  var complicationDetail: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The encounter during which the procedure was performed.
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * A protocol, guideline, orderset or other definition that was adhered to in whole or in part by this procedure.
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
    */
  var focalDevice: js.UndefOr[js.Array[ProcedureFocalDevice]] = js.undefined
  
  /**
    * If the procedure required specific follow up - e.g. removal of sutures. The followup may be represented as a simple note, or could potentially be more complex in which case the CarePlan resource can be used.
    */
  var followUp: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * This records identifiers associated with this procedure that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * If true, it means the procedure did not occur as described.  Typically it would be accompanied by attributes describing the type of activity.  It might also be accompanied by body site information or time information (i.e. no procedure was done to the left arm or no procedure was done in this 2-year period).  Specifying additional information such as performer, outcome, etc. is generally inappropriate.  For example, it's not that useful to say "There was no appendectomy done at 12:03pm June 6th by Dr. Smith with a successful outcome" as it implies that there *could* have been an appendectomy done at any other time, by any other clinician or with any other outcome.
    * This element is labeled as a modifier because it indicates that a procedure didn't happen.
    */
  var notDone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A code indicating why the procedure was not performed.
    */
  var notDoneReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Any other notes about the procedure.  E.g. the operative notes.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * If outcome contains narrative text only, it can be captured using the CodeableConcept.text.
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The MedicationAdministration has a partOf reference to Procedure, but this is not a circular reference.  For a surgical procedure, the anesthesia related medicationAdministration is part of the procedure.  For an IV medication administration,  the procedure to insert the IV port is part of the medication administration.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
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
    * The coded reason why the procedure was performed. This may be coded entity of some type, or may simply be present as text.
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * e.g. endoscopy for dilatation and biopsy, combination diagnosis and therapeutic.
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * There could potentially be multiple reports - e.g. if this was a procedure which took multiple biopsies resulting in a number of anatomical pathology reports.
    */
  var report: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Procedure: typings.fhir.fhirStrings.Procedure
  
  /**
    * The unknown code is not to be used to convey other statuses.  The unknown code should be used when one of the statuses applies, but the authoring system doesn't know the current state of the procedure.
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: preparation | `in-progress` | suspended | aborted | completed | `entered-in-error` | unknown
  
  /**
    * The person, animal or group on which the procedure was performed.
    */
  var subject: Reference
  
  /**
    * For devices actually implanted or removed, use Procedure.device.
    */
  var usedCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * For devices actually implanted or removed, use Procedure.device.
    */
  var usedReference: js.UndefOr[js.Array[Reference]] = js.undefined
}
object Procedure {
  
  inline def apply(
    status: preparation | `in-progress` | suspended | aborted | completed | `entered-in-error` | unknown,
    subject: Reference
  ): Procedure = {
    val __obj = js.Dynamic.literal(resourceType = "Procedure", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Procedure]
  }
  
  extension [Self <: Procedure](x: Self) {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setBodySite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setBodySiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "bodySite", js.Array(value*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setComplication(value: js.Array[CodeableConcept]): Self = StObject.set(x, "complication", value.asInstanceOf[js.Any])
    
    inline def setComplicationDetail(value: js.Array[Reference]): Self = StObject.set(x, "complicationDetail", value.asInstanceOf[js.Any])
    
    inline def setComplicationDetailUndefined: Self = StObject.set(x, "complicationDetail", js.undefined)
    
    inline def setComplicationDetailVarargs(value: Reference*): Self = StObject.set(x, "complicationDetail", js.Array(value*))
    
    inline def setComplicationUndefined: Self = StObject.set(x, "complication", js.undefined)
    
    inline def setComplicationVarargs(value: CodeableConcept*): Self = StObject.set(x, "complication", js.Array(value*))
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDefinition(value: js.Array[Reference]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDefinitionVarargs(value: Reference*): Self = StObject.set(x, "definition", js.Array(value*))
    
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
    
    inline def setNotDone(value: Boolean): Self = StObject.set(x, "notDone", value.asInstanceOf[js.Any])
    
    inline def setNotDoneReason(value: CodeableConcept): Self = StObject.set(x, "notDoneReason", value.asInstanceOf[js.Any])
    
    inline def setNotDoneReasonUndefined: Self = StObject.set(x, "notDoneReason", js.undefined)
    
    inline def setNotDoneUndefined: Self = StObject.set(x, "notDone", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setPerformedDateTime(value: String): Self = StObject.set(x, "performedDateTime", value.asInstanceOf[js.Any])
    
    inline def setPerformedDateTimeUndefined: Self = StObject.set(x, "performedDateTime", js.undefined)
    
    inline def setPerformedPeriod(value: Period): Self = StObject.set(x, "performedPeriod", value.asInstanceOf[js.Any])
    
    inline def setPerformedPeriodUndefined: Self = StObject.set(x, "performedPeriod", js.undefined)
    
    inline def setPerformer(value: js.Array[ProcedurePerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: ProcedurePerformer*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value*))
    
    inline def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value*))
    
    inline def setReport(value: js.Array[Reference]): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    
    inline def setReportVarargs(value: Reference*): Self = StObject.set(x, "report", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Procedure): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: preparation | `in-progress` | suspended | aborted | completed | `entered-in-error` | unknown
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setUsedCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "usedCode", value.asInstanceOf[js.Any])
    
    inline def setUsedCodeUndefined: Self = StObject.set(x, "usedCode", js.undefined)
    
    inline def setUsedCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "usedCode", js.Array(value*))
    
    inline def setUsedReference(value: js.Array[Reference]): Self = StObject.set(x, "usedReference", value.asInstanceOf[js.Any])
    
    inline def setUsedReferenceUndefined: Self = StObject.set(x, "usedReference", js.undefined)
    
    inline def setUsedReferenceVarargs(value: Reference*): Self = StObject.set(x, "usedReference", js.Array(value*))
    
    inline def set_notDone(value: Element): Self = StObject.set(x, "_notDone", value.asInstanceOf[js.Any])
    
    inline def set_notDoneUndefined: Self = StObject.set(x, "_notDone", js.undefined)
    
    inline def set_performedDateTime(value: Element): Self = StObject.set(x, "_performedDateTime", value.asInstanceOf[js.Any])
    
    inline def set_performedDateTimeUndefined: Self = StObject.set(x, "_performedDateTime", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
