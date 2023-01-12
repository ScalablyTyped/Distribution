package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`data-requested`
import typings.fhir.fhirStrings.`data-required`
import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.failure
import typings.fhir.fhirStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuidanceResponse
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _moduleCanonical: js.UndefOr[Element] = js.undefined
  
  var _moduleUri: js.UndefOr[Element] = js.undefined
  
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * If the evaluation could not be completed due to lack of information, or additional information would potentially result in a more accurate response, this element will a description of the data required in order to proceed with the evaluation. A subsequent request to the service should include this data.
    */
  var dataRequirement: js.UndefOr[js.Array[DataRequirement]] = js.undefined
  
  /**
    * This will typically be the encounter the event occurred within, but some activities may be initiated prior to or after the official copmletion of an encounter but still be tied to the context of the encounter.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element.
    */
  var evaluationMessage: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Allows a service to provide  unique, business identifiers for the response.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * An identifier, CodeableConcept or canonical reference to the guidance that was requested.
    */
  var moduleCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * An identifier, CodeableConcept or canonical reference to the guidance that was requested.
    */
  var moduleCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * An identifier, CodeableConcept or canonical reference to the guidance that was requested.
    */
  var moduleUri: js.UndefOr[String] = js.undefined
  
  /**
    * Provides a mechanism to communicate additional information about the response.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Indicates when the guidance response was processed.
    */
  var occurrenceDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as procedure or communication requests that are returned as part of the operation result. However, modules may define specific outputs that would be returned as the result of the evaluation, and these would be returned in this element.
    */
  var outputParameters: js.UndefOr[Reference] = js.undefined
  
  /**
    * Provides a reference to the device that performed the guidance.
    */
  var performer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Describes the reason for the guidance response in coded or textual form.
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Indicates the reason the request was initiated. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response.
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The identifier of the request associated with this response. If an identifier was given as part of the request, it will be reproduced here to enable the requester to more easily identify the response in a multi-request scenario.
    */
  var requestIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_GuidanceResponse: typings.fhir.fhirStrings.GuidanceResponse
  
  /**
    * The actions, if any, produced by the evaluation of the artifact.
    */
  var result: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: success | `data-requested` | `data-required` | `in-progress` | failure | `entered-in-error`
  
  /**
    * The patient for which the request was processed.
    */
  var subject: js.UndefOr[Reference] = js.undefined
}
object GuidanceResponse {
  
  inline def apply(
    status: success | `data-requested` | `data-required` | `in-progress` | failure | `entered-in-error`
  ): GuidanceResponse = {
    val __obj = js.Dynamic.literal(resourceType = "GuidanceResponse", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuidanceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GuidanceResponse] (val x: Self) extends AnyVal {
    
    inline def setDataRequirement(value: js.Array[DataRequirement]): Self = StObject.set(x, "dataRequirement", value.asInstanceOf[js.Any])
    
    inline def setDataRequirementUndefined: Self = StObject.set(x, "dataRequirement", js.undefined)
    
    inline def setDataRequirementVarargs(value: DataRequirement*): Self = StObject.set(x, "dataRequirement", js.Array(value*))
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEvaluationMessage(value: js.Array[Reference]): Self = StObject.set(x, "evaluationMessage", value.asInstanceOf[js.Any])
    
    inline def setEvaluationMessageUndefined: Self = StObject.set(x, "evaluationMessage", js.undefined)
    
    inline def setEvaluationMessageVarargs(value: Reference*): Self = StObject.set(x, "evaluationMessage", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setModuleCanonical(value: String): Self = StObject.set(x, "moduleCanonical", value.asInstanceOf[js.Any])
    
    inline def setModuleCanonicalUndefined: Self = StObject.set(x, "moduleCanonical", js.undefined)
    
    inline def setModuleCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "moduleCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setModuleCodeableConceptUndefined: Self = StObject.set(x, "moduleCodeableConcept", js.undefined)
    
    inline def setModuleUri(value: String): Self = StObject.set(x, "moduleUri", value.asInstanceOf[js.Any])
    
    inline def setModuleUriUndefined: Self = StObject.set(x, "moduleUri", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOccurrenceDateTime(value: String): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOutputParameters(value: Reference): Self = StObject.set(x, "outputParameters", value.asInstanceOf[js.Any])
    
    inline def setOutputParametersUndefined: Self = StObject.set(x, "outputParameters", js.undefined)
    
    inline def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value*))
    
    inline def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value*))
    
    inline def setRequestIdentifier(value: Identifier): Self = StObject.set(x, "requestIdentifier", value.asInstanceOf[js.Any])
    
    inline def setRequestIdentifierUndefined: Self = StObject.set(x, "requestIdentifier", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.GuidanceResponse): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Reference): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setStatus(value: success | `data-requested` | `data-required` | `in-progress` | failure | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def set_moduleCanonical(value: Element): Self = StObject.set(x, "_moduleCanonical", value.asInstanceOf[js.Any])
    
    inline def set_moduleCanonicalUndefined: Self = StObject.set(x, "_moduleCanonical", js.undefined)
    
    inline def set_moduleUri(value: Element): Self = StObject.set(x, "_moduleUri", value.asInstanceOf[js.Any])
    
    inline def set_moduleUriUndefined: Self = StObject.set(x, "_moduleUri", js.undefined)
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
