package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Groups and questions
  */
trait QuestionnaireResponseItem
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'linkId'.
    */
  var _linkId: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * The response(s) to the question
    */
  var answer: js.UndefOr[js.Array[QuestionnaireResponseItemAnswer]] = js.undefined
  
  /**
    * ElementDefinition - details for the item
    */
  var definition: js.UndefOr[uri] = js.undefined
  
  /**
    * Nested questionnaire response items
    */
  var item: js.UndefOr[js.Array[QuestionnaireResponseItem]] = js.undefined
  
  /**
    * Pointer to specific item from Questionnaire
    */
  var linkId: String
  
  /**
    * The subject this group's answers are about
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Name for group or question text
    */
  var text: js.UndefOr[String] = js.undefined
}
object QuestionnaireResponseItem {
  
  inline def apply(linkId: String): QuestionnaireResponseItem = {
    val __obj = js.Dynamic.literal(linkId = linkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireResponseItem]
  }
  
  extension [Self <: QuestionnaireResponseItem](x: Self) {
    
    inline def setAnswer(value: js.Array[QuestionnaireResponseItemAnswer]): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    inline def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
    
    inline def setAnswerVarargs(value: QuestionnaireResponseItemAnswer*): Self = StObject.set(x, "answer", js.Array(value :_*))
    
    inline def setDefinition(value: uri): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setItem(value: js.Array[QuestionnaireResponseItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: QuestionnaireResponseItem*): Self = StObject.set(x, "item", js.Array(value :_*))
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def set_definition(value: Element): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    inline def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    inline def set_linkId(value: Element): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
