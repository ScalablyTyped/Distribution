package typings.downshift.mod

import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseComboboxProps[Item] extends js.Object {
  var circularNavigation: js.UndefOr[Boolean] = js.native
  var defaultHighlightedIndex: js.UndefOr[Double] = js.native
  var defaultInputValue: js.UndefOr[String] = js.native
  var defaultIsOpen: js.UndefOr[Boolean] = js.native
  var defaultSelectedItem: js.UndefOr[Item | Null] = js.native
  var environment: js.UndefOr[Environment] = js.native
  var getA11ySelectionMessage: js.UndefOr[js.Function1[/* options */ A11yStatusMessageOptions[Item], String]] = js.native
  var getA11yStatusMessage: js.UndefOr[js.Function1[/* options */ A11yStatusMessageOptions[Item], String]] = js.native
  var getItemId: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
  var highlightedIndex: js.UndefOr[Double] = js.native
  var id: js.UndefOr[String] = js.native
  var initialHighlightedIndex: js.UndefOr[Double] = js.native
  var initialInputValue: js.UndefOr[String] = js.native
  var initialIsOpen: js.UndefOr[Boolean] = js.native
  var initialSelectedItem: js.UndefOr[Item | Null] = js.native
  var inputId: js.UndefOr[String] = js.native
  var inputValue: js.UndefOr[String] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var itemToString: js.UndefOr[js.Function1[/* item */ Item | Null, String]] = js.native
  var items: js.Array[Item] = js.native
  var labelId: js.UndefOr[String] = js.native
  var menuId: js.UndefOr[String] = js.native
  var onHighlightedIndexChange: js.UndefOr[js.Function1[/* changes */ UseComboboxStateChange[Item], Unit]] = js.native
  var onInputValueChange: js.UndefOr[js.Function1[/* changes */ UseComboboxStateChange[Item], Unit]] = js.native
  var onIsOpenChange: js.UndefOr[js.Function1[/* changes */ UseComboboxStateChange[Item], Unit]] = js.native
  var onSelectedItemChange: js.UndefOr[js.Function1[/* changes */ UseComboboxStateChange[Item], Unit]] = js.native
  var onStateChange: js.UndefOr[js.Function1[/* changes */ UseComboboxStateChange[Item], Unit]] = js.native
  var scrollIntoView: js.UndefOr[js.Function2[/* node */ HTMLElement, /* menuNode */ HTMLElement, Unit]] = js.native
  var selectedItem: js.UndefOr[Item | Null] = js.native
  var stateReducer: js.UndefOr[
    js.Function2[
      /* state */ UseComboboxState[Item], 
      /* actionAndChanges */ UseComboboxStateChangeOptions[Item], 
      Partial[UseComboboxState[Item]]
    ]
  ] = js.native
  var toggleButtonId: js.UndefOr[String] = js.native
}

object UseComboboxProps {
  @scala.inline
  def apply[Item](items: js.Array[Item]): UseComboboxProps[Item] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseComboboxProps[Item]]
  }
  @scala.inline
  implicit class UseComboboxPropsOps[Self <: UseComboboxProps[_], Item] (val x: Self with UseComboboxProps[Item]) extends AnyVal {
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
    def setItemsVarargs(value: Item*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Item]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setCircularNavigation(value: Boolean): Self = this.set("circularNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircularNavigation: Self = this.set("circularNavigation", js.undefined)
    @scala.inline
    def setDefaultHighlightedIndex(value: Double): Self = this.set("defaultHighlightedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultHighlightedIndex: Self = this.set("defaultHighlightedIndex", js.undefined)
    @scala.inline
    def setDefaultInputValue(value: String): Self = this.set("defaultInputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultInputValue: Self = this.set("defaultInputValue", js.undefined)
    @scala.inline
    def setDefaultIsOpen(value: Boolean): Self = this.set("defaultIsOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultIsOpen: Self = this.set("defaultIsOpen", js.undefined)
    @scala.inline
    def setDefaultSelectedItem(value: Item): Self = this.set("defaultSelectedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSelectedItem: Self = this.set("defaultSelectedItem", js.undefined)
    @scala.inline
    def setDefaultSelectedItemNull: Self = this.set("defaultSelectedItem", null)
    @scala.inline
    def setEnvironment(value: Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setGetA11ySelectionMessage(value: /* options */ A11yStatusMessageOptions[Item] => String): Self = this.set("getA11ySelectionMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetA11ySelectionMessage: Self = this.set("getA11ySelectionMessage", js.undefined)
    @scala.inline
    def setGetA11yStatusMessage(value: /* options */ A11yStatusMessageOptions[Item] => String): Self = this.set("getA11yStatusMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetA11yStatusMessage: Self = this.set("getA11yStatusMessage", js.undefined)
    @scala.inline
    def setGetItemId(value: /* index */ Double => String): Self = this.set("getItemId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetItemId: Self = this.set("getItemId", js.undefined)
    @scala.inline
    def setHighlightedIndex(value: Double): Self = this.set("highlightedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightedIndex: Self = this.set("highlightedIndex", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInitialHighlightedIndex(value: Double): Self = this.set("initialHighlightedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialHighlightedIndex: Self = this.set("initialHighlightedIndex", js.undefined)
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
    def setInitialSelectedItemNull: Self = this.set("initialSelectedItem", null)
    @scala.inline
    def setInputId(value: String): Self = this.set("inputId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputId: Self = this.set("inputId", js.undefined)
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
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
    def setOnHighlightedIndexChange(value: /* changes */ UseComboboxStateChange[Item] => Unit): Self = this.set("onHighlightedIndexChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHighlightedIndexChange: Self = this.set("onHighlightedIndexChange", js.undefined)
    @scala.inline
    def setOnInputValueChange(value: /* changes */ UseComboboxStateChange[Item] => Unit): Self = this.set("onInputValueChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInputValueChange: Self = this.set("onInputValueChange", js.undefined)
    @scala.inline
    def setOnIsOpenChange(value: /* changes */ UseComboboxStateChange[Item] => Unit): Self = this.set("onIsOpenChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIsOpenChange: Self = this.set("onIsOpenChange", js.undefined)
    @scala.inline
    def setOnSelectedItemChange(value: /* changes */ UseComboboxStateChange[Item] => Unit): Self = this.set("onSelectedItemChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectedItemChange: Self = this.set("onSelectedItemChange", js.undefined)
    @scala.inline
    def setOnStateChange(value: /* changes */ UseComboboxStateChange[Item] => Unit): Self = this.set("onStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStateChange: Self = this.set("onStateChange", js.undefined)
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
    def setStateReducer(
      value: (/* state */ UseComboboxState[Item], /* actionAndChanges */ UseComboboxStateChangeOptions[Item]) => Partial[UseComboboxState[Item]]
    ): Self = this.set("stateReducer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
    @scala.inline
    def setToggleButtonId(value: String): Self = this.set("toggleButtonId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleButtonId: Self = this.set("toggleButtonId", js.undefined)
  }
  
}

