package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.PanelDotHead
import typings.fundamentalReact.panelMod.PanelHeadProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Panel/Panel.PanelHeadProps> & {  displayName  :'Panel.Head'} */
@js.native
trait FunctionComponentPanelHea extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialPanelHeadProps] = js.native
  var displayName: js.UndefOr[String with PanelDotHead] = js.native
  var propTypes: js.UndefOr[WeakValidationMapPanelHea] = js.native
  def apply(props: PropsWithChildren[PanelHeadProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[PanelHeadProps], context: js.Any): ReactElement | Null = js.native
}

