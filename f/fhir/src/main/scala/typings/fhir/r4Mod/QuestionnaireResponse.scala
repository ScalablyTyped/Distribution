package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.amended
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionnaireResponse
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _authored: js.UndefOr[Element] = js.undefined
  
  var _questionnaire: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Mapping a subject's answers to multiple choice options and determining what to put in the textual answer is a matter of interpretation.  Authoring by device would indicate that some portion of the questionnaire had been auto-populated.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * May be different from the lastUpdateTime of the resource itself, because that reflects when the data was known to the server, not when the data was captured.
    * This element is optional to allow for systems that might not know the value, however it SHOULD be populated if possible.
    */
  var authored: js.UndefOr[String] = js.undefined
  
  /**
    * The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse.  For example, a ServiceRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This will typically be the encounter the event occurred within, but some activities may be initiated prior to or after the official completion of an encounter but still be tied to the context of the encounter. A questionnaire that was initiated during an encounter but not fully completed during the encounter would still generally be associated with the encounter.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * A business identifier assigned to a particular completed (or partially completed) questionnaire.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Groups cannot have answers and therefore must nest directly within item. When dealing with questions, nesting must occur within each answer because some questions may have multiple answers (and the nesting occurs for each answer).
    */
  var item: js.UndefOr[js.Array[QuestionnaireResponseItem]] = js.undefined
  
  /**
    * Composition of questionnaire responses will be handled by the parent questionnaire having answers that reference the child questionnaire.  For relationships to referrals, and other types of requests, use basedOn.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * If a QuestionnaireResponse references a Questionnaire, then the QuestionnaireResponse structure must be consistent with the Questionnaire (i.e. questions must be organized into the same groups, nested questions must still be nested, etc.).
    */
  var questionnaire: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_QuestionnaireResponse: typings.fhir.fhirStrings.QuestionnaireResponse
  
  /**
    * If not specified, no inference can be made about who provided the data.
    */
  var source: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: `in-progress` | completed | amended | `entered-in-error` | stopped
  
  /**
    * If the Questionnaire declared a subjectType, the resource pointed to by this element must be an instance of one of the listed types.
    */
  var subject: js.UndefOr[Reference] = js.undefined
}
object QuestionnaireResponse {
  
  inline def apply(status: `in-progress` | completed | amended | `entered-in-error` | stopped): QuestionnaireResponse = {
    val __obj = js.Dynamic.literal(resourceType = "QuestionnaireResponse", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuestionnaireResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthored(value: String): Self = StObject.set(x, "authored", value.asInstanceOf[js.Any])
    
    inline def setAuthoredUndefined: Self = StObject.set(x, "authored", js.undefined)
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setItem(value: js.Array[QuestionnaireResponseItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: QuestionnaireResponseItem*): Self = StObject.set(x, "item", js.Array(value*))
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setQuestionnaire(value: String): Self = StObject.set(x, "questionnaire", value.asInstanceOf[js.Any])
    
    inline def setQuestionnaireUndefined: Self = StObject.set(x, "questionnaire", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.QuestionnaireResponse): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Reference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStatus(value: `in-progress` | completed | amended | `entered-in-error` | stopped): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def set_authored(value: Element): Self = StObject.set(x, "_authored", value.asInstanceOf[js.Any])
    
    inline def set_authoredUndefined: Self = StObject.set(x, "_authored", js.undefined)
    
    inline def set_questionnaire(value: Element): Self = StObject.set(x, "_questionnaire", value.asInstanceOf[js.Any])
    
    inline def set_questionnaireUndefined: Self = StObject.set(x, "_questionnaire", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
