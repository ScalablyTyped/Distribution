package typings.ejDotWebDotAll.ej.ComboBox

import typings.ejDotWebDotAll.ej.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers before fetching data from the remote server.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
  /** Triggers after data is fetched successfully from the remote server.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
  /** Triggers when the data fetch request from the remote server fails.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.undefined
  /** Accepts the template and assigns it to the popup list content of the component when the data fetch request from the remote server fails.
    * @Default {The Request Failed}
    */
  var actionFailureTemplate: js.UndefOr[String] = js.undefined
  /** Specifies whether the component allows user defined value which does not exist in data source.
    * @Default {true}
    */
  var allowCustom: js.UndefOr[Boolean] = js.undefined
  /** When allowFiltering is set to true, show the filter bar (search box) of the component. The filter action retrieves matched items through the filtering event based on the
    * characters typed in the search TextBox. If no match is found, the value of the noRecordsTemplate property will be displayed.
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether suggest a first matched item in input when searching. No action happens when no matches found.
    * @Default {false}
    */
  var autofill: js.UndefOr[Boolean] = js.undefined
  /** Triggers when an item in a popup is selected or when the model value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Triggers when the popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
  /** Triggers when ComboBox widget is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Sets CSS classes to the root element of the component that helps customize the UI styles.
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Triggers on set a custom value to this component.
    */
  var customValueSpecifier: js.UndefOr[js.Function1[/* e */ CustomValueSpecifierEventArgs, Unit]] = js.undefined
  /** Accepts the list items either through local or remote service and binds it to the component. It can be an array of JSON objects or an instance of DataManager.
    * @Default {[]}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.undefined
  /** When set to true, enables RTL mode of the component that displays the content in the right-to-left direction.
    * @Default {false}
    */
  var enableRtl: js.UndefOr[Boolean] = js.undefined
  /** Specifies a value that indicates whether the component is enabled or not.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** The fields property maps the columns of the data table and binds the data to the component.
    */
  var fields: js.UndefOr[Fields] = js.undefined
  /** Triggers on typing a character in the component.
    */
  var filtering: js.UndefOr[js.Function1[/* e */ FilteringEventArgs, Unit]] = js.undefined
  /** Triggers when the component is focused.
    */
  var focus: js.UndefOr[js.Function1[/* e */ FocusEventArgs, Unit]] = js.undefined
  /** Accepts the template design and assigns it to the footer container of the popup list.
    * @Default {null}
    */
  var footerTemplate: js.UndefOr[String] = js.undefined
  /** Accepts the template design and assigns it to the group headers present in the popup list.
    * @Default {null}
    */
  var groupTemplate: js.UndefOr[String] = js.undefined
  /** Accepts the template design and assigns it to the header container of the popup list.
    * @Default {null}
    */
  var headerTemplate: js.UndefOr[String] = js.undefined
  /** Allows additional HTML attributes such as title, name, etc., and accepts n number of attributes in a key-value pair format.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets the index of the selected item in the component.
    * @Default {null}
    */
  var index: js.UndefOr[Double] = js.undefined
  /** Accepts the template design and assigns it to each list item present in the popup.
    * @Default {null}
    */
  var itemTemplate: js.UndefOr[String] = js.undefined
  /** Overrides the global culture and localization value for this component. Default global culture is 'en-US'.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Accepts the template design and assigns it to popup list of component when no data is available on the component.
    * @Default {No Records Found}
    */
  var noRecordsTemplate: js.UndefOr[String] = js.undefined
  /** Triggers after the suggestion list is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
  /** Accepts the value to be displayed as a watermark text on the component input.
    * @Default {null}
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /** Specifies the height of the popup list.
    * @Default {300px}
    */
  var popupHeight: js.UndefOr[String | Double] = js.undefined
  /** Specifies the width of the popup list. By default, the popup width sets based on the width of the component.
    * @Default {100%}
    */
  var popupWidth: js.UndefOr[String | Double] = js.undefined
  /** The query to retrieve the data from the data source.
    * @Default {null}
    */
  var query: js.UndefOr[Query] = js.undefined
  /** When set to true, the user interactions on the component are disabled.
    * @Default {false}
    */
  var readonly: js.UndefOr[Boolean] = js.undefined
  /** Triggers when an item in the popup is selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.undefined
  /** Specifies whether to show or hide the clear button. When the clear button is clicked, value, text, and index properties are reset to null.
    * @Default {true}
    */
  var showClearButton: js.UndefOr[Boolean] = js.undefined
  /** Specifies the sortOrder to sort the data source. The available type of sort orders are
    * @Default {ej.SortOrder.None}
    */
  var sortOrder: js.UndefOr[typings.ejDotWebDotAll.ej.ComboBox.SortOrder | String] = js.undefined
  /** Gets or sets the display text of the selected item in the component.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
  /** Gets or sets the value of the selected item in the component.
    * @Default {null}
    */
  var value: js.UndefOr[Double | String] = js.undefined
  /** Specifies the width of the component. By default, the component width sets based on the width of its parent container. You can also set the width in pixel values.
    * @Default {100%}
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionBegin: /* e */ ActionBeginEventArgs => Unit = null,
    actionComplete: /* e */ ActionCompleteEventArgs => Unit = null,
    actionFailure: /* e */ ActionFailureEventArgs => Unit = null,
    actionFailureTemplate: String = null,
    allowCustom: js.UndefOr[Boolean] = js.undefined,
    allowFiltering: js.UndefOr[Boolean] = js.undefined,
    autofill: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ ChangeEventArgs => Unit = null,
    close: /* e */ CloseEventArgs => Unit = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    customValueSpecifier: /* e */ CustomValueSpecifierEventArgs => Unit = null,
    dataSource: js.Any | js.Array[_] = null,
    enableRtl: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fields: Fields = null,
    filtering: /* e */ FilteringEventArgs => Unit = null,
    focus: /* e */ FocusEventArgs => Unit = null,
    footerTemplate: String = null,
    groupTemplate: String = null,
    headerTemplate: String = null,
    htmlAttributes: js.Any = null,
    index: Int | Double = null,
    itemTemplate: String = null,
    locale: String = null,
    noRecordsTemplate: String = null,
    open: /* e */ OpenEventArgs => Unit = null,
    placeholder: String = null,
    popupHeight: String | Double = null,
    popupWidth: String | Double = null,
    query: Query = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    select: /* e */ SelectEventArgs => Unit = null,
    showClearButton: js.UndefOr[Boolean] = js.undefined,
    sortOrder: typings.ejDotWebDotAll.ej.ComboBox.SortOrder | String = null,
    text: String = null,
    value: Double | String = null,
    width: Double | String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(js.Any.fromFunction1(actionBegin))
    if (actionComplete != null) __obj.updateDynamic("actionComplete")(js.Any.fromFunction1(actionComplete))
    if (actionFailure != null) __obj.updateDynamic("actionFailure")(js.Any.fromFunction1(actionFailure))
    if (actionFailureTemplate != null) __obj.updateDynamic("actionFailureTemplate")(actionFailureTemplate)
    if (!js.isUndefined(allowCustom)) __obj.updateDynamic("allowCustom")(allowCustom)
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering)
    if (!js.isUndefined(autofill)) __obj.updateDynamic("autofill")(autofill)
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (customValueSpecifier != null) __obj.updateDynamic("customValueSpecifier")(js.Any.fromFunction1(customValueSpecifier))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRtl)) __obj.updateDynamic("enableRtl")(enableRtl)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filtering != null) __obj.updateDynamic("filtering")(js.Any.fromFunction1(filtering))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction1(focus))
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate)
    if (groupTemplate != null) __obj.updateDynamic("groupTemplate")(groupTemplate)
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate)
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (noRecordsTemplate != null) __obj.updateDynamic("noRecordsTemplate")(noRecordsTemplate)
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (popupHeight != null) __obj.updateDynamic("popupHeight")(popupHeight.asInstanceOf[js.Any])
    if (popupWidth != null) __obj.updateDynamic("popupWidth")(popupWidth.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (!js.isUndefined(showClearButton)) __obj.updateDynamic("showClearButton")(showClearButton)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

