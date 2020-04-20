package typings.downshift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function0[scala.Unit]
  type ChildrenFunction[Item] = js.Function1[
    /* options */ typings.downshift.mod.ControllerStateAndHelpers[Item], 
    typings.react.mod.ReactNode
  ]
  type ControllerStateAndHelpers[Item] = typings.downshift.mod.DownshiftState[Item] with typings.downshift.mod.PropGetters[Item] with typings.downshift.mod.Actions[Item]
  type Downshift[Item] = typings.react.mod.Component[typings.downshift.mod.DownshiftProps[Item], js.Object, js.Any]
  type StateChangeFunction[Item] = js.Function1[
    /* state */ typings.downshift.mod.DownshiftState[Item], 
    typings.std.Partial[typings.downshift.mod.StateChangeOptions[Item]]
  ]
  type UseComboboxReturnValue[Item] = typings.downshift.mod.UseComboboxState[Item] with typings.downshift.mod.UseComboboxPropGetters[Item] with typings.downshift.mod.UseComboboxActions[Item]
  type UseMultipleSelectionReturnValue[Item] = typings.downshift.mod.UseMultipleSelectionState[Item] with typings.downshift.mod.UseMultipleSelectionPropGetters[Item] with typings.downshift.mod.UseMultipleSelectionActions[Item]
  type UseSelectReturnValue[Item] = typings.downshift.mod.UseSelectState[Item] with typings.downshift.mod.UseSelectPropGetters[Item] with typings.downshift.mod.UseSelectActions[Item]
}
