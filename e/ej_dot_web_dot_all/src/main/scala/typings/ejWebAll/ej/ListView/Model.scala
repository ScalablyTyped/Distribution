package typings.ejWebAll.ej.ListView

import typings.ejWebAll.ej.VirtualScrollMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Event triggers before the AJAX request happens.
    */
  var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.native
  /** Event triggers after the AJAX content loaded completely.
    */
  var ajaxComplete: js.UndefOr[js.Function1[/* e */ AjaxCompleteEventArgs, Unit]] = js.native
  /** Event triggers when the AJAX request failed.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.native
  /** Specifies the ajaxSettings option to load the items to the ListView control.
    * @Default {null}
    */
  var ajaxSettings: js.UndefOr[AjaxSettings] = js.native
  /** Event triggers after the AJAX content loaded successfully.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.native
  /** Loads the list data on demand via scrolling behavior to improve the applicationâ€™s performance. There are two ways to load data which can be defined using virtualScrollMode
    * property.
    * @Default {false}
    */
  var allowVirtualScrolling: js.UndefOr[Boolean] = js.native
  /** Set the index values to be selected on initial loading. This works only when enableCheckMark is set true.
    * @Default {[]}
    */
  var checkedIndices: js.UndefOr[js.Array[_]] = js.native
  /** Sets the root class for ListView theme. This cssClass API helps to use custom skinning option for ListView control. By defining the root class using this API, we need to include
    * this root class in CSS.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Contains the list of data for generating the ListView items.
    * @Default {[]}
    */
  var dataSource: js.UndefOr[js.Array[_]] = js.native
  /** Specifies whether to load AJAX content while selecting item.
    * @Default {false}
    */
  var enableAjax: js.UndefOr[Boolean] = js.native
  /** Specifies whether to enable caching the content.
    * @Default {false}
    */
  var enableCache: js.UndefOr[Boolean] = js.native
  /** Specifies whether to enable check mark for the item.
    * @Default {false}
    */
  var enableCheckMark: js.UndefOr[Boolean] = js.native
  /** Specifies whether to enable the filtering feature to filter the item.
    * @Default {false}
    */
  var enableFiltering: js.UndefOr[Boolean] = js.native
  /** Specifies whether to group the list item.
    * @Default {false}
    */
  var enableGroupList: js.UndefOr[Boolean] = js.native
  /** Specifies to maintain the current model value to browser cookies for state maintenance. While refresh the page, the model value will get apply to the control from browser cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Specifies the field settings to map the datasource.
    */
  var fieldSettings: js.UndefOr[FieldSettings] = js.native
  /** Specifies the text of the back button in the header.
    * @Default {null}
    */
  var headerBackButtonText: js.UndefOr[String] = js.native
  /** Specifies the title of the header.
    * @Default {Title}
    */
  var headerTitle: js.UndefOr[String] = js.native
  /** Specifies the height.
    * @Default {null}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Specifies the number of items to be fetched on each scroll. Note: This property works only with Virtual scrolling.
    * @Default {5}
    */
  var itemRequestCount: js.UndefOr[Double] = js.native
  /** Contains the array of items to be added in ListView.
    * @Default {[]}
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  /** Event triggers before the items loaded.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Event triggers after the items loaded.
    */
  var loadComplete: js.UndefOr[js.Function1[/* e */ LoadCompleteEventArgs, Unit]] = js.native
  /** Set the localization culture for ListView Widget.
    */
  var locale: js.UndefOr[String] = js.native
  /** Event triggers when mouse down happens on the item.
    */
  var mouseDown: js.UndefOr[js.Function1[/* e */ MouseDownEventArgs, Unit]] = js.native
  /** Event triggers when mouse up happens on the item.
    */
  var mouseUp: js.UndefOr[js.Function1[/* e */ MouseUpEventArgs, Unit]] = js.native
  /** Specifies whether to retain the selection of the item.
    * @Default {false}
    */
  var persistSelection: js.UndefOr[Boolean] = js.native
  /** Specifies whether to prevent the selection of the item.
    * @Default {false}
    */
  var preventSelection: js.UndefOr[Boolean] = js.native
  /** Specifies the query to execute with the datasource.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  /** Specifies whether need to render the control with the template contents.
    * @Default {false}
    */
  var renderTemplate: js.UndefOr[Boolean] = js.native
  /** Specifies the index of item which need to be in selected state initially while loading.
    * @Default {0}
    */
  var selectedItemIndex: js.UndefOr[Double] = js.native
  /** Specifies whether to show the header.
    * @Default {true}
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  /** Specifies whether to show the back button header.
    * @Default {false}
    */
  var showHeaderBackButton: js.UndefOr[Boolean] = js.native
  /** Specifies ID of the element contains template contents.
    * @Default {null}
    */
  var templateId: js.UndefOr[String] = js.native
  /** Specifies the maximum number of items to be fetched. Note: This will work only with Virtual scrolling
    * @Default {5}
    */
  var totalItemsCount: js.UndefOr[Double] = js.native
  /** Specifies the virtual scroll mode to load the list data on demand via scrolling behavior. There are two types of mode.
    * @Default {ej.VirtualScrollMode.Normal}
    */
  var virtualScrollMode: js.UndefOr[VirtualScrollMode | String] = js.native
  /** Specifies the width.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setAjaxBeforeLoad(value: /* e */ AjaxBeforeLoadEventArgs => Unit): Self = this.set("ajaxBeforeLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAjaxBeforeLoad: Self = this.set("ajaxBeforeLoad", js.undefined)
    @scala.inline
    def setAjaxComplete(value: /* e */ AjaxCompleteEventArgs => Unit): Self = this.set("ajaxComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAjaxComplete: Self = this.set("ajaxComplete", js.undefined)
    @scala.inline
    def setAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = this.set("ajaxError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAjaxError: Self = this.set("ajaxError", js.undefined)
    @scala.inline
    def setAjaxSettings(value: AjaxSettings): Self = this.set("ajaxSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjaxSettings: Self = this.set("ajaxSettings", js.undefined)
    @scala.inline
    def setAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = this.set("ajaxSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAjaxSuccess: Self = this.set("ajaxSuccess", js.undefined)
    @scala.inline
    def setAllowVirtualScrolling(value: Boolean): Self = this.set("allowVirtualScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowVirtualScrolling: Self = this.set("allowVirtualScrolling", js.undefined)
    @scala.inline
    def setCheckedIndicesVarargs(value: js.Any*): Self = this.set("checkedIndices", js.Array(value :_*))
    @scala.inline
    def setCheckedIndices(value: js.Array[_]): Self = this.set("checkedIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedIndices: Self = this.set("checkedIndices", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[_]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setEnableAjax(value: Boolean): Self = this.set("enableAjax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAjax: Self = this.set("enableAjax", js.undefined)
    @scala.inline
    def setEnableCache(value: Boolean): Self = this.set("enableCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCache: Self = this.set("enableCache", js.undefined)
    @scala.inline
    def setEnableCheckMark(value: Boolean): Self = this.set("enableCheckMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCheckMark: Self = this.set("enableCheckMark", js.undefined)
    @scala.inline
    def setEnableFiltering(value: Boolean): Self = this.set("enableFiltering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableFiltering: Self = this.set("enableFiltering", js.undefined)
    @scala.inline
    def setEnableGroupList(value: Boolean): Self = this.set("enableGroupList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGroupList: Self = this.set("enableGroupList", js.undefined)
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    @scala.inline
    def setFieldSettings(value: FieldSettings): Self = this.set("fieldSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldSettings: Self = this.set("fieldSettings", js.undefined)
    @scala.inline
    def setHeaderBackButtonText(value: String): Self = this.set("headerBackButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderBackButtonText: Self = this.set("headerBackButtonText", js.undefined)
    @scala.inline
    def setHeaderTitle(value: String): Self = this.set("headerTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTitle: Self = this.set("headerTitle", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setItemRequestCount(value: Double): Self = this.set("itemRequestCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemRequestCount: Self = this.set("itemRequestCount", js.undefined)
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLoad(value: /* e */ LoadEventArgs => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setLoadComplete(value: /* e */ LoadCompleteEventArgs => Unit): Self = this.set("loadComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoadComplete: Self = this.set("loadComplete", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMouseDown(value: /* e */ MouseDownEventArgs => Unit): Self = this.set("mouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseDown: Self = this.set("mouseDown", js.undefined)
    @scala.inline
    def setMouseUp(value: /* e */ MouseUpEventArgs => Unit): Self = this.set("mouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseUp: Self = this.set("mouseUp", js.undefined)
    @scala.inline
    def setPersistSelection(value: Boolean): Self = this.set("persistSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistSelection: Self = this.set("persistSelection", js.undefined)
    @scala.inline
    def setPreventSelection(value: Boolean): Self = this.set("preventSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventSelection: Self = this.set("preventSelection", js.undefined)
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setRenderTemplate(value: Boolean): Self = this.set("renderTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderTemplate: Self = this.set("renderTemplate", js.undefined)
    @scala.inline
    def setSelectedItemIndex(value: Double): Self = this.set("selectedItemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItemIndex: Self = this.set("selectedItemIndex", js.undefined)
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHeader: Self = this.set("showHeader", js.undefined)
    @scala.inline
    def setShowHeaderBackButton(value: Boolean): Self = this.set("showHeaderBackButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHeaderBackButton: Self = this.set("showHeaderBackButton", js.undefined)
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
    @scala.inline
    def setTotalItemsCount(value: Double): Self = this.set("totalItemsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalItemsCount: Self = this.set("totalItemsCount", js.undefined)
    @scala.inline
    def setVirtualScrollMode(value: VirtualScrollMode | String): Self = this.set("virtualScrollMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualScrollMode: Self = this.set("virtualScrollMode", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

