package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.ui.dxActionSheet.CancelClickEvent
import typings.devextreme.mod.DevExpress.ui.dxActionSheet.ItemLike
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxActionSheetOptions[TItem /* <: ItemLike[TKey] */, TKey]
  extends StObject
     with CollectionWidgetOptions[dxActionSheet[TItem, TKey], TItem, TKey] {
  
  /**
    * The text displayed in the button that closes the action sheet.
    */
  var cancelText: js.UndefOr[String] = js.undefined
  
  /**
    * A function that is executed when the Cancel button is clicked or tapped.
    */
  var onCancelClick: js.UndefOr[(js.Function1[/* e */ CancelClickEvent[TItem, TKey], Unit]) | String] = js.undefined
  
  /**
    * Specifies whether or not to display the Cancel button in action sheet.
    */
  var showCancelButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value specifying whether or not the title of the action sheet is visible.
    */
  var showTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the element the action sheet popover points at. Applies only if usePopover is true.
    */
  var target: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  /**
    * The title of the action sheet.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether or not to show the action sheet within a Popover UI component.
    */
  var usePopover: js.UndefOr[Boolean] = js.undefined
}
object dxActionSheetOptions {
  
  inline def apply[TItem /* <: ItemLike[TKey] */, TKey](): dxActionSheetOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxActionSheetOptions[TItem, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxActionSheetOptions[?, ?], TItem /* <: ItemLike[TKey] */, TKey] (val x: Self & (dxActionSheetOptions[TItem, TKey])) extends AnyVal {
    
    inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setOnCancelClick(value: (js.Function1[/* e */ CancelClickEvent[TItem, TKey], Unit]) | String): Self = StObject.set(x, "onCancelClick", value.asInstanceOf[js.Any])
    
    inline def setOnCancelClickFunction1(value: /* e */ CancelClickEvent[TItem, TKey] => Unit): Self = StObject.set(x, "onCancelClick", js.Any.fromFunction1(value))
    
    inline def setOnCancelClickUndefined: Self = StObject.set(x, "onCancelClick", js.undefined)
    
    inline def setShowCancelButton(value: Boolean): Self = StObject.set(x, "showCancelButton", value.asInstanceOf[js.Any])
    
    inline def setShowCancelButtonUndefined: Self = StObject.set(x, "showCancelButton", js.undefined)
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    inline def setTarget(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUsePopover(value: Boolean): Self = StObject.set(x, "usePopover", value.asInstanceOf[js.Any])
    
    inline def setUsePopoverUndefined: Self = StObject.set(x, "usePopover", js.undefined)
  }
}
