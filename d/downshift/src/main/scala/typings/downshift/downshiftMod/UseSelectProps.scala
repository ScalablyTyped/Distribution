package typings.downshift.downshiftMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSelectProps[Item] extends js.Object {
  var circularNavigation: js.UndefOr[Boolean] = js.undefined
  var defaultHighlightedIndex: js.UndefOr[Double] = js.undefined
  var defaultIsOpen: js.UndefOr[Boolean] = js.undefined
  var defaultSelectedItem: js.UndefOr[Item] = js.undefined
  var environment: js.UndefOr[Environment] = js.undefined
  var getA11ySelectionMessage: js.UndefOr[js.Function1[/* options */ UseSelectA11yMessageOptions[Item], String]] = js.undefined
  var getA11yStatusMessage: js.UndefOr[js.Function1[/* options */ UseSelectA11yMessageOptions[Item], String]] = js.undefined
  var getItemId: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
  var highlightedIndex: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var initialHighlightedIndex: js.UndefOr[Double] = js.undefined
  var initialIsOpen: js.UndefOr[Boolean] = js.undefined
  var initialSelectedItem: js.UndefOr[Item] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var itemToString: js.UndefOr[js.Function1[/* item */ Item, String]] = js.undefined
  var items: js.Array[Item]
  var labelId: js.UndefOr[String] = js.undefined
  var menuId: js.UndefOr[String] = js.undefined
  var onHighlightedIndexChange: js.UndefOr[js.Function1[/* changes */ Partial[UseSelectState[Item]], Unit]] = js.undefined
  var onIsOpenChange: js.UndefOr[js.Function1[/* changes */ Partial[UseSelectState[Item]], Unit]] = js.undefined
  var onSelectedItemChange: js.UndefOr[js.Function1[/* changes */ Partial[UseSelectState[Item]], Unit]] = js.undefined
  var onStateChange: js.UndefOr[js.Function1[/* changes */ Partial[UseSelectState[Item]], Unit]] = js.undefined
  var selectedItem: js.UndefOr[Item] = js.undefined
  var stateReducer: js.UndefOr[
    js.Function2[
      /* state */ UseSelectState[Item], 
      /* changes */ UseSelectStateChangeOptions[Item], 
      Partial[UseSelectStateChangeOptions[Item]]
    ]
  ] = js.undefined
  var toggleButtonId: js.UndefOr[String] = js.undefined
}

object UseSelectProps {
  @scala.inline
  def apply[Item](
    items: js.Array[Item],
    circularNavigation: js.UndefOr[Boolean] = js.undefined,
    defaultHighlightedIndex: Int | Double = null,
    defaultIsOpen: js.UndefOr[Boolean] = js.undefined,
    defaultSelectedItem: Item = null,
    environment: Environment = null,
    getA11ySelectionMessage: /* options */ UseSelectA11yMessageOptions[Item] => String = null,
    getA11yStatusMessage: /* options */ UseSelectA11yMessageOptions[Item] => String = null,
    getItemId: /* index */ Double => String = null,
    highlightedIndex: Int | Double = null,
    id: String = null,
    initialHighlightedIndex: Int | Double = null,
    initialIsOpen: js.UndefOr[Boolean] = js.undefined,
    initialSelectedItem: Item = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    itemToString: /* item */ Item => String = null,
    labelId: String = null,
    menuId: String = null,
    onHighlightedIndexChange: /* changes */ Partial[UseSelectState[Item]] => Unit = null,
    onIsOpenChange: /* changes */ Partial[UseSelectState[Item]] => Unit = null,
    onSelectedItemChange: /* changes */ Partial[UseSelectState[Item]] => Unit = null,
    onStateChange: /* changes */ Partial[UseSelectState[Item]] => Unit = null,
    selectedItem: Item = null,
    stateReducer: (/* state */ UseSelectState[Item], /* changes */ UseSelectStateChangeOptions[Item]) => Partial[UseSelectStateChangeOptions[Item]] = null,
    toggleButtonId: String = null
  ): UseSelectProps[Item] = {
    val __obj = js.Dynamic.literal(items = items)
    if (!js.isUndefined(circularNavigation)) __obj.updateDynamic("circularNavigation")(circularNavigation)
    if (defaultHighlightedIndex != null) __obj.updateDynamic("defaultHighlightedIndex")(defaultHighlightedIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultIsOpen)) __obj.updateDynamic("defaultIsOpen")(defaultIsOpen)
    if (defaultSelectedItem != null) __obj.updateDynamic("defaultSelectedItem")(defaultSelectedItem.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (getA11ySelectionMessage != null) __obj.updateDynamic("getA11ySelectionMessage")(js.Any.fromFunction1(getA11ySelectionMessage))
    if (getA11yStatusMessage != null) __obj.updateDynamic("getA11yStatusMessage")(js.Any.fromFunction1(getA11yStatusMessage))
    if (getItemId != null) __obj.updateDynamic("getItemId")(js.Any.fromFunction1(getItemId))
    if (highlightedIndex != null) __obj.updateDynamic("highlightedIndex")(highlightedIndex.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (initialHighlightedIndex != null) __obj.updateDynamic("initialHighlightedIndex")(initialHighlightedIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(initialIsOpen)) __obj.updateDynamic("initialIsOpen")(initialIsOpen)
    if (initialSelectedItem != null) __obj.updateDynamic("initialSelectedItem")(initialSelectedItem.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (itemToString != null) __obj.updateDynamic("itemToString")(js.Any.fromFunction1(itemToString))
    if (labelId != null) __obj.updateDynamic("labelId")(labelId)
    if (menuId != null) __obj.updateDynamic("menuId")(menuId)
    if (onHighlightedIndexChange != null) __obj.updateDynamic("onHighlightedIndexChange")(js.Any.fromFunction1(onHighlightedIndexChange))
    if (onIsOpenChange != null) __obj.updateDynamic("onIsOpenChange")(js.Any.fromFunction1(onIsOpenChange))
    if (onSelectedItemChange != null) __obj.updateDynamic("onSelectedItemChange")(js.Any.fromFunction1(onSelectedItemChange))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction2(stateReducer))
    if (toggleButtonId != null) __obj.updateDynamic("toggleButtonId")(toggleButtonId)
    __obj.asInstanceOf[UseSelectProps[Item]]
  }
}

