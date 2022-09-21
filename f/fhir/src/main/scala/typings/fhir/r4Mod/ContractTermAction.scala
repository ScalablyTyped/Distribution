package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractTermAction
  extends StObject
     with BackboneElement {
  
  var _contextLinkId: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _doNotPerform: js.UndefOr[Element] = js.undefined
  
  var _linkId: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  var _performerLinkId: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _reason: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _reasonLinkId: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _requesterLinkId: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Encounter or Episode with primary association to specified term activity.
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Id [identifier??] of the clause or question text related to the requester of this action in the referenced form or QuestionnaireResponse.
    */
  var contextLinkId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * True if the term prohibits the  action.
    */
  var doNotPerform: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Reason or purpose for the action stipulated by this Contract Provision.
    */
  var intent: CodeableConcept
  
  /**
    * Id [identifier??] of the clause or question text related to this action in the referenced form or QuestionnaireResponse.
    */
  var linkId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Comments made about the term action made by the requester, performer, subject or other participants.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * When action happens.
    */
  var occurrenceDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * When action happens.
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * When action happens.
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Indicates who or what is being asked to perform (or not perform) the ction.
    */
  var performer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Id [identifier??] of the clause or question text related to the reason type or reference of this  action in the referenced form or QuestionnaireResponse.
    */
  var performerLinkId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The type of role or competency of an individual desired or required to perform or not perform the action.
    */
  var performerRole: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The type of individual that is desired or required to perform or not perform the action.
    */
  var performerType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Describes why the action is to be performed or not performed in textual form.
    */
  var reason: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Rationale for the action to be performed or not performed. Describes why the action is permitted or prohibited.
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Id [identifier??] of the clause or question text related to the reason type or reference of this  action in the referenced form or QuestionnaireResponse.
    */
  var reasonLinkId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates another resource whose existence justifies permitting or not permitting this action.
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Who or what initiated the action and has responsibility for its activation.
    */
  var requester: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Id [identifier??] of the clause or question text related to the requester of this action in the referenced form or QuestionnaireResponse.
    */
  var requesterLinkId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Security labels that protects the action.
    */
  var securityLabelNumber: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Current state of the term action.
    */
  var status: CodeableConcept
  
  /**
    * Entity of the action.
    */
  var subject: js.UndefOr[js.Array[ContractTermActionSubject]] = js.undefined
  
  /**
    * Activity or service obligation to be done or not done, performed or not performed, effectuated or not by this Contract term.
    */
  var `type`: CodeableConcept
}
object ContractTermAction {
  
