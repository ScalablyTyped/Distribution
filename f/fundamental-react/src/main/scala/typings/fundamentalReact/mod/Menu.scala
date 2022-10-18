package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.FunctionComponentMenuGrou
import typings.fundamentalReact.anon.FunctionComponentMenuItem
import typings.fundamentalReact.anon.FunctionComponentMenuList
import typings.fundamentalReact.anon.PartialMenuProps
import typings.fundamentalReact.anon.WeakValidationMapMenuProp
import typings.fundamentalReact.libMenuMenuMod.MenuProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuProps> & {  displayName :'Menu',   Group :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuGroupProps> & {  displayName :'Menu.Group'},   Item :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuItemProps> & {  displayName :'Menu.Item'},   List :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuListProps> & {  displayName :'Menu.List'}} */
object Menu {
  
  inline def apply(props: MenuProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: MenuProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("fundamental-react", "Menu")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Menu.Group")
  @js.native
  def Group: FunctionComponentMenuGrou = js.native
  inline def Group_=(x: FunctionComponentMenuGrou): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Menu.Item")
  @js.native
  def Item: FunctionComponentMenuItem = js.native
  inline def Item_=(x: FunctionComponentMenuItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Menu.List")
  @js.native
  def List: FunctionComponentMenuList = js.native
  inline def List_=(x: FunctionComponentMenuList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("List")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Menu.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Menu.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialMenuProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialMenuProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Menu.displayName")
  @js.native
  def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Menu | String] = js.native
  inline def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Menu | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Menu.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapMenuProp] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapMenuProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
