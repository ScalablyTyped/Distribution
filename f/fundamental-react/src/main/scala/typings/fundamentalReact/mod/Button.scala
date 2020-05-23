package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialButtonProps
import typings.fundamentalReact.anon.WeakValidationMapButtonPr
import typings.fundamentalReact.buttonMod.ButtonProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "Button")
@js.native
object Button extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialButtonProps] = js.native
  var displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Button | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapButtonPr] = js.native
  def apply(props: PropsWithChildren[ButtonProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ButtonProps], context: js.Any): ReactElement | Null = js.native
}

