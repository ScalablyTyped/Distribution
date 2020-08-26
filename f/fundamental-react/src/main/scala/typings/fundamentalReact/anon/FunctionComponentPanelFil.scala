package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.PanelDotFilters
import typings.fundamentalReact.panelMod.PanelFiltersProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Panel/Panel.PanelFiltersProps> & {  displayName :'Panel.Filters'} */
@js.native
trait FunctionComponentPanelFil extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialPanelFiltersProps] = js.native
  var displayName: js.UndefOr[String] with PanelDotFilters = js.native
  var propTypes: js.UndefOr[WeakValidationMapPanelFil] = js.native
  def apply(props: PropsWithChildren[PanelFiltersProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[PanelFiltersProps], context: js.Any): ReactElement | Null = js.native
}

