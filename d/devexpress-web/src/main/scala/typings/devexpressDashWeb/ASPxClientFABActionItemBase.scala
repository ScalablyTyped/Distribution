package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientFABActionItemBase extends js.Object {
  def GetActionName(): String
  def GetText(): String
  /**
    * 
    * @param value 
    */
  def SetText(value: String): Unit
}

object ASPxClientFABActionItemBase {
  @scala.inline
  def apply(GetActionName: () => String, GetText: () => String, SetText: String => Unit): ASPxClientFABActionItemBase = {
    val __obj = js.Dynamic.literal(GetActionName = js.Any.fromFunction0(GetActionName), GetText = js.Any.fromFunction0(GetText), SetText = js.Any.fromFunction1(SetText))
  
    __obj.asInstanceOf[ASPxClientFABActionItemBase]
  }
}

