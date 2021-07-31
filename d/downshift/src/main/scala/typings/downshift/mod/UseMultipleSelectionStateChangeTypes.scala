package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UseMultipleSelectionStateChangeTypes extends StObject
@JSImport("downshift", "UseMultipleSelectionStateChangeTypes")
@js.native
object UseMultipleSelectionStateChangeTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UseMultipleSelectionStateChangeTypes & String] = js.native
  
  @js.native
  sealed trait DropdownClick
    extends StObject
       with UseMultipleSelectionStateChangeTypes
  /* "__dropdown_click__" */ val DropdownClick: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.DropdownClick & String = js.native
  
  @js.native
  sealed trait DropdownKeyDownBackspace
    extends StObject
       with UseMultipleSelectionStateChangeTypes
  /* "__dropdown_keydown_backspace__" */ val DropdownKeyDownBackspace: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.DropdownKeyDownBackspace & String = js.native
  
  @js.native
  sealed trait DropdownKeyDownNavigationPrevious
    extends StObject
       with UseMultipleSelectionStateChangeTypes
  /* "__dropdown_keydown_navigation_previous__" */ val DropdownKeyDownNavigationPrevious: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.DropdownKeyDownNavigationPrevious & String = js.native
  
  @js.native
  sealed trait FunctionAddSelectedItem
    extends StObject
       with UseMultipleSelectionStateChangeTypes
  /* "__function_add_selected_item__" */ val FunctionAddSelectedItem: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionAddSelectedItem & String = js.native
  
  @js.native
  sealed trait FunctionRemoveSelectedItem
    extends StObject
       with UseMultipleSelectionStateChangeTypes
  /* "__function_remove_selected_item__" */ val FunctionRemoveSelectedItem: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionRemoveSelectedItem & String = js.native
  
  @js.native
  sealed trait FunctionReset
    extends StObject
       with UseMultipleSelectionStateChangeTypes
  /* "__function_reset__" */ val FunctionReset: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionReset & String = js.native
  
  @js.native
  sealed trait FunctionSetActiveIndex
    extends StObject
       with UseMultipleSelectionStateChangeTypes
  /* "__function_set_active_index__" */ val FunctionSetActiveIndex: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionSetActiveIndex & String = js.native
  
  @js.native
  sealed trait FunctionSetSelectedItems
    extends StObject
       with UseMultipleSelectionStateChangeTypes
  /* "__function_set_selected_items__" */ val FunctionSetSelectedItems: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionSetSelectedItems & String = js.native
  
  @js.native
  sealed trait SelectedItemClick
    extends StObject
       with UseMultipleSelectionStateChangeTypes
  /* "__selected_item_click__" */ val SelectedItemClick: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemClick & String = js.native
  
  @js.native
  sealed trait SelectedItemKeyDownBackspace
    extends StObject
       with UseMultipleSelectionStateChangeTypes
  /* "__selected_item_keydown_backspace__" */ val SelectedItemKeyDownBackspace: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemKeyDownBackspace & String = js.native
  
  @js.native
  sealed trait SelectedItemKeyDownDelete
    extends StObject
       with UseMultipleSelectionStateChangeTypes
  /* "__selected_item_keydown_delete__" */ val SelectedItemKeyDownDelete: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemKeyDownDelete & String = js.native
  
  @js.native
  sealed trait SelectedItemKeyDownNavigationNext
    extends StObject
       with UseMultipleSelectionStateChangeTypes
  /* "__selected_item_keydown_navigation_next__" */ val SelectedItemKeyDownNavigationNext: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemKeyDownNavigationNext & String = js.native
  
  @js.native
  sealed trait SelectedItemKeyDownNavigationPrevious
    extends StObject
       with UseMultipleSelectionStateChangeTypes
  /* "__selected_item_keydown_navigation_previous__" */ val SelectedItemKeyDownNavigationPrevious: typings.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemKeyDownNavigationPrevious & String = js.native
}
