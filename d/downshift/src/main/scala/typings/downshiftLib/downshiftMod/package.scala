package typings
package downshiftLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object downshiftMod {
  type Callback = js.Function0[scala.Unit]
  type ChildrenFunction[Item] = js.Function1[/* options */ ControllerStateAndHelpers[Item], reactLib.reactMod.ReactNode]
  type ControllerStateAndHelpers[Item] = DownshiftState[Item] with PropGetters[Item] with Actions[Item]
  type DownshiftInterface[Item] = (reactLib.reactMod.ComponentClass[DownshiftProps[Item], reactLib.reactMod.ComponentState]) with downshiftLib.Anon_StateChangeTypes
  type GetLabelPropsOptions = reactLib.reactMod.HTMLProps[stdLib.HTMLLabelElement]
  type StateChangeFunction[Item] = js.Function1[/* state */ DownshiftState[Item], stdLib.Partial[StateChangeOptions[Item]]]
}
