package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.MenuDotList
import typings.fundamentalReact.menuMod.MenuListProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuListProps> & {  displayName :'Menu.List'} */
@js.native
trait FunctionComponentMenuList extends StObject {
  
  def apply(props: PropsWithChildren[MenuListProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[MenuListProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialMenuListProps] = js.native
  
  var displayName: js.UndefOr[String] with MenuDotList = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapMenuList] = js.native
}
