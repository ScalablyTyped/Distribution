package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionnaireResponseGroupQuestion
  extends StObject
     with BackboneElement {
  
  var _linkId: js.UndefOr[Element] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * The respondent's answer(s) to the question.
    */
  var answer: js.UndefOr[js.Array[QuestionnaireResponseGroupQuestionAnswer]] = js.undefined
  
  /**
    * Groups can repeat in the answers, so a direct 1..1 correspondence may not exist - requiring correspondence by id.
    */
  var linkId: js.UndefOr[String] = js.undefined
  
  /**
    * When including text for the questionnaire, each question may contain its actual question display text.
    */
  var text: js.UndefOr[String] = js.undefined
}
object QuestionnaireResponseGroupQuestion {
  
  inline def apply(): QuestionnaireResponseGroupQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuestionnaireResponseGroupQuestion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuestionnaireResponseGroupQuestion] (val x: Self) extends AnyVal {
    
    inline def setAnswer(value: js.Array[QuestionnaireResponseGroupQuestionAnswer]): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    inline def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
    
    inline def setAnswerVarargs(value: QuestionnaireResponseGroupQuestionAnswer*): Self = StObject.set(x, "answer", js.Array(value*))
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def set_linkId(value: Element): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
