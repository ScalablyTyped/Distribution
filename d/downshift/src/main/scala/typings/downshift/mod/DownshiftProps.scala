package typings.downshift.mod

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownshiftProps[Item] extends StObject {
  
  var children: js.UndefOr[ChildrenFunction[Item]] = js.native
  
  var defaultHighlightedIndex: js.UndefOr[Double | Null] = js.native
  
  var defaultIsOpen: js.UndefOr[Boolean] = js.native
  
  var environment: js.UndefOr[Environment] = js.native
  
  var getA11yStatusMessage: js.UndefOr[js.Function1[/* options */ A11yStatusMessageOptions[Item], String]] = js.native
  
  var getItemId: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], String]] = js.native
  
  var highlightedIndex: js.UndefOr[Double | Null] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var initialHighlightedIndex: js.UndefOr[Double | Null] = js.native
  
  var initialInputValue: js.UndefOr[String] = js.native
  
  var initialIsOpen: js.UndefOr[Boolean] = js.native
  
  var initialSelectedItem: js.UndefOr[Item] = js.native
  
  var inputId: js.UndefOr[String] = js.native
  
  var inputValue: js.UndefOr[String | Null] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var itemCount: js.UndefOr[Double] = js.native
  
  var itemToString: js.UndefOr[js.Function1[/* item */ Item | Null, String]] = js.native
  
  var labelId: js.UndefOr[String] = js.native
  
  var menuId: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[
    js.Function2[
      /* selectedItem */ Item | Null, 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      Unit
    ]
  ] = js.native
  
  var onInputValueChange: js.UndefOr[
    js.Function2[/* inputValue */ String, /* stateAndHelpers */ ControllerStateAndHelpers[Item], Unit]
  ] = js.native
  
  var onOuterClick: js.UndefOr[js.Function1[/* stateAndHelpers */ ControllerStateAndHelpers[Item], Unit]] = js.native
  
  var onSelect: js.UndefOr[
    js.Function2[
      /* selectedItem */ Item | Null, 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      Unit
    ]
  ] = js.native
  
  var onStateChange: js.UndefOr[
    js.Function2[
      /* options */ StateChangeOptions[Item], 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      Unit
    ]
  ] = js.native
  
  var onUserAction: js.UndefOr[
    js.Function2[
      /* options */ StateChangeOptions[Item], 
      /* stateAndHelpers */ ControllerStateAndHelpers[Item], 
      Unit
    ]
  ] = js.native
  
  var scrollIntoView: js.UndefOr[js.Function2[/* node */ HTMLElement, /* menuNode */ HTMLElement, Unit]] = js.native
  
  var selectedItem: js.UndefOr[Item | Null] = js.native
  
  var selectedItemChanged: js.UndefOr[js.Function2[/* prevItem */ Item, /* item */ Item, Boolean]] = js.native
  
  var stateReducer: js.UndefOr[
    js.Function2[
      /* state */ DownshiftState[Item], 
      /* changes */ StateChangeOptions[Item], 
      Partial[StateChangeOptions[Item]]
    ]
  ] = js.native
  
  var suppressRefError: js.UndefOr[Boolean] = js.native
}
object DownshiftProps {
  
