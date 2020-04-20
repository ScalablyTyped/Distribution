package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseMultipleSelectionProps[Item] extends js.Object {
  var activeIndex: js.UndefOr[Double] = js.undefined
  var defaultActiveIndex: js.UndefOr[Double] = js.undefined
  var defaultSelectedItems: js.UndefOr[js.Array[Item]] = js.undefined
  var environment: js.UndefOr[Environment] = js.undefined
  var getA11yRemovalMessage: js.UndefOr[js.Function1[/* options */ A11yRemovalMessage[Item], String]] = js.undefined
  var initialActiveIndex: js.UndefOr[Double] = js.undefined
  var initialSelectedItems: js.UndefOr[js.Array[Item]] = js.undefined
  var itemToString: js.UndefOr[js.Function1[/* item */ Item, String]] = js.undefined
  var keyNavigationNext: js.UndefOr[String] = js.undefined
  var keyNavigationPrevious: js.UndefOr[String] = js.undefined
  var onActiveIndexChange: js.UndefOr[js.Function1[/* changes */ UseMultipleSelectionStateChange[Item], Unit]] = js.undefined
  var onSelectedItemsChange: js.UndefOr[js.Function1[/* changes */ UseMultipleSelectionStateChange[Item], Unit]] = js.undefined
  var onStateChange: js.UndefOr[js.Function1[/* changes */ UseMultipleSelectionStateChange[Item], Unit]] = js.undefined
  var selectedItems: js.UndefOr[js.Array[Item]] = js.undefined
  var stateReducer: js.UndefOr[
    js.Function2[
      /* state */ UseMultipleSelectionState[Item], 
      /* actionAndChanges */ UseMultipleSelectionStateChangeOptions[Item], 
      UseMultipleSelectionState[Item]
    ]
  ] = js.undefined
}

object UseMultipleSelectionProps {
  @scala.inline
  def apply[Item](
    activeIndex: Int | Double = null,
    defaultActiveIndex: Int | Double = null,
    defaultSelectedItems: js.Array[Item] = null,
    environment: Environment = null,
    getA11yRemovalMessage: /* options */ A11yRemovalMessage[Item] => String = null,
    initialActiveIndex: Int | Double = null,
    initialSelectedItems: js.Array[Item] = null,
    itemToString: /* item */ Item => String = null,
    keyNavigationNext: String = null,
    keyNavigationPrevious: String = null,
    onActiveIndexChange: /* changes */ UseMultipleSelectionStateChange[Item] => Unit = null,
    onSelectedItemsChange: /* changes */ UseMultipleSelectionStateChange[Item] => Unit = null,
    onStateChange: /* changes */ UseMultipleSelectionStateChange[Item] => Unit = null,
    selectedItems: js.Array[Item] = null,
    stateReducer: (/* state */ UseMultipleSelectionState[Item], /* actionAndChanges */ UseMultipleSelectionStateChangeOptions[Item]) => UseMultipleSelectionState[Item] = null
  ): UseMultipleSelectionProps[Item] = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (defaultSelectedItems != null) __obj.updateDynamic("defaultSelectedItems")(defaultSelectedItems.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (getA11yRemovalMessage != null) __obj.updateDynamic("getA11yRemovalMessage")(js.Any.fromFunction1(getA11yRemovalMessage))
    if (initialActiveIndex != null) __obj.updateDynamic("initialActiveIndex")(initialActiveIndex.asInstanceOf[js.Any])
    if (initialSelectedItems != null) __obj.updateDynamic("initialSelectedItems")(initialSelectedItems.asInstanceOf[js.Any])
    if (itemToString != null) __obj.updateDynamic("itemToString")(js.Any.fromFunction1(itemToString))
    if (keyNavigationNext != null) __obj.updateDynamic("keyNavigationNext")(keyNavigationNext.asInstanceOf[js.Any])
    if (keyNavigationPrevious != null) __obj.updateDynamic("keyNavigationPrevious")(keyNavigationPrevious.asInstanceOf[js.Any])
    if (onActiveIndexChange != null) __obj.updateDynamic("onActiveIndexChange")(js.Any.fromFunction1(onActiveIndexChange))
    if (onSelectedItemsChange != null) __obj.updateDynamic("onSelectedItemsChange")(js.Any.fromFunction1(onSelectedItemsChange))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction2(stateReducer))
    __obj.asInstanceOf[UseMultipleSelectionProps[Item]]
  }
}

