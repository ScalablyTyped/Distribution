package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.PanelDotHeader
import typings.fundamentalReact.panelMod.PanelHeaderProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Panel/Panel.PanelHeaderProps> & {  displayName :'Panel.Header'} */
@js.native
trait FunctionComponentPanelHeaCall extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialPanelHeaderProps] = js.native
  var displayName: js.UndefOr[String] with PanelDotHeader = js.native
  var propTypes: js.UndefOr[WeakValidationMapPanelHeaClassName] = js.native
  def apply(props: PropsWithChildren[PanelHeaderProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[PanelHeaderProps], context: js.Any): ReactElement | Null = js.native
}

