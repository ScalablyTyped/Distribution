package typings.fundamentalReact

import typings.fundamentalReact.actionBarMod.ActionBarBackProps
import typings.fundamentalReact.fundamentalReactStrings.ActionBarDotBack
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/ActionBar/ActionBar.ActionBarBackProps> & {  displayName  :'ActionBar.Back'} */
@js.native
trait FunctionComponentActionBaCall extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialActionBarBackProps] = js.native
  var displayName: js.UndefOr[String with ActionBarDotBack] = js.native
  var propTypes: js.UndefOr[WeakValidationMapActionBaAccessKey] = js.native
  def apply(props: PropsWithChildren[ActionBarBackProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ActionBarBackProps], context: js.Any): ReactElement | Null = js.native
}

