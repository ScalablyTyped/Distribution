package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for referral or transfer of care
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ReferralRequest extends DomainResource {
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
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
    * Date of creation/activation
    */
  var authoredOn: js.UndefOr[dateTime] = js.native
  /**
    * Request fulfilled by this request
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Originating encounter
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * A textual description of the referral
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Composite request this is part of
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * proposal | plan | order
    */
  var intent: code = js.native
  /**
    * Comments made about referral request
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * When the service(s) requested in the referral should occur
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.native
  /**
    * When the service(s) requested in the referral should occur
    */
  var occurrencePeriod: js.UndefOr[Period] = js.native
  /**
    * Urgency of referral / transfer of care request
    */
  var priority: js.UndefOr[code] = js.native
  /**
    * Reason for referral / transfer of care request
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Why is service needed?
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Receiver of referral / transfer of care request
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Key events in history of request
    */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Request(s) replaced by this request
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Who/what is requesting service
    */
  var requester: js.UndefOr[ReferralRequestRequester] = js.native
  /**
    * Actions requested as part of the referral
    */
  var serviceRequested: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * The clinical specialty (discipline) that the referral is requested for
    */
  var specialty: js.UndefOr[CodeableConcept] = js.native
  /**
    * draft | active | suspended | cancelled | completed | entered-in-error | unknown
    */
  var status: code = js.native
  /**
    * Patient referred to care or transfer
    */
  var subject: Reference = js.native
  /**
    * Additonal information to support referral or transfer of care request
    */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Referral/Transition of care request type
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object ReferralRequest {
  @scala.inline
  def apply(intent: code, status: code, subject: Reference): ReferralRequest = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferralRequest]
  }
  @scala.inline
  implicit class ReferralRequestOps[Self <: ReferralRequest] (val x: Self) extends AnyVal {
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
    def setIntent(value: code): Self = this.set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def set_authoredOn(value: Element): Self = this.set("_authoredOn", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_authoredOn: Self = this.set("_authoredOn", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setGroupIdentifier(value: Identifier): Self = this.set("groupIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIdentifier: Self = this.set("groupIdentifier", js.undefined)
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
    def setRecipientVarargs(value: Reference*): Self = this.set("recipient", js.Array(value :_*))
    @scala.inline
    def setRecipient(value: js.Array[Reference]): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipient: Self = this.set("recipient", js.undefined)
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
    def setRequester(value: ReferralRequestRequester): Self = this.set("requester", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequester: Self = this.set("requester", js.undefined)
    @scala.inline
    def setServiceRequestedVarargs(value: CodeableConcept*): Self = this.set("serviceRequested", js.Array(value :_*))
    @scala.inline
    def setServiceRequested(value: js.Array[CodeableConcept]): Self = this.set("serviceRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRequested: Self = this.set("serviceRequested", js.undefined)
    @scala.inline
    def setSpecialty(value: CodeableConcept): Self = this.set("specialty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecialty: Self = this.set("specialty", js.undefined)
    @scala.inline
    def setSupportingInfoVarargs(value: Reference*): Self = this.set("supportingInfo", js.Array(value :_*))
    @scala.inline
    def setSupportingInfo(value: js.Array[Reference]): Self = this.set("supportingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportingInfo: Self = this.set("supportingInfo", js.undefined)
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

