package typings.ejDotWebDotAll.ej.Autocomplete

import typings.ejDotWebDotAll.ej.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers when the AJAX requests Begins.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
  /** Triggers when the AJAX requests complete. The request may get failed or succeed.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
  /** Triggers when the data requested from AJAX get failed.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.undefined
  /** Triggers when the data requested from AJAX will get successfully loaded in the Autocomplete widget.
    */
  var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, Unit]] = js.undefined
  /** Customize &quot;Add New&quot; text (label) to be added in the autocomplete popup list for the entered text when there are no suggestions for it.
    * @Default {Add New}
    */
  var addNewText: js.UndefOr[String] = js.undefined
  /** Allows new values to be added to the autocomplete input other than the values in the suggestion list. Normally, when there are no suggestions it will display â€œNo suggestionsâ€
    * label in the popup.
    * @Default {false}
    */
  var allowAddNew: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the sorting of suggestion list item. The default sort order is ascending order. You customize sort order.
    * @Default {true}
    */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables selecting the animation style for the popup list. Animation types can be selected through either of the following options,
    * @Default {slide}
    */
  var animateType: js.UndefOr[typings.ejDotWebDotAll.ej.Autocomplete.Animation | String] = js.undefined
  /** To focus the items in the suggestion list when the popup is shown. By default first item will be focused.
    * @Default {false}
    */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the case sensitive search.
    * @Default {false}
    */
  var caseSensitiveSearch: js.UndefOr[Boolean] = js.undefined
  /** Triggers when the text box value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Triggers after the suggestion popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
  /** Triggers when Autocomplete widget is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** The root class for the Autocomplete textbox widget which helps in customizing its theme.
    * @Default {â€â€}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** The data source contains the list of data for the suggestions list. It can be a string array or JSON array or service URL that returns JSON.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.undefined
  /** The time delay (in milliseconds) after which the suggestion popup will be shown.
    * @Default {200}
    */
  var delaySuggestionTimeout: js.UndefOr[Double] = js.undefined
  /** The special character which acts as a separator for the given words for multi-mode search i.e. the text after the delimiter are considered as a separate word or query for search
    * operation.
    * @Default {â€™,â€™}
    */
  var delimiterChar: js.UndefOr[String] = js.undefined
  /** Triggers after the Autocomplete widget is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** The text to be displayed in the popup when there are no suggestions available for the entered text.
    * @Default {â€œNo suggestionsâ€}
    */
  var emptyResultText: js.UndefOr[String] = js.undefined
  /** Fills the autocomplete textbox with the first matched item from the suggestion list automatically based on the entered text when enabled.
    * @Default {false}
    */
  var enableAutoFill: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables displaying the duplicate names present in the search result.
    * @Default {false}
    */
  var enableDistinct: js.UndefOr[Boolean] = js.undefined
  /** Allows the current model values to be saved in local storage or browser cookies for state maintenance when it is set to true. While refreshing the page, it retains the model value
    * from browser cookies or local storage.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Displays the Autocomplete widgetâ€™s content from right to left when enabled.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the Autocomplete textbox widget.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Mapping fields for the suggestion items of the Autocomplete textbox widget.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.undefined
  /** Specifies the search filter type. There are several types of search filter available such as â€˜startswithâ€™, â€˜containsâ€™, â€˜endswithâ€™, â€˜lessthanâ€™,
    * â€˜lessthanorequalâ€™, â€˜greaterthanâ€™, â€˜greaterthanorequalâ€™, â€˜equalâ€™, â€˜notequalâ€™.
    * @Default {ej.filterType.StartsWith}
    */
  var filterType: js.UndefOr[String] = js.undefined
  /** Triggers after the autocomplete textbox is focused.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.undefined
  /** Triggers after the Autocomplete textbox gets out of the focus.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.undefined
  /** The height of the Autocomplete textbox.
    * @Default {null}
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /** The search text can be highlighted in the AutoComplete suggestion list when enabled.
    * @Default {false}
    */
  var highlightSearch: js.UndefOr[Boolean] = js.undefined
  /** To enable or disable the diacritic characters of the Autocomplete suggestion list when filtering.
    * @Default {false}
    */
  var ignoreAccent: js.UndefOr[Boolean] = js.undefined
  /** Number of items to be displayed in the suggestion list.
    * @Default {0}
    */
  var itemsCount: js.UndefOr[Double] = js.undefined
  /** Set the localization culture for Autocomplete Widget.
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Minimum number of character to be entered in the Autocomplete textbox to show the suggestion list.
    * @Default {1}
    */
  var minCharacter: js.UndefOr[Double] = js.undefined
  /** An Autocomplete column collection can be defined and customized through the multiColumnSettings property.Column's header, field, and stringFormat can be define via
    * multiColumnSettings properties.
    */
  var multiColumnSettings: js.UndefOr[MultiColumnSettings] = js.undefined
  /** Enables or disables selecting multiple values from the suggestion list. Multiple values can be selected through either of the following options,
    * @Default {ej.MultiSelectMode.None}
    */
  var multiSelectMode: js.UndefOr[typings.ejDotWebDotAll.ej.Autocomplete.MultiSelectMode | String] = js.undefined
  /** Triggers after the suggestion list is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
  /** The height of the suggestion list.
    * @Default {â€œ152pxâ€}
    */
  var popupHeight: js.UndefOr[String] = js.undefined
  /** The width of the suggestion list.
    * @Default {â€œautoâ€}
    */
  var popupWidth: js.UndefOr[String] = js.undefined
  /** The query to retrieve the data from the data source.
    * @Default {null}
    */
  var query: js.UndefOr[Query] = js.undefined
  /** Indicates that the autocomplete textbox values can only be readable.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** Triggers when an item has been selected from the suggestion list.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.undefined
  /** Sets the value for the Autocomplete textbox based on the given input key value.
    */
  var selectValueByKey: js.UndefOr[Double] = js.undefined
  /** Enables or disables showing the message when there are no suggestions for the entered text.
    * @Default {true}
    */
  var showEmptyResultText: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the loading icon to intimate the searching operation. The loading icon is visible when there is a time delay to perform the search.
    * @Default {true}
    */
  var showLoadingIcon: js.UndefOr[Boolean] = js.undefined
  /** Enables the showPopup button in autocomplete textbox. When the showPopup button is clicked, it displays all the available data from the data source.
    * @Default {false}
    */
  var showPopupButton: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables reset icon to clear the textbox values.
    * @Default {false}
    */
  var showResetIcon: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables rounded corner.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Sort order specifies whether the suggestion list values has to be displayed in ascending or descending order.
    * @Default {ej.SortOrder.Ascending}
    */
  var sortOrder: js.UndefOr[typings.ejDotWebDotAll.ej.Autocomplete.SortOrder | String] = js.undefined
  /** The template to display the suggestion list items with customized appearance.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.undefined
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
  var value: js.UndefOr[String] = js.undefined
  /** Enables or disables the visibility of the autocomplete textbox.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** The text to be displayed when the value of the autocomplete textbox is empty.
    * @Default {null}
    */
  var watermarkText: js.UndefOr[String] = js.undefined
  /** The width of the Autocomplete textbox.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionBegin: /* e */ ActionBeginEventArgs => Unit = null,
    actionComplete: /* e */ ActionCompleteEventArgs => Unit = null,
    actionFailure: /* e */ ActionFailureEventArgs => Unit = null,
    actionSuccess: /* e */ ActionSuccessEventArgs => Unit = null,
    addNewText: String = null,
    allowAddNew: js.UndefOr[Boolean] = js.undefined,
    allowSorting: js.UndefOr[Boolean] = js.undefined,
    animateType: typings.ejDotWebDotAll.ej.Autocomplete.Animation | String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    caseSensitiveSearch: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ ChangeEventArgs => Unit = null,
    close: /* e */ CloseEventArgs => Unit = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    dataSource: js.Any | js.Array[_] = null,
    delaySuggestionTimeout: Int | Double = null,
    delimiterChar: String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    emptyResultText: String = null,
    enableAutoFill: js.UndefOr[Boolean] = js.undefined,
    enableDistinct: js.UndefOr[Boolean] = js.undefined,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fields: Fields = null,
    filterType: String = null,
    focusIn: /* e */ FocusInEventArgs => Unit = null,
    focusOut: /* e */ FocusOutEventArgs => Unit = null,
    height: String | Double = null,
    highlightSearch: js.UndefOr[Boolean] = js.undefined,
    ignoreAccent: js.UndefOr[Boolean] = js.undefined,
    itemsCount: Int | Double = null,
    locale: String = null,
    minCharacter: Int | Double = null,
    multiColumnSettings: MultiColumnSettings = null,
    multiSelectMode: typings.ejDotWebDotAll.ej.Autocomplete.MultiSelectMode | String = null,
    open: /* e */ OpenEventArgs => Unit = null,
    popupHeight: String = null,
    popupWidth: String = null,
    query: Query = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    select: /* e */ SelectEventArgs => Unit = null,
    selectValueByKey: Int | Double = null,
    showEmptyResultText: js.UndefOr[Boolean] = js.undefined,
    showLoadingIcon: js.UndefOr[Boolean] = js.undefined,
    showPopupButton: js.UndefOr[Boolean] = js.undefined,
    showResetIcon: js.UndefOr[Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    sortOrder: typings.ejDotWebDotAll.ej.Autocomplete.SortOrder | String = null,
    template: String = null,
    validationMessage: js.Any = null,
    validationRules: js.Any = null,
    value: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    watermarkText: String = null,
    width: String | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(js.Any.fromFunction1(actionBegin))
    if (actionComplete != null) __obj.updateDynamic("actionComplete")(js.Any.fromFunction1(actionComplete))
    if (actionFailure != null) __obj.updateDynamic("actionFailure")(js.Any.fromFunction1(actionFailure))
    if (actionSuccess != null) __obj.updateDynamic("actionSuccess")(js.Any.fromFunction1(actionSuccess))
    if (addNewText != null) __obj.updateDynamic("addNewText")(addNewText.asInstanceOf[js.Any])
    if (!js.isUndefined(allowAddNew)) __obj.updateDynamic("allowAddNew")(allowAddNew.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.asInstanceOf[js.Any])
    if (animateType != null) __obj.updateDynamic("animateType")(animateType.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitiveSearch)) __obj.updateDynamic("caseSensitiveSearch")(caseSensitiveSearch.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (delaySuggestionTimeout != null) __obj.updateDynamic("delaySuggestionTimeout")(delaySuggestionTimeout.asInstanceOf[js.Any])
    if (delimiterChar != null) __obj.updateDynamic("delimiterChar")(delimiterChar.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (emptyResultText != null) __obj.updateDynamic("emptyResultText")(emptyResultText.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutoFill)) __obj.updateDynamic("enableAutoFill")(enableAutoFill.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDistinct)) __obj.updateDynamic("enableDistinct")(enableDistinct.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (focusIn != null) __obj.updateDynamic("focusIn")(js.Any.fromFunction1(focusIn))
    if (focusOut != null) __obj.updateDynamic("focusOut")(js.Any.fromFunction1(focusOut))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightSearch)) __obj.updateDynamic("highlightSearch")(highlightSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreAccent)) __obj.updateDynamic("ignoreAccent")(ignoreAccent.asInstanceOf[js.Any])
    if (itemsCount != null) __obj.updateDynamic("itemsCount")(itemsCount.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (minCharacter != null) __obj.updateDynamic("minCharacter")(minCharacter.asInstanceOf[js.Any])
    if (multiColumnSettings != null) __obj.updateDynamic("multiColumnSettings")(multiColumnSettings.asInstanceOf[js.Any])
    if (multiSelectMode != null) __obj.updateDynamic("multiSelectMode")(multiSelectMode.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (popupHeight != null) __obj.updateDynamic("popupHeight")(popupHeight.asInstanceOf[js.Any])
    if (popupWidth != null) __obj.updateDynamic("popupWidth")(popupWidth.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (selectValueByKey != null) __obj.updateDynamic("selectValueByKey")(selectValueByKey.asInstanceOf[js.Any])
    if (!js.isUndefined(showEmptyResultText)) __obj.updateDynamic("showEmptyResultText")(showEmptyResultText.asInstanceOf[js.Any])
    if (!js.isUndefined(showLoadingIcon)) __obj.updateDynamic("showLoadingIcon")(showLoadingIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showPopupButton)) __obj.updateDynamic("showPopupButton")(showPopupButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showResetIcon)) __obj.updateDynamic("showResetIcon")(showResetIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (validationMessage != null) __obj.updateDynamic("validationMessage")(validationMessage.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (watermarkText != null) __obj.updateDynamic("watermarkText")(watermarkText.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

