package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/reveal.html
@js.native
trait RevealCSSOptions extends js.Object {
  var display: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var visibility: js.UndefOr[String] = js.native
}

object RevealCSSOptions {
  @scala.inline
  def apply(): RevealCSSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevealCSSOptions]
  }
  @scala.inline
  implicit class RevealCSSOptionsOps[Self <: RevealCSSOptions] (val x: Self) extends AnyVal {
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
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

