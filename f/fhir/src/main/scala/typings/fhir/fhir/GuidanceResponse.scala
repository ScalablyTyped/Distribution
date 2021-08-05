package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The formal response to a guidance request
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait GuidanceResponse
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'requestId'.
    */
  var _requestId: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Encounter or Episode during which the response was returned
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Additional required data
    */
  var dataRequirement: js.UndefOr[js.Array[DataRequirement]] = js.undefined
  
  /**
    * Messages resulting from the evaluation of the artifact or artifacts
    */
  var evaluationMessage: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * A reference to a knowledge module
    */
  var module: Reference
  
  /**
    * Additional notes about the response
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * When the guidance response was processed
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * The output parameters of the evaluation, if any
    */
  var outputParameters: js.UndefOr[Reference] = js.undefined
  
  /**
    * Device returning the guidance
    */
  var performer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Reason for the response
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Reason for the response
    */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The id of the request associated with this response, if any
    */
  var requestId: js.UndefOr[id] = js.undefined
  
  /**
    * Proposed actions, if any
    */
  var result: js.UndefOr[Reference] = js.undefined
  
  /**
    * success | data-requested | data-required | in-progress | failure | entered-in-error
    */
  var status: code
  
  /**
    * Patient the request was performed for
    */
  var subject: js.UndefOr[Reference] = js.undefined
}
object GuidanceResponse {
  
  inline def apply(module: Reference, status: code): GuidanceResponse = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuidanceResponse]
  }
  
  extension [Self <: GuidanceResponse](x: Self) {
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDataRequirement(value: js.Array[DataRequirement]): Self = StObject.set(x, "dataRequirement", value.asInstanceOf[js.Any])
    
    inline def setDataRequirementUndefined: Self = StObject.set(x, "dataRequirement", js.undefined)
    
    inline def setDataRequirementVarargs(value: DataRequirement*): Self = StObject.set(x, "dataRequirement", js.Array(value :_*))
    
    inline def setEvaluationMessage(value: js.Array[Reference]): Self = StObject.set(x, "evaluationMessage", value.asInstanceOf[js.Any])
    
    inline def setEvaluationMessageUndefined: Self = StObject.set(x, "evaluationMessage", js.undefined)
    
    inline def setEvaluationMessageVarargs(value: Reference*): Self = StObject.set(x, "evaluationMessage", js.Array(value :_*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setModule(value: Reference): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    inline def setOccurrenceDateTime(value: dateTime): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOutputParameters(value: Reference): Self = StObject.set(x, "outputParameters", value.asInstanceOf[js.Any])
    
    inline def setOutputParametersUndefined: Self = StObject.set(x, "outputParameters", js.undefined)
    
    inline def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeableConceptUndefined: Self = StObject.set(x, "reasonCodeableConcept", js.undefined)
    
    inline def setReasonReference(value: Reference): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setRequestId(value: id): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setResult(value: Reference): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_requestId(value: Element): Self = StObject.set(x, "_requestId", value.asInstanceOf[js.Any])
    
    inline def set_requestIdUndefined: Self = StObject.set(x, "_requestId", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
