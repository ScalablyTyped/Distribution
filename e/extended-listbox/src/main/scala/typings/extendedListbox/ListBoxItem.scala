package typings.extendedListbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBoxItem extends StObject {
  
  /** list of childItems */
  var childItems: js.UndefOr[js.Array[String | ListBoxItem]] = js.native
  
  /** determines if the item should be clickable */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** determines if the item has childItems */
  var groupHeader: js.UndefOr[Boolean] = js.native
  
  /** unique identifier, if not set it will be generated */
  var id: js.UndefOr[String] = js.native
  
  /** index position from the item in the list; only used for manual addItem api calls */
  var index: js.UndefOr[Double] = js.native
  
  /** display text or id of the parent; only used for manual addItem api calls */
  var parentGroupId: js.UndefOr[String] = js.native
  
  /** determines if the item is selected */
  var selected: js.UndefOr[Boolean] = js.native
  
  /** display text */
  var text: js.UndefOr[String] = js.native
}
object ListBoxItem {
  
  @scala.inline
  def apply(): ListBoxItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxItem]
  }
  
  @scala.inline
  implicit class ListBoxItemMutableBuilder[Self <: ListBoxItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildItems(value: js.Array[String | ListBoxItem]): Self = StObject.set(x, "childItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildItemsUndefined: Self = StObject.set(x, "childItems", js.undefined)
    
    @scala.inline
    def setChildItemsVarargs(value: (String | ListBoxItem)*): Self = StObject.set(x, "childItems", js.Array(value :_*))
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setGroupHeader(value: Boolean): Self = StObject.set(x, "groupHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupHeaderUndefined: Self = StObject.set(x, "groupHeader", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setParentGroupId(value: String): Self = StObject.set(x, "parentGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentGroupIdUndefined: Self = StObject.set(x, "parentGroupId", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
