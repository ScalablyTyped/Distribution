package typings.doubleclickGpt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestrictDataProcessing extends js.Object {
  var restrictDataProcessing: Boolean = js.native
}

object RestrictDataProcessing {
  @scala.inline
  def apply(restrictDataProcessing: Boolean): RestrictDataProcessing = {
    val __obj = js.Dynamic.literal(restrictDataProcessing = restrictDataProcessing.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictDataProcessing]
  }
  @scala.inline
  implicit class RestrictDataProcessingOps[Self <: RestrictDataProcessing] (val x: Self) extends AnyVal {
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
    def setRestrictDataProcessing(value: Boolean): Self = this.set("restrictDataProcessing", value.asInstanceOf[js.Any])
  }
  
}

