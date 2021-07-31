package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A input field widget that accepts text input.
  *
  *     var textInput = CardService.newTextInput()
  *         .setFieldName("text_input_form_input_key")
  *         .setTitle("Text input title")
  *         .setHint("Text input hint");
  */
trait TextInput extends StObject {
  
  def setFieldName(fieldName: String): TextInput
  
  def setHint(hint: String): TextInput
  
  def setMultiline(multiline: Boolean): TextInput
  
  def setOnChangeAction(action: Action): TextInput
  
  def setSuggestions(suggestions: Suggestions): TextInput
  
  def setSuggestionsAction(suggestionsAction: Action): TextInput
  
  def setTitle(title: String): TextInput
  
  def setValue(value: String): TextInput
}
object TextInput {
  
  @scala.inline
  def apply(
    setFieldName: String => TextInput,
    setHint: String => TextInput,
    setMultiline: Boolean => TextInput,
    setOnChangeAction: Action => TextInput,
    setSuggestions: Suggestions => TextInput,
    setSuggestionsAction: Action => TextInput,
    setTitle: String => TextInput,
    setValue: String => TextInput
  ): TextInput = {
    val __obj = js.Dynamic.literal(setFieldName = js.Any.fromFunction1(setFieldName), setHint = js.Any.fromFunction1(setHint), setMultiline = js.Any.fromFunction1(setMultiline), setOnChangeAction = js.Any.fromFunction1(setOnChangeAction), setSuggestions = js.Any.fromFunction1(setSuggestions), setSuggestionsAction = js.Any.fromFunction1(setSuggestionsAction), setTitle = js.Any.fromFunction1(setTitle), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[TextInput]
  }
  
  @scala.inline
  implicit class TextInputMutableBuilder[Self <: TextInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetFieldName(value: String => TextInput): Self = StObject.set(x, "setFieldName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHint(value: String => TextInput): Self = StObject.set(x, "setHint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMultiline(value: Boolean => TextInput): Self = StObject.set(x, "setMultiline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnChangeAction(value: Action => TextInput): Self = StObject.set(x, "setOnChangeAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSuggestions(value: Suggestions => TextInput): Self = StObject.set(x, "setSuggestions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSuggestionsAction(value: Action => TextInput): Self = StObject.set(x, "setSuggestionsAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => TextInput): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: String => TextInput): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
  }
}
