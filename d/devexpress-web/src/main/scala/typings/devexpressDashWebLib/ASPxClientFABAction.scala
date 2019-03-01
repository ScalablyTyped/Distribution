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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetActionItemByName")(GetActionItemByName)
    __obj.updateDynamic("GetActionName")(GetActionName)
    __obj.updateDynamic("GetContextName")(GetContextName)
    __obj.updateDynamic("GetItem")(GetItem)
    __obj.updateDynamic("GetItemCount")(GetItemCount)
    __obj.updateDynamic("GetText")(GetText)
    __obj.updateDynamic("SetText")(SetText)
    __obj.asInstanceOf[ASPxClientFABAction]
  }
}

