package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the floating action button's action object.
  */
@JSGlobal("ASPxClientFABAction")
@js.native
class ASPxClientFABAction () extends ASPxClientFABActionItemBase {
  /**
    * Gets the FAB action item. Specifies the FAB action item.
    * @param index Specifies the item's index in the collection.
    */
  def GetActionItem(index: Double): ASPxClientFABActionItem = js.native
  /**
    * Returns an action item with the specified name. An ASPxClientFABActionItem that is the action item with the specified name.
    * @param name A string value specifying the action item name.
    */
  def GetActionItemByName(name: String): ASPxClientFABActionItem = js.native
  /**
    * Returns the number of items in the action/action group.
    */
  def GetActionItemCount(): Double = js.native
  /**
    * Gets the FAB action's context name.
    */
  def GetContextName(): String = js.native
}

