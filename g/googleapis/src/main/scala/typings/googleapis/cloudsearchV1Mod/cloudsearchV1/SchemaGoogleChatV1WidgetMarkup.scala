package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChatV1WidgetMarkup extends StObject {
  
  /**
    * A list of buttons. Buttons is also oneof data and only one of these fields should be set.
    */
  var buttons: js.UndefOr[js.Array[SchemaGoogleChatV1WidgetMarkupButton]] = js.undefined
  
  /**
    * Display an image in this widget.
    */
  var image: js.UndefOr[SchemaGoogleChatV1WidgetMarkupImage] = js.undefined
  
  /**
    * Display a key value item in this widget.
    */
  var keyValue: js.UndefOr[SchemaGoogleChatV1WidgetMarkupKeyValue] = js.undefined
  
  /**
    * Display a text paragraph in this widget.
    */
  var textParagraph: js.UndefOr[SchemaGoogleChatV1WidgetMarkupTextParagraph] = js.undefined
}
object SchemaGoogleChatV1WidgetMarkup {
  
  inline def apply(): SchemaGoogleChatV1WidgetMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChatV1WidgetMarkup]
  }
  
  extension [Self <: SchemaGoogleChatV1WidgetMarkup](x: Self) {
    
    inline def setButtons(value: js.Array[SchemaGoogleChatV1WidgetMarkupButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: SchemaGoogleChatV1WidgetMarkupButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setImage(value: SchemaGoogleChatV1WidgetMarkupImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setKeyValue(value: SchemaGoogleChatV1WidgetMarkupKeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
    
    inline def setTextParagraph(value: SchemaGoogleChatV1WidgetMarkupTextParagraph): Self = StObject.set(x, "textParagraph", value.asInstanceOf[js.Any])
    
    inline def setTextParagraphUndefined: Self = StObject.set(x, "textParagraph", js.undefined)
  }
}
