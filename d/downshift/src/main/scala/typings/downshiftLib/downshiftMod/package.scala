package typings
package downshiftLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object downshiftMod {
  type ChildrenFunction[Item] = js.Function1[/* options */ ControllerStateAndHelpers[Item], reactLib.reactMod.ReactNs.ReactNode]
  type ControllerStateAndHelpers[Item] = DownshiftState[Item] with PropGetters[Item] with Actions[Item]
  type DownshiftInterface[Item] = (reactLib.reactMod.ReactNs.ComponentClass[DownshiftProps[Item], reactLib.reactMod.ReactNs.ComponentState]) with downshiftLib.Anon_StateChangeTypes
  type GetLabelPropsOptions = reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLLabelElement]
}
