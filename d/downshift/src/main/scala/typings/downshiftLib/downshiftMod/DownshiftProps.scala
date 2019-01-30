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

