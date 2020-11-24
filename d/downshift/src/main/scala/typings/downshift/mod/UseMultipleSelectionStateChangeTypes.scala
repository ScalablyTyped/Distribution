package typings.downshift.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UseMultipleSelectionStateChangeTypes extends js.Object
@JSImport("downshift", "UseMultipleSelectionStateChangeTypes")
@js.native
object UseMultipleSelectionStateChangeTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UseMultipleSelectionStateChangeTypes with String] = js.native
  
  @js.native
  sealed trait DropdownClick extends UseMultipleSelectionStateChangeTypes
  /* "__dropdown_click__" */ @js.native
  object DropdownClick extends TopLevel[DropdownClick with String]
  
  @js.native
  sealed trait DropdownKeyDownBackspace extends UseMultipleSelectionStateChangeTypes
  /* "__dropdown_keydown_backspace__" */ @js.native
  object DropdownKeyDownBackspace extends TopLevel[DropdownKeyDownBackspace with String]
  
  @js.native
  sealed trait DropdownKeyDownNavigationPrevious extends UseMultipleSelectionStateChangeTypes
  /* "__dropdown_keydown_navigation_previous__" */ @js.native
  object DropdownKeyDownNavigationPrevious extends TopLevel[DropdownKeyDownNavigationPrevious with String]
  
  @js.native
  sealed trait FunctionAddSelectedItem extends UseMultipleSelectionStateChangeTypes
  /* "__function_add_selected_item__" */ @js.native
  object FunctionAddSelectedItem extends TopLevel[FunctionAddSelectedItem with String]
  
  @js.native
  sealed trait FunctionRemoveSelectedItem extends UseMultipleSelectionStateChangeTypes
  /* "__function_remove_selected_item__" */ @js.native
  object FunctionRemoveSelectedItem extends TopLevel[FunctionRemoveSelectedItem with String]
  
  @js.native
  sealed trait FunctionReset extends UseMultipleSelectionStateChangeTypes
  /* "__function_reset__" */ @js.native
  object FunctionReset extends TopLevel[FunctionReset with String]
  
  @js.native
  sealed trait FunctionSetActiveIndex extends UseMultipleSelectionStateChangeTypes
  /* "__function_set_active_index__" */ @js.native
  object FunctionSetActiveIndex extends TopLevel[FunctionSetActiveIndex with String]
  
  @js.native
  sealed trait FunctionSetSelectedItems extends UseMultipleSelectionStateChangeTypes
  /* "__function_set_selected_items__" */ @js.native
  object FunctionSetSelectedItems extends TopLevel[FunctionSetSelectedItems with String]
  
  @js.native
  sealed trait SelectedItemClick extends UseMultipleSelectionStateChangeTypes
  /* "__selected_item_click__" */ @js.native
  object SelectedItemClick extends TopLevel[SelectedItemClick with String]
  
  @js.native
  sealed trait SelectedItemKeyDownBackspace extends UseMultipleSelectionStateChangeTypes
  /* "__selected_item_keydown_backspace__" */ @js.native
  object SelectedItemKeyDownBackspace extends TopLevel[SelectedItemKeyDownBackspace with String]
  
  @js.native
  sealed trait SelectedItemKeyDownDelete extends UseMultipleSelectionStateChangeTypes
  /* "__selected_item_keydown_delete__" */ @js.native
  object SelectedItemKeyDownDelete extends TopLevel[SelectedItemKeyDownDelete with String]
  
  @js.native
  sealed trait SelectedItemKeyDownNavigationNext extends UseMultipleSelectionStateChangeTypes
  /* "__selected_item_keydown_navigation_next__" */ @js.native
  object SelectedItemKeyDownNavigationNext extends TopLevel[SelectedItemKeyDownNavigationNext with String]
  
  @js.native
  sealed trait SelectedItemKeyDownNavigationPrevious extends UseMultipleSelectionStateChangeTypes
  /* "__selected_item_keydown_navigation_previous__" */ @js.native
  object SelectedItemKeyDownNavigationPrevious extends TopLevel[SelectedItemKeyDownNavigationPrevious with String]
}
