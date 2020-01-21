package typings.fundamentalReact

import typings.fundamentalReact.fundamentalReactStrings.Menu
import typings.fundamentalReact.menuMod.MenuGroupProps
import typings.fundamentalReact.menuMod.MenuItemProps
import typings.fundamentalReact.menuMod.MenuListProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayNameGroup extends js.Object {
  var Group: FunctionComponent[MenuGroupProps] with AnonDisplayNameMenuGroup
  var Item: FunctionComponent[MenuItemProps] with AnonDisplayNameMenuItem
  var List: FunctionComponent[MenuListProps] with AnonDisplayNameMenuList
  var displayName: Menu
}

object AnonDisplayNameGroup {
  @scala.inline
  def apply(
    Group: FunctionComponent[MenuGroupProps] with AnonDisplayNameMenuGroup,
    Item: FunctionComponent[MenuItemProps] with AnonDisplayNameMenuItem,
    List: FunctionComponent[MenuListProps] with AnonDisplayNameMenuList,
    displayName: Menu
  ): AnonDisplayNameGroup = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], List = List.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisplayNameGroup]
  }
}

