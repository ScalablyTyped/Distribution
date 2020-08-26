package typings.fbWatchman.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Capabilities extends js.Object {
  var optional: js.Array[_] = js.native
  var required: js.Array[_] = js.native
}

object Capabilities {
  @scala.inline
  def apply(optional: js.Array[_], required: js.Array[_]): Capabilities = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capabilities]
  }
  @scala.inline
  implicit class CapabilitiesOps[Self <: Capabilities] (val x: Self) extends AnyVal {
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
    def setOptionalVarargs(value: js.Any*): Self = this.set("optional", js.Array(value :_*))
    @scala.inline
    def setOptional(value: js.Array[_]): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredVarargs(value: js.Any*): Self = this.set("required", js.Array(value :_*))
    @scala.inline
    def setRequired(value: js.Array[_]): Self = this.set("required", value.asInstanceOf[js.Any])
  }
  
}

