package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1TextInput extends StObject {
  
  /**
    * The refresh function that returns suggestions based on the user's input text. If the callback is not specified, autocomplete is done in client side based on the initial suggestion items.
    */
  var autoCompleteAction: js.UndefOr[SchemaGoogleAppsCardV1Action] = js.undefined
  
  /**
    * The hint text.
    */
  var hintText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The initial suggestions made before any user input.
    */
  var initialSuggestions: js.UndefOr[SchemaGoogleAppsCardV1Suggestions] = js.undefined
  
  /**
    * At least one of label and hintText must be specified.
    */
  var label: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the text input which is used in `formInput`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The onChange action, for example, invoke a function.
    */
  var onChangeAction: js.UndefOr[SchemaGoogleAppsCardV1Action] = js.undefined
  
  /**
    * The style of the text, for example, a single line or multiple lines.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The default value when there is no input from the user.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsCardV1TextInput {
  
  inline def apply(): SchemaGoogleAppsCardV1TextInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1TextInput]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1TextInput](x: Self) {
    
    inline def setAutoCompleteAction(value: SchemaGoogleAppsCardV1Action): Self = StObject.set(x, "autoCompleteAction", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteActionUndefined: Self = StObject.set(x, "autoCompleteAction", js.undefined)
    
    inline def setHintText(value: String): Self = StObject.set(x, "hintText", value.asInstanceOf[js.Any])
    
    inline def setHintTextNull: Self = StObject.set(x, "hintText", null)
    
    inline def setHintTextUndefined: Self = StObject.set(x, "hintText", js.undefined)
    
    inline def setInitialSuggestions(value: SchemaGoogleAppsCardV1Suggestions): Self = StObject.set(x, "initialSuggestions", value.asInstanceOf[js.Any])
    
    inline def setInitialSuggestionsUndefined: Self = StObject.set(x, "initialSuggestions", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChangeAction(value: SchemaGoogleAppsCardV1Action): Self = StObject.set(x, "onChangeAction", value.asInstanceOf[js.Any])
    
    inline def setOnChangeActionUndefined: Self = StObject.set(x, "onChangeAction", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
