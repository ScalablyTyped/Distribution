package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Number extends js.Object {
  // 为空时，是数字，否则会以字符串加后缀形式赋值
  var key: String
  var value: String
}

object Number {
  @scala.inline
  def apply(key: String, value: String): Number = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Number]
  }
}

