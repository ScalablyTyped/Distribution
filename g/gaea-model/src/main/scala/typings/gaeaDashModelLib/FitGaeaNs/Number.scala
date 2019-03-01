package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Number extends js.Object {
  // 为空时，是数字，否则会以字符串加后缀形式赋值
  var key: java.lang.String
  var value: java.lang.String
}

object Number {
  @scala.inline
  def apply(key: java.lang.String, value: java.lang.String): Number = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Number]
  }
}

