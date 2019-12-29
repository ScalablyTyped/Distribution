package typings.fundamentalDashReact

import typings.fundamentalDashReact.fundamentalDashReactStrings.Menu
import typings.fundamentalDashReact.libMenuMenuMod.MenuGroupProps
import typings.fundamentalDashReact.libMenuMenuMod.MenuItemProps
import typings.fundamentalDashReact.libMenuMenuMod.MenuListProps
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayNameGroup extends js.Object {
  var Group: FunctionComponent[MenuGroupProps] with Anon_DisplayNameMenuGroup
  var Item: FunctionComponent[MenuItemProps] with Anon_DisplayNameMenuItem
  var List: FunctionComponent[MenuListProps] with Anon_DisplayNameMenuList
  var displayName: Menu
}

object Anon_DisplayNameGroup {
  @scala.inline
  def apply(
    Group: FunctionComponent[MenuGroupProps] with Anon_DisplayNameMenuGroup,
    Item: FunctionComponent[MenuItemProps] with Anon_DisplayNameMenuItem,
    List: FunctionComponent[MenuListProps] with Anon_DisplayNameMenuList,
    displayName: Menu
  ): Anon_DisplayNameGroup = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], List = List.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DisplayNameGroup]
  }
}

