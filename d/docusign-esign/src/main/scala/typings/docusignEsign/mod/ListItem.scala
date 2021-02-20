package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItem extends StObject {
  
  /**
    * When set to **true**, indicates that this item is the default selection shown to a signer.
    *
    * Only one selection can be set as the default.
    */
  var selected: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `selected` property is editable.
    */
  var selectedMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the text that is shown in the dropdown list.
    */
  var text: js.UndefOr[String] = js.native
  
  var textMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Specifies the value that is used when the list item is selected.
    */
  var value: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `value` property is editable.
    */
  var valueMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
}
object ListItem {
  
  @scala.inline
  def apply(): ListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItem]
  }
  
  @scala.inline
  implicit class ListItemMutableBuilder[Self <: ListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "selectedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedMetadataUndefined: Self = StObject.set(x, "selectedMetadata", js.undefined)
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "textMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMetadataUndefined: Self = StObject.set(x, "textMetadata", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "valueMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueMetadataUndefined: Self = StObject.set(x, "valueMetadata", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
