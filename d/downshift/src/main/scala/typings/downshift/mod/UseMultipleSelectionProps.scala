package typings.downshift.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseMultipleSelectionProps[Item] extends StObject {
  
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
      Partial[UseMultipleSelectionState[Item]]
    ]
  ] = js.undefined
}
object UseMultipleSelectionProps {
  
  inline def apply[Item](): UseMultipleSelectionProps[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseMultipleSelectionProps[Item]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseMultipleSelectionProps[?], Item] (val x: Self & UseMultipleSelectionProps[Item]) extends AnyVal {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
    inline def setDefaultActiveIndex(value: Double): Self = StObject.set(x, "defaultActiveIndex", value.asInstanceOf[js.Any])
    
    inline def setDefaultActiveIndexUndefined: Self = StObject.set(x, "defaultActiveIndex", js.undefined)
    
    inline def setDefaultSelectedItems(value: js.Array[Item]): Self = StObject.set(x, "defaultSelectedItems", value.asInstanceOf[js.Any])
    
    inline def setDefaultSelectedItemsUndefined: Self = StObject.set(x, "defaultSelectedItems", js.undefined)
    
    inline def setDefaultSelectedItemsVarargs(value: Item*): Self = StObject.set(x, "defaultSelectedItems", js.Array(value*))
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setGetA11yRemovalMessage(value: /* options */ A11yRemovalMessage[Item] => String): Self = StObject.set(x, "getA11yRemovalMessage", js.Any.fromFunction1(value))
    
    inline def setGetA11yRemovalMessageUndefined: Self = StObject.set(x, "getA11yRemovalMessage", js.undefined)
    
    inline def setInitialActiveIndex(value: Double): Self = StObject.set(x, "initialActiveIndex", value.asInstanceOf[js.Any])
    
    inline def setInitialActiveIndexUndefined: Self = StObject.set(x, "initialActiveIndex", js.undefined)
    
    inline def setInitialSelectedItems(value: js.Array[Item]): Self = StObject.set(x, "initialSelectedItems", value.asInstanceOf[js.Any])
    
    inline def setInitialSelectedItemsUndefined: Self = StObject.set(x, "initialSelectedItems", js.undefined)
    
    inline def setInitialSelectedItemsVarargs(value: Item*): Self = StObject.set(x, "initialSelectedItems", js.Array(value*))
    
    inline def setItemToString(value: /* item */ Item => String): Self = StObject.set(x, "itemToString", js.Any.fromFunction1(value))
    
    inline def setItemToStringUndefined: Self = StObject.set(x, "itemToString", js.undefined)
    
    inline def setKeyNavigationNext(value: String): Self = StObject.set(x, "keyNavigationNext", value.asInstanceOf[js.Any])
    
    inline def setKeyNavigationNextUndefined: Self = StObject.set(x, "keyNavigationNext", js.undefined)
    
    inline def setKeyNavigationPrevious(value: String): Self = StObject.set(x, "keyNavigationPrevious", value.asInstanceOf[js.Any])
    
    inline def setKeyNavigationPreviousUndefined: Self = StObject.set(x, "keyNavigationPrevious", js.undefined)
    
    inline def setOnActiveIndexChange(value: /* changes */ UseMultipleSelectionStateChange[Item] => Unit): Self = StObject.set(x, "onActiveIndexChange", js.Any.fromFunction1(value))
    
    inline def setOnActiveIndexChangeUndefined: Self = StObject.set(x, "onActiveIndexChange", js.undefined)
    
    inline def setOnSelectedItemsChange(value: /* changes */ UseMultipleSelectionStateChange[Item] => Unit): Self = StObject.set(x, "onSelectedItemsChange", js.Any.fromFunction1(value))
    
    inline def setOnSelectedItemsChangeUndefined: Self = StObject.set(x, "onSelectedItemsChange", js.undefined)
    
    inline def setOnStateChange(value: /* changes */ UseMultipleSelectionStateChange[Item] => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
    
    inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
    
    inline def setSelectedItems(value: js.Array[Item]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: Item*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    
    inline def setStateReducer(
      value: (/* state */ UseMultipleSelectionState[Item], /* actionAndChanges */ UseMultipleSelectionStateChangeOptions[Item]) => Partial[UseMultipleSelectionState[Item]]
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction2(value))
    
    inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
  }
}
