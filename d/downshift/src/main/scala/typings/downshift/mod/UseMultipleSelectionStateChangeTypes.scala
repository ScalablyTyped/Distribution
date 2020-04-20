package typings.downshift.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UseMultipleSelectionStateChangeTypes extends js.Object

@JSImport("downshift", "UseMultipleSelectionStateChangeTypes")
@js.native
object UseMultipleSelectionStateChangeTypes extends js.Object {
  @js.native
  sealed trait DropdownClick extends UseMultipleSelectionStateChangeTypes
  
  @js.native
  sealed trait DropdownKeyDownBackspace extends UseMultipleSelectionStateChangeTypes
  
  @js.native
  sealed trait DropdownKeyDownNavigationPrevious extends UseMultipleSelectionStateChangeTypes
  
  @js.native
  sealed trait FunctionAddSelectedItem extends UseMultipleSelectionStateChangeTypes
  
  @js.native
  sealed trait FunctionRemoveSelectedItem extends UseMultipleSelectionStateChangeTypes
  
  @js.native
  sealed trait FunctionReset extends UseMultipleSelectionStateChangeTypes
  
  @js.native
  sealed trait FunctionSetActiveIndex extends UseMultipleSelectionStateChangeTypes
  
  @js.native
  sealed trait FunctionSetSelectedItems extends UseMultipleSelectionStateChangeTypes
  
  @js.native
  sealed trait SelectedItemClick extends UseMultipleSelectionStateChangeTypes
  
  @js.native
  sealed trait SelectedItemKeyDownBackspace extends UseMultipleSelectionStateChangeTypes
  
  @js.native
  sealed trait SelectedItemKeyDownDelete extends UseMultipleSelectionStateChangeTypes
  
  @js.native
  sealed trait SelectedItemKeyDownNavigationNext extends UseMultipleSelectionStateChangeTypes
  
  @js.native
  sealed trait SelectedItemKeyDownNavigationPrevious extends UseMultipleSelectionStateChangeTypes
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UseMultipleSelectionStateChangeTypes with String] = js.native
  /* "__dropdown_click__" */ @js.native
  object DropdownClick extends TopLevel[DropdownClick with String]
  
  /* "__dropdown_keydown_backspace__" */ @js.native
  object DropdownKeyDownBackspace extends TopLevel[DropdownKeyDownBackspace with String]
  
  /* "__dropdown_keydown_navigation_previous__" */ @js.native
  object DropdownKeyDownNavigationPrevious extends TopLevel[DropdownKeyDownNavigationPrevious with String]
  
  /* "__function_add_selected_item__" */ @js.native
  object FunctionAddSelectedItem extends TopLevel[FunctionAddSelectedItem with String]
  
  /* "__function_remove_selected_item__" */ @js.native
  object FunctionRemoveSelectedItem extends TopLevel[FunctionRemoveSelectedItem with String]
  
  /* "__function_reset__" */ @js.native
  object FunctionReset extends TopLevel[FunctionReset with String]
  
  /* "__function_set_active_index__" */ @js.native
  object FunctionSetActiveIndex extends TopLevel[FunctionSetActiveIndex with String]
  
  /* "__function_set_selected_items__" */ @js.native
  object FunctionSetSelectedItems extends TopLevel[FunctionSetSelectedItems with String]
  
  /* "__selected_item_click__" */ @js.native
  object SelectedItemClick extends TopLevel[SelectedItemClick with String]
  
  /* "__selected_item_keydown_backspace__" */ @js.native
  object SelectedItemKeyDownBackspace extends TopLevel[SelectedItemKeyDownBackspace with String]
  
  /* "__selected_item_keydown_delete__" */ @js.native
  object SelectedItemKeyDownDelete extends TopLevel[SelectedItemKeyDownDelete with String]
  
  /* "__selected_item_keydown_navigation_next__" */ @js.native
  object SelectedItemKeyDownNavigationNext extends TopLevel[SelectedItemKeyDownNavigationNext with String]
  
  /* "__selected_item_keydown_navigation_previous__" */ @js.native
  object SelectedItemKeyDownNavigationPrevious extends TopLevel[SelectedItemKeyDownNavigationPrevious with String]
  
}

