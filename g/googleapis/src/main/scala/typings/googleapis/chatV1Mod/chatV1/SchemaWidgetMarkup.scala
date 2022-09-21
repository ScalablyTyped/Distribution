package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWidgetMarkup extends StObject {
  
  /**
    * A list of buttons. Buttons is also oneof data and only one of these fields should be set.
    */
  var buttons: js.UndefOr[js.Array[SchemaButton]] = js.undefined
  
  /**
    * Display an image in this widget.
    */
  var image: js.UndefOr[SchemaImage] = js.undefined
  
  /**
    * Display a key value item in this widget.
    */
  var keyValue: js.UndefOr[SchemaKeyValue] = js.undefined
  
  /**
    * Display a text paragraph in this widget.
    */
  var textParagraph: js.UndefOr[SchemaTextParagraph] = js.undefined
}
object SchemaWidgetMarkup {
  
  inline def apply(): SchemaWidgetMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWidgetMarkup]
  }
  
  extension [Self <: SchemaWidgetMarkup](x: Self) {
    
    inline def setButtons(value: js.Array[SchemaButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: SchemaButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setKeyValue(value: SchemaKeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
    
    inline def setTextParagraph(value: SchemaTextParagraph): Self = StObject.set(x, "textParagraph", value.asInstanceOf[js.Any])
    
    inline def setTextParagraphUndefined: Self = StObject.set(x, "textParagraph", js.undefined)
  }
}
