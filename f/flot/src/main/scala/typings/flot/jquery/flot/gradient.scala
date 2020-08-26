package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait gradient extends js.Object {
  var colors: js.Array[_] = js.native
}

object gradient {
  @scala.inline
  def apply(colors: js.Array[_]): gradient = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[gradient]
  }
  @scala.inline
  implicit class gradientOps[Self <: gradient] (val x: Self) extends AnyVal {
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
    def setColorsVarargs(value: js.Any*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[_]): Self = this.set("colors", value.asInstanceOf[js.Any])
  }
  
}

