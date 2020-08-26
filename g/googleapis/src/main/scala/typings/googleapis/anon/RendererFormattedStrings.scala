package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RendererFormattedStrings extends js.Object {
  var rendererFormattedStrings: js.UndefOr[AuditGroupExpandTooltip] = js.native
}

object RendererFormattedStrings {
  @scala.inline
  def apply(): RendererFormattedStrings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererFormattedStrings]
  }
  @scala.inline
  implicit class RendererFormattedStringsOps[Self <: RendererFormattedStrings] (val x: Self) extends AnyVal {
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
    def setRendererFormattedStrings(value: AuditGroupExpandTooltip): Self = this.set("rendererFormattedStrings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRendererFormattedStrings: Self = this.set("rendererFormattedStrings", js.undefined)
  }
  
}

