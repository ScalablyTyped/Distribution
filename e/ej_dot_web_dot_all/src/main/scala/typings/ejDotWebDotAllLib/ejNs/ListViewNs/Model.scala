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

object Model {
  @scala.inline
  def apply(
    ajaxBeforeLoad: /* e */ AjaxBeforeLoadEventArgs => scala.Unit = null,
    ajaxComplete: /* e */ AjaxCompleteEventArgs => scala.Unit = null,
    ajaxError: /* e */ AjaxErrorEventArgs => scala.Unit = null,
    ajaxSettings: AjaxSettings = null,
    ajaxSuccess: /* e */ AjaxSuccessEventArgs => scala.Unit = null,
    allowVirtualScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    checkedIndices: js.Array[_] = null,
    cssClass: java.lang.String = null,
    dataSource: js.Array[_] = null,
    enableAjax: js.UndefOr[scala.Boolean] = js.undefined,
    enableCache: js.UndefOr[scala.Boolean] = js.undefined,
    enableCheckMark: js.UndefOr[scala.Boolean] = js.undefined,
    enableFiltering: js.UndefOr[scala.Boolean] = js.undefined,
    enableGroupList: js.UndefOr[scala.Boolean] = js.undefined,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    fieldSettings: FieldSettings = null,
    headerBackButtonText: java.lang.String = null,
    headerTitle: java.lang.String = null,
    height: java.lang.String | scala.Double = null,
    itemRequestCount: scala.Int | scala.Double = null,
    items: js.Array[_] = null,
    load: /* e */ LoadEventArgs => scala.Unit = null,
    loadComplete: /* e */ LoadCompleteEventArgs => scala.Unit = null,
    locale: java.lang.String = null,
    mouseDown: /* e */ MouseDownEventArgs => scala.Unit = null,
    mouseUp: /* e */ MouseUpEventArgs => scala.Unit = null,
    persistSelection: js.UndefOr[scala.Boolean] = js.undefined,
    preventSelection: js.UndefOr[scala.Boolean] = js.undefined,
    query: js.Any = null,
    renderTemplate: js.UndefOr[scala.Boolean] = js.undefined,
    selectedItemIndex: scala.Int | scala.Double = null,
    showHeader: js.UndefOr[scala.Boolean] = js.undefined,
    showHeaderBackButton: js.UndefOr[scala.Boolean] = js.undefined,
    templateId: java.lang.String = null,
    totalItemsCount: scala.Int | scala.Double = null,
    virtualScrollMode: ejDotWebDotAllLib.ejNs.VirtualScrollMode | java.lang.String = null,
    width: java.lang.String | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (ajaxBeforeLoad != null) __obj.updateDynamic("ajaxBeforeLoad")(js.Any.fromFunction1(ajaxBeforeLoad))
    if (ajaxComplete != null) __obj.updateDynamic("ajaxComplete")(js.Any.fromFunction1(ajaxComplete))
    if (ajaxError != null) __obj.updateDynamic("ajaxError")(js.Any.fromFunction1(ajaxError))
    if (ajaxSettings != null) __obj.updateDynamic("ajaxSettings")(ajaxSettings)
    if (ajaxSuccess != null) __obj.updateDynamic("ajaxSuccess")(js.Any.fromFunction1(ajaxSuccess))
    if (!js.isUndefined(allowVirtualScrolling)) __obj.updateDynamic("allowVirtualScrolling")(allowVirtualScrolling)
    if (checkedIndices != null) __obj.updateDynamic("checkedIndices")(checkedIndices)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (!js.isUndefined(enableAjax)) __obj.updateDynamic("enableAjax")(enableAjax)
    if (!js.isUndefined(enableCache)) __obj.updateDynamic("enableCache")(enableCache)
    if (!js.isUndefined(enableCheckMark)) __obj.updateDynamic("enableCheckMark")(enableCheckMark)
    if (!js.isUndefined(enableFiltering)) __obj.updateDynamic("enableFiltering")(enableFiltering)
    if (!js.isUndefined(enableGroupList)) __obj.updateDynamic("enableGroupList")(enableGroupList)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (fieldSettings != null) __obj.updateDynamic("fieldSettings")(fieldSettings)
    if (headerBackButtonText != null) __obj.updateDynamic("headerBackButtonText")(headerBackButtonText)
    if (headerTitle != null) __obj.updateDynamic("headerTitle")(headerTitle)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (itemRequestCount != null) __obj.updateDynamic("itemRequestCount")(itemRequestCount.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items)
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (loadComplete != null) __obj.updateDynamic("loadComplete")(js.Any.fromFunction1(loadComplete))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mouseDown != null) __obj.updateDynamic("mouseDown")(js.Any.fromFunction1(mouseDown))
    if (mouseUp != null) __obj.updateDynamic("mouseUp")(js.Any.fromFunction1(mouseUp))
    if (!js.isUndefined(persistSelection)) __obj.updateDynamic("persistSelection")(persistSelection)
    if (!js.isUndefined(preventSelection)) __obj.updateDynamic("preventSelection")(preventSelection)
    if (query != null) __obj.updateDynamic("query")(query)
    if (!js.isUndefined(renderTemplate)) __obj.updateDynamic("renderTemplate")(renderTemplate)
    if (selectedItemIndex != null) __obj.updateDynamic("selectedItemIndex")(selectedItemIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader)
    if (!js.isUndefined(showHeaderBackButton)) __obj.updateDynamic("showHeaderBackButton")(showHeaderBackButton)
    if (templateId != null) __obj.updateDynamic("templateId")(templateId)
    if (totalItemsCount != null) __obj.updateDynamic("totalItemsCount")(totalItemsCount.asInstanceOf[js.Any])
    if (virtualScrollMode != null) __obj.updateDynamic("virtualScrollMode")(virtualScrollMode.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

