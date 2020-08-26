package typings.doubleclickGpt.googletag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LazyLoadOptionsConfig extends js.Object {
  var fetchMarginPercent: js.UndefOr[Double] = js.native
  var mobileScaling: js.UndefOr[Double] = js.native
  var renderMarginPercent: js.UndefOr[Double] = js.native
}

object LazyLoadOptionsConfig {
  @scala.inline
  def apply(): LazyLoadOptionsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LazyLoadOptionsConfig]
  }
  @scala.inline
  implicit class LazyLoadOptionsConfigOps[Self <: LazyLoadOptionsConfig] (val x: Self) extends AnyVal {
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
    def setFetchMarginPercent(value: Double): Self = this.set("fetchMarginPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchMarginPercent: Self = this.set("fetchMarginPercent", js.undefined)
    @scala.inline
    def setMobileScaling(value: Double): Self = this.set("mobileScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileScaling: Self = this.set("mobileScaling", js.undefined)
    @scala.inline
    def setRenderMarginPercent(value: Double): Self = this.set("renderMarginPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderMarginPercent: Self = this.set("renderMarginPercent", js.undefined)
  }
  
}

