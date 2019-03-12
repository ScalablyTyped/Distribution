package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientFABActionItemBase extends js.Object {
  def GetActionName(): java.lang.String
  def GetText(): java.lang.String
  /**
    * 
    * @param value 
    */
  def SetText(value: java.lang.String): scala.Unit
}

object ASPxClientFABActionItemBase {
  @scala.inline
  def apply(
    GetActionName: () => java.lang.String,
    GetText: () => java.lang.String,
    SetText: java.lang.String => scala.Unit
  ): ASPxClientFABActionItemBase = {
    val __obj = js.Dynamic.literal(GetActionName = js.Any.fromFunction0(GetActionName), GetText = js.Any.fromFunction0(GetText), SetText = js.Any.fromFunction1(SetText))
  
    __obj.asInstanceOf[ASPxClientFABActionItemBase]
  }
}

