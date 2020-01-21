package typings.fundamentalReact

import typings.fundamentalReact.fundamentalReactStrings.ListGroup
import typings.fundamentalReact.listGroupMod.ListGroupItemActionsProps
import typings.fundamentalReact.listGroupMod.ListGroupItemCheckboxProps
import typings.fundamentalReact.listGroupMod.ListGroupItemProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayNameItem extends js.Object {
  var Item: FunctionComponent[ListGroupItemProps] with AnonDisplayNameListGroupItem
  var ItemActions: FunctionComponent[ListGroupItemActionsProps] with AnonDisplayNameListGroupItemActions
  var ItemCheckbox: FunctionComponent[ListGroupItemCheckboxProps] with AnonDisplayNameListGroupItemCheckbox
  var displayName: ListGroup
}

object AnonDisplayNameItem {
  @scala.inline
  def apply(
    Item: FunctionComponent[ListGroupItemProps] with AnonDisplayNameListGroupItem,
    ItemActions: FunctionComponent[ListGroupItemActionsProps] with AnonDisplayNameListGroupItemActions,
    ItemCheckbox: FunctionComponent[ListGroupItemCheckboxProps] with AnonDisplayNameListGroupItemCheckbox,
    displayName: ListGroup
  ): AnonDisplayNameItem = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], ItemActions = ItemActions.asInstanceOf[js.Any], ItemCheckbox = ItemCheckbox.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisplayNameItem]
  }
}

