package typings.extendedListbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBoxSettings extends js.Object {
  
  /** function which returns a array of items */
  var getItems: js.UndefOr[js.Function0[js.Array[String | ListBoxItem]]] = js.native
  
  /** callback for searchBar text changes */
  var onFilterChanged: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.native
  
  /** callback for doubleClick event on an item */
  var onItemDoubleClicked: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.native
  
  /** callback for enter keyPress event on an item */
  var onItemEnterPressed: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.native
  
  /** callback for item changes (item added, item removed, item order) */
  var onItemsChanged: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.native
  
  /** callback for selection changes */
  var onValueChanged: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.native
  
  /** determines if the searchBar is visible */
  var searchBar: js.UndefOr[Boolean] = js.native
  
  /** settings for the searchBar button */
  var searchBarButton: js.UndefOr[ListBoxSearchBarButtonOptions] = js.native
  
  /** watermark (placeholder) for the searchBar */
  var searchBarWatermark: js.UndefOr[String] = js.native
}
object ListBoxSettings {
  
  @scala.inline
  def apply(): ListBoxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxSettings]
  }
  
  @scala.inline
  implicit class ListBoxSettingsOps[Self <: ListBoxSettings] (val x: Self) extends AnyVal {
    
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
    def setGetItems(value: () => js.Array[String | ListBoxItem]): Self = this.set("getItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetItems: Self = this.set("getItems", js.undefined)
    
    @scala.inline
    def setOnFilterChanged(value: /* event */ ListBoxEvent => Unit): Self = this.set("onFilterChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFilterChanged: Self = this.set("onFilterChanged", js.undefined)
    
    @scala.inline
    def setOnItemDoubleClicked(value: /* event */ ListBoxEvent => Unit): Self = this.set("onItemDoubleClicked", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemDoubleClicked: Self = this.set("onItemDoubleClicked", js.undefined)
    
    @scala.inline
    def setOnItemEnterPressed(value: /* event */ ListBoxEvent => Unit): Self = this.set("onItemEnterPressed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemEnterPressed: Self = this.set("onItemEnterPressed", js.undefined)
    
    @scala.inline
    def setOnItemsChanged(value: /* event */ ListBoxEvent => Unit): Self = this.set("onItemsChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemsChanged: Self = this.set("onItemsChanged", js.undefined)
    
    @scala.inline
    def setOnValueChanged(value: /* event */ ListBoxEvent => Unit): Self = this.set("onValueChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValueChanged: Self = this.set("onValueChanged", js.undefined)
    
    @scala.inline
    def setSearchBar(value: Boolean): Self = this.set("searchBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchBar: Self = this.set("searchBar", js.undefined)
    
    @scala.inline
    def setSearchBarButton(value: ListBoxSearchBarButtonOptions): Self = this.set("searchBarButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchBarButton: Self = this.set("searchBarButton", js.undefined)
    
    @scala.inline
    def setSearchBarWatermark(value: String): Self = this.set("searchBarWatermark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchBarWatermark: Self = this.set("searchBarWatermark", js.undefined)
  }
}
