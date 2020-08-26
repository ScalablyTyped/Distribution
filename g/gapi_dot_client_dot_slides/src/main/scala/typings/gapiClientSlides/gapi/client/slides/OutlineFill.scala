package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutlineFill extends js.Object {
  /** Solid color fill. */
  var solidFill: js.UndefOr[SolidFill] = js.native
}

object OutlineFill {
  @scala.inline
  def apply(): OutlineFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlineFill]
  }
  @scala.inline
  implicit class OutlineFillOps[Self <: OutlineFill] (val x: Self) extends AnyVal {
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
    def setSolidFill(value: SolidFill): Self = this.set("solidFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolidFill: Self = this.set("solidFill", js.undefined)
  }
  
}

