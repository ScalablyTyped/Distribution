package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedColumnsColumnWidgets extends StObject {
  
  /**
    * ButtonList widget.
    */
  var buttonList: js.UndefOr[SchemaAppsDynamiteSharedButtonList] = js.undefined
  
  /**
    * DateTimePicker widget.
    */
  var dateTimePicker: js.UndefOr[SchemaAppsDynamiteSharedDateTimePicker] = js.undefined
  
  /**
    * DecoratedText widget.
    */
  var decoratedText: js.UndefOr[SchemaAppsDynamiteSharedDecoratedText] = js.undefined
  
  /**
    * Image widget.
    */
  var image: js.UndefOr[SchemaAppsDynamiteSharedImage] = js.undefined
  
  /**
    * SelectionInput widget.
    */
  var selectionInput: js.UndefOr[SchemaAppsDynamiteSharedSelectionInput] = js.undefined
  
  /**
    * TextInput widget.
    */
  var textInput: js.UndefOr[SchemaAppsDynamiteSharedTextInput] = js.undefined
  
  /**
    * Text paragraph widget.
    */
  var textParagraph: js.UndefOr[SchemaAppsDynamiteSharedTextParagraph] = js.undefined
}
object SchemaAppsDynamiteSharedColumnsColumnWidgets {
  
  inline def apply(): SchemaAppsDynamiteSharedColumnsColumnWidgets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedColumnsColumnWidgets]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedColumnsColumnWidgets](x: Self) {
    
    inline def setButtonList(value: SchemaAppsDynamiteSharedButtonList): Self = StObject.set(x, "buttonList", value.asInstanceOf[js.Any])
    
    inline def setButtonListUndefined: Self = StObject.set(x, "buttonList", js.undefined)
    
    inline def setDateTimePicker(value: SchemaAppsDynamiteSharedDateTimePicker): Self = StObject.set(x, "dateTimePicker", value.asInstanceOf[js.Any])
    
    inline def setDateTimePickerUndefined: Self = StObject.set(x, "dateTimePicker", js.undefined)
    
    inline def setDecoratedText(value: SchemaAppsDynamiteSharedDecoratedText): Self = StObject.set(x, "decoratedText", value.asInstanceOf[js.Any])
    
    inline def setDecoratedTextUndefined: Self = StObject.set(x, "decoratedText", js.undefined)
    
    inline def setImage(value: SchemaAppsDynamiteSharedImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setSelectionInput(value: SchemaAppsDynamiteSharedSelectionInput): Self = StObject.set(x, "selectionInput", value.asInstanceOf[js.Any])
    
    inline def setSelectionInputUndefined: Self = StObject.set(x, "selectionInput", js.undefined)
    
    inline def setTextInput(value: SchemaAppsDynamiteSharedTextInput): Self = StObject.set(x, "textInput", value.asInstanceOf[js.Any])
    
    inline def setTextInputUndefined: Self = StObject.set(x, "textInput", js.undefined)
    
    inline def setTextParagraph(value: SchemaAppsDynamiteSharedTextParagraph): Self = StObject.set(x, "textParagraph", value.asInstanceOf[js.Any])
    
    inline def setTextParagraphUndefined: Self = StObject.set(x, "textParagraph", js.undefined)
  }
}
