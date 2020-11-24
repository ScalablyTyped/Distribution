package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.MenuDotItem
import typings.fundamentalReact.menuMod.MenuItemProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuItemProps> & {  displayName :'Menu.Item'} */
@js.native
trait FunctionComponentMenuItem extends js.Object {
  
  def apply(props: PropsWithChildren[MenuItemProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[MenuItemProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialMenuItemProps] = js.native
  
  var displayName: js.UndefOr[String] with MenuDotItem = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapMenuItem] = js.native
}
