package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structured set of questions and their answers
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait QuestionnaireResponse
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'authored'.
    */
  var _authored: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Person who received and recorded the answers
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Date the answers were gathered
    */
  var authored: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Request fulfilled by this QuestionnaireResponse
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Encounter or Episode during which questionnaire was completed
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Unique id for this set of answers
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Groups and questions
    */
  var item: js.UndefOr[js.Array[QuestionnaireResponseItem]] = js.undefined
  
  /**
    * Part of this action
    */
  var parent: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Form being answered
    */
  var questionnaire: js.UndefOr[Reference] = js.undefined
  
  /**
    * The person who answered the questions
    */
  var source: js.UndefOr[Reference] = js.undefined
  
  /**
    * in-progress | completed | amended | entered-in-error | stopped
    */
  var status: code
  
  /**
    * The subject of the questions
    */
  var subject: js.UndefOr[Reference] = js.undefined
}
object QuestionnaireResponse {
  
  inline def apply(status: code): QuestionnaireResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireResponse]
  }
  
  extension [Self <: QuestionnaireResponse](x: Self) {
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAuthored(value: dateTime): Self = StObject.set(x, "authored", value.asInstanceOf[js.Any])
    
    inline def setAuthoredUndefined: Self = StObject.set(x, "authored", js.undefined)
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setItem(value: js.Array[QuestionnaireResponseItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: QuestionnaireResponseItem*): Self = StObject.set(x, "item", js.Array(value :_*))
    
    inline def setParent(value: js.Array[Reference]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setParentVarargs(value: Reference*): Self = StObject.set(x, "parent", js.Array(value :_*))
    
    inline def setQuestionnaire(value: Reference): Self = StObject.set(x, "questionnaire", value.asInstanceOf[js.Any])
    
    inline def setQuestionnaireUndefined: Self = StObject.set(x, "questionnaire", js.undefined)
    
    inline def setSource(value: Reference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def set_authored(value: Element): Self = StObject.set(x, "_authored", value.asInstanceOf[js.Any])
    
    inline def set_authoredUndefined: Self = StObject.set(x, "_authored", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
