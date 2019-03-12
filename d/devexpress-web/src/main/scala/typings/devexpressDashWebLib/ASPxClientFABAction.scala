package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientFABAction extends ASPxClientFABActionItemBase {
  /**
    * 
    * @param name 
    */
  def GetActionItemByName(name: java.lang.String): ASPxClientFABActionItem
  def GetContextName(): java.lang.String
  /**
    * 
    * @param index 
    */
  def GetItem(index: scala.Double): ASPxClientFABActionItem
  def GetItemCount(): scala.Double
}

object ASPxClientFABAction {
  @scala.inline
  def apply(
    GetActionItemByName: java.lang.String => ASPxClientFABActionItem,
    GetActionName: () => java.lang.String,
    GetContextName: () => java.lang.String,
    GetItem: scala.Double => ASPxClientFABActionItem,
    GetItemCount: () => scala.Double,
    GetText: () => java.lang.String,
    SetText: java.lang.String => scala.Unit
  ): ASPxClientFABAction = {
    val __obj = js.Dynamic.literal(GetActionItemByName = js.Any.fromFunction1(GetActionItemByName), GetActionName = js.Any.fromFunction0(GetActionName), GetContextName = js.Any.fromFunction0(GetContextName), GetItem = js.Any.fromFunction1(GetItem), GetItemCount = js.Any.fromFunction0(GetItemCount), GetText = js.Any.fromFunction0(GetText), SetText = js.Any.fromFunction1(SetText))
  
    __obj.asInstanceOf[ASPxClientFABAction]
  }
}

