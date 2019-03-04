package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientFABActionItem extends ASPxClientFABActionItemBase {
  def GetVisible(): scala.Boolean
  /**
    * 
    * @param value 
    */
  def SetVisible(value: scala.Boolean): scala.Unit
}

object ASPxClientFABActionItem {
  @scala.inline
  def apply(
    GetActionName: js.Function0[java.lang.String],
    GetText: js.Function0[java.lang.String],
    GetVisible: js.Function0[scala.Boolean],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit]
  ): ASPxClientFABActionItem = {
    val __obj = js.Dynamic.literal(GetActionName = GetActionName, GetText = GetText, GetVisible = GetVisible, SetText = SetText, SetVisible = SetVisible)
  
    __obj.asInstanceOf[ASPxClientFABActionItem]
  }
}

