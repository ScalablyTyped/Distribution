package typings
package downshiftLib.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownshiftProps[Item] extends js.Object {
  var children: js.UndefOr[ChildrenFunction[Item]] = js.undefined
  var defaultHighlightedIndex: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var defaultIsOpen: js.UndefOr[scala.Boolean] = js.undefined
  var environment: js.UndefOr[Environment] = js.undefined
  var getA11yStatusMessage: js.UndefOr[js.Function1[/* options */ A11yStatusMessageOptions[Item], java.lang.String]] = js.undefined
  var getItemId: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], java.lang.String]] = js.undefined
  var highlightedIndex: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var initialHighlightedIndex: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var initialInputValue: js.UndefOr[java.lang.String] = js.undefined
  var initialIsOpen: js.UndefOr[scala.Boolean] = js.undefined
  var initialSelectedItem: js.UndefOr[Item] = js.undefined
  var inputId: js.UndefOr[java.lang.String] = js.undefined
  var inputValue: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var itemCount: js.UndefOr[scala.Double] = js.undefined
  var itemToString: js.UndefOr[js.Function1[/* item */ Item | scala.Null, java.lang.String]] = js.undefined
  var labelId: js.UndefOr[java.lang.String] = js.undefined
  var menuId: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* selectedItem */ Item | scala.Null, 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      scala.Unit
    ]
  ] = js.undefined
  var onInputValueChange: js.UndefOr[
    js.Function2[
      /* inputValue */ java.lang.String, 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      scala.Unit
    ]
  ] = js.undefined
  var onOuterClick: js.UndefOr[js.Function1[/* stateAndHelpers */ ControllerStateAndHelpers[Item], scala.Unit]] = js.undefined
  var onSelect: js.UndefOr[
    js.Function2[
      /* selectedItem */ Item | scala.Null, 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      scala.Unit
    ]
  ] = js.undefined
  var onStateChange: js.UndefOr[
    js.Function2[
      /* options */ StateChangeOptions[Item], 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      scala.Unit
    ]
  ] = js.undefined
  var onUserAction: js.UndefOr[
    js.Function2[
      /* options */ StateChangeOptions[Item], 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      scala.Unit
    ]
  ] = js.undefined
  var selectedItem: js.UndefOr[Item | scala.Null] = js.undefined
  var selectedItemChanged: js.UndefOr[js.Function2[/* prevItem */ Item, /* item */ Item, scala.Boolean]] = js.undefined
  var stateReducer: js.UndefOr[
    js.Function2[
      /* state */ DownshiftState[Item], 
      /* changes */ StateChangeOptions[Item], 
      stdLib.Partial[StateChangeOptions[Item]]
    ]
  ] = js.undefined
  var suppressRefError: js.UndefOr[scala.Boolean] = js.undefined
}

object DownshiftProps {
  @scala.inline
  def apply[Item](
    children: ChildrenFunction[Item] = null,
    defaultHighlightedIndex: scala.Int | scala.Double = null,
    defaultIsOpen: js.UndefOr[scala.Boolean] = js.undefined,
    environment: Environment = null,
    getA11yStatusMessage: js.Function1[/* options */ A11yStatusMessageOptions[Item], java.lang.String] = null,
    getItemId: js.Function1[/* index */ js.UndefOr[scala.Double], java.lang.String] = null,
    highlightedIndex: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    initialHighlightedIndex: scala.Int | scala.Double = null,
    initialInputValue: java.lang.String = null,
    initialIsOpen: js.UndefOr[scala.Boolean] = js.undefined,
    initialSelectedItem: Item = null,
    inputId: java.lang.String = null,
    inputValue: java.lang.String = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    itemCount: scala.Int | scala.Double = null,
    itemToString: js.Function1[/* item */ Item | scala.Null, java.lang.String] = null,
    labelId: java.lang.String = null,
    menuId: java.lang.String = null,
    onChange: js.Function2[
      /* selectedItem */ Item | scala.Null, 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      scala.Unit
    ] = null,
    onInputValueChange: js.Function2[
      /* inputValue */ java.lang.String, 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      scala.Unit
    ] = null,
    onOuterClick: js.Function1[/* stateAndHelpers */ ControllerStateAndHelpers[Item], scala.Unit] = null,
    onSelect: js.Function2[
      /* selectedItem */ Item | scala.Null, 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      scala.Unit
    ] = null,
    onStateChange: js.Function2[
      /* options */ StateChangeOptions[Item], 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      scala.Unit
    ] = null,
    onUserAction: js.Function2[
      /* options */ StateChangeOptions[Item], 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      scala.Unit
    ] = null,
    selectedItem: Item = null,
    selectedItemChanged: js.Function2[/* prevItem */ Item, /* item */ Item, scala.Boolean] = null,
    stateReducer: js.Function2[
      /* state */ DownshiftState[Item], 
      /* changes */ StateChangeOptions[Item], 
      stdLib.Partial[StateChangeOptions[Item]]
    ] = null,
    suppressRefError: js.UndefOr[scala.Boolean] = js.undefined
  ): DownshiftProps[Item] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (defaultHighlightedIndex != null) __obj.updateDynamic("defaultHighlightedIndex")(defaultHighlightedIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultIsOpen)) __obj.updateDynamic("defaultIsOpen")(defaultIsOpen)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (getA11yStatusMessage != null) __obj.updateDynamic("getA11yStatusMessage")(getA11yStatusMessage)
    if (getItemId != null) __obj.updateDynamic("getItemId")(getItemId)
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
    if (itemToString != null) __obj.updateDynamic("itemToString")(itemToString)
    if (labelId != null) __obj.updateDynamic("labelId")(labelId)
    if (menuId != null) __obj.updateDynamic("menuId")(menuId)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onInputValueChange != null) __obj.updateDynamic("onInputValueChange")(onInputValueChange)
    if (onOuterClick != null) __obj.updateDynamic("onOuterClick")(onOuterClick)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(onStateChange)
    if (onUserAction != null) __obj.updateDynamic("onUserAction")(onUserAction)
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (selectedItemChanged != null) __obj.updateDynamic("selectedItemChanged")(selectedItemChanged)
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(stateReducer)
    if (!js.isUndefined(suppressRefError)) __obj.updateDynamic("suppressRefError")(suppressRefError)
    __obj.asInstanceOf[DownshiftProps[Item]]
  }
}

