package typings.fundamentalReact.menuMod

import typings.fundamentalReact.FunctionComponentMenuGrou
import typings.fundamentalReact.FunctionComponentMenuItem
import typings.fundamentalReact.FunctionComponentMenuList
import typings.fundamentalReact.PartialMenuProps
import typings.fundamentalReact.WeakValidationMapMenuProp
import typings.fundamentalReact.fundamentalReactStrings.Menu
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Menu/Menu", JSImport.Default)
@js.native
object default extends js.Object {
  var Group: FunctionComponentMenuGrou = js.native
  var Item: FunctionComponentMenuItem = js.native
  var List: FunctionComponentMenuList = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialMenuProps] = js.native
  var displayName: js.UndefOr[Menu | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapMenuProp] = js.native
  def apply(props: PropsWithChildren[MenuProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[MenuProps], context: js.Any): ReactElement | Null = js.native
}

