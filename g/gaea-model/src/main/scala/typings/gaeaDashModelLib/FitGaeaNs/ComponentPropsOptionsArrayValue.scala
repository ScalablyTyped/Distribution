package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentPropsOptionsArrayValue extends js.Object {
  /**
    * ComponentPropsOptionsArray 设置的 key
    */
  var key: java.lang.String
  /**
    * 用户填入的值
    */
  var value: scala.Double | java.lang.String
}

object ComponentPropsOptionsArrayValue {
  @scala.inline
  def apply(key: java.lang.String, value: scala.Double | java.lang.String): ComponentPropsOptionsArrayValue = {
    val __obj = js.Dynamic.literal(key = key, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComponentPropsOptionsArrayValue]
  }
}

