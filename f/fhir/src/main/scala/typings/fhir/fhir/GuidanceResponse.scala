package typings.fhir.fhir

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
  implicit class GuidanceResponseOps[Self <: GuidanceResponse] (val x: Self) extends AnyVal {
    
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
    def setModule(value: Reference): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_occurrenceDateTime(value: Element): Self = this.set("_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_occurrenceDateTime: Self = this.set("_occurrenceDateTime", js.undefined)
    
    @scala.inline
    def set_requestId(value: Element): Self = this.set("_requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_requestId: Self = this.set("_requestId", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDataRequirementVarargs(value: DataRequirement*): Self = this.set("dataRequirement", js.Array(value :_*))
    
    @scala.inline
    def setDataRequirement(value: js.Array[DataRequirement]): Self = this.set("dataRequirement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataRequirement: Self = this.set("dataRequirement", js.undefined)
    
    @scala.inline
    def setEvaluationMessageVarargs(value: Reference*): Self = this.set("evaluationMessage", js.Array(value :_*))
    
    @scala.inline
    def setEvaluationMessage(value: js.Array[Reference]): Self = this.set("evaluationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationMessage: Self = this.set("evaluationMessage", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
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
    def setOutputParameters(value: Reference): Self = this.set("outputParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputParameters: Self = this.set("outputParameters", js.undefined)
    
    @scala.inline
    def setPerformer(value: Reference): Self = this.set("performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformer: Self = this.set("performer", js.undefined)
    
    @scala.inline
    def setReasonCodeableConcept(value: CodeableConcept): Self = this.set("reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonCodeableConcept: Self = this.set("reasonCodeableConcept", js.undefined)
    
    @scala.inline
    def setReasonReference(value: Reference): Self = this.set("reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonReference: Self = this.set("reasonReference", js.undefined)
    
    @scala.inline
    def setRequestId(value: id): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    
    @scala.inline
    def setResult(value: Reference): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
