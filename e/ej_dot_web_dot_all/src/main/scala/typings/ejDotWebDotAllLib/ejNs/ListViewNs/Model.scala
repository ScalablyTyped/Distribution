package typings
package ejDotWebDotAllLib.ejNs.ListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Model extends js.Object {
  /** Event triggers before the AJAX request happens.
               */
  var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, scala.Unit]] = js.undefined
  /** Event triggers after the AJAX content loaded completely.
               */
  var ajaxComplete: js.UndefOr[js.Function1[/* e */ AjaxCompleteEventArgs, scala.Unit]] = js.undefined
  /** Event triggers when the AJAX request failed.
               */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, scala.Unit]] = js.undefined
  /** Specifies the ajaxSettings option to load the items to the ListView control.
               * @Default {null}
               */
  var ajaxSettings: js.UndefOr[AjaxSettings] = js.undefined
  /** Event triggers after the AJAX content loaded successfully.
               */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, scala.Unit]] = js.undefined
  /** Loads the list data on demand via scrolling behavior to improve the applicationâ€™s performance. There are two ways to load data which can be defined using virtualScrollMode
               * property.
               * @Default {false}
               */
  var allowVirtualScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /** Set the index values to be selected on initial loading. This works only when enableCheckMark is set true.
               * @Default {[]}
               */
  var checkedIndices: js.UndefOr[js.Array[_]] = js.undefined
  /** Sets the root class for ListView theme. This cssClass API helps to use custom skinning option for ListView control. By defining the root class using this API, we need to include
               * this root class in CSS.
               */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Contains the list of data for generating the ListView items.
               * @Default {[]}
               */
  var dataSource: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies whether to load AJAX content while selecting item.
               * @Default {false}
               */
  var enableAjax: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to enable caching the content.
               * @Default {false}
               */
  var enableCache: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to enable check mark for the item.
               * @Default {false}
               */
  var enableCheckMark: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to enable the filtering feature to filter the item.
               * @Default {false}
               */
  var enableFiltering: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to group the list item.
               * @Default {false}
               */
  var enableGroupList: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies to maintain the current model value to browser cookies for state maintenance. While refresh the page, the model value will get apply to the control from browser cookies.
               * @Default {false}
               */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the field settings to map the datasource.
               */
  var fieldSettings: js.UndefOr[FieldSettings] = js.undefined
  /** Specifies the text of the back button in the header.
               * @Default {null}
               */
  var headerBackButtonText: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the title of the header.
               * @Default {Title}
               */
  var headerTitle: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the height.
               * @Default {null}
               */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Specifies the number of items to be fetched on each scroll. Note: This property works only with Virtual scrolling.
               * @Default {5}
               */
  var itemRequestCount: js.UndefOr[scala.Double] = js.undefined
  /** Contains the array of items to be added in ListView.
               * @Default {[]}
               */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  /** Event triggers before the items loaded.
               */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Event triggers after the items loaded.
               */
  var loadComplete: js.UndefOr[js.Function1[/* e */ LoadCompleteEventArgs, scala.Unit]] = js.undefined
  /** Set the localization culture for ListView Widget.
               */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Event triggers when mouse down happens on the item.
               */
  var mouseDown: js.UndefOr[js.Function1[/* e */ MouseDownEventArgs, scala.Unit]] = js.undefined
  /** Event triggers when mouse up happens on the item.
               */
  var mouseUp: js.UndefOr[js.Function1[/* e */ MouseUpEventArgs, scala.Unit]] = js.undefined
  /** Specifies whether to retain the selection of the item.
               * @Default {false}
               */
  var persistSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to prevent the selection of the item.
               * @Default {false}
               */
  var preventSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the query to execute with the datasource.
               * @Default {null}
               */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Specifies whether need to render the control with the template contents.
               * @Default {false}
               */
  var renderTemplate: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the index of item which need to be in selected state initially while loading.
               * @Default {0}
               */
  var selectedItemIndex: js.UndefOr[scala.Double] = js.undefined
  /** Specifies whether to show the header.
               * @Default {true}
               */
  var showHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to show the back button header.
               * @Default {false}
               */
  var showHeaderBackButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies ID of the element contains template contents.
               * @Default {null}
               */
  var templateId: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the maximum number of items to be fetched. Note: This will work only with Virtual scrolling
               * @Default {5}
               */
  var totalItemsCount: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the virtual scroll mode to load the list data on demand via scrolling behavior. There are two types of mode.
               * @Default {ej.VirtualScrollMode.Normal}
               */
  var virtualScrollMode: js.UndefOr[ejDotWebDotAllLib.ejNs.VirtualScrollMode | java.lang.String] = js.undefined
  /** Specifies the width.
               * @Default {null}
               */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

