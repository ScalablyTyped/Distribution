package typings.downshift.downshiftMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSelectProps[Item] extends js.Object {
  var circularNavigation: Boolean
  var defaultHighlightedIndex: Double
  var defaultIsOpen: Boolean
  var defaultSelectedItem: Item
  var environment: js.UndefOr[Environment] = js.undefined
  var highlightedIndex: Double
  var id: String
  var initialHighlightedIndex: Double
  var initialIsOpen: Boolean
  var initialSelectedItem: Item
  var isOpen: Boolean
  var itemToString: js.UndefOr[js.Function1[/* item */ Item, String]] = js.undefined
  var items: js.Array[Item]
  var labelId: String
  var menuId: String
  var onHighlightedIndexChange: js.UndefOr[js.Function1[/* changes */ Partial[UseSelectState[Item]], Unit]] = js.undefined
  var onIsOpenChange: js.UndefOr[js.Function1[/* changes */ Partial[UseSelectState[Item]], Unit]] = js.undefined
  var onSelectedItemChange: js.UndefOr[js.Function1[/* changes */ Partial[UseSelectState[Item]], Unit]] = js.undefined
  var onStateChange: js.UndefOr[js.Function1[/* changes */ Partial[UseSelectState[Item]], Unit]] = js.undefined
  var selectedItem: Item
  var stateReducer: js.UndefOr[
    js.Function2[
      /* state */ UseSelectState[Item], 
      /* changes */ UseSelectStateChangeOptions[Item], 
      Partial[UseSelectStateChangeOptions[Item]]
    ]
  ] = js.undefined
  var toggleButtonId: String
  def getA11ySelectionMessage(options: UseSelectA11yMessageOptions[Item]): String
  def getA11yStatusMessage(options: UseSelectA11yMessageOptions[Item]): String
  def getItemId(index: Double): String
}

object UseSelectProps {
  @scala.inline
  def apply[Item](
    circularNavigation: Boolean,
    defaultHighlightedIndex: Double,
    defaultIsOpen: Boolean,
    defaultSelectedItem: Item,
    getA11ySelectionMessage: UseSelectA11yMessageOptions[Item] => String,
    getA11yStatusMessage: UseSelectA11yMessageOptions[Item] => String,
    getItemId: Double => String,
    highlightedIndex: Double,
    id: String,
    initialHighlightedIndex: Double,
    initialIsOpen: Boolean,
    initialSelectedItem: Item,
    isOpen: Boolean,
    items: js.Array[Item],
    labelId: String,
    menuId: String,
    selectedItem: Item,
    toggleButtonId: String,
    environment: Environment = null,
    itemToString: /* item */ Item => String = null,
    onHighlightedIndexChange: /* changes */ Partial[UseSelectState[Item]] => Unit = null,
    onIsOpenChange: /* changes */ Partial[UseSelectState[Item]] => Unit = null,
    onSelectedItemChange: /* changes */ Partial[UseSelectState[Item]] => Unit = null,
    onStateChange: /* changes */ Partial[UseSelectState[Item]] => Unit = null,
    stateReducer: (/* state */ UseSelectState[Item], /* changes */ UseSelectStateChangeOptions[Item]) => Partial[UseSelectStateChangeOptions[Item]] = null
  ): UseSelectProps[Item] = {
    val __obj = js.Dynamic.literal(circularNavigation = circularNavigation, defaultHighlightedIndex = defaultHighlightedIndex, defaultIsOpen = defaultIsOpen, defaultSelectedItem = defaultSelectedItem.asInstanceOf[js.Any], getA11ySelectionMessage = js.Any.fromFunction1(getA11ySelectionMessage), getA11yStatusMessage = js.Any.fromFunction1(getA11yStatusMessage), getItemId = js.Any.fromFunction1(getItemId), highlightedIndex = highlightedIndex, id = id, initialHighlightedIndex = initialHighlightedIndex, initialIsOpen = initialIsOpen, initialSelectedItem = initialSelectedItem.asInstanceOf[js.Any], isOpen = isOpen, items = items, labelId = labelId, menuId = menuId, selectedItem = selectedItem.asInstanceOf[js.Any], toggleButtonId = toggleButtonId)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (itemToString != null) __obj.updateDynamic("itemToString")(js.Any.fromFunction1(itemToString))
    if (onHighlightedIndexChange != null) __obj.updateDynamic("onHighlightedIndexChange")(js.Any.fromFunction1(onHighlightedIndexChange))
    if (onIsOpenChange != null) __obj.updateDynamic("onIsOpenChange")(js.Any.fromFunction1(onIsOpenChange))
    if (onSelectedItemChange != null) __obj.updateDynamic("onSelectedItemChange")(js.Any.fromFunction1(onSelectedItemChange))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction2(stateReducer))
    __obj.asInstanceOf[UseSelectProps[Item]]
  }
}

