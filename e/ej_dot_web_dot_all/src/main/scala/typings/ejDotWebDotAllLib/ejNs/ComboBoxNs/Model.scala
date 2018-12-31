package typings
package ejDotWebDotAllLib.ejNs.ComboBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers before fetching data from the remote server.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, scala.Unit]] = js.undefined
  /** Triggers after data is fetched successfully from the remote server.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the data fetch request from the remote server fails.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, scala.Unit]] = js.undefined
  /** Accepts the template and assigns it to the popup list content of the component when the data fetch request from the remote server fails.
    * @Default {The Request Failed}
    */
  var actionFailureTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies whether the component allows user defined value which does not exist in data source.
    * @Default {true}
    */
  var allowCustom: js.UndefOr[scala.Boolean] = js.undefined
  /** When allowFiltering is set to true, show the filter bar (search box) of the component. The filter action retrieves matched items through the filtering event based on the
    * characters typed in the search TextBox. If no match is found, the value of the noRecordsTemplate property will be displayed.
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether suggest a first matched item in input when searching. No action happens when no matches found.
    * @Default {false}
    */
  var autofill: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers when an item in a popup is selected or when the model value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, scala.Unit]] = js.undefined
  /** Triggers when ComboBox widget is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Sets CSS classes to the root element of the component that helps customize the UI styles.
    * @Default {null}
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers on set a custom value to this component.
    */
  var customValueSpecifier: js.UndefOr[js.Function1[/* e */ CustomValueSpecifierEventArgs, scala.Unit]] = js.undefined
  /** Accepts the list items either through local or remote service and binds it to the component. It can be an array of JSON objects or an instance of DataManager.
    * @Default {[]}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.undefined
  /** When set to true, enables RTL mode of the component that displays the content in the right-to-left direction.
    * @Default {false}
    */
  var enableRtl: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies a value that indicates whether the component is enabled or not.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** The fields property maps the columns of the data table and binds the data to the component.
    */
  var fields: js.UndefOr[Fields] = js.undefined
  /** Triggers on typing a character in the component.
    */
  var filtering: js.UndefOr[js.Function1[/* e */ FilteringEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the component is focused.
    */
  var focus: js.UndefOr[js.Function1[/* e */ FocusEventArgs, scala.Unit]] = js.undefined
  /** Accepts the template design and assigns it to the footer container of the popup list.
    * @Default {null}
    */
  var footerTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Accepts the template design and assigns it to the group headers present in the popup list.
    * @Default {null}
    */
  var groupTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Accepts the template design and assigns it to the header container of the popup list.
    * @Default {null}
    */
  var headerTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Allows additional HTML attributes such as title, name, etc., and accepts n number of attributes in a key-value pair format.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets the index of the selected item in the component.
    * @Default {null}
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Accepts the template design and assigns it to each list item present in the popup.
    * @Default {null}
    */
  var itemTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Overrides the global culture and localization value for this component. Default global culture is 'en-US'.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Accepts the template design and assigns it to popup list of component when no data is available on the component.
    * @Default {No Records Found}
    */
  var noRecordsTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers after the suggestion list is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, scala.Unit]] = js.undefined
  /** Accepts the value to be displayed as a watermark text on the component input.
    * @Default {null}
    */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the height of the popup list.
    * @Default {300px}
    */
  var popupHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Specifies the width of the popup list. By default, the popup width sets based on the width of the component.
    * @Default {100%}
    */
  var popupWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** The query to retrieve the data from the data source.
    * @Default {null}
    */
  var query: js.UndefOr[ejDotWebDotAllLib.ejNs.Query] = js.undefined
  /** When set to true, the user interactions on the component are disabled.
    * @Default {false}
    */
  var readonly: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers when an item in the popup is selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, scala.Unit]] = js.undefined
  /** Specifies whether to show or hide the clear button. When the clear button is clicked, value, text, and index properties are reset to null.
    * @Default {true}
    */
  var showClearButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the sortOrder to sort the data source. The available type of sort orders are
    * @Default {ej.SortOrder.None}
    */
  var sortOrder: js.UndefOr[SortOrder | java.lang.String] = js.undefined
  /** Gets or sets the display text of the selected item in the component.
    * @Default {null}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets the value of the selected item in the component.
    * @Default {null}
    */
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Specifies the width of the component. By default, the component width sets based on the width of its parent container. You can also set the width in pixel values.
    * @Default {100%}
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

