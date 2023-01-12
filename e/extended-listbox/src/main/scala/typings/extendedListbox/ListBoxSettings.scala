package typings.extendedListbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBoxSettings extends StObject {
  
  /** function which returns a array of items */
  var getItems: js.UndefOr[js.Function0[js.Array[String | ListBoxItem]]] = js.undefined
  
  /** callback for searchBar text changes */
  var onFilterChanged: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.undefined
  
  /** callback for doubleClick event on an item */
  var onItemDoubleClicked: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.undefined
  
  /** callback for enter keyPress event on an item */
  var onItemEnterPressed: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.undefined
  
  /** callback for item changes (item added, item removed, item order) */
  var onItemsChanged: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.undefined
  
  /** callback for selection changes */
  var onValueChanged: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.undefined
  
  /** determines if the searchBar is visible */
  var searchBar: js.UndefOr[Boolean] = js.undefined
  
  /** settings for the searchBar button */
  var searchBarButton: js.UndefOr[ListBoxSearchBarButtonOptions] = js.undefined
  
  /** watermark (placeholder) for the searchBar */
  var searchBarWatermark: js.UndefOr[String] = js.undefined
}
object ListBoxSettings {
  
  inline def apply(): ListBoxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBoxSettings] (val x: Self) extends AnyVal {
    
    inline def setGetItems(value: () => js.Array[String | ListBoxItem]): Self = StObject.set(x, "getItems", js.Any.fromFunction0(value))
    
    inline def setGetItemsUndefined: Self = StObject.set(x, "getItems", js.undefined)
    
    inline def setOnFilterChanged(value: /* event */ ListBoxEvent => Unit): Self = StObject.set(x, "onFilterChanged", js.Any.fromFunction1(value))
    
    inline def setOnFilterChangedUndefined: Self = StObject.set(x, "onFilterChanged", js.undefined)
    
    inline def setOnItemDoubleClicked(value: /* event */ ListBoxEvent => Unit): Self = StObject.set(x, "onItemDoubleClicked", js.Any.fromFunction1(value))
    
    inline def setOnItemDoubleClickedUndefined: Self = StObject.set(x, "onItemDoubleClicked", js.undefined)
    
    inline def setOnItemEnterPressed(value: /* event */ ListBoxEvent => Unit): Self = StObject.set(x, "onItemEnterPressed", js.Any.fromFunction1(value))
    
    inline def setOnItemEnterPressedUndefined: Self = StObject.set(x, "onItemEnterPressed", js.undefined)
    
    inline def setOnItemsChanged(value: /* event */ ListBoxEvent => Unit): Self = StObject.set(x, "onItemsChanged", js.Any.fromFunction1(value))
    
    inline def setOnItemsChangedUndefined: Self = StObject.set(x, "onItemsChanged", js.undefined)
    
    inline def setOnValueChanged(value: /* event */ ListBoxEvent => Unit): Self = StObject.set(x, "onValueChanged", js.Any.fromFunction1(value))
    
    inline def setOnValueChangedUndefined: Self = StObject.set(x, "onValueChanged", js.undefined)
    
    inline def setSearchBar(value: Boolean): Self = StObject.set(x, "searchBar", value.asInstanceOf[js.Any])
    
    inline def setSearchBarButton(value: ListBoxSearchBarButtonOptions): Self = StObject.set(x, "searchBarButton", value.asInstanceOf[js.Any])
    
    inline def setSearchBarButtonUndefined: Self = StObject.set(x, "searchBarButton", js.undefined)
    
    inline def setSearchBarUndefined: Self = StObject.set(x, "searchBar", js.undefined)
    
    inline def setSearchBarWatermark(value: String): Self = StObject.set(x, "searchBarWatermark", value.asInstanceOf[js.Any])
    
    inline def setSearchBarWatermarkUndefined: Self = StObject.set(x, "searchBarWatermark", js.undefined)
  }
}
