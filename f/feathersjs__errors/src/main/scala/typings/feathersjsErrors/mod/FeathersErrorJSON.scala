package typings.feathersjsErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeathersErrorJSON extends js.Object {
  val className: String = js.native
  val code: Double = js.native
  val data: js.Any = js.native
  val errors: js.Any = js.native
  val message: String = js.native
  val name: String = js.native
}

object FeathersErrorJSON {
  @scala.inline
  def apply(className: String, code: Double, data: js.Any, errors: js.Any, message: String, name: String): FeathersErrorJSON = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeathersErrorJSON]
  }
  @scala.inline
  implicit class FeathersErrorJSONOps[Self <: FeathersErrorJSON] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrors(value: js.Any): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

