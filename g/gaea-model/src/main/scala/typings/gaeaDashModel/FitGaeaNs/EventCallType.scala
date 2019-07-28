package typings.gaeaDashModel.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventCallType extends js.Object {
  // 调用函数名称
  var functionName: String
  // 调用参数
  var param: js.UndefOr[js.Array[EventCallTypeParam]] = js.undefined
}

object EventCallType {
  @scala.inline
  def apply(functionName: String, param: js.Array[EventCallTypeParam] = null): EventCallType = {
    val __obj = js.Dynamic.literal(functionName = functionName)
    if (param != null) __obj.updateDynamic("param")(param)
    __obj.asInstanceOf[EventCallType]
  }
}

