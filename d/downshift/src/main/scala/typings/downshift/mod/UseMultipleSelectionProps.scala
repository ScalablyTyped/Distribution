package typings.downshift.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseMultipleSelectionProps[Item] extends StObject {
  
  var activeIndex: js.UndefOr[Double] = js.native
  
  var defaultActiveIndex: js.UndefOr[Double] = js.native
  
  var defaultSelectedItems: js.UndefOr[js.Array[Item]] = js.native
  
  var environment: js.UndefOr[Environment] = js.native
  
  var getA11yRemovalMessage: js.UndefOr[js.Function1[/* options */ A11yRemovalMessage[Item], String]] = js.native
  
  var initialActiveIndex: js.UndefOr[Double] = js.native
  
  var initialSelectedItems: js.UndefOr[js.Array[Item]] = js.native
  
  var itemToString: js.UndefOr[js.Function1[/* item */ Item, String]] = js.native
  
  var keyNavigationNext: js.UndefOr[String] = js.native
  
  var keyNavigationPrevious: js.UndefOr[String] = js.native
  
  var onActiveIndexChange: js.UndefOr[js.Function1[/* changes */ UseMultipleSelectionStateChange[Item], Unit]] = js.native
  
  var onSelectedItemsChange: js.UndefOr[js.Function1[/* changes */ UseMultipleSelectionStateChange[Item], Unit]] = js.native
  
  var onStateChange: js.UndefOr[js.Function1[/* changes */ UseMultipleSelectionStateChange[Item], Unit]] = js.native
  
  var selectedItems: js.UndefOr[js.Array[Item]] = js.native
  
  var stateReducer: js.UndefOr[
    js.Function2[
      /* state */ UseMultipleSelectionState[Item], 
      /* actionAndChanges */ UseMultipleSelectionStateChangeOptions[Item], 
      Partial[UseMultipleSelectionState[Item]]
    ]
  ] = js.native
}
object UseMultipleSelectionProps {
  
  @scala.inline
  def apply[Item](): UseMultipleSelectionProps[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseMultipleSelectionProps[Item]]
  }
  
  @scala.inline
  implicit class UseMultipleSelectionPropsMutableBuilder[Self <: UseMultipleSelectionProps[_], Item] (val x: Self with UseMultipleSelectionProps[Item]) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
    @scala.inline
    def setDefaultActiveIndex(value: Double): Self = StObject.set(x, "defaultActiveIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultActiveIndexUndefined: Self = StObject.set(x, "defaultActiveIndex", js.undefined)
    
    @scala.inline
    def setDefaultSelectedItems(value: js.Array[Item]): Self = StObject.set(x, "defaultSelectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSelectedItemsUndefined: Self = StObject.set(x, "defaultSelectedItems", js.undefined)
    
    @scala.inline
    def setDefaultSelectedItemsVarargs(value: Item*): Self = StObject.set(x, "defaultSelectedItems", js.Array(value :_*))
    
    @scala.inline
    def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setGetA11yRemovalMessage(value: /* options */ A11yRemovalMessage[Item] => String): Self = StObject.set(x, "getA11yRemovalMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetA11yRemovalMessageUndefined: Self = StObject.set(x, "getA11yRemovalMessage", js.undefined)
    
    @scala.inline
    def setInitialActiveIndex(value: Double): Self = StObject.set(x, "initialActiveIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialActiveIndexUndefined: Self = StObject.set(x, "initialActiveIndex", js.undefined)
    
    @scala.inline
    def setInitialSelectedItems(value: js.Array[Item]): Self = StObject.set(x, "initialSelectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialSelectedItemsUndefined: Self = StObject.set(x, "initialSelectedItems", js.undefined)
    
    @scala.inline
    def setInitialSelectedItemsVarargs(value: Item*): Self = StObject.set(x, "initialSelectedItems", js.Array(value :_*))
    
    @scala.inline
    def setItemToString(value: /* item */ Item => String): Self = StObject.set(x, "itemToString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemToStringUndefined: Self = StObject.set(x, "itemToString", js.undefined)
    
    @scala.inline
    def setKeyNavigationNext(value: String): Self = StObject.set(x, "keyNavigationNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNavigationNextUndefined: Self = StObject.set(x, "keyNavigationNext", js.undefined)
    
    @scala.inline
    def setKeyNavigationPrevious(value: String): Self = StObject.set(x, "keyNavigationPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNavigationPreviousUndefined: Self = StObject.set(x, "keyNavigationPrevious", js.undefined)
    
    @scala.inline
    def setOnActiveIndexChange(value: /* changes */ UseMultipleSelectionStateChange[Item] => Unit): Self = StObject.set(x, "onActiveIndexChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnActiveIndexChangeUndefined: Self = StObject.set(x, "onActiveIndexChange", js.undefined)
    
    @scala.inline
    def setOnSelectedItemsChange(value: /* changes */ UseMultipleSelectionStateChange[Item] => Unit): Self = StObject.set(x, "onSelectedItemsChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectedItemsChangeUndefined: Self = StObject.set(x, "onSelectedItemsChange", js.undefined)
    
    @scala.inline
    def setOnStateChange(value: /* changes */ UseMultipleSelectionStateChange[Item] => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
    
    @scala.inline
    def setSelectedItems(value: js.Array[Item]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    @scala.inline
    def setSelectedItemsVarargs(value: Item*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setStateReducer(
      value: (/* state */ UseMultipleSelectionState[Item], /* actionAndChanges */ UseMultipleSelectionStateChangeOptions[Item]) => Partial[UseMultipleSelectionState[Item]]
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
  }
}
