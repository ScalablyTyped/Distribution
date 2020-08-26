package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterName extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  var parameterName: js.UndefOr[String] = js.native
}

object ParameterName {
  @scala.inline
  def apply(): ParameterName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterName]
  }
  @scala.inline
  implicit class ParameterNameOps[Self <: ParameterName] (val x: Self) extends AnyVal {
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
    def set$ref(value: String): Self = this.set("$ref", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$ref: Self = this.set("$ref", js.undefined)
    @scala.inline
    def setParameterName(value: String): Self = this.set("parameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterName: Self = this.set("parameterName", js.undefined)
  }
  
}

