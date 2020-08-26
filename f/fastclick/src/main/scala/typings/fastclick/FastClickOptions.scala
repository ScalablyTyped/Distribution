package typings.fastclick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastClickOptions extends js.Object {
  var tapDelay: js.UndefOr[Double] = js.native
  var touchBoundary: js.UndefOr[Double] = js.native
}

object FastClickOptions {
  @scala.inline
  def apply(): FastClickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastClickOptions]
  }
  @scala.inline
  implicit class FastClickOptionsOps[Self <: FastClickOptions] (val x: Self) extends AnyVal {
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
    def setTapDelay(value: Double): Self = this.set("tapDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapDelay: Self = this.set("tapDelay", js.undefined)
    @scala.inline
    def setTouchBoundary(value: Double): Self = this.set("touchBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchBoundary: Self = this.set("touchBoundary", js.undefined)
  }
  
}

