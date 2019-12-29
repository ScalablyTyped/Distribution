package typings.fundamentalDashReact

import typings.fundamentalDashReact.fundamentalDashReactStrings.ListGroup
import typings.fundamentalDashReact.libListGroupListGroupMod.ListGroupItemActionsProps
import typings.fundamentalDashReact.libListGroupListGroupMod.ListGroupItemCheckboxProps
import typings.fundamentalDashReact.libListGroupListGroupMod.ListGroupItemProps
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayNameItem extends js.Object {
  var Item: FunctionComponent[ListGroupItemProps] with Anon_DisplayNameListGroupItem
  var ItemActions: FunctionComponent[ListGroupItemActionsProps] with Anon_DisplayNameListGroupItemActions
  var ItemCheckbox: FunctionComponent[ListGroupItemCheckboxProps] with Anon_DisplayNameListGroupItemCheckbox
  var displayName: ListGroup
}

object Anon_DisplayNameItem {
  @scala.inline
  def apply(
    Item: FunctionComponent[ListGroupItemProps] with Anon_DisplayNameListGroupItem,
    ItemActions: FunctionComponent[ListGroupItemActionsProps] with Anon_DisplayNameListGroupItemActions,
    ItemCheckbox: FunctionComponent[ListGroupItemCheckboxProps] with Anon_DisplayNameListGroupItemCheckbox,
    displayName: ListGroup
  ): Anon_DisplayNameItem = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], ItemActions = ItemActions.asInstanceOf[js.Any], ItemCheckbox = ItemCheckbox.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DisplayNameItem]
  }
}

