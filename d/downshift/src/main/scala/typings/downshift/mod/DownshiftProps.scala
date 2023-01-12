package typings.downshift.mod

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownshiftProps[Item] extends StObject {
  
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
  
  inline def apply[Item](): DownshiftProps[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownshiftProps[Item]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownshiftProps[?], Item] (val x: Self & DownshiftProps[Item]) extends AnyVal {
    
    inline def setChildren(value: /* options */ ControllerStateAndHelpers[Item] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDefaultHighlightedIndex(value: Double): Self = StObject.set(x, "defaultHighlightedIndex", value.asInstanceOf[js.Any])
    
    inline def setDefaultHighlightedIndexNull: Self = StObject.set(x, "defaultHighlightedIndex", null)
    
    inline def setDefaultHighlightedIndexUndefined: Self = StObject.set(x, "defaultHighlightedIndex", js.undefined)
    
    inline def setDefaultIsOpen(value: Boolean): Self = StObject.set(x, "defaultIsOpen", value.asInstanceOf[js.Any])
    
    inline def setDefaultIsOpenUndefined: Self = StObject.set(x, "defaultIsOpen", js.undefined)
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setGetA11yStatusMessage(value: /* options */ A11yStatusMessageOptions[Item] => String): Self = StObject.set(x, "getA11yStatusMessage", js.Any.fromFunction1(value))
    
    inline def setGetA11yStatusMessageUndefined: Self = StObject.set(x, "getA11yStatusMessage", js.undefined)
    
    inline def setGetItemId(value: /* index */ js.UndefOr[Double] => String): Self = StObject.set(x, "getItemId", js.Any.fromFunction1(value))
    
    inline def setGetItemIdUndefined: Self = StObject.set(x, "getItemId", js.undefined)
    
    inline def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    inline def setHighlightedIndexNull: Self = StObject.set(x, "highlightedIndex", null)
    
    inline def setHighlightedIndexUndefined: Self = StObject.set(x, "highlightedIndex", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitialHighlightedIndex(value: Double): Self = StObject.set(x, "initialHighlightedIndex", value.asInstanceOf[js.Any])
    
    inline def setInitialHighlightedIndexNull: Self = StObject.set(x, "initialHighlightedIndex", null)
    
    inline def setInitialHighlightedIndexUndefined: Self = StObject.set(x, "initialHighlightedIndex", js.undefined)
    
    inline def setInitialInputValue(value: String): Self = StObject.set(x, "initialInputValue", value.asInstanceOf[js.Any])
    
    inline def setInitialInputValueUndefined: Self = StObject.set(x, "initialInputValue", js.undefined)
    
    inline def setInitialIsOpen(value: Boolean): Self = StObject.set(x, "initialIsOpen", value.asInstanceOf[js.Any])
    
    inline def setInitialIsOpenUndefined: Self = StObject.set(x, "initialIsOpen", js.undefined)
    
    inline def setInitialSelectedItem(value: Item): Self = StObject.set(x, "initialSelectedItem", value.asInstanceOf[js.Any])
    
    inline def setInitialSelectedItemUndefined: Self = StObject.set(x, "initialSelectedItem", js.undefined)
    
    inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
    
    inline def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setInputValueNull: Self = StObject.set(x, "inputValue", null)
    
    inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
    
    inline def setItemToString(value: /* item */ Item | Null => String): Self = StObject.set(x, "itemToString", js.Any.fromFunction1(value))
    
    inline def setItemToStringUndefined: Self = StObject.set(x, "itemToString", js.undefined)
    
    inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
    
    inline def setMenuId(value: String): Self = StObject.set(x, "menuId", value.asInstanceOf[js.Any])
    
    inline def setMenuIdUndefined: Self = StObject.set(x, "menuId", js.undefined)
    
    inline def setOnChange(
      value: (/* selectedItem */ Item | Null, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnInputValueChange(value: (/* inputValue */ String, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit): Self = StObject.set(x, "onInputValueChange", js.Any.fromFunction2(value))
    
    inline def setOnInputValueChangeUndefined: Self = StObject.set(x, "onInputValueChange", js.undefined)
    
    inline def setOnOuterClick(value: /* stateAndHelpers */ ControllerStateAndHelpers[Item] => Unit): Self = StObject.set(x, "onOuterClick", js.Any.fromFunction1(value))
    
    inline def setOnOuterClickUndefined: Self = StObject.set(x, "onOuterClick", js.undefined)
    
    inline def setOnSelect(
      value: (/* selectedItem */ Item | Null, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnStateChange(
      value: (/* options */ StateChangeOptions[Item], /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): Self = StObject.set(x, "onStateChange", js.Any.fromFunction2(value))
    
    inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
    
    inline def setOnUserAction(
      value: (/* options */ StateChangeOptions[Item], /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): Self = StObject.set(x, "onUserAction", js.Any.fromFunction2(value))
    
    inline def setOnUserActionUndefined: Self = StObject.set(x, "onUserAction", js.undefined)
    
    inline def setScrollIntoView(value: (/* node */ HTMLElement, /* menuNode */ HTMLElement) => Unit): Self = StObject.set(x, "scrollIntoView", js.Any.fromFunction2(value))
    
    inline def setScrollIntoViewUndefined: Self = StObject.set(x, "scrollIntoView", js.undefined)
    
    inline def setSelectedItem(value: Item): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemChanged(value: (/* prevItem */ Item, /* item */ Item) => Boolean): Self = StObject.set(x, "selectedItemChanged", js.Any.fromFunction2(value))
    
    inline def setSelectedItemChangedUndefined: Self = StObject.set(x, "selectedItemChanged", js.undefined)
    
    inline def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    inline def setStateReducer(
      value: (/* state */ DownshiftState[Item], /* changes */ StateChangeOptions[Item]) => Partial[StateChangeOptions[Item]]
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction2(value))
    
    inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    
    inline def setSuppressRefError(value: Boolean): Self = StObject.set(x, "suppressRefError", value.asInstanceOf[js.Any])
    
    inline def setSuppressRefErrorUndefined: Self = StObject.set(x, "suppressRefError", js.undefined)
  }
}
