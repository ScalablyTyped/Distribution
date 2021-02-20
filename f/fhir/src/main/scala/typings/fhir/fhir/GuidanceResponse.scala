package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The formal response to a guidance request
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait GuidanceResponse extends DomainResource {
  
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'requestId'.
    */
  var _requestId: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Encounter or Episode during which the response was returned
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * Additional required data
    */
  var dataRequirement: js.UndefOr[js.Array[DataRequirement]] = js.native
  
  /**
    * Messages resulting from the evaluation of the artifact or artifacts
    */
  var evaluationMessage: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * A reference to a knowledge module
    */
  var module: Reference = js.native
  
  /**
    * Additional notes about the response
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * When the guidance response was processed
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * The output parameters of the evaluation, if any
    */
  var outputParameters: js.UndefOr[Reference] = js.native
  
  /**
    * Device returning the guidance
    */
  var performer: js.UndefOr[Reference] = js.native
  
  /**
    * Reason for the response
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Reason for the response
    */
  var reasonReference: js.UndefOr[Reference] = js.native
  
  /**
    * The id of the request associated with this response, if any
    */
  var requestId: js.UndefOr[id] = js.native
  
  /**
    * Proposed actions, if any
    */
  var result: js.UndefOr[Reference] = js.native
  
  /**
    * success | data-requested | data-required | in-progress | failure | entered-in-error
    */
  var status: code = js.native
  
  /**
    * Patient the request was performed for
    */
  var subject: js.UndefOr[Reference] = js.native
}
object GuidanceResponse {
  
  @scala.inline
  def apply(module: Reference, status: code): GuidanceResponse = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuidanceResponse]
  }
  
  @scala.inline
  implicit class GuidanceResponseMutableBuilder[Self <: GuidanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDataRequirement(value: js.Array[DataRequirement]): Self = StObject.set(x, "dataRequirement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRequirementUndefined: Self = StObject.set(x, "dataRequirement", js.undefined)
    
    @scala.inline
    def setDataRequirementVarargs(value: DataRequirement*): Self = StObject.set(x, "dataRequirement", js.Array(value :_*))
    
    @scala.inline
    def setEvaluationMessage(value: js.Array[Reference]): Self = StObject.set(x, "evaluationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationMessageUndefined: Self = StObject.set(x, "evaluationMessage", js.undefined)
    
    @scala.inline
    def setEvaluationMessageVarargs(value: Reference*): Self = StObject.set(x, "evaluationMessage", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setModule(value: Reference): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setOccurrenceDateTime(value: dateTime): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    @scala.inline
    def setOutputParameters(value: Reference): Self = StObject.set(x, "outputParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputParametersUndefined: Self = StObject.set(x, "outputParameters", js.undefined)
    
    @scala.inline
    def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    @scala.inline
    def setReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeableConceptUndefined: Self = StObject.set(x, "reasonCodeableConcept", js.undefined)
    
    @scala.inline
    def setReasonReference(value: Reference): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    @scala.inline
    def setRequestId(value: id): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setResult(value: Reference): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    @scala.inline
    def set_requestId(value: Element): Self = StObject.set(x, "_requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_requestIdUndefined: Self = StObject.set(x, "_requestId", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
