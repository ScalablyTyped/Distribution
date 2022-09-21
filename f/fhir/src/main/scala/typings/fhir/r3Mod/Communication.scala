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

trait Communication
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _notDone: js.UndefOr[Element] = js.undefined
  
  var _received: js.UndefOr[Element] = js.undefined
  
  var _sent: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * This must point to some sort of a 'Request' resource, such as CarePlan, CommunicationRequest, ReferralRequest, MedicationRequest, etc.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * There may be multiple axes of categorization and one communication may serve multiple purposes.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The encounter within which the communication was sent.
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * A protocol, guideline, or other definition that was adhered to in whole or in part by this communication event.
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Identifiers associated with this Communication that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * A channel that was used for this communication (e.g. email, fax).
    */
  var medium: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * This element is labeled as a modifier because it marks the communication as a communication that did not occur.  The more attributes are populated, the more constrained the negated statement is.
    */
  var notDone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Describes why the communication event did not occur in coded and/or textual form.
    */
  var notDoneReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Additional notes or commentary about the communication by the sender, receiver or other interested parties.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Part of this action.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Text, attachment(s), or resource(s) that was communicated to the recipient.
    */
  var payload: js.UndefOr[js.Array[CommunicationPayload]] = js.undefined
  
  /**
    * Textual reasons can be caprued using reasonCode.text.
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Indicates another resource whose existence justifies this communication.
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The time when this communication arrived at the destination.
    */
  var received: js.UndefOr[String] = js.undefined
  
  /**
    * The entity (e.g. person, organization, clinical information system, or device) which was the target of the communication. If receipts need to be tracked by individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either a receipt(s) is not tracked (e.g. a mass mail-out) or is captured in aggregate (all emails confirmed received by a particular time).
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Communication: typings.fhir.fhirStrings.Communication
  
  /**
    * The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication.
    */
  var sender: js.UndefOr[Reference] = js.undefined
  
  /**
    * The time when this communication was sent.
    */
  var sent: js.UndefOr[String] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains the codes aborted and entered-in-error that mark the communication as not currently valid.
    */
  var status: preparation | `in-progress` | suspended | aborted | completed | `entered-in-error` | unknown
  
  /**
    * The patient or group that was the focus of this communication.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * The resources which were responsible for or related to producing this communication.
    */
  var topic: js.UndefOr[js.Array[Reference]] = js.undefined
}
object Communication {
  
  inline def apply(
    status: preparation | `in-progress` | suspended | aborted | completed | `entered-in-error` | unknown
  ): Communication = {
    val __obj = js.Dynamic.literal(resourceType = "Communication", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Communication]
  }
  
  extension [Self <: Communication](x: Self) {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDefinition(value: js.Array[Reference]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDefinitionVarargs(value: Reference*): Self = StObject.set(x, "definition", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setMedium(value: js.Array[CodeableConcept]): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setMediumVarargs(value: CodeableConcept*): Self = StObject.set(x, "medium", js.Array(value*))
    
    inline def setNotDone(value: Boolean): Self = StObject.set(x, "notDone", value.asInstanceOf[js.Any])
    
    inline def setNotDoneReason(value: CodeableConcept): Self = StObject.set(x, "notDoneReason", value.asInstanceOf[js.Any])
    
    inline def setNotDoneReasonUndefined: Self = StObject.set(x, "notDoneReason", js.undefined)
    
    inline def setNotDoneUndefined: Self = StObject.set(x, "notDone", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setPayload(value: js.Array[CommunicationPayload]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setPayloadVarargs(value: CommunicationPayload*): Self = StObject.set(x, "payload", js.Array(value*))
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value*))
    
    inline def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value*))
    
    inline def setReceived(value: String): Self = StObject.set(x, "received", value.asInstanceOf[js.Any])
    
    inline def setReceivedUndefined: Self = StObject.set(x, "received", js.undefined)
    
    inline def setRecipient(value: js.Array[Reference]): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    inline def setRecipientVarargs(value: Reference*): Self = StObject.set(x, "recipient", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Communication): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Reference): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setSent(value: String): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
    
    inline def setSentUndefined: Self = StObject.set(x, "sent", js.undefined)
    
    inline def setStatus(
      value: preparation | `in-progress` | suspended | aborted | completed | `entered-in-error` | unknown
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTopic(value: js.Array[Reference]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setTopicVarargs(value: Reference*): Self = StObject.set(x, "topic", js.Array(value*))
    
    inline def set_notDone(value: Element): Self = StObject.set(x, "_notDone", value.asInstanceOf[js.Any])
    
    inline def set_notDoneUndefined: Self = StObject.set(x, "_notDone", js.undefined)
    
    inline def set_received(value: Element): Self = StObject.set(x, "_received", value.asInstanceOf[js.Any])
    
    inline def set_receivedUndefined: Self = StObject.set(x, "_received", js.undefined)
    
    inline def set_sent(value: Element): Self = StObject.set(x, "_sent", value.asInstanceOf[js.Any])
    
    inline def set_sentUndefined: Self = StObject.set(x, "_sent", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
