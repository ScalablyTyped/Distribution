package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientComboBox.ItemFiltering and ASPxClientListBox.ItemFiltering events.
  */
trait ASPxClientListEditItemFilteringEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a string that is a filter condition for the editor's items typed by a user.
    */
  var filter: String
  
  /**
    * Specifies whether the item should be shown in the search result.
    */
  var isFit: Boolean
  
  /**
    * Gets the editor item object related to the event.
    */
  var item: ASPxClientListEditItem
}
object ASPxClientListEditItemFilteringEventArgs {
  
  inline def apply(filter: String, isFit: Boolean, item: ASPxClientListEditItem): ASPxClientListEditItemFilteringEventArgs = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], isFit = isFit.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientListEditItemFilteringEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientListEditItemFilteringEventArgs] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setIsFit(value: Boolean): Self = StObject.set(x, "isFit", value.asInstanceOf[js.Any])
    
    inline def setItem(value: ASPxClientListEditItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
