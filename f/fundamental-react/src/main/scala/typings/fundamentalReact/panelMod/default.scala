package typings.fundamentalReact.panelMod

import typings.fundamentalReact.anon.FunctionComponentPanelAct
import typings.fundamentalReact.anon.FunctionComponentPanelBod
import typings.fundamentalReact.anon.FunctionComponentPanelFil
import typings.fundamentalReact.anon.FunctionComponentPanelFoo
import typings.fundamentalReact.anon.FunctionComponentPanelHea
import typings.fundamentalReact.anon.FunctionComponentPanelHeaCall
import typings.fundamentalReact.anon.PartialPanelProps
import typings.fundamentalReact.anon.WeakValidationMapPanelPro
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

