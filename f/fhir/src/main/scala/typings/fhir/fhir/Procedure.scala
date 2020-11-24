package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An action that is being or was performed on a patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Procedure extends DomainResource {
  
  /**
    * Contains extended information for property 'notDone'.
    */
  var _notDone: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'performedDateTime'.
    */
  var _performedDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * A request for this procedure
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Target body sites
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Classification of the procedure
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Identification of the procedure
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Complication following the procedure
    */
  var complication: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * A condition that is a result of the procedure
    */
  var complicationDetail: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Encounter or episode associated with the procedure
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Device changed in procedure
    */
  var focalDevice: js.UndefOr[js.Array[ProcedureFocalDevice]] = js.native
  
  /**
    * Instructions for follow up
    */
  var followUp: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * External Identifiers for this procedure
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Where the procedure happened
    */
  var location: js.UndefOr[Reference] = js.native
  
  /**
    * True if procedure was not performed as scheduled
    */
  var notDone: js.UndefOr[Boolean] = js.native
  
  /**
    * Reason procedure was not performed
    */
  var notDoneReason: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Additional information about the procedure
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * The result of procedure
    */
  var outcome: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Part of referenced event
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Date/Period the procedure was performed
    */
  var performedDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Date/Period the procedure was performed
    */
  var performedPeriod: js.UndefOr[Period] = js.native
  
  /**
    * The people who performed the procedure
    */
  var performer: js.UndefOr[js.Array[ProcedurePerformer]] = js.native
  
  /**
    * Coded reason procedure performed
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Condition that is the reason the procedure performed
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Any report resulting from the procedure
    */
  var report: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * preparation | in-progress | suspended | aborted | completed | entered-in-error | unknown
    */
  var status: code = js.native
  
  /**
    * Who the procedure was performed on
    */
  var subject: Reference = js.native
  
  /**
    * Coded items used during the procedure
    */
  var usedCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Items used during procedure
    */
  var usedReference: js.UndefOr[js.Array[Reference]] = js.native
}
object Procedure {
  
  @scala.inline
  def apply(status: code, subject: Reference): Procedure = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Procedure]
  }
  
  @scala.inline
  implicit class ProcedureOps[Self <: Procedure] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_notDone(value: Element): Self = this.set("_notDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_notDone: Self = this.set("_notDone", js.undefined)
    
    @scala.inline
    def set_performedDateTime(value: Element): Self = this.set("_performedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_performedDateTime: Self = this.set("_performedDateTime", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = this.set("basedOn", js.Array(value :_*))
    
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = this.set("basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasedOn: Self = this.set("basedOn", js.undefined)
    
    @scala.inline
    def setBodySiteVarargs(value: CodeableConcept*): Self = this.set("bodySite", js.Array(value :_*))
    
    @scala.inline
    def setBodySite(value: js.Array[CodeableConcept]): Self = this.set("bodySite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodySite: Self = this.set("bodySite", js.undefined)
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setComplicationVarargs(value: CodeableConcept*): Self = this.set("complication", js.Array(value :_*))
    
    @scala.inline
    def setComplication(value: js.Array[CodeableConcept]): Self = this.set("complication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplication: Self = this.set("complication", js.undefined)
    
    @scala.inline
    def setComplicationDetailVarargs(value: Reference*): Self = this.set("complicationDetail", js.Array(value :_*))
    
    @scala.inline
    def setComplicationDetail(value: js.Array[Reference]): Self = this.set("complicationDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplicationDetail: Self = this.set("complicationDetail", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDefinitionVarargs(value: Reference*): Self = this.set("definition", js.Array(value :_*))
    
    @scala.inline
    def setDefinition(value: js.Array[Reference]): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    
    @scala.inline
    def setFocalDeviceVarargs(value: ProcedureFocalDevice*): Self = this.set("focalDevice", js.Array(value :_*))
    
    @scala.inline
    def setFocalDevice(value: js.Array[ProcedureFocalDevice]): Self = this.set("focalDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocalDevice: Self = this.set("focalDevice", js.undefined)
    
    @scala.inline
    def setFollowUpVarargs(value: CodeableConcept*): Self = this.set("followUp", js.Array(value :_*))
    
    @scala.inline
    def setFollowUp(value: js.Array[CodeableConcept]): Self = this.set("followUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowUp: Self = this.set("followUp", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setLocation(value: Reference): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setNotDone(value: Boolean): Self = this.set("notDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotDone: Self = this.set("notDone", js.undefined)
    
    @scala.inline
    def setNotDoneReason(value: CodeableConcept): Self = this.set("notDoneReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotDoneReason: Self = this.set("notDoneReason", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setOutcome(value: CodeableConcept): Self = this.set("outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutcome: Self = this.set("outcome", js.undefined)
    
    @scala.inline
    def setPartOfVarargs(value: Reference*): Self = this.set("partOf", js.Array(value :_*))
    
    @scala.inline
    def setPartOf(value: js.Array[Reference]): Self = this.set("partOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartOf: Self = this.set("partOf", js.undefined)
    
    @scala.inline
    def setPerformedDateTime(value: dateTime): Self = this.set("performedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformedDateTime: Self = this.set("performedDateTime", js.undefined)
    
    @scala.inline
    def setPerformedPeriod(value: Period): Self = this.set("performedPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformedPeriod: Self = this.set("performedPeriod", js.undefined)
    
    @scala.inline
    def setPerformerVarargs(value: ProcedurePerformer*): Self = this.set("performer", js.Array(value :_*))
    
    @scala.inline
    def setPerformer(value: js.Array[ProcedurePerformer]): Self = this.set("performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformer: Self = this.set("performer", js.undefined)
    
    @scala.inline
    def setReasonCodeVarargs(value: CodeableConcept*): Self = this.set("reasonCode", js.Array(value :_*))
    
    @scala.inline
    def setReasonCode(value: js.Array[CodeableConcept]): Self = this.set("reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonCode: Self = this.set("reasonCode", js.undefined)
    
    @scala.inline
    def setReasonReferenceVarargs(value: Reference*): Self = this.set("reasonReference", js.Array(value :_*))
    
    @scala.inline
    def setReasonReference(value: js.Array[Reference]): Self = this.set("reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonReference: Self = this.set("reasonReference", js.undefined)
    
    @scala.inline
    def setReportVarargs(value: Reference*): Self = this.set("report", js.Array(value :_*))
    
    @scala.inline
    def setReport(value: js.Array[Reference]): Self = this.set("report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReport: Self = this.set("report", js.undefined)
    
    @scala.inline
    def setUsedCodeVarargs(value: CodeableConcept*): Self = this.set("usedCode", js.Array(value :_*))
    
    @scala.inline
    def setUsedCode(value: js.Array[CodeableConcept]): Self = this.set("usedCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsedCode: Self = this.set("usedCode", js.undefined)
    
    @scala.inline
    def setUsedReferenceVarargs(value: Reference*): Self = this.set("usedReference", js.Array(value :_*))
    
    @scala.inline
    def setUsedReference(value: js.Array[Reference]): Self = this.set("usedReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsedReference: Self = this.set("usedReference", js.undefined)
  }
}
