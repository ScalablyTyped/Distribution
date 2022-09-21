package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedSelectionInputSelectionItem extends StObject {
  
  /**
    * If more than one item is selected for `RADIO_BUTTON` and `DROPDOWN`, the first selected item is treated as selected and the ones after are ignored.
    */
  var selected: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The text to be displayed.
    */
  var text: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value associated with this item. The client should use this as a form input value.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedSelectionInputSelectionItem {
  
  inline def apply(): SchemaAppsDynamiteSharedSelectionInputSelectionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedSelectionInputSelectionItem]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedSelectionInputSelectionItem](x: Self) {
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedNull: Self = StObject.set(x, "selected", null)
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
