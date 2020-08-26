package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XAdsForce extends js.Object {
  var xAdsForce: js.UndefOr[Boolean] = js.native
}

object XAdsForce {
  @scala.inline
  def apply(): XAdsForce = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAdsForce]
  }
  @scala.inline
  implicit class XAdsForceOps[Self <: XAdsForce] (val x: Self) extends AnyVal {
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
    def setXAdsForce(value: Boolean): Self = this.set("xAdsForce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAdsForce: Self = this.set("xAdsForce", js.undefined)
  }
  
}

