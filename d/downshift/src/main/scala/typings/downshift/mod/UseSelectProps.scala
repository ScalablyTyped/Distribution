package typings.downshift.mod

import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseSelectProps[Item] extends StObject {
  
  var circularNavigation: js.UndefOr[Boolean] = js.native
  
  var defaultHighlightedIndex: js.UndefOr[Double] = js.native
  
  var defaultIsOpen: js.UndefOr[Boolean] = js.native
  
  var defaultSelectedItem: js.UndefOr[Item | Null] = js.native
  
  var environment: js.UndefOr[Environment] = js.native
  
  var getA11ySelectionMessage: js.UndefOr[js.Function1[/* options */ A11yStatusMessageOptions[Item], String]] = js.native
  
  var getA11yStatusMessage: js.UndefOr[js.Function1[/* options */ A11yStatusMessageOptions[Item], String]] = js.native
  
  var getItemId: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
  
  var highlightedIndex: js.UndefOr[Double] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var initialHighlightedIndex: js.UndefOr[Double] = js.native
  
  var initialIsOpen: js.UndefOr[Boolean] = js.native
  
  var initialSelectedItem: js.UndefOr[Item | Null] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var itemToString: js.UndefOr[js.Function1[/* item */ Item | Null, String]] = js.native
  
  var items: js.Array[Item] = js.native
  
  var labelId: js.UndefOr[String] = js.native
  
  var menuId: js.UndefOr[String] = js.native
  
  var onHighlightedIndexChange: js.UndefOr[js.Function1[/* changes */ UseSelectStateChange[Item], Unit]] = js.native
  
  var onIsOpenChange: js.UndefOr[js.Function1[/* changes */ UseSelectStateChange[Item], Unit]] = js.native
  
  var onSelectedItemChange: js.UndefOr[js.Function1[/* changes */ UseSelectStateChange[Item], Unit]] = js.native
  
  var onStateChange: js.UndefOr[js.Function1[/* changes */ UseSelectStateChange[Item], Unit]] = js.native
  
  var scrollIntoView: js.UndefOr[js.Function2[/* node */ HTMLElement, /* menuNode */ HTMLElement, Unit]] = js.native
  
  var selectedItem: js.UndefOr[Item | Null] = js.native
  
  var stateReducer: js.UndefOr[
    js.Function2[
      /* state */ UseSelectState[Item], 
      /* actionAndChanges */ UseSelectStateChangeOptions[Item], 
      Partial[UseSelectState[Item]]
    ]
  ] = js.native
  
  var toggleButtonId: js.UndefOr[String] = js.native
}
object UseSelectProps {
  
