package typings.dwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BShowIndicator extends js.Object {
  /**
    * Whether to show the indicator of the device.
    */
  var bShowIndicator: js.UndefOr[Boolean] = js.native
  /**
    * Whether to show the UI of the device.
    */
  var bShowUI: js.UndefOr[Boolean] = js.native
}

object BShowIndicator {
  @scala.inline
  def apply(): BShowIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BShowIndicator]
  }
  @scala.inline
  implicit class BShowIndicatorOps[Self <: BShowIndicator] (val x: Self) extends AnyVal {
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
    def setBShowIndicator(value: Boolean): Self = this.set("bShowIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBShowIndicator: Self = this.set("bShowIndicator", js.undefined)
    @scala.inline
    def setBShowUI(value: Boolean): Self = this.set("bShowUI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBShowUI: Self = this.set("bShowUI", js.undefined)
  }
  
}

