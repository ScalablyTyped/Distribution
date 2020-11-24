package typings.downshift.mod

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownshiftProps[Item] extends js.Object {
  
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
  implicit class DownshiftPropsOps[Self <: DownshiftProps[_], Item] (val x: Self with DownshiftProps[Item]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildren(value: /* options */ ControllerStateAndHelpers[Item] => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDefaultHighlightedIndex(value: Double): Self = this.set("defaultHighlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultHighlightedIndex: Self = this.set("defaultHighlightedIndex", js.undefined)
    
    @scala.inline
    def setDefaultHighlightedIndexNull: Self = this.set("defaultHighlightedIndex", null)
    
    @scala.inline
    def setDefaultIsOpen(value: Boolean): Self = this.set("defaultIsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultIsOpen: Self = this.set("defaultIsOpen", js.undefined)
    
    @scala.inline
    def setEnvironment(value: Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setGetA11yStatusMessage(value: /* options */ A11yStatusMessageOptions[Item] => String): Self = this.set("getA11yStatusMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetA11yStatusMessage: Self = this.set("getA11yStatusMessage", js.undefined)
    
    @scala.inline
    def setGetItemId(value: /* index */ js.UndefOr[Double] => String): Self = this.set("getItemId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetItemId: Self = this.set("getItemId", js.undefined)
    
    @scala.inline
    def setHighlightedIndex(value: Double): Self = this.set("highlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightedIndex: Self = this.set("highlightedIndex", js.undefined)
    
    @scala.inline
    def setHighlightedIndexNull: Self = this.set("highlightedIndex", null)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInitialHighlightedIndex(value: Double): Self = this.set("initialHighlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialHighlightedIndex: Self = this.set("initialHighlightedIndex", js.undefined)
    
    @scala.inline
    def setInitialHighlightedIndexNull: Self = this.set("initialHighlightedIndex", null)
    
    @scala.inline
    def setInitialInputValue(value: String): Self = this.set("initialInputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialInputValue: Self = this.set("initialInputValue", js.undefined)
    
    @scala.inline
    def setInitialIsOpen(value: Boolean): Self = this.set("initialIsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialIsOpen: Self = this.set("initialIsOpen", js.undefined)
    
    @scala.inline
    def setInitialSelectedItem(value: Item): Self = this.set("initialSelectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialSelectedItem: Self = this.set("initialSelectedItem", js.undefined)
    
    @scala.inline
    def setInputId(value: String): Self = this.set("inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputId: Self = this.set("inputId", js.undefined)
    
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    
    @scala.inline
    def setInputValueNull: Self = this.set("inputValue", null)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setItemCount(value: Double): Self = this.set("itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCount: Self = this.set("itemCount", js.undefined)
    
    @scala.inline
    def setItemToString(value: /* item */ Item | Null => String): Self = this.set("itemToString", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItemToString: Self = this.set("itemToString", js.undefined)
    
    @scala.inline
    def setLabelId(value: String): Self = this.set("labelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelId: Self = this.set("labelId", js.undefined)
    
    @scala.inline
    def setMenuId(value: String): Self = this.set("menuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuId: Self = this.set("menuId", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* selectedItem */ Item | Null, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnInputValueChange(value: (/* inputValue */ String, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit): Self = this.set("onInputValueChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnInputValueChange: Self = this.set("onInputValueChange", js.undefined)
    
    @scala.inline
    def setOnOuterClick(value: /* stateAndHelpers */ ControllerStateAndHelpers[Item] => Unit): Self = this.set("onOuterClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOuterClick: Self = this.set("onOuterClick", js.undefined)
    
    @scala.inline
    def setOnSelect(
      value: (/* selectedItem */ Item | Null, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): Self = this.set("onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOnStateChange(
      value: (/* options */ StateChangeOptions[Item], /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): Self = this.set("onStateChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnStateChange: Self = this.set("onStateChange", js.undefined)
    
    @scala.inline
    def setOnUserAction(
      value: (/* options */ StateChangeOptions[Item], /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Unit
    ): Self = this.set("onUserAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnUserAction: Self = this.set("onUserAction", js.undefined)
    
    @scala.inline
    def setScrollIntoView(value: (/* node */ HTMLElement, /* menuNode */ HTMLElement) => Unit): Self = this.set("scrollIntoView", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteScrollIntoView: Self = this.set("scrollIntoView", js.undefined)
    
    @scala.inline
    def setSelectedItem(value: Item): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItem: Self = this.set("selectedItem", js.undefined)
    
    @scala.inline
    def setSelectedItemNull: Self = this.set("selectedItem", null)
    
    @scala.inline
    def setSelectedItemChanged(value: (/* prevItem */ Item, /* item */ Item) => Boolean): Self = this.set("selectedItemChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSelectedItemChanged: Self = this.set("selectedItemChanged", js.undefined)
    
    @scala.inline
    def setStateReducer(
      value: (/* state */ DownshiftState[Item], /* changes */ StateChangeOptions[Item]) => Partial[StateChangeOptions[Item]]
    ): Self = this.set("stateReducer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
    
    @scala.inline
    def setSuppressRefError(value: Boolean): Self = this.set("suppressRefError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressRefError: Self = this.set("suppressRefError", js.undefined)
  }
}
