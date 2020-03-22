package typings.fundamentalReact.actionBarMod

import typings.fundamentalReact.FunctionComponentActionBa
import typings.fundamentalReact.FunctionComponentActionBaCall
import typings.fundamentalReact.FunctionComponentActionBaContextTypes
import typings.fundamentalReact.PartialActionBarProps
import typings.fundamentalReact.WeakValidationMapActionBa
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/ActionBar/ActionBar", JSImport.Default)
@js.native
object default extends js.Object {
  var Actions: FunctionComponentActionBa = js.native
  var Back: FunctionComponentActionBaCall = js.native
  var Header: FunctionComponentActionBaContextTypes = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialActionBarProps] = js.native
  var displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.ActionBar | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapActionBa] = js.native
  def apply(props: PropsWithChildren[ActionBarProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ActionBarProps], context: js.Any): ReactElement | Null = js.native
}

