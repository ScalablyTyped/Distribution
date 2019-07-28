package typings.fundamentalDashReact

import typings.fundamentalDashReact.libListGroupListGroupMod.ListGroupItemActionsProps
import typings.fundamentalDashReact.libListGroupListGroupMod.ListGroupItemCheckboxProps
import typings.fundamentalDashReact.libListGroupListGroupMod.ListGroupItemProps
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemItemActions extends js.Object {
  var Item: FunctionComponent[ListGroupItemProps]
  var ItemActions: FunctionComponent[ListGroupItemActionsProps]
  var ItemCheckbox: FunctionComponent[ListGroupItemCheckboxProps]
}

object Anon_ItemItemActions {
  @scala.inline
  def apply(
    Item: FunctionComponent[ListGroupItemProps],
    ItemActions: FunctionComponent[ListGroupItemActionsProps],
    ItemCheckbox: FunctionComponent[ListGroupItemCheckboxProps]
  ): Anon_ItemItemActions = {
    val __obj = js.Dynamic.literal(Item = Item, ItemActions = ItemActions, ItemCheckbox = ItemCheckbox)
  
    __obj.asInstanceOf[Anon_ItemItemActions]
  }
}

