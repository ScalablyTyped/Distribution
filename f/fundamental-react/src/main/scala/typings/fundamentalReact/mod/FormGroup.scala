package typings.fundamentalReact.mod

import typings.fundamentalReact.PartialFormGroupProps
import typings.fundamentalReact.WeakValidationMapFormGrou
import typings.fundamentalReact.formGroupMod.FormGroupProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "FormGroup")
@js.native
object FormGroup extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialFormGroupProps] = js.native
  var displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.FormGroup | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapFormGrou] = js.native
  def apply(props: PropsWithChildren[FormGroupProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[FormGroupProps], context: js.Any): ReactElement | Null = js.native
}

