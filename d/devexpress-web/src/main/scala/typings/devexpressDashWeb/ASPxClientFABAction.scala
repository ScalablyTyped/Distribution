package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientFABAction extends ASPxClientFABActionItemBase {
  /**
    * 
    * @param name 
    */
  def GetActionItemByName(name: String): ASPxClientFABActionItem
  def GetContextName(): String
  /**
    * 
    * @param index 
    */
  def GetItem(index: Double): ASPxClientFABActionItem
  def GetItemCount(): Double
}

object ASPxClientFABAction {
  @scala.inline
  def apply(
    GetActionItemByName: String => ASPxClientFABActionItem,
    GetActionName: () => String,
    GetContextName: () => String,
    GetItem: Double => ASPxClientFABActionItem,
    GetItemCount: () => Double,
    GetText: () => String,
    SetText: String => Unit
  ): ASPxClientFABAction = {
    val __obj = js.Dynamic.literal(GetActionItemByName = js.Any.fromFunction1(GetActionItemByName), GetActionName = js.Any.fromFunction0(GetActionName), GetContextName = js.Any.fromFunction0(GetContextName), GetItem = js.Any.fromFunction1(GetItem), GetItemCount = js.Any.fromFunction0(GetItemCount), GetText = js.Any.fromFunction0(GetText), SetText = js.Any.fromFunction1(SetText))
  
    __obj.asInstanceOf[ASPxClientFABAction]
  }
}

