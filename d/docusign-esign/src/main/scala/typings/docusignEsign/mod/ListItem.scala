package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItem extends StObject {
  
  /**
    * When set to **true**, indicates that this item is the default selection shown to a signer.
    *
    * Only one selection can be set as the default.
    */
  var selected: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `selected` property is editable.
    */
  var selectedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Specifies the text that is shown in the dropdown list.
    */
  var text: js.UndefOr[String] = js.undefined
  
  var textMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Specifies the value that is used when the list item is selected.
    */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `value` property is editable.
    */
  var valueMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
}
object ListItem {
  
  inline def apply(): ListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItem]
  }
  
  extension [Self <: ListItem](x: Self) {
    
    inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "selectedMetadata", value.asInstanceOf[js.Any])
    
    inline def setSelectedMetadataUndefined: Self = StObject.set(x, "selectedMetadata", js.undefined)
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "textMetadata", value.asInstanceOf[js.Any])
    
    inline def setTextMetadataUndefined: Self = StObject.set(x, "textMetadata", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "valueMetadata", value.asInstanceOf[js.Any])
    
    inline def setValueMetadataUndefined: Self = StObject.set(x, "valueMetadata", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
