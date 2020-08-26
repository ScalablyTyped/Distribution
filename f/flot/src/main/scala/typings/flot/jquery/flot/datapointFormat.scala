package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait datapointFormat extends js.Object {
  var defaultValue: js.UndefOr[Double] = js.native
  var number: Boolean = js.native
  var required: Boolean = js.native
  var x: js.UndefOr[Boolean] = js.native
  var y: js.UndefOr[Boolean] = js.native
}

object datapointFormat {
  @scala.inline
  def apply(number: Boolean, required: Boolean): datapointFormat = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[datapointFormat]
  }
  @scala.inline
  implicit class datapointFormatOps[Self <: datapointFormat] (val x: Self) extends AnyVal {
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
    def setNumber(value: Boolean): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setX(value: Boolean): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Boolean): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

