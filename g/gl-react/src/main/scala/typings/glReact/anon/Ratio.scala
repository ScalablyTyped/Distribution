package typings.glReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ratio extends js.Object {
  var obj: js.Any = js.native
  var ratio: Boolean = js.native
  var `type`: String = js.native
}

object Ratio {
  @scala.inline
  def apply(obj: js.Any, ratio: Boolean, `type`: String): Ratio = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ratio]
  }
  @scala.inline
  implicit class RatioOps[Self <: Ratio] (val x: Self) extends AnyVal {
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
    def setObj(value: js.Any): Self = this.set("obj", value.asInstanceOf[js.Any])
    @scala.inline
    def setRatio(value: Boolean): Self = this.set("ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

