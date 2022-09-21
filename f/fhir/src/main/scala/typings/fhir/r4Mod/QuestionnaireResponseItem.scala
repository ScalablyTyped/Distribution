package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionnaireResponseItem
  extends StObject
     with BackboneElement {
  
  var _definition: js.UndefOr[Element] = js.undefined
  
  var _linkId: js.UndefOr[Element] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * The value is nested because we cannot have a repeating structure that has variable type.
    */
  var answer: js.UndefOr[js.Array[QuestionnaireResponseItemAnswer]] = js.undefined
  
  /**
    * The ElementDefinition must be in a [StructureDefinition](structuredefinition.html#), and must have a fragment identifier that identifies the specific data element by its id (Element.id). E.g. http://hl7.org/fhir/StructureDefinition/Observation#Observation.value[x].
    * There is no need for this element if the item pointed to by the linkId has a definition listed.
    */
  var definition: js.UndefOr[String] = js.undefined
  
  /**
    * Questions or sub-groups nested beneath a question or group.
    */
  var item: js.UndefOr[js.Array[QuestionnaireResponseItem]] = js.undefined
  
  /**
    * The item from the Questionnaire that corresponds to this item in the QuestionnaireResponse resource.
    */
  var linkId: String
  
  /**
    * Text that is displayed above the contents of the group or as the text of the question being answered.
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
    
    inline def setAnswerVarargs(value: QuestionnaireResponseItemAnswer*): Self = StObject.set(x, "answer", js.Array(value*))
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setItem(value: js.Array[QuestionnaireResponseItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: QuestionnaireResponseItem*): Self = StObject.set(x, "item", js.Array(value*))
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
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
