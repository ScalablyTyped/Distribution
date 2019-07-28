package typings.fundamentalDashReact

import typings.fundamentalDashReact.libMenuMenuMod.MenuGroupProps
import typings.fundamentalDashReact.libMenuMenuMod.MenuItemProps
import typings.fundamentalDashReact.libMenuMenuMod.MenuListProps
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Group extends js.Object {
  var Group: FunctionComponent[MenuGroupProps]
  var Item: FunctionComponent[MenuItemProps]
  var List: FunctionComponent[MenuListProps]
}

object Anon_Group {
  @scala.inline
  def apply(
    Group: FunctionComponent[MenuGroupProps],
    Item: FunctionComponent[MenuItemProps],
    List: FunctionComponent[MenuListProps]
  ): Anon_Group = {
    val __obj = js.Dynamic.literal(Group = Group, Item = Item, List = List)
  
    __obj.asInstanceOf[Anon_Group]
  }
}

