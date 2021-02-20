package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UseMultipleSelectionStateChangeTypes extends StObject
@JSImport("downshift", "UseMultipleSelectionStateChangeTypes")
@js.native
object UseMultipleSelectionStateChangeTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UseMultipleSelectionStateChangeTypes with String] = js.native
  
  @js.native
  sealed trait DropdownClick extends UseMultipleSelectionStateChangeTypes
  /* "__dropdown_click__" */ val DropdownClick: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.DropdownClick with String = js.native
  
  @js.native
  sealed trait DropdownKeyDownBackspace extends UseMultipleSelectionStateChangeTypes
  /* "__dropdown_keydown_backspace__" */ val DropdownKeyDownBackspace: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.DropdownKeyDownBackspace with String = js.native
  
  @js.native
  sealed trait DropdownKeyDownNavigationPrevious extends UseMultipleSelectionStateChangeTypes
  /* "__dropdown_keydown_navigation_previous__" */ val DropdownKeyDownNavigationPrevious: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.DropdownKeyDownNavigationPrevious with String = js.native
  
  @js.native
  sealed trait FunctionAddSelectedItem extends UseMultipleSelectionStateChangeTypes
  /* "__function_add_selected_item__" */ val FunctionAddSelectedItem: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionAddSelectedItem with String = js.native
  
  @js.native
  sealed trait FunctionRemoveSelectedItem extends UseMultipleSelectionStateChangeTypes
  /* "__function_remove_selected_item__" */ val FunctionRemoveSelectedItem: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionRemoveSelectedItem with String = js.native
  
  @js.native
  sealed trait FunctionReset extends UseMultipleSelectionStateChangeTypes
  /* "__function_reset__" */ val FunctionReset: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionReset with String = js.native
  
  @js.native
  sealed trait FunctionSetActiveIndex extends UseMultipleSelectionStateChangeTypes
  /* "__function_set_active_index__" */ val FunctionSetActiveIndex: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionSetActiveIndex with String = js.native
  
  @js.native
  sealed trait FunctionSetSelectedItems extends UseMultipleSelectionStateChangeTypes
  /* "__function_set_selected_items__" */ val FunctionSetSelectedItems: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionSetSelectedItems with String = js.native
  
  @js.native
  sealed trait SelectedItemClick extends UseMultipleSelectionStateChangeTypes
  /* "__selected_item_click__" */ val SelectedItemClick: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemClick with String = js.native
  
  @js.native
  sealed trait SelectedItemKeyDownBackspace extends UseMultipleSelectionStateChangeTypes
  /* "__selected_item_keydown_backspace__" */ val SelectedItemKeyDownBackspace: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemKeyDownBackspace with String = js.native
  
  @js.native
  sealed trait SelectedItemKeyDownDelete extends UseMultipleSelectionStateChangeTypes
  /* "__selected_item_keydown_delete__" */ val SelectedItemKeyDownDelete: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemKeyDownDelete with String = js.native
  
  @js.native
  sealed trait SelectedItemKeyDownNavigationNext extends UseMultipleSelectionStateChangeTypes
  /* "__selected_item_keydown_navigation_next__" */ val SelectedItemKeyDownNavigationNext: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemKeyDownNavigationNext with String = js.native
  
  @js.native
  sealed trait SelectedItemKeyDownNavigationPrevious extends UseMultipleSelectionStateChangeTypes
  /* "__selected_item_keydown_navigation_previous__" */ val SelectedItemKeyDownNavigationPrevious: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemKeyDownNavigationPrevious with String = js.native
}
