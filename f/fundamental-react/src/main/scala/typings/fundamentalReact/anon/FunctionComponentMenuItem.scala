package typings.fundamentalReact.anon

import typings.fundamentalReact.libMenuMenuMod.MenuItemProps
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuItemProps> & {  displayName :'Menu.Item'} */
@js.native
trait FunctionComponentMenuItem extends StObject {
  
  def apply(props: MenuItemProps): ReactNode = js.native
  def apply(props: MenuItemProps, context: Any): ReactNode = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialMenuItemProps] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapMenuItem] = js.native
}
