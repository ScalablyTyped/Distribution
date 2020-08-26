package typings.geetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var challenge: String = js.native
  var seccode: String = js.native
  var validate: String = js.native
}

object Result {
  @scala.inline
  def apply(challenge: String, seccode: String, validate: String): Result = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], seccode = seccode.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setSeccode(value: String): Self = this.set("seccode", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidate(value: String): Self = this.set("validate", value.asInstanceOf[js.Any])
  }
  
}