  @scala.inline
  def apply[Item](items: js.Array[Item]): UseSelectProps[Item] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectProps[Item]]
  }
  
  @scala.inline
  implicit class UseSelectPropsMutableBuilder[Self <: UseSelectProps[_], Item] (val x: Self with UseSelectProps[Item]) extends AnyVal {
    
    @scala.inline
    def setCircularNavigation(value: Boolean): Self = StObject.set(x, "circularNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircularNavigationUndefined: Self = StObject.set(x, "circularNavigation", js.undefined)
    
    @scala.inline
    def setDefaultHighlightedIndex(value: Double): Self = StObject.set(x, "defaultHighlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHighlightedIndexUndefined: Self = StObject.set(x, "defaultHighlightedIndex", js.undefined)
    
    @scala.inline
    def setDefaultIsOpen(value: Boolean): Self = StObject.set(x, "defaultIsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultIsOpenUndefined: Self = StObject.set(x, "defaultIsOpen", js.undefined)
    
    @scala.inline
    def setDefaultSelectedItem(value: Item): Self = StObject.set(x, "defaultSelectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSelectedItemNull: Self = StObject.set(x, "defaultSelectedItem", null)
    
    @scala.inline
    def setDefaultSelectedItemUndefined: Self = StObject.set(x, "defaultSelectedItem", js.undefined)
    
    @scala.inline
    def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setGetA11ySelectionMessage(value: /* options */ A11yStatusMessageOptions[Item] => String): Self = StObject.set(x, "getA11ySelectionMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetA11ySelectionMessageUndefined: Self = StObject.set(x, "getA11ySelectionMessage", js.undefined)
    
    @scala.inline
    def setGetA11yStatusMessage(value: /* options */ A11yStatusMessageOptions[Item] => String): Self = StObject.set(x, "getA11yStatusMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetA11yStatusMessageUndefined: Self = StObject.set(x, "getA11yStatusMessage", js.undefined)
    
    @scala.inline
    def setGetItemId(value: /* index */ Double => String): Self = StObject.set(x, "getItemId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemIdUndefined: Self = StObject.set(x, "getItemId", js.undefined)
    
    @scala.inline
    def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedIndexUndefined: Self = StObject.set(x, "highlightedIndex", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInitialHighlightedIndex(value: Double): Self = StObject.set(x, "initialHighlightedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialHighlightedIndexUndefined: Self = StObject.set(x, "initialHighlightedIndex", js.undefined)
    
    @scala.inline
    def setInitialIsOpen(value: Boolean): Self = StObject.set(x, "initialIsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialIsOpenUndefined: Self = StObject.set(x, "initialIsOpen", js.undefined)
    
    @scala.inline
    def setInitialSelectedItem(value: Item): Self = StObject.set(x, "initialSelectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialSelectedItemNull: Self = StObject.set(x, "initialSelectedItem", null)
    
    @scala.inline
    def setInitialSelectedItemUndefined: Self = StObject.set(x, "initialSelectedItem", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    @scala.inline
    def setItemToString(value: /* item */ Item | Null => String): Self = StObject.set(x, "itemToString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemToStringUndefined: Self = StObject.set(x, "itemToString", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
    
    @scala.inline
    def setMenuId(value: String): Self = StObject.set(x, "menuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuIdUndefined: Self = StObject.set(x, "menuId", js.undefined)
    
    @scala.inline
    def setOnHighlightedIndexChange(value: /* changes */ UseSelectStateChange[Item] => Unit): Self = StObject.set(x, "onHighlightedIndexChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHighlightedIndexChangeUndefined: Self = StObject.set(x, "onHighlightedIndexChange", js.undefined)
    
    @scala.inline
    def setOnIsOpenChange(value: /* changes */ UseSelectStateChange[Item] => Unit): Self = StObject.set(x, "onIsOpenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIsOpenChangeUndefined: Self = StObject.set(x, "onIsOpenChange", js.undefined)
    
    @scala.inline
    def setOnSelectedItemChange(value: /* changes */ UseSelectStateChange[Item] => Unit): Self = StObject.set(x, "onSelectedItemChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectedItemChangeUndefined: Self = StObject.set(x, "onSelectedItemChange", js.undefined)
    
    @scala.inline
    def setOnStateChange(value: /* changes */ UseSelectStateChange[Item] => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
    
    @scala.inline
    def setScrollIntoView(value: (/* node */ HTMLElement, /* menuNode */ HTMLElement) => Unit): Self = StObject.set(x, "scrollIntoView", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScrollIntoViewUndefined: Self = StObject.set(x, "scrollIntoView", js.undefined)
    
    @scala.inline
    def setSelectedItem(value: Item): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
    
    @scala.inline
    def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    @scala.inline
    def setStateReducer(
      value: (/* state */ UseSelectState[Item], /* actionAndChanges */ UseSelectStateChangeOptions[Item]) => Partial[UseSelectState[Item]]
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    
    @scala.inline
    def setToggleButtonId(value: String): Self = StObject.set(x, "toggleButtonId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleButtonIdUndefined: Self = StObject.set(x, "toggleButtonId", js.undefined)
  }
}
