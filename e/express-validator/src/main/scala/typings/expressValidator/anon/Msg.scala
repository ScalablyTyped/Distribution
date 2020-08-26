package typings.expressValidator.anon

import typings.expressValidator.baseMod.ValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Msg extends ValidationError {
  var location: typings.expressValidator.baseMod.Location = js.native
  var msg: js.Any = js.native
  var nestedErrors: js.UndefOr[js.Array[_]] = js.native
  var param: String = js.native
  var value: js.Any = js.native
}

object Msg {
  @scala.inline
  def apply(location: typings.expressValidator.baseMod.Location, msg: js.Any, param: String, value: js.Any): Msg = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
  @scala.inline
  implicit class MsgOps[Self <: Msg] (val x: Self) extends AnyVal {
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
    def setLocation(value: typings.expressValidator.baseMod.Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsg(value: js.Any): Self = this.set("msg", value.asInstanceOf[js.Any])
    @scala.inline
    def setParam(value: String): Self = this.set("param", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setNestedErrorsVarargs(value: js.Any*): Self = this.set("nestedErrors", js.Array(value :_*))
    @scala.inline
    def setNestedErrors(value: js.Array[_]): Self = this.set("nestedErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestedErrors: Self = this.set("nestedErrors", js.undefined)
  }
  
}

