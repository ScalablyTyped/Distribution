package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.PanelDotBody
import typings.fundamentalReact.panelMod.PanelBodyProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Panel/Panel.PanelBodyProps> & {  displayName  :'Panel.Body'} */
@js.native
trait FunctionComponentPanelBod extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialPanelBodyProps] = js.native
  var displayName: js.UndefOr[String with PanelDotBody] = js.native
  var propTypes: js.UndefOr[WeakValidationMapPanelBod] = js.native
  def apply(props: PropsWithChildren[PanelBodyProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[PanelBodyProps], context: js.Any): ReactElement | Null = js.native
}

