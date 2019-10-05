package typings.gaeaDashModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentPropsOptionsArrayValue extends js.Object {
  /**
    * ComponentPropsOptionsArray 设置的 key
    */
  var key: String
  /**
    * 用户填入的值
    */
  var value: Double | String
}

object ComponentPropsOptionsArrayValue {
  @scala.inline
  def apply(key: String, value: Double | String): ComponentPropsOptionsArrayValue = {
    val __obj = js.Dynamic.literal(key = key, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComponentPropsOptionsArrayValue]
  }
}

