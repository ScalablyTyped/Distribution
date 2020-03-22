package typings.fundamentalReact.panelMod

import typings.fundamentalReact.FunctionComponentPanelAct
import typings.fundamentalReact.FunctionComponentPanelBod
import typings.fundamentalReact.FunctionComponentPanelFil
import typings.fundamentalReact.FunctionComponentPanelFoo
import typings.fundamentalReact.FunctionComponentPanelHea
import typings.fundamentalReact.FunctionComponentPanelHeaCall
import typings.fundamentalReact.PartialPanelProps
import typings.fundamentalReact.WeakValidationMapPanelPro
import typings.fundamentalReact.fundamentalReactStrings.Panel
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Panel/Panel", JSImport.Default)
@js.native
object default extends js.Object {
  var Actions: FunctionComponentPanelAct = js.native
  var Body: FunctionComponentPanelBod = js.native
  var Filters: FunctionComponentPanelFil = js.native
  var Footer: FunctionComponentPanelFoo = js.native
  var Head: FunctionComponentPanelHea = js.native
  var Header: FunctionComponentPanelHeaCall = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialPanelProps] = js.native
  var displayName: js.UndefOr[Panel | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapPanelPro] = js.native
  def apply(props: PropsWithChildren[PanelProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[PanelProps], context: js.Any): ReactElement | Null = js.native
}

