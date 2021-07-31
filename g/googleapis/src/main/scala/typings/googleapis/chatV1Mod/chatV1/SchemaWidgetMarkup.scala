package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A widget is a UI element that presents texts, images, etc.
  */
trait SchemaWidgetMarkup extends StObject {
  
  /**
    * A list of buttons. Buttons is also oneof data and only one of these
    * fields should be set.
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
  
  @scala.inline
  def apply(): SchemaWidgetMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWidgetMarkup]
  }
  
  @scala.inline
  implicit class SchemaWidgetMarkupMutableBuilder[Self <: SchemaWidgetMarkup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[SchemaButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: SchemaButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setKeyValue(value: SchemaKeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
    
    @scala.inline
    def setTextParagraph(value: SchemaTextParagraph): Self = StObject.set(x, "textParagraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextParagraphUndefined: Self = StObject.set(x, "textParagraph", js.undefined)
  }
}
