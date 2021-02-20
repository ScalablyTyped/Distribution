package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientComboBox.ItemFiltering and ASPxClientListBox.ItemFiltering events.
  */
@js.native
trait ASPxClientListEditItemFilteringEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a string that is a filter condition for the editor's items typed by a user.
    */
  var filter: String = js.native
  
  /**
    * Specifies whether the item should be shown in the search result.
    */
  var isFit: Boolean = js.native
  
  /**
    * Gets the editor item object related to the event.
    */
  var item: ASPxClientListEditItem = js.native
}
object ASPxClientListEditItemFilteringEventArgs {
  
  @scala.inline
  def apply(filter: String, isFit: Boolean, item: ASPxClientListEditItem): ASPxClientListEditItemFilteringEventArgs = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], isFit = isFit.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientListEditItemFilteringEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientListEditItemFilteringEventArgsMutableBuilder[Self <: ASPxClientListEditItemFilteringEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFit(value: Boolean): Self = StObject.set(x, "isFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: ASPxClientListEditItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
