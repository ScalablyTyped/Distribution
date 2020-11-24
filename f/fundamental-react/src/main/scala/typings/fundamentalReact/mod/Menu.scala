package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.FunctionComponentMenuGrou
import typings.fundamentalReact.anon.FunctionComponentMenuItem
import typings.fundamentalReact.anon.FunctionComponentMenuList
import typings.fundamentalReact.anon.PartialMenuProps
import typings.fundamentalReact.anon.WeakValidationMapMenuProp
import typings.fundamentalReact.menuMod.MenuProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react", "Menu")
@js.native
object Menu extends js.Object {
  
  def apply(props: PropsWithChildren[MenuProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[MenuProps], context: js.Any): ReactElement | Null = js.native
  
  var Group: FunctionComponentMenuGrou = js.native
  
  var Item: FunctionComponentMenuItem = js.native
  
  var List: FunctionComponentMenuList = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialMenuProps] = js.native
  
  var displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Menu | String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapMenuProp] = js.native
}
