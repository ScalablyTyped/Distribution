package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxGroupItemWithFilledProps extends FancyBoxGroupItem {
  @JSName("$thumb")
  var $thumb: js.UndefOr[JQuery] = js.native
  var contentType: js.UndefOr[String] = js.native
  var index: js.UndefOr[Double] = js.native
  var thumb: js.UndefOr[js.Any] = js.native
}

object FancyBoxGroupItemWithFilledProps {
  @scala.inline
  def apply(src: String): FancyBoxGroupItemWithFilledProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxGroupItemWithFilledProps]
  }
  @scala.inline
  implicit class FancyBoxGroupItemWithFilledPropsOps[Self <: FancyBoxGroupItemWithFilledProps] (val x: Self) extends AnyVal {
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
    def set$thumb(value: JQuery): Self = this.set("$thumb", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$thumb: Self = this.set("$thumb", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setThumb(value: js.Any): Self = this.set("thumb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumb: Self = this.set("thumb", js.undefined)
  }
  
}

