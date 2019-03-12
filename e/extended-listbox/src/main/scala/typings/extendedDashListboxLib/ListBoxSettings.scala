package typings
package extendedDashListboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxSettings extends js.Object {
  /** function which returns a array of items */
  var getItems: js.UndefOr[js.Function0[js.Array[java.lang.String | ListBoxItem]]] = js.undefined
  /** callback for searchBar text changes */
  var onFilterChanged: js.UndefOr[js.Function1[/* event */ ListBoxEvent, scala.Unit]] = js.undefined
  /** callback for doubleClick event on an item */
  var onItemDoubleClicked: js.UndefOr[js.Function1[/* event */ ListBoxEvent, scala.Unit]] = js.undefined
  /** callback for enter keyPress event on an item */
  var onItemEnterPressed: js.UndefOr[js.Function1[/* event */ ListBoxEvent, scala.Unit]] = js.undefined
  /** callback for item changes (item added, item removed, item order) */
  var onItemsChanged: js.UndefOr[js.Function1[/* event */ ListBoxEvent, scala.Unit]] = js.undefined
  /** callback for selection changes */
  var onValueChanged: js.UndefOr[js.Function1[/* event */ ListBoxEvent, scala.Unit]] = js.undefined
  /** determines if the searchBar is visible */
  var searchBar: js.UndefOr[scala.Boolean] = js.undefined
  /** settings for the searchBar button */
  var searchBarButton: js.UndefOr[ListBoxSearchBarButtonOptions] = js.undefined
  /** watermark (placeholder) for the searchBar */
  var searchBarWatermark: js.UndefOr[java.lang.String] = js.undefined
}

object ListBoxSettings {
  @scala.inline
  def apply(
    getItems: () => js.Array[java.lang.String | ListBoxItem] = null,
    onFilterChanged: /* event */ ListBoxEvent => scala.Unit = null,
    onItemDoubleClicked: /* event */ ListBoxEvent => scala.Unit = null,
    onItemEnterPressed: /* event */ ListBoxEvent => scala.Unit = null,
    onItemsChanged: /* event */ ListBoxEvent => scala.Unit = null,
    onValueChanged: /* event */ ListBoxEvent => scala.Unit = null,
    searchBar: js.UndefOr[scala.Boolean] = js.undefined,
    searchBarButton: ListBoxSearchBarButtonOptions = null,
    searchBarWatermark: java.lang.String = null
  ): ListBoxSettings = {
    val __obj = js.Dynamic.literal()
    if (getItems != null) __obj.updateDynamic("getItems")(js.Any.fromFunction0(getItems))
    if (onFilterChanged != null) __obj.updateDynamic("onFilterChanged")(js.Any.fromFunction1(onFilterChanged))
    if (onItemDoubleClicked != null) __obj.updateDynamic("onItemDoubleClicked")(js.Any.fromFunction1(onItemDoubleClicked))
    if (onItemEnterPressed != null) __obj.updateDynamic("onItemEnterPressed")(js.Any.fromFunction1(onItemEnterPressed))
    if (onItemsChanged != null) __obj.updateDynamic("onItemsChanged")(js.Any.fromFunction1(onItemsChanged))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1(onValueChanged))
    if (!js.isUndefined(searchBar)) __obj.updateDynamic("searchBar")(searchBar)
    if (searchBarButton != null) __obj.updateDynamic("searchBarButton")(searchBarButton)
    if (searchBarWatermark != null) __obj.updateDynamic("searchBarWatermark")(searchBarWatermark)
    __obj.asInstanceOf[ListBoxSettings]
  }
}

