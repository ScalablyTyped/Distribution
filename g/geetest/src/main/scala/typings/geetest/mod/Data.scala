package typings.geetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var challenge: String
  var geetest_id: String
  var gt: String
  var new_captcha: String
  var success: Success
}

object Data {
  @scala.inline
  def apply(challenge: String, geetest_id: String, gt: String, new_captcha: String, success: Success): Data = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], geetest_id = geetest_id.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any], new_captcha = new_captcha.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

