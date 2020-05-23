package typings.fundamentalReact.switchMod

import typings.fundamentalReact.anon.PartialSwitchProps
import typings.fundamentalReact.anon.WeakValidationMapSwitchPr
import typings.fundamentalReact.fundamentalReactStrings.Switch
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Switch/Switch", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialSwitchProps] = js.native
  var displayName: js.UndefOr[String | Switch] = js.native
  var propTypes: js.UndefOr[WeakValidationMapSwitchPr] = js.native
  def apply(props: PropsWithChildren[SwitchProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[SwitchProps], context: js.Any): ReactElement | Null = js.native
}

