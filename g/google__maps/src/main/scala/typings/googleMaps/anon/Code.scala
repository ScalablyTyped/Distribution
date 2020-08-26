package typings.googleMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  /** This is the same as the HTTP status of the response. */
  var code: Double = js.native
  /**
    * A list of errors which occurred. Each error contains an identifier for the type of error (the `reason`)
    * and a short description (the `message`).
    */
  var errors: js.Array[Domain] = js.native
  /** A short description of the error. */
  var message: String = js.native
}

object Code {
  @scala.inline
  def apply(code: Double, errors: js.Array[Domain], message: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsVarargs(value: Domain*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[Domain]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

