package typings.geetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var challenge: String = js.native
  var geetest_id: String = js.native
  var gt: String = js.native
  var new_captcha: String = js.native
  var success: Success = js.native
}

object Data {
  @scala.inline
  def apply(challenge: String, geetest_id: String, gt: String, new_captcha: String, success: Success): Data = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], geetest_id = geetest_id.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any], new_captcha = new_captcha.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setChallenge(value: String): Self = this.set("challenge", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeetest_id(value: String): Self = this.set("geetest_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setGt(value: String): Self = this.set("gt", value.asInstanceOf[js.Any])
    @scala.inline
    def setNew_captcha(value: String): Self = this.set("new_captcha", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Success): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

