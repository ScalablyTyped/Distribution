package typings.fundamentalReact.buttonGroupMod

import typings.fundamentalReact.anon.PartialButtonGroupProps
import typings.fundamentalReact.anon.WeakValidationMapButtonGr
import typings.fundamentalReact.fundamentalReactStrings.ButtonGroup
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Button/ButtonGroup", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialButtonGroupProps] = js.native
  var displayName: js.UndefOr[ButtonGroup | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapButtonGr] = js.native
  def apply(props: PropsWithChildren[ButtonGroupProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ButtonGroupProps], context: js.Any): ReactElement | Null = js.native
}

