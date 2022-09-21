package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionnaireResponseGroup
  extends StObject
     with BackboneElement {
  
  var _linkId: js.UndefOr[Element] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Reports can consist of complex nested groups.
    */
  var group: js.UndefOr[js.Array[QuestionnaireResponseGroup]] = js.undefined
  
  /**
    * Groups can repeat in the answers, so a direct 1..1 correspondence may not exist - requiring correspondence by identifier.
    */
  var linkId: js.UndefOr[String] = js.undefined
  
  /**
    * Must register answers to questions.
    */
  var question: js.UndefOr[js.Array[QuestionnaireResponseGroupQuestion]] = js.undefined
  
  /**
    * Sometimes a group of answers is about a specific participant, artifact or piece of information in the patient's care or record, e.g. a specific Problem, RelatedPerson, Allergy etc.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * When including text for the questionnaire, each section may contain additional explanations are background text.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * When including text for the questionnaire with the answers, sections may have a section header.
    */
  var title: js.UndefOr[String] = js.undefined
}
object QuestionnaireResponseGroup {
  
  inline def apply(): QuestionnaireResponseGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuestionnaireResponseGroup]
  }
  
  extension [Self <: QuestionnaireResponseGroup](x: Self) {
    
    inline def setGroup(value: js.Array[QuestionnaireResponseGroup]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGroupVarargs(value: QuestionnaireResponseGroup*): Self = StObject.set(x, "group", js.Array(value*))
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
    inline def setQuestion(value: js.Array[QuestionnaireResponseGroupQuestion]): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    inline def setQuestionUndefined: Self = StObject.set(x, "question", js.undefined)
    
    inline def setQuestionVarargs(value: QuestionnaireResponseGroupQuestion*): Self = StObject.set(x, "question", js.Array(value*))
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def set_linkId(value: Element): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
