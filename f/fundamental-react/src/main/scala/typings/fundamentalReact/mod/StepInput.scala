package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialStepInputProps
import typings.fundamentalReact.anon.WeakValidationMapStepInpu
import typings.fundamentalReact.stepInputMod.StepInputProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "StepInput")
@js.native
object StepInput extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialStepInputProps] = js.native
  var displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.StepInput | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapStepInpu] = js.native
  def apply(props: PropsWithChildren[StepInputProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[StepInputProps], context: js.Any): ReactElement | Null = js.native
}

