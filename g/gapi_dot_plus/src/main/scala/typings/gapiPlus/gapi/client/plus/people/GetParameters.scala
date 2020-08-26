package typings.gapiPlus.gapi.client.plus.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParameters extends js.Object {
  var userId: String = js.native
}

object GetParameters {
  @scala.inline
  def apply(userId: String): GetParameters = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters]
  }
  @scala.inline
  implicit class GetParametersOps[Self <: GetParameters] (val x: Self) extends AnyVal {
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
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
  
}

