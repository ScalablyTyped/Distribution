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
    GetActionName: js.Function0[java.lang.String],
    GetText: js.Function0[java.lang.String],
    SetText: js.Function1[java.lang.String, scala.Unit]
  ): ASPxClientFABActionItemBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetActionName")(GetActionName)
    __obj.updateDynamic("GetText")(GetText)
    __obj.updateDynamic("SetText")(SetText)
    __obj.asInstanceOf[ASPxClientFABActionItemBase]
  }
}

