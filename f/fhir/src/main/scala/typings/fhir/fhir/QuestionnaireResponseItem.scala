package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Groups and questions
  */
@js.native
trait QuestionnaireResponseItem extends BackboneElement {
  
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'linkId'.
    */
  var _linkId: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  
  /**
    * The response(s) to the question
    */
  var answer: js.UndefOr[js.Array[QuestionnaireResponseItemAnswer]] = js.native
  
  /**
    * ElementDefinition - details for the item
    */
  var definition: js.UndefOr[uri] = js.native
  
  /**
    * Nested questionnaire response items
    */
  var item: js.UndefOr[js.Array[QuestionnaireResponseItem]] = js.native
  
  /**
    * Pointer to specific item from Questionnaire
    */
  var linkId: String = js.native
  
  /**
    * The subject this group's answers are about
    */
  var subject: js.UndefOr[Reference] = js.native
  
  /**
    * Name for group or question text
    */
  var text: js.UndefOr[String] = js.native
}
object QuestionnaireResponseItem {
  
  @scala.inline
  def apply(linkId: String): QuestionnaireResponseItem = {
    val __obj = js.Dynamic.literal(linkId = linkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireResponseItem]
  }
  
  @scala.inline
  implicit class QuestionnaireResponseItemMutableBuilder[Self <: QuestionnaireResponseItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnswer(value: js.Array[QuestionnaireResponseItemAnswer]): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
    
    @scala.inline
    def setAnswerVarargs(value: QuestionnaireResponseItemAnswer*): Self = StObject.set(x, "answer", js.Array(value :_*))
    
    @scala.inline
    def setDefinition(value: uri): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setItem(value: js.Array[QuestionnaireResponseItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setItemVarargs(value: QuestionnaireResponseItem*): Self = StObject.set(x, "item", js.Array(value :_*))
    
    @scala.inline
    def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def set_definition(value: Element): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    @scala.inline
    def set_linkId(value: Element): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
    
    @scala.inline
    def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
