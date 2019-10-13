package typings.downshift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object downshiftMod {
  import typings.downshift.Anon_StateChangeTypes
  import typings.downshift.Anon_StateChangeTypesAnonFunctionClearKeysSoFar
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.ReactNode
  import typings.std.Partial

  type Callback = js.Function0[Unit]
  type ChildrenFunction[Item] = js.Function1[/* options */ ControllerStateAndHelpers[Item], ReactNode]
  type ControllerStateAndHelpers[Item] = DownshiftState[Item] with PropGetters[Item] with Actions[Item]
  type DownshiftInterface[Item] = (ComponentClass[DownshiftProps[Item], ComponentState]) with Anon_StateChangeTypes
  type StateChangeFunction[Item] = js.Function1[/* state */ DownshiftState[Item], Partial[StateChangeOptions[Item]]]
  type UseSelectInterface[Item] = js.Function1[
    /* props */ UseSelectProps[Item], 
    UseSelectReturnValue[Item] with Anon_StateChangeTypesAnonFunctionClearKeysSoFar
  ]
  type UseSelectReturnValue[Item] = UseSelectState[Item] with UseSelectPropGetters[Item] with UseSelectActions[Item]
}
