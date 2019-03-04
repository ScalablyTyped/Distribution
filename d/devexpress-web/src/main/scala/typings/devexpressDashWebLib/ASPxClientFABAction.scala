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
    GetActionItemByName: js.Function1[java.lang.String, ASPxClientFABActionItem],
    GetActionName: js.Function0[java.lang.String],
    GetContextName: js.Function0[java.lang.String],
    GetItem: js.Function1[scala.Double, ASPxClientFABActionItem],
    GetItemCount: js.Function0[scala.Double],
    GetText: js.Function0[java.lang.String],
    SetText: js.Function1[java.lang.String, scala.Unit]
  ): ASPxClientFABAction = {
    val __obj = js.Dynamic.literal(GetActionItemByName = GetActionItemByName, GetActionName = GetActionName, GetContextName = GetContextName, GetItem = GetItem, GetItemCount = GetItemCount, GetText = GetText, SetText = SetText)
  
    __obj.asInstanceOf[ASPxClientFABAction]
  }
}

