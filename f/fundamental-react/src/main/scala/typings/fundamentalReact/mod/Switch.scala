package typings.fundamentalReact.mod

import typings.fundamentalReact.PartialSwitchProps
import typings.fundamentalReact.WeakValidationMapSwitchPr
import typings.fundamentalReact.switchMod.SwitchProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "Switch")
@js.native
object Switch extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialSwitchProps] = js.native
  var displayName: js.UndefOr[String | typings.fundamentalReact.fundamentalReactStrings.Switch] = js.native
  var propTypes: js.UndefOr[WeakValidationMapSwitchPr] = js.native
  def apply(props: PropsWithChildren[SwitchProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[SwitchProps], context: js.Any): ReactElement | Null = js.native
}

