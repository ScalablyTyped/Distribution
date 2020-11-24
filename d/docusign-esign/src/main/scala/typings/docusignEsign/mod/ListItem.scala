package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItem extends js.Object {
  
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
  implicit class ListItemOps[Self <: ListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSelectedMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("selectedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedMetadata: Self = this.set("selectedMetadata", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("textMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextMetadata: Self = this.set("textMetadata", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("valueMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueMetadata: Self = this.set("valueMetadata", js.undefined)
  }
}
