package typings.fundamentalReact

import typings.fundamentalReact.fundamentalReactStrings.PanelDotActions
import typings.fundamentalReact.panelMod.PanelActionsProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Panel/Panel.PanelActionsProps> & {  displayName  :'Panel.Actions'} */
@js.native
trait FunctionComponentPanelAct extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialPanelActionsProps] = js.native
  var displayName: js.UndefOr[String with PanelDotActions] = js.native
  var propTypes: js.UndefOr[WeakValidationMapPanelAct] = js.native
  def apply(props: PropsWithChildren[PanelActionsProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[PanelActionsProps], context: js.Any): ReactElement | Null = js.native
}

