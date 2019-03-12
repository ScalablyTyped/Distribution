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
    GetActionName: () => java.lang.String,
    GetText: () => java.lang.String,
    GetVisible: () => scala.Boolean,
    SetText: java.lang.String => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit
  ): ASPxClientFABActionItem = {
    val __obj = js.Dynamic.literal(GetActionName = js.Any.fromFunction0(GetActionName), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible))
  
    __obj.asInstanceOf[ASPxClientFABActionItem]
  }
}

