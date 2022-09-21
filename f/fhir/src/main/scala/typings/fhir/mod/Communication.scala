package typings.fhir.mod

import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.failed
import typings.fhir.fhirStrings.rejected
import typings.fhir.fhirStrings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Communication
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _received: js.UndefOr[Element] = js.undefined
  
  var _sent: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The type of message conveyed such as alert, notification, reminder, instruction, etc.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The encounter within which the communication was sent.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifiers associated with this Communication that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * A channel that was used for this communication (e.g. email, fax).
    */
  var medium: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Text, attachment(s), or resource(s) that was communicated to the recipient.
    */
  var payload: js.UndefOr[js.Array[CommunicationPayload]] = js.undefined
  
  /**
    * The reason or justification for the communication.
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The time when this communication arrived at the destination.
    */
  var received: js.UndefOr[String] = js.undefined
  
  /**
    * The entity (e.g. person, organization, clinical information system, or device) which was the target of the communication. If receipts need to be tracked by individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either a receipt(s) is not tracked (e.g. a mass mail-out) or is captured in aggregate (all emails confirmed received by a particular time).
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The communication request that was responsible for producing this communication.
    */
  var requestDetail: js.UndefOr[Reference] = js.undefined
  
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
    * The status of the transmission.
    */
  var status: js.UndefOr[`in-progress` | completed | suspended | rejected | failed] = js.undefined
  
  /**
    * The patient who was the focus of this communication.
    */
  var subject: js.UndefOr[Reference] = js.undefined
}
object Communication {
  
  inline def apply(): Communication = {
    val __obj = js.Dynamic.literal(resourceType = "Communication")
    __obj.asInstanceOf[Communication]
  }
  
  extension [Self <: Communication](x: Self) {
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setMedium(value: js.Array[CodeableConcept]): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setMediumVarargs(value: CodeableConcept*): Self = StObject.set(x, "medium", js.Array(value*))
    
    inline def setPayload(value: js.Array[CommunicationPayload]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setPayloadVarargs(value: CommunicationPayload*): Self = StObject.set(x, "payload", js.Array(value*))
    
    inline def setReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setReceived(value: String): Self = StObject.set(x, "received", value.asInstanceOf[js.Any])
    
    inline def setReceivedUndefined: Self = StObject.set(x, "received", js.undefined)
    
    inline def setRecipient(value: js.Array[Reference]): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    inline def setRecipientVarargs(value: Reference*): Self = StObject.set(x, "recipient", js.Array(value*))
    
    inline def setRequestDetail(value: Reference): Self = StObject.set(x, "requestDetail", value.asInstanceOf[js.Any])
    
    inline def setRequestDetailUndefined: Self = StObject.set(x, "requestDetail", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Communication): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Reference): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setSent(value: String): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
    
    inline def setSentUndefined: Self = StObject.set(x, "sent", js.undefined)
    
    inline def setStatus(value: `in-progress` | completed | suspended | rejected | failed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def set_received(value: Element): Self = StObject.set(x, "_received", value.asInstanceOf[js.Any])
    
    inline def set_receivedUndefined: Self = StObject.set(x, "_received", js.undefined)
    
    inline def set_sent(value: Element): Self = StObject.set(x, "_sent", value.asInstanceOf[js.Any])
    
    inline def set_sentUndefined: Self = StObject.set(x, "_sent", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
