package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentPropsOptionsArrayValue extends js.Object {
  /**
    * ComponentPropsOptionsArray 设置的 key
    */
  var key: String = js.native
  /**
    * 用户填入的值
    */
  var value: Double | String = js.native
}

object ComponentPropsOptionsArrayValue {
  @scala.inline
  def apply(key: String, value: Double | String): ComponentPropsOptionsArrayValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPropsOptionsArrayValue]
  }
  @scala.inline
  implicit class ComponentPropsOptionsArrayValueOps[Self <: ComponentPropsOptionsArrayValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double | String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

