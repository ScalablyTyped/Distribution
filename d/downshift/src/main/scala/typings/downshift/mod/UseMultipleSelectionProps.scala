package typings.downshift.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseMultipleSelectionProps[Item] extends js.Object {
  
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
  implicit class UseMultipleSelectionPropsOps[Self <: UseMultipleSelectionProps[_], Item] (val x: Self with UseMultipleSelectionProps[Item]) extends AnyVal {
    
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
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    
    @scala.inline
    def setDefaultActiveIndex(value: Double): Self = this.set("defaultActiveIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActiveIndex: Self = this.set("defaultActiveIndex", js.undefined)
    
    @scala.inline
    def setDefaultSelectedItemsVarargs(value: Item*): Self = this.set("defaultSelectedItems", js.Array(value :_*))
    
    @scala.inline
    def setDefaultSelectedItems(value: js.Array[Item]): Self = this.set("defaultSelectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSelectedItems: Self = this.set("defaultSelectedItems", js.undefined)
    
    @scala.inline
    def setEnvironment(value: Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setGetA11yRemovalMessage(value: /* options */ A11yRemovalMessage[Item] => String): Self = this.set("getA11yRemovalMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetA11yRemovalMessage: Self = this.set("getA11yRemovalMessage", js.undefined)
    
    @scala.inline
    def setInitialActiveIndex(value: Double): Self = this.set("initialActiveIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialActiveIndex: Self = this.set("initialActiveIndex", js.undefined)
    
    @scala.inline
    def setInitialSelectedItemsVarargs(value: Item*): Self = this.set("initialSelectedItems", js.Array(value :_*))
    
    @scala.inline
    def setInitialSelectedItems(value: js.Array[Item]): Self = this.set("initialSelectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialSelectedItems: Self = this.set("initialSelectedItems", js.undefined)
    
    @scala.inline
    def setItemToString(value: /* item */ Item => String): Self = this.set("itemToString", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItemToString: Self = this.set("itemToString", js.undefined)
    
    @scala.inline
    def setKeyNavigationNext(value: String): Self = this.set("keyNavigationNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyNavigationNext: Self = this.set("keyNavigationNext", js.undefined)
    
    @scala.inline
    def setKeyNavigationPrevious(value: String): Self = this.set("keyNavigationPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyNavigationPrevious: Self = this.set("keyNavigationPrevious", js.undefined)
    
    @scala.inline
    def setOnActiveIndexChange(value: /* changes */ UseMultipleSelectionStateChange[Item] => Unit): Self = this.set("onActiveIndexChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnActiveIndexChange: Self = this.set("onActiveIndexChange", js.undefined)
    
    @scala.inline
    def setOnSelectedItemsChange(value: /* changes */ UseMultipleSelectionStateChange[Item] => Unit): Self = this.set("onSelectedItemsChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectedItemsChange: Self = this.set("onSelectedItemsChange", js.undefined)
    
    @scala.inline
    def setOnStateChange(value: /* changes */ UseMultipleSelectionStateChange[Item] => Unit): Self = this.set("onStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStateChange: Self = this.set("onStateChange", js.undefined)
    
    @scala.inline
    def setSelectedItemsVarargs(value: Item*): Self = this.set("selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSelectedItems(value: js.Array[Item]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    
    @scala.inline
    def setStateReducer(
      value: (/* state */ UseMultipleSelectionState[Item], /* actionAndChanges */ UseMultipleSelectionStateChangeOptions[Item]) => Partial[UseMultipleSelectionState[Item]]
    ): Self = this.set("stateReducer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
  }
}
