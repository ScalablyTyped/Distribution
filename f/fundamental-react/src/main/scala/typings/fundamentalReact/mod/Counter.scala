package typings.fundamentalReact.mod

import typings.fundamentalReact.PartialCounterProps
import typings.fundamentalReact.WeakValidationMapCounterP
import typings.fundamentalReact.counterMod.CounterProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "Counter")
@js.native
object Counter extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialCounterProps] = js.native
  var displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Counter | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapCounterP] = js.native
  def apply(props: PropsWithChildren[CounterProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[CounterProps], context: js.Any): ReactElement | Null = js.native
}

