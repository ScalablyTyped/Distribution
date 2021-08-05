package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An action that is being or was performed on a patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Procedure
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'notDone'.
    */
  var _notDone: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'performedDateTime'.
    */
  var _performedDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * A request for this procedure
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Target body sites
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Classification of the procedure
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identification of the procedure
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Complication following the procedure
    */
  var complication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A condition that is a result of the procedure
    */
  var complicationDetail: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Encounter or episode associated with the procedure
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Device changed in procedure
    */
  var focalDevice: js.UndefOr[js.Array[ProcedureFocalDevice]] = js.undefined
  
  /**
    * Instructions for follow up
    */
  var followUp: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * External Identifiers for this procedure
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Where the procedure happened
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * True if procedure was not performed as scheduled
    */
  var notDone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Reason procedure was not performed
    */
  var notDoneReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Additional information about the procedure
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The result of procedure
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Part of referenced event
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Date/Period the procedure was performed
    */
  var performedDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Date/Period the procedure was performed
    */
  var performedPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The people who performed the procedure
    */
  var performer: js.UndefOr[js.Array[ProcedurePerformer]] = js.undefined
  
  /**
    * Coded reason procedure performed
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Condition that is the reason the procedure performed
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Any report resulting from the procedure
    */
  var report: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * preparation | in-progress | suspended | aborted | completed | entered-in-error | unknown
    */
  var status: code
  
  /**
    * Who the procedure was performed on
    */
  var subject: Reference
  
  /**
    * Coded items used during the procedure
    */
  var usedCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Items used during procedure
    */
  var usedReference: js.UndefOr[js.Array[Reference]] = js.undefined
}
object Procedure {
  
  inline def apply(status: code, subject: Reference): Procedure = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Procedure]
  }
  
  extension [Self <: Procedure](x: Self) {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    inline def setBodySite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setBodySiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "bodySite", js.Array(value :_*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setComplication(value: js.Array[CodeableConcept]): Self = StObject.set(x, "complication", value.asInstanceOf[js.Any])
    
    inline def setComplicationDetail(value: js.Array[Reference]): Self = StObject.set(x, "complicationDetail", value.asInstanceOf[js.Any])
    
    inline def setComplicationDetailUndefined: Self = StObject.set(x, "complicationDetail", js.undefined)
    
    inline def setComplicationDetailVarargs(value: Reference*): Self = StObject.set(x, "complicationDetail", js.Array(value :_*))
    
    inline def setComplicationUndefined: Self = StObject.set(x, "complication", js.undefined)
    
    inline def setComplicationVarargs(value: CodeableConcept*): Self = StObject.set(x, "complication", js.Array(value :_*))
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDefinition(value: js.Array[Reference]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDefinitionVarargs(value: Reference*): Self = StObject.set(x, "definition", js.Array(value :_*))
    
    inline def setFocalDevice(value: js.Array[ProcedureFocalDevice]): Self = StObject.set(x, "focalDevice", value.asInstanceOf[js.Any])
    
    inline def setFocalDeviceUndefined: Self = StObject.set(x, "focalDevice", js.undefined)
    
    inline def setFocalDeviceVarargs(value: ProcedureFocalDevice*): Self = StObject.set(x, "focalDevice", js.Array(value :_*))
    
    inline def setFollowUp(value: js.Array[CodeableConcept]): Self = StObject.set(x, "followUp", value.asInstanceOf[js.Any])
    
    inline def setFollowUpUndefined: Self = StObject.set(x, "followUp", js.undefined)
    
    inline def setFollowUpVarargs(value: CodeableConcept*): Self = StObject.set(x, "followUp", js.Array(value :_*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNotDone(value: Boolean): Self = StObject.set(x, "notDone", value.asInstanceOf[js.Any])
    
    inline def setNotDoneReason(value: CodeableConcept): Self = StObject.set(x, "notDoneReason", value.asInstanceOf[js.Any])
    
    inline def setNotDoneReasonUndefined: Self = StObject.set(x, "notDoneReason", js.undefined)
    
    inline def setNotDoneUndefined: Self = StObject.set(x, "notDone", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value :_*))
    
    inline def setPerformedDateTime(value: dateTime): Self = StObject.set(x, "performedDateTime", value.asInstanceOf[js.Any])
    
    inline def setPerformedDateTimeUndefined: Self = StObject.set(x, "performedDateTime", js.undefined)
    
    inline def setPerformedPeriod(value: Period): Self = StObject.set(x, "performedPeriod", value.asInstanceOf[js.Any])
    
    inline def setPerformedPeriodUndefined: Self = StObject.set(x, "performedPeriod", js.undefined)
    
    inline def setPerformer(value: js.Array[ProcedurePerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: ProcedurePerformer*): Self = StObject.set(x, "performer", js.Array(value :_*))
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value :_*))
    
    inline def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value :_*))
    
    inline def setReport(value: js.Array[Reference]): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    
    inline def setReportVarargs(value: Reference*): Self = StObject.set(x, "report", js.Array(value :_*))
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setUsedCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "usedCode", value.asInstanceOf[js.Any])
    
    inline def setUsedCodeUndefined: Self = StObject.set(x, "usedCode", js.undefined)
    
    inline def setUsedCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "usedCode", js.Array(value :_*))
    
    inline def setUsedReference(value: js.Array[Reference]): Self = StObject.set(x, "usedReference", value.asInstanceOf[js.Any])
    
    inline def setUsedReferenceUndefined: Self = StObject.set(x, "usedReference", js.undefined)
    
    inline def setUsedReferenceVarargs(value: Reference*): Self = StObject.set(x, "usedReference", js.Array(value :_*))
    
    inline def set_notDone(value: Element): Self = StObject.set(x, "_notDone", value.asInstanceOf[js.Any])
    
    inline def set_notDoneUndefined: Self = StObject.set(x, "_notDone", js.undefined)
    
    inline def set_performedDateTime(value: Element): Self = StObject.set(x, "_performedDateTime", value.asInstanceOf[js.Any])
    
    inline def set_performedDateTimeUndefined: Self = StObject.set(x, "_performedDateTime", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
