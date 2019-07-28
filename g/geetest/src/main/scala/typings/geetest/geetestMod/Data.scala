package typings.geetest.geetestMod

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
    val __obj = js.Dynamic.literal(challenge = challenge, geetest_id = geetest_id, gt = gt, new_captcha = new_captcha, success = success)
  
    __obj.asInstanceOf[Data]
  }
}

