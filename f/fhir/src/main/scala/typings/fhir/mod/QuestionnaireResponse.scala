package typings.fhir.mod

import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.amended
import typings.fhir.fhirStrings.completed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionnaireResponse
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _authored: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Need to know who interpreted the subject's answers to the questions in the questionnaire, and selected the appropriate options for answers.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Clinicians need to be able to check the date that the information in the questionnaire was collected, to derive the context of the answers.
    */
  var authored: js.UndefOr[String] = js.undefined
  
  /**
    * Some institutions track questionnaires under a specific encounter.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Need to be able to logically group answers to grouped questions.
    */
  var group: js.UndefOr[QuestionnaireResponseGroup] = js.undefined
  
  /**
    * Used for tracking, registration and other business purposes.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Needed to allow editing of the questionnaire in a manner that enforces the constraints of the original form.
    */
  var questionnaire: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_QuestionnaireResponse: typings.fhir.fhirStrings.QuestionnaireResponse
  
  /**
    * When answering questions about a subject that is minor, incapable of answering or an animal, another human source is used to answer the questions.
    */
  var source: js.UndefOr[Reference] = js.undefined
  
  /**
    * The information on Questionnaire resources  may possibly be gathered during multiple sessions and altered after considered being finished. Questionnaire resources with just questions may serve as template forms, with the applicable publication statuses.
    */
  var status: `in-progress` | completed | amended
  
  /**
    * The subject context must be known.
    */
  var subject: js.UndefOr[Reference] = js.undefined
}
object QuestionnaireResponse {
  
  inline def apply(status: `in-progress` | completed | amended): QuestionnaireResponse = {
    val __obj = js.Dynamic.literal(resourceType = "QuestionnaireResponse", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireResponse]
  }
  
  extension [Self <: QuestionnaireResponse](x: Self) {
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthored(value: String): Self = StObject.set(x, "authored", value.asInstanceOf[js.Any])
    
    inline def setAuthoredUndefined: Self = StObject.set(x, "authored", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setGroup(value: QuestionnaireResponseGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setQuestionnaire(value: Reference): Self = StObject.set(x, "questionnaire", value.asInstanceOf[js.Any])
    
    inline def setQuestionnaireUndefined: Self = StObject.set(x, "questionnaire", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.QuestionnaireResponse): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Reference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStatus(value: `in-progress` | completed | amended): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def set_authored(value: Element): Self = StObject.set(x, "_authored", value.asInstanceOf[js.Any])
    
    inline def set_authoredUndefined: Self = StObject.set(x, "_authored", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
