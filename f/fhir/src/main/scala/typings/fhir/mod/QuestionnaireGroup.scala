package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionnaireGroup
  extends StObject
     with BackboneElement {
  
  var _linkId: js.UndefOr[Element] = js.undefined
  
  var _repeats: js.UndefOr[Element] = js.undefined
  
  var _required: js.UndefOr[Element] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Allows linking of groups of questions (and complete Questionnaire resources) to formal terminologies.
    */
  var concept: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Reports can consist of complex nested groups.
    */
  var group: js.UndefOr[js.Array[QuestionnaireGroup]] = js.undefined
  
  /**
    * [[[QuestionnaireResponse]]] does not require omitted groups to be included and may have some groups that repeat, so linkage based on position alone is not sufficient.
    */
  var linkId: js.UndefOr[String] = js.undefined
  
  /**
    * Must register answers to questions.
    */
  var question: js.UndefOr[js.Array[QuestionnaireGroupQuestion]] = js.undefined
  
  /**
    * Groups may be used to create set of (related) questions that can be repeated to give multiple answers to such a set.
    */
  var repeats: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, indicates that the group must be present and have required questions within it answered.  If false, the group may be skipped when answering the questionnaire.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When including text for the questionnaire, each section may contain additional explanations are background text.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * When including text for the questionnaire with the answers, sections may have a section header.
    */
  var title: js.UndefOr[String] = js.undefined
}
object QuestionnaireGroup {
  
  inline def apply(): QuestionnaireGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuestionnaireGroup]
  }
  
  extension [Self <: QuestionnaireGroup](x: Self) {
    
    inline def setConcept(value: js.Array[Coding]): Self = StObject.set(x, "concept", value.asInstanceOf[js.Any])
    
    inline def setConceptUndefined: Self = StObject.set(x, "concept", js.undefined)
    
    inline def setConceptVarargs(value: Coding*): Self = StObject.set(x, "concept", js.Array(value*))
    
    inline def setGroup(value: js.Array[QuestionnaireGroup]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGroupVarargs(value: QuestionnaireGroup*): Self = StObject.set(x, "group", js.Array(value*))
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
    inline def setQuestion(value: js.Array[QuestionnaireGroupQuestion]): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    inline def setQuestionUndefined: Self = StObject.set(x, "question", js.undefined)
    
    inline def setQuestionVarargs(value: QuestionnaireGroupQuestion*): Self = StObject.set(x, "question", js.Array(value*))
    
    inline def setRepeats(value: Boolean): Self = StObject.set(x, "repeats", value.asInstanceOf[js.Any])
    
    inline def setRepeatsUndefined: Self = StObject.set(x, "repeats", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def set_linkId(value: Element): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
    
    inline def set_repeats(value: Element): Self = StObject.set(x, "_repeats", value.asInstanceOf[js.Any])
    
    inline def set_repeatsUndefined: Self = StObject.set(x, "_repeats", js.undefined)
    
    inline def set_required(value: Element): Self = StObject.set(x, "_required", value.asInstanceOf[js.Any])
    
    inline def set_requiredUndefined: Self = StObject.set(x, "_required", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
