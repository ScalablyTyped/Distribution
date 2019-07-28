package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientFABActionItem extends ASPxClientFABActionItemBase {
  def GetVisible(): Boolean
  /**
    * 
    * @param value 
    */
  def SetVisible(value: Boolean): Unit
}

object ASPxClientFABActionItem {
  @scala.inline
  def apply(
    GetActionName: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetText: String => Unit,
    SetVisible: Boolean => Unit
  ): ASPxClientFABActionItem = {
    val __obj = js.Dynamic.literal(GetActionName = js.Any.fromFunction0(GetActionName), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible))
  
    __obj.asInstanceOf[ASPxClientFABActionItem]
  }
}

