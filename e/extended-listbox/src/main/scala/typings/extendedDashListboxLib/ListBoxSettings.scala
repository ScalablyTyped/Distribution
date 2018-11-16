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

