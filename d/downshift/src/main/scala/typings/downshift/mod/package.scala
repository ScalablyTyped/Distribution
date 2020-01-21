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
  type DownshiftInterface[Item] = (typings.react.mod.ComponentClass[typings.downshift.mod.DownshiftProps[Item], typings.react.mod.ComponentState]) with typings.downshift.AnonStateChangeTypes
  type StateChangeFunction[Item] = js.Function1[
    /* state */ typings.downshift.mod.DownshiftState[Item], 
    typings.std.Partial[typings.downshift.mod.StateChangeOptions[Item]]
  ]
  type UseSelectReturnValue[Item] = typings.downshift.mod.UseSelectState[Item] with typings.downshift.mod.UseSelectPropGetters[Item] with typings.downshift.mod.UseSelectActions[Item]
}
