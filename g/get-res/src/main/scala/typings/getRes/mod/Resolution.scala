package typings.getRes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolution extends js.Object {
  var item: String = js.native
  var percent: String = js.native
}

object Resolution {
  @scala.inline
  def apply(item: String, percent: String): Resolution = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolution]
  }
  @scala.inline
  implicit class ResolutionOps[Self <: Resolution] (val x: Self) extends AnyVal {
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
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercent(value: String): Self = this.set("percent", value.asInstanceOf[js.Any])
  }
  
}

