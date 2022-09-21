package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.MenuDotList
import typings.fundamentalReact.menuMod.MenuListProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuListProps> & {  displayName :'Menu.List'} */
@js.native
trait FunctionComponentMenuList extends StObject {
  
  def apply(props: MenuListProps): ReactElement | Null = js.native
  def apply(props: MenuListProps, context: Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialMenuListProps] = js.native
  
  var displayName: js.UndefOr[String] & MenuDotList = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapMenuList] = js.native
}
