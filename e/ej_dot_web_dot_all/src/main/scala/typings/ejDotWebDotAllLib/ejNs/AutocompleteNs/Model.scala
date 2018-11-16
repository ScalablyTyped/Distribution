package typings
package ejDotWebDotAllLib.ejNs.AutocompleteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Model extends js.Object {
  /** Triggers when the AJAX requests Begins.
               */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the AJAX requests complete. The request may get failed or succeed.
               */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the data requested from AJAX get failed.
               */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the data requested from AJAX will get successfully loaded in the Autocomplete widget.
               */
  var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, scala.Unit]] = js.undefined
  /** Customize &quot;Add New&quot; text (label) to be added in the autocomplete popup list for the entered text when there are no suggestions for it.
               * @Default {Add New}
               */
  var addNewText: js.UndefOr[java.lang.String] = js.undefined
  /** Allows new values to be added to the autocomplete input other than the values in the suggestion list. Normally, when there are no suggestions it will display â€œNo suggestionsâ€
               * label in the popup.
               * @Default {false}
               */
  var allowAddNew: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the sorting of suggestion list item. The default sort order is ascending order. You customize sort order.
               * @Default {true}
               */
  var allowSorting: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables selecting the animation style for the popup list. Animation types can be selected through either of the following options,
               * @Default {slide}
               */
  var animateType: js.UndefOr[Animation | java.lang.String] = js.undefined
  /** To focus the items in the suggestion list when the popup is shown. By default first item will be focused.
               * @Default {false}
               */
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the case sensitive search.
               * @Default {false}
               */
  var caseSensitiveSearch: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers when the text box value is changed.
               */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Triggers after the suggestion popup is closed.
               */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, scala.Unit]] = js.undefined
  /** Triggers when Autocomplete widget is created.
               */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** The root class for the Autocomplete textbox widget which helps in customizing its theme.
               * @Default {â€â€}
               */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** The data source contains the list of data for the suggestions list. It can be a string array or JSON array or service URL that returns JSON.
               * @Default {null}
               */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.undefined
  /** The time delay (in milliseconds) after which the suggestion popup will be shown.
               * @Default {200}
               */
  var delaySuggestionTimeout: js.UndefOr[scala.Double] = js.undefined
  /** The special character which acts as a separator for the given words for multi-mode search i.e. the text after the delimiter are considered as a separate word or query for search
               * operation.
               * @Default {â€™,â€™}
               */
  var delimiterChar: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers after the Autocomplete widget is destroyed.
               */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** The text to be displayed in the popup when there are no suggestions available for the entered text.
               * @Default {â€œNo suggestionsâ€}
               */
  var emptyResultText: js.UndefOr[java.lang.String] = js.undefined
  /** Fills the autocomplete textbox with the first matched item from the suggestion list automatically based on the entered text when enabled.
               * @Default {false}
               */
  var enableAutoFill: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables displaying the duplicate names present in the search result.
               * @Default {false}
               */
  var enableDistinct: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows the current model values to be saved in local storage or browser cookies for state maintenance when it is set to true. While refreshing the page, it retains the model value
               * from browser cookies or local storage.
               * @Default {false}
               */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Displays the Autocomplete widgetâ€™s content from right to left when enabled.
               * @Default {false}
               */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the Autocomplete textbox widget.
               * @Default {true}
               */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Mapping fields for the suggestion items of the Autocomplete textbox widget.
               * @Default {null}
               */
  var fields: js.UndefOr[Fields] = js.undefined
  /** Specifies the search filter type. There are several types of search filter available such as â€˜startswithâ€™, â€˜containsâ€™, â€˜endswithâ€™, â€˜lessthanâ€™,
               * â€˜lessthanorequalâ€™, â€˜greaterthanâ€™, â€˜greaterthanorequalâ€™, â€˜equalâ€™, â€˜notequalâ€™.
               * @Default {ej.filterType.StartsWith}
               */
  var filterType: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers after the autocomplete textbox is focused.
               */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, scala.Unit]] = js.undefined
  /** Triggers after the Autocomplete textbox gets out of the focus.
               */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, scala.Unit]] = js.undefined
  /** The height of the Autocomplete textbox.
               * @Default {null}
               */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** The search text can be highlighted in the AutoComplete suggestion list when enabled.
               * @Default {false}
               */
  var highlightSearch: js.UndefOr[scala.Boolean] = js.undefined
  /** Number of items to be displayed in the suggestion list.
               * @Default {0}
               */
  var itemsCount: js.UndefOr[scala.Double] = js.undefined
  /** Set the localization culture for Autocomplete Widget.
               */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Minimum number of character to be entered in the Autocomplete textbox to show the suggestion list.
               * @Default {1}
               */
  var minCharacter: js.UndefOr[scala.Double] = js.undefined
  /** An Autocomplete column collection can be defined and customized through the multiColumnSettings property.Column's header, field, and stringFormat can be define via
               * multiColumnSettings properties.
               */
  var multiColumnSettings: js.UndefOr[MultiColumnSettings] = js.undefined
  /** Enables or disables selecting multiple values from the suggestion list. Multiple values can be selected through either of the following options,
               * @Default {ej.MultiSelectMode.None}
               */
  var multiSelectMode: js.UndefOr[MultiSelectMode | java.lang.String] = js.undefined
  /** Triggers after the suggestion list is opened.
               */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, scala.Unit]] = js.undefined
  /** The height of the suggestion list.
               * @Default {â€œ152pxâ€}
               */
  var popupHeight: js.UndefOr[java.lang.String] = js.undefined
  /** The width of the suggestion list.
               * @Default {â€œautoâ€}
               */
  var popupWidth: js.UndefOr[java.lang.String] = js.undefined
  /** The query to retrieve the data from the data source.
               * @Default {null}
               */
  var query: js.UndefOr[ejDotWebDotAllLib.ejNs.Query] = js.undefined
  /** Indicates that the autocomplete textbox values can only be readable.
               * @Default {false}
               */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers when an item has been selected from the suggestion list.
               */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, scala.Unit]] = js.undefined
  /** Sets the value for the Autocomplete textbox based on the given input key value.
               */
  var selectValueByKey: js.UndefOr[scala.Double] = js.undefined
  /** Enables or disables showing the message when there are no suggestions for the entered text.
               * @Default {true}
               */
  var showEmptyResultText: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the loading icon to intimate the searching operation. The loading icon is visible when there is a time delay to perform the search.
               * @Default {true}
               */
  var showLoadingIcon: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables the showPopup button in autocomplete textbox. When the showPopup button is clicked, it displays all the available data from the data source.
               * @Default {false}
               */
  var showPopupButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables reset icon to clear the textbox values.
               * @Default {false}
               */
  var showResetIcon: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables rounded corner.
               * @Default {false}
               */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Sort order specifies whether the suggestion list values has to be displayed in ascending or descending order.
               * @Default {ej.SortOrder.Ascending}
               */
  var sortOrder: js.UndefOr[SortOrder | java.lang.String] = js.undefined
  /** The template to display the suggestion list items with customized appearance.
               * @Default {null}
               */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** The jQuery validation error message to be displayed on form validation.
               * @Default {null}
               */
  var validationMessage: js.UndefOr[js.Any] = js.undefined
  /** The jQuery validation rules for form validation.
               * @Default {null}
               */
  var validationRules: js.UndefOr[js.Any] = js.undefined
  /** The value to be displayed in the autocomplete textbox.
               * @Default {null}
               */
  var value: js.UndefOr[java.lang.String] = js.undefined
  /** Enables or disables the visibility of the autocomplete textbox.
               * @Default {true}
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** The text to be displayed when the value of the autocomplete textbox is empty.
               * @Default {null}
               */
  var watermarkText: js.UndefOr[java.lang.String] = js.undefined
  /** The width of the Autocomplete textbox.
               * @Default {null}
               */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