  @scala.inline
  def apply[Item](): DownshiftProps[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownshiftProps[Item]]
  }
  
  @scala.inline
  implicit class DownshiftPropsMutableBuilder[Self <: DownshiftProps[_], Item] (val x: Self with DownshiftProps[Item]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* options */ ControllerStateAndHelpers[Item] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDefaultHighlightedIndex(value: Double): Self = StObject.set(x, "defaultHighlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHighlightedIndexNull: Self = StObject.set(x, "defaultHighlightedIndex", null)
    
    @scala.inline
    def setDefaultHighlightedIndexUndefined: Self = StObject.set(x, "defaultHighlightedIndex", js.undefined)
    
    @scala.inline
    def setDefaultIsOpen(value: Boolean): Self = StObject.set(x, "defaultIsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultIsOpenUndefined: Self = StObject.set(x, "defaultIsOpen", js.undefined)
    
    @scala.inline
    def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setGetA11yStatusMessage(value: /* options */ A11yStatusMessageOptions[Item] => String): Self = StObject.set(x, "getA11yStatusMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetA11yStatusMessageUndefined: Self = StObject.set(x, "getA11yStatusMessage", js.undefined)
    
    @scala.inline
    def setGetItemId(value: /* index */ js.UndefOr[Double] => String): Self = StObject.set(x, "getItemId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemIdUndefined: Self = StObject.set(x, "getItemId", js.undefined)
    
    @scala.inline
    def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedIndexNull: Self = StObject.set(x, "highlightedIndex", null)
    
    @scala.inline
    def setHighlightedIndexUndefined: Self = StObject.set(x, "highlightedIndex", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInitialHighlightedIndex(value: Double): Self = StObject.set(x, "initialHighlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialHighlightedIndexNull: Self = StObject.set(x, "initialHighlightedIndex", null)
    
    @scala.inline
    def setInitialHighlightedIndexUndefined: Self = StObject.set(x, "initialHighlightedIndex", js.undefined)
    
    @scala.inline
    def setInitialInputValue(value: String): Self = StObject.set(x, "initialInputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialInputValueUndefined: Self = StObject.set(x, "initialInputValue", js.undefined)
    
    @scala.inline
    def setInitialIsOpen(value: Boolean): Self = StObject.set(x, "initialIsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialIsOpenUndefined: Self = StObject.set(x, "initialIsOpen", js.undefined)
    
    @scala.inline
    def setInitialSelectedItem(value: Item): Self = StObject.set(x, "initialSelectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialSelectedItemUndefined: Self = StObject.set(x, "initialSelectedItem", js.undefined)
    
    @scala.inline
    def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
    
    @scala.inline
    def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValueNull: Self = StObject.set(x, "inputValue", null)
    
    @scala.inline
    def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    @scala.inline
    def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
    
    @scala.inline
    def setItemToString(value: /* item */ Item | Null => String): Self = StObject.set(x, "itemToString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemToStringUndefined: Self = StObject.set(x, "itemToString", js.undefined)
    
    @scala.inline
    def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
    
    @scala.inline
    def setMenuId(value: String): Self = StObject.set(x, "menuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuIdUndefined: Self = StObject.set(x, "menuId", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* selectedItem */ Item | Null, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnInputValueChange(value: (/* inputValue */ String, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit): Self = StObject.set(x, "onInputValueChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnInputValueChangeUndefined: Self = StObject.set(x, "onInputValueChange", js.undefined)
    
    @scala.inline
    def setOnOuterClick(value: /* stateAndHelpers */ ControllerStateAndHelpers[Item] => Unit): Self = StObject.set(x, "onOuterClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOuterClickUndefined: Self = StObject.set(x, "onOuterClick", js.undefined)
    
    @scala.inline
    def setOnSelect(
      value: (/* selectedItem */ Item | Null, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOnStateChange(
      value: (/* options */ StateChangeOptions[Item], /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): Self = StObject.set(x, "onStateChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
    
    @scala.inline
    def setOnUserAction(
      value: (/* options */ StateChangeOptions[Item], /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): Self = StObject.set(x, "onUserAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnUserActionUndefined: Self = StObject.set(x, "onUserAction", js.undefined)
    
    @scala.inline
    def setScrollIntoView(value: (/* node */ HTMLElement, /* menuNode */ HTMLElement) => Unit): Self = StObject.set(x, "scrollIntoView", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScrollIntoViewUndefined: Self = StObject.set(x, "scrollIntoView", js.undefined)
    
    @scala.inline
    def setSelectedItem(value: Item): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemChanged(value: (/* prevItem */ Item, /* item */ Item) => Boolean): Self = StObject.set(x, "selectedItemChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectedItemChangedUndefined: Self = StObject.set(x, "selectedItemChanged", js.undefined)
    
    @scala.inline
    def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
    
    @scala.inline
    def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    @scala.inline
    def setStateReducer(
      value: (/* state */ DownshiftState[Item], /* changes */ StateChangeOptions[Item]) => Partial[StateChangeOptions[Item]]
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    
    @scala.inline
    def setSuppressRefError(value: Boolean): Self = StObject.set(x, "suppressRefError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressRefErrorUndefined: Self = StObject.set(x, "suppressRefError", js.undefined)
  }
}
