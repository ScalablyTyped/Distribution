package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request for a procedure or diagnostic to be performed
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ProcedureRequest extends DomainResource {
  
  /**
    * Contains extended information for property 'asNeededBoolean'.
    */
  var _asNeededBoolean: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'doNotPerform'.
    */
  var _doNotPerform: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'intent'.
    */
  var _intent: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Preconditions for procedure or diagnostic
    */
  var asNeededBoolean: js.UndefOr[Boolean] = js.native
  
  /**
    * Preconditions for procedure or diagnostic
    */
  var asNeededCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Date request signed
    */
  var authoredOn: js.UndefOr[dateTime] = js.native
  
  /**
    * What request fulfills
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Location on Body
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Classification of procedure
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * What is being requested/ordered
    */
  var code: CodeableConcept = js.native
  
  /**
    * Encounter or Episode during which request was created
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * Protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * True if procedure should not be performed
    */
  var doNotPerform: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifiers assigned to this order
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * proposal | plan | order +
    */
  var intent: code = js.native
  
  /**
    * Comments
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * When procedure should occur
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * When procedure should occur
    */
  var occurrencePeriod: js.UndefOr[Period] = js.native
  
  /**
    * When procedure should occur
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.native
  
  /**
    * Requested perfomer
    */
  var performer: js.UndefOr[Reference] = js.native
  
  /**
    * Performer role
    */
  var performerType: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * routine | urgent | asap | stat
    */
  var priority: js.UndefOr[code] = js.native
  
  /**
    * Explanation/Justification for test
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Explanation/Justification for test
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Request provenance
    */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * What request replaces
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Who/what is requesting procedure or diagnostic
    */
  var requester: js.UndefOr[ProcedureRequestRequester] = js.native
  
  /**
    * Composite Request ID
    */
  var requisition: js.UndefOr[Identifier] = js.native
  
  /**
    * Procedure Samples
    */
  var specimen: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * draft | active | suspended | completed | entered-in-error | cancelled
    */
  var status: code = js.native
  
  /**
    * Individual the service is ordered for
    */
  var subject: Reference = js.native
  
  /**
    * Additional clinical information
    */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.native
}
object ProcedureRequest {
  
  @scala.inline
  def apply(code: CodeableConcept, intent: code, status: code, subject: Reference): ProcedureRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureRequest]
  }
  
  @scala.inline
  implicit class ProcedureRequestOps[Self <: ProcedureRequest] (val x: Self) extends AnyVal {
    
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
    def setIntent(value: code): Self = this.set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_asNeededBoolean(value: Element): Self = this.set("_asNeededBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_asNeededBoolean: Self = this.set("_asNeededBoolean", js.undefined)
    
    @scala.inline
    def set_authoredOn(value: Element): Self = this.set("_authoredOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_authoredOn: Self = this.set("_authoredOn", js.undefined)
    
    @scala.inline
    def set_doNotPerform(value: Element): Self = this.set("_doNotPerform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_doNotPerform: Self = this.set("_doNotPerform", js.undefined)
    
    @scala.inline
    def set_intent(value: Element): Self = this.set("_intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_intent: Self = this.set("_intent", js.undefined)
    
    @scala.inline
    def set_occurrenceDateTime(value: Element): Self = this.set("_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_occurrenceDateTime: Self = this.set("_occurrenceDateTime", js.undefined)
    
    @scala.inline
    def set_priority(value: Element): Self = this.set("_priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_priority: Self = this.set("_priority", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setAsNeededBoolean(value: Boolean): Self = this.set("asNeededBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsNeededBoolean: Self = this.set("asNeededBoolean", js.undefined)
    
    @scala.inline
    def setAsNeededCodeableConcept(value: CodeableConcept): Self = this.set("asNeededCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsNeededCodeableConcept: Self = this.set("asNeededCodeableConcept", js.undefined)
    
    @scala.inline
    def setAuthoredOn(value: dateTime): Self = this.set("authoredOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthoredOn: Self = this.set("authoredOn", js.undefined)
    
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
    def setCategoryVarargs(value: CodeableConcept*): Self = this.set("category", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
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
    def setDoNotPerform(value: Boolean): Self = this.set("doNotPerform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotPerform: Self = this.set("doNotPerform", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setOccurrenceDateTime(value: dateTime): Self = this.set("occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccurrenceDateTime: Self = this.set("occurrenceDateTime", js.undefined)
    
    @scala.inline
    def setOccurrencePeriod(value: Period): Self = this.set("occurrencePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccurrencePeriod: Self = this.set("occurrencePeriod", js.undefined)
    
    @scala.inline
    def setOccurrenceTiming(value: Timing): Self = this.set("occurrenceTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccurrenceTiming: Self = this.set("occurrenceTiming", js.undefined)
    
    @scala.inline
    def setPerformer(value: Reference): Self = this.set("performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformer: Self = this.set("performer", js.undefined)
    
    @scala.inline
    def setPerformerType(value: CodeableConcept): Self = this.set("performerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformerType: Self = this.set("performerType", js.undefined)
    
    @scala.inline
    def setPriority(value: code): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
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
    def setRelevantHistoryVarargs(value: Reference*): Self = this.set("relevantHistory", js.Array(value :_*))
    
    @scala.inline
    def setRelevantHistory(value: js.Array[Reference]): Self = this.set("relevantHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelevantHistory: Self = this.set("relevantHistory", js.undefined)
    
    @scala.inline
    def setReplacesVarargs(value: Reference*): Self = this.set("replaces", js.Array(value :_*))
    
    @scala.inline
    def setReplaces(value: js.Array[Reference]): Self = this.set("replaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaces: Self = this.set("replaces", js.undefined)
    
    @scala.inline
    def setRequester(value: ProcedureRequestRequester): Self = this.set("requester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequester: Self = this.set("requester", js.undefined)
    
    @scala.inline
    def setRequisition(value: Identifier): Self = this.set("requisition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequisition: Self = this.set("requisition", js.undefined)
    
    @scala.inline
    def setSpecimenVarargs(value: Reference*): Self = this.set("specimen", js.Array(value :_*))
    
    @scala.inline
    def setSpecimen(value: js.Array[Reference]): Self = this.set("specimen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecimen: Self = this.set("specimen", js.undefined)
    
    @scala.inline
    def setSupportingInfoVarargs(value: Reference*): Self = this.set("supportingInfo", js.Array(value :_*))
    
    @scala.inline
    def setSupportingInfo(value: js.Array[Reference]): Self = this.set("supportingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportingInfo: Self = this.set("supportingInfo", js.undefined)
  }
}
