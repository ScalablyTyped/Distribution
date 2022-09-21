package typings.fhir.mod

import typings.fhir.fhirStrings.`open-choice`
import typings.fhir.fhirStrings.attachment
import typings.fhir.fhirStrings.boolean
import typings.fhir.fhirStrings.choice
import typings.fhir.fhirStrings.date
import typings.fhir.fhirStrings.dateTime
import typings.fhir.fhirStrings.decimal
import typings.fhir.fhirStrings.instant
import typings.fhir.fhirStrings.integer
import typings.fhir.fhirStrings.quantity_
import typings.fhir.fhirStrings.reference
import typings.fhir.fhirStrings.string
import typings.fhir.fhirStrings.text
import typings.fhir.fhirStrings.time
import typings.fhir.fhirStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionnaireGroupQuestion
  extends StObject
     with BackboneElement {
  
  var _linkId: js.UndefOr[Element] = js.undefined
  
  var _repeats: js.UndefOr[Element] = js.undefined
  
  var _required: js.UndefOr[Element] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Allows linking of questions (and their answers) to formal terminologies.
    */
  var concept: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * It is useful to have "sub-questions", questions which normally appear when certain answers are given and which collect additional details.
    */
  var group: js.UndefOr[js.Array[QuestionnaireGroup]] = js.undefined
  
  /**
    * [[[QuestionnaireResponse]]] does not require omitted groups to be included and may have some groups that repeat, so linkage based on position alone is not sufficient.
    */
  var linkId: js.UndefOr[String] = js.undefined
  
  /**
    * For a "choice" question, identifies one of the permitted answers for the question.
    */
  var option: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Reference to a value set containing a list of codes representing permitted answers for the question.
    */
  var options: js.UndefOr[Reference] = js.undefined
  
  /**
    * Used for "check all that apply" types of questions or "list your top 3", etc.
    */
  var repeats: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, indicates that the question must be answered and have required groups within it also present.  If false, the question and any contained groups may be skipped when answering the questionnaire.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When including text for the questionnaire, each question may contain its actual question display text.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the format in which the user is to be prompted for the answer.
    */
  var `type`: js.UndefOr[
    boolean | decimal | integer | date | dateTime | instant | time | string | text | url | choice | `open-choice` | attachment | reference | quantity_
  ] = js.undefined
}
object QuestionnaireGroupQuestion {
  
  inline def apply(): QuestionnaireGroupQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuestionnaireGroupQuestion]
  }
  
  extension [Self <: QuestionnaireGroupQuestion](x: Self) {
    
    inline def setConcept(value: js.Array[Coding]): Self = StObject.set(x, "concept", value.asInstanceOf[js.Any])
    
    inline def setConceptUndefined: Self = StObject.set(x, "concept", js.undefined)
    
    inline def setConceptVarargs(value: Coding*): Self = StObject.set(x, "concept", js.Array(value*))
    
    inline def setGroup(value: js.Array[QuestionnaireGroup]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGroupVarargs(value: QuestionnaireGroup*): Self = StObject.set(x, "group", js.Array(value*))
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
    inline def setOption(value: js.Array[Coding]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    inline def setOptionVarargs(value: Coding*): Self = StObject.set(x, "option", js.Array(value*))
    
    inline def setOptions(value: Reference): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setRepeats(value: Boolean): Self = StObject.set(x, "repeats", value.asInstanceOf[js.Any])
    
    inline def setRepeatsUndefined: Self = StObject.set(x, "repeats", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(
      value: boolean | decimal | integer | date | dateTime | instant | time | string | text | url | choice | `open-choice` | attachment | reference | quantity_
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_linkId(value: Element): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
    
    inline def set_repeats(value: Element): Self = StObject.set(x, "_repeats", value.asInstanceOf[js.Any])
    
    inline def set_repeatsUndefined: Self = StObject.set(x, "_repeats", js.undefined)
    
    inline def set_required(value: Element): Self = StObject.set(x, "_required", value.asInstanceOf[js.Any])
    
    inline def set_requiredUndefined: Self = StObject.set(x, "_required", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
