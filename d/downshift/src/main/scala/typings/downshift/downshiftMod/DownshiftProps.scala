package typings.downshift.downshiftMod

import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownshiftProps[Item] extends js.Object {
  var children: js.UndefOr[ChildrenFunction[Item]] = js.undefined
  var defaultHighlightedIndex: js.UndefOr[Double | Null] = js.undefined
  var defaultIsOpen: js.UndefOr[Boolean] = js.undefined
  var environment: js.UndefOr[Environment] = js.undefined
  var getA11yStatusMessage: js.UndefOr[js.Function1[/* options */ A11yStatusMessageOptions[Item], String]] = js.undefined
  var getItemId: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], String]] = js.undefined
  var highlightedIndex: js.UndefOr[Double | Null] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var initialHighlightedIndex: js.UndefOr[Double | Null] = js.undefined
  var initialInputValue: js.UndefOr[String] = js.undefined
  var initialIsOpen: js.UndefOr[Boolean] = js.undefined
  var initialSelectedItem: js.UndefOr[Item] = js.undefined
  var inputId: js.UndefOr[String] = js.undefined
  var inputValue: js.UndefOr[String | Null] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var itemCount: js.UndefOr[Double] = js.undefined
  var itemToString: js.UndefOr[js.Function1[/* item */ Item | Null, String]] = js.undefined
  var labelId: js.UndefOr[String] = js.undefined
  var menuId: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* selectedItem */ Item | Null, 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      Unit
    ]
  ] = js.undefined
  var onInputValueChange: js.UndefOr[
    js.Function2[/* inputValue */ String, /* stateAndHelpers */ ControllerStateAndHelpers[Item], Unit]
  ] = js.undefined
  var onOuterClick: js.UndefOr[js.Function1[/* stateAndHelpers */ ControllerStateAndHelpers[Item], Unit]] = js.undefined
  var onSelect: js.UndefOr[
    js.Function2[
      /* selectedItem */ Item | Null, 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      Unit
    ]
  ] = js.undefined
  var onStateChange: js.UndefOr[
    js.Function2[
      /* options */ StateChangeOptions[Item], 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      Unit
    ]
  ] = js.undefined
  var onUserAction: js.UndefOr[
    js.Function2[
      /* options */ StateChangeOptions[Item], 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      Unit
    ]
  ] = js.undefined
  var scrollIntoView: js.UndefOr[js.Function2[/* node */ HTMLElement, /* menuNode */ HTMLElement, Unit]] = js.undefined
  var selectedItem: js.UndefOr[Item | Null] = js.undefined
  var selectedItemChanged: js.UndefOr[js.Function2[/* prevItem */ Item, /* item */ Item, Boolean]] = js.undefined
  var stateReducer: js.UndefOr[
    js.Function2[
      /* state */ DownshiftState[Item], 
      /* changes */ StateChangeOptions[Item], 
      Partial[StateChangeOptions[Item]]
    ]
  ] = js.undefined
  var suppressRefError: js.UndefOr[Boolean] = js.undefined
}

object DownshiftProps {
  @scala.inline
  def apply[Item](
    children: ChildrenFunction[Item] = null,
    defaultHighlightedIndex: Int | Double = null,
    defaultIsOpen: js.UndefOr[Boolean] = js.undefined,
    environment: Environment = null,
    getA11yStatusMessage: /* options */ A11yStatusMessageOptions[Item] => String = null,
    getItemId: /* index */ js.UndefOr[Double] => String = null,
    highlightedIndex: Int | Double = null,
    id: String = null,
    initialHighlightedIndex: Int | Double = null,
    initialInputValue: String = null,
    initialIsOpen: js.UndefOr[Boolean] = js.undefined,
    initialSelectedItem: Item = null,
    inputId: String = null,
    inputValue: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    itemCount: Int | Double = null,
    itemToString: /* item */ Item | Null => String = null,
    labelId: String = null,
    menuId: String = null,
    onChange: (/* selectedItem */ Item | Null, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit = null,
    onInputValueChange: (/* inputValue */ String, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit = null,
    onOuterClick: /* stateAndHelpers */ ControllerStateAndHelpers[Item] => Unit = null,
    onSelect: (/* selectedItem */ Item | Null, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit = null,
    onStateChange: (/* options */ StateChangeOptions[Item], /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit = null,
    onUserAction: (/* options */ StateChangeOptions[Item], /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit = null,
    scrollIntoView: (/* node */ HTMLElement, /* menuNode */ HTMLElement) => Unit = null,
    selectedItem: Item = null,
    selectedItemChanged: (/* prevItem */ Item, /* item */ Item) => Boolean = null,
    stateReducer: (/* state */ DownshiftState[Item], /* changes */ StateChangeOptions[Item]) => Partial[StateChangeOptions[Item]] = null,
    suppressRefError: js.UndefOr[Boolean] = js.undefined
  ): DownshiftProps[Item] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (defaultHighlightedIndex != null) __obj.updateDynamic("defaultHighlightedIndex")(defaultHighlightedIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultIsOpen)) __obj.updateDynamic("defaultIsOpen")(defaultIsOpen)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (getA11yStatusMessage != null) __obj.updateDynamic("getA11yStatusMessage")(js.Any.fromFunction1(getA11yStatusMessage))
    if (getItemId != null) __obj.updateDynamic("getItemId")(js.Any.fromFunction1(getItemId))
    if (highlightedIndex != null) __obj.updateDynamic("highlightedIndex")(highlightedIndex.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (initialHighlightedIndex != null) __obj.updateDynamic("initialHighlightedIndex")(initialHighlightedIndex.asInstanceOf[js.Any])
    if (initialInputValue != null) __obj.updateDynamic("initialInputValue")(initialInputValue)
    if (!js.isUndefined(initialIsOpen)) __obj.updateDynamic("initialIsOpen")(initialIsOpen)
    if (initialSelectedItem != null) __obj.updateDynamic("initialSelectedItem")(initialSelectedItem.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount.asInstanceOf[js.Any])
    if (itemToString != null) __obj.updateDynamic("itemToString")(js.Any.fromFunction1(itemToString))
    if (labelId != null) __obj.updateDynamic("labelId")(labelId)
    if (menuId != null) __obj.updateDynamic("menuId")(menuId)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onInputValueChange != null) __obj.updateDynamic("onInputValueChange")(js.Any.fromFunction2(onInputValueChange))
    if (onOuterClick != null) __obj.updateDynamic("onOuterClick")(js.Any.fromFunction1(onOuterClick))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction2(onStateChange))
    if (onUserAction != null) __obj.updateDynamic("onUserAction")(js.Any.fromFunction2(onUserAction))
    if (scrollIntoView != null) __obj.updateDynamic("scrollIntoView")(js.Any.fromFunction2(scrollIntoView))
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemChanged != null) __obj.updateDynamic("selectedItemChanged")(js.Any.fromFunction2(selectedItemChanged))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction2(stateReducer))
    if (!js.isUndefined(suppressRefError)) __obj.updateDynamic("suppressRefError")(suppressRefError)
    __obj.asInstanceOf[DownshiftProps[Item]]
  }
}

