package typings.downshift

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function0[scala.Unit]
  
  type ChildrenFunction[Item] = js.Function1[
    /* options */ typings.downshift.mod.ControllerStateAndHelpers[Item], 
    typings.react.mod.ReactNode
  ]
  
  type ControllerStateAndHelpers[Item] = typings.downshift.mod.DownshiftState[Item] with typings.downshift.mod.PropGetters[Item] with typings.downshift.mod.Actions[Item]
  
  type Downshift[Item] = typings.react.mod.Component[typings.downshift.mod.DownshiftProps[Item], js.Object, js.Any]
  
  type GetLabelPropsOptions = typings.react.mod.HTMLProps[typings.std.HTMLLabelElement]
  
  type StateChangeFunction[Item] = js.Function1[
    /* state */ typings.downshift.mod.DownshiftState[Item], 
    typings.std.Partial[typings.downshift.mod.StateChangeOptions[Item]]
  ]
  
  type UseComboboxGetComboboxPropsOptions = typings.react.mod.HTMLProps[typings.std.HTMLLabelElement]
  
  type UseComboboxGetLabelPropsOptions = typings.downshift.mod.GetLabelPropsOptions
  
  type UseComboboxReturnValue[Item] = typings.downshift.mod.UseComboboxState[Item] with typings.downshift.mod.UseComboboxPropGetters[Item] with typings.downshift.mod.UseComboboxActions[Item]
  
  type UseMultipleSelectionReturnValue[Item] = typings.downshift.mod.UseMultipleSelectionState[Item] with typings.downshift.mod.UseMultipleSelectionPropGetters[Item] with typings.downshift.mod.UseMultipleSelectionActions[Item]
  
  type UseSelectGetLabelPropsOptions = typings.downshift.mod.GetLabelPropsOptions
  
  type UseSelectReturnValue[Item] = typings.downshift.mod.UseSelectState[Item] with typings.downshift.mod.UseSelectPropGetters[Item] with typings.downshift.mod.UseSelectActions[Item]
  
  @scala.inline
  def resetIdCounter(): scala.Unit = typings.downshift.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resetIdCounter")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def useCombobox: typings.downshift.mod.UseComboboxInterface = typings.downshift.mod.^.asInstanceOf[js.Dynamic].selectDynamic("useCombobox").asInstanceOf[typings.downshift.mod.UseComboboxInterface]
  
  @scala.inline
  def useMultipleSelection: typings.downshift.mod.UseMultipleSelectionInterface = typings.downshift.mod.^.asInstanceOf[js.Dynamic].selectDynamic("useMultipleSelection").asInstanceOf[typings.downshift.mod.UseMultipleSelectionInterface]
  
  @scala.inline
  def useSelect: typings.downshift.mod.UseSelectInterface = typings.downshift.mod.^.asInstanceOf[js.Dynamic].selectDynamic("useSelect").asInstanceOf[typings.downshift.mod.UseSelectInterface]
}
