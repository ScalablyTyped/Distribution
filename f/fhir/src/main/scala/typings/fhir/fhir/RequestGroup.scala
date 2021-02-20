package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A group of related requests
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait RequestGroup extends DomainResource {
  
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'intent'.
    */
  var _intent: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Proposed actions, if any
    */
  var action: js.UndefOr[js.Array[RequestGroupAction]] = js.native
  
  /**
    * Device or practitioner that authored the request group
    */
  var author: js.UndefOr[Reference] = js.native
  
  /**
    * When the request group was authored
    */
  var authoredOn: js.UndefOr[dateTime] = js.native
  
  /**
    * Fulfills plan, proposal, or order
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Encounter or Episode for the request group
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.native
  
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
    * Additional notes about the response
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * routine | urgent | asap | stat
    */
  var priority: js.UndefOr[code] = js.native
  
  /**
    * Reason for the request group
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Reason for the request group
    */
  var reasonReference: js.UndefOr[Reference] = js.native
  
  /**
    * Request(s) replaced by this request
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * draft | active | suspended | cancelled | completed | entered-in-error | unknown
    */
  var status: code = js.native
  
  /**
    * Who the request group is about
    */
  var subject: js.UndefOr[Reference] = js.native
}
object RequestGroup {
  
  @scala.inline
  def apply(intent: code, status: code): RequestGroup = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestGroup]
  }
  
  @scala.inline
  implicit class RequestGroupMutableBuilder[Self <: RequestGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Array[RequestGroupAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setActionVarargs(value: RequestGroupAction*): Self = StObject.set(x, "action", js.Array(value :_*))
    
    @scala.inline
    def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setAuthoredOn(value: dateTime): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDefinition(value: js.Array[Reference]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setDefinitionVarargs(value: Reference*): Self = StObject.set(x, "definition", js.Array(value :_*))
    
    @scala.inline
    def setGroupIdentifier(value: Identifier): Self = StObject.set(x, "groupIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdentifierUndefined: Self = StObject.set(x, "groupIdentifier", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setIntent(value: code): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setPriority(value: code): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeableConceptUndefined: Self = StObject.set(x, "reasonCodeableConcept", js.undefined)
    
    @scala.inline
    def setReasonReference(value: Reference): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    @scala.inline
    def setReplaces(value: js.Array[Reference]): Self = StObject.set(x, "replaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacesUndefined: Self = StObject.set(x, "replaces", js.undefined)
    
    @scala.inline
    def setReplacesVarargs(value: Reference*): Self = StObject.set(x, "replaces", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def set_authoredOn(value: Element): Self = StObject.set(x, "_authoredOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_authoredOnUndefined: Self = StObject.set(x, "_authoredOn", js.undefined)
    
    @scala.inline
    def set_intent(value: Element): Self = StObject.set(x, "_intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_intentUndefined: Self = StObject.set(x, "_intent", js.undefined)
    
    @scala.inline
    def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