  inline def apply(intent: CodeableConcept, status: CodeableConcept, `type`: CodeableConcept): ContractTermAction = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractTermAction]
  }
  
  extension [Self <: ContractTermAction](x: Self) {
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextLinkId(value: js.Array[String]): Self = StObject.set(x, "contextLinkId", value.asInstanceOf[js.Any])
    
    inline def setContextLinkIdUndefined: Self = StObject.set(x, "contextLinkId", js.undefined)
    
    inline def setContextLinkIdVarargs(value: String*): Self = StObject.set(x, "contextLinkId", js.Array(value*))
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDoNotPerform(value: Boolean): Self = StObject.set(x, "doNotPerform", value.asInstanceOf[js.Any])
    
    inline def setDoNotPerformUndefined: Self = StObject.set(x, "doNotPerform", js.undefined)
    
    inline def setIntent(value: CodeableConcept): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setLinkId(value: js.Array[String]): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
    inline def setLinkIdVarargs(value: String*): Self = StObject.set(x, "linkId", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOccurrenceDateTime(value: String): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    inline def setOccurrenceTiming(value: Timing): Self = StObject.set(x, "occurrenceTiming", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceTimingUndefined: Self = StObject.set(x, "occurrenceTiming", js.undefined)
    
    inline def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerLinkId(value: js.Array[String]): Self = StObject.set(x, "performerLinkId", value.asInstanceOf[js.Any])
    
    inline def setPerformerLinkIdUndefined: Self = StObject.set(x, "performerLinkId", js.undefined)
    
    inline def setPerformerLinkIdVarargs(value: String*): Self = StObject.set(x, "performerLinkId", js.Array(value*))
    
    inline def setPerformerRole(value: CodeableConcept): Self = StObject.set(x, "performerRole", value.asInstanceOf[js.Any])
    
    inline def setPerformerRoleUndefined: Self = StObject.set(x, "performerRole", js.undefined)
    
    inline def setPerformerType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "performerType", value.asInstanceOf[js.Any])
    
    inline def setPerformerTypeUndefined: Self = StObject.set(x, "performerType", js.undefined)
    
    inline def setPerformerTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "performerType", js.Array(value*))
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setReason(value: js.Array[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value*))
    
    inline def setReasonLinkId(value: js.Array[String]): Self = StObject.set(x, "reasonLinkId", value.asInstanceOf[js.Any])
    
    inline def setReasonLinkIdUndefined: Self = StObject.set(x, "reasonLinkId", js.undefined)
    
    inline def setReasonLinkIdVarargs(value: String*): Self = StObject.set(x, "reasonLinkId", js.Array(value*))
    
    inline def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value*))
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: String*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setRequester(value: js.Array[Reference]): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterLinkId(value: js.Array[String]): Self = StObject.set(x, "requesterLinkId", value.asInstanceOf[js.Any])
    
    inline def setRequesterLinkIdUndefined: Self = StObject.set(x, "requesterLinkId", js.undefined)
    
    inline def setRequesterLinkIdVarargs(value: String*): Self = StObject.set(x, "requesterLinkId", js.Array(value*))
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setRequesterVarargs(value: Reference*): Self = StObject.set(x, "requester", js.Array(value*))
    
    inline def setSecurityLabelNumber(value: js.Array[Double]): Self = StObject.set(x, "securityLabelNumber", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabelNumberUndefined: Self = StObject.set(x, "securityLabelNumber", js.undefined)
    
    inline def setSecurityLabelNumberVarargs(value: Double*): Self = StObject.set(x, "securityLabelNumber", js.Array(value*))
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: js.Array[ContractTermActionSubject]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubjectVarargs(value: ContractTermActionSubject*): Self = StObject.set(x, "subject", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_contextLinkId(value: js.Array[Element]): Self = StObject.set(x, "_contextLinkId", value.asInstanceOf[js.Any])
    
    inline def set_contextLinkIdUndefined: Self = StObject.set(x, "_contextLinkId", js.undefined)
    
    inline def set_contextLinkIdVarargs(value: Element*): Self = StObject.set(x, "_contextLinkId", js.Array(value*))
    
    inline def set_doNotPerform(value: Element): Self = StObject.set(x, "_doNotPerform", value.asInstanceOf[js.Any])
    
    inline def set_doNotPerformUndefined: Self = StObject.set(x, "_doNotPerform", js.undefined)
    
    inline def set_linkId(value: js.Array[Element]): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
    
    inline def set_linkIdVarargs(value: Element*): Self = StObject.set(x, "_linkId", js.Array(value*))
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_performerLinkId(value: js.Array[Element]): Self = StObject.set(x, "_performerLinkId", value.asInstanceOf[js.Any])
    
    inline def set_performerLinkIdUndefined: Self = StObject.set(x, "_performerLinkId", js.undefined)
    
    inline def set_performerLinkIdVarargs(value: Element*): Self = StObject.set(x, "_performerLinkId", js.Array(value*))
    
    inline def set_reason(value: js.Array[Element]): Self = StObject.set(x, "_reason", value.asInstanceOf[js.Any])
    
    inline def set_reasonLinkId(value: js.Array[Element]): Self = StObject.set(x, "_reasonLinkId", value.asInstanceOf[js.Any])
    
    inline def set_reasonLinkIdUndefined: Self = StObject.set(x, "_reasonLinkId", js.undefined)
    
    inline def set_reasonLinkIdVarargs(value: Element*): Self = StObject.set(x, "_reasonLinkId", js.Array(value*))
    
    inline def set_reasonUndefined: Self = StObject.set(x, "_reason", js.undefined)
    
    inline def set_reasonVarargs(value: Element*): Self = StObject.set(x, "_reason", js.Array(value*))
    
    inline def set_requesterLinkId(value: js.Array[Element]): Self = StObject.set(x, "_requesterLinkId", value.asInstanceOf[js.Any])
    
    inline def set_requesterLinkIdUndefined: Self = StObject.set(x, "_requesterLinkId", js.undefined)
    
    inline def set_requesterLinkIdVarargs(value: Element*): Self = StObject.set(x, "_requesterLinkId", js.Array(value*))
  }
}
