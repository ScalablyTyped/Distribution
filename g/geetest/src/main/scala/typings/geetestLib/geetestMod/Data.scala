package typings
package geetestLib.geetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var challenge: java.lang.String
  var geetest_id: java.lang.String
  var gt: java.lang.String
  var new_captcha: java.lang.String
  var success: geetestLib.Success
}

object Data {
  @scala.inline
  def apply(
    challenge: java.lang.String,
    geetest_id: java.lang.String,
    gt: java.lang.String,
    new_captcha: java.lang.String,
    success: geetestLib.Success
  ): Data = {
    val __obj = js.Dynamic.literal(challenge = challenge, geetest_id = geetest_id, gt = gt, new_captcha = new_captcha, success = success)
  
    __obj.asInstanceOf[Data]
  }
}

