package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateOptions extends js.Object {
  /** Controls rate-limiting of requests. Maximum number of requests per period. (Default: 50). */
  var limit: js.UndefOr[Double] = js.native
  /** Period for rate limit, in milliseconds. (Default: 1000 ms). */
  var period: js.UndefOr[Double] = js.native
}

object RateOptions {
  @scala.inline
  def apply(): RateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateOptions]
  }
  @scala.inline
  implicit class RateOptionsOps[Self <: RateOptions] (val x: Self) extends AnyVal {
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
  }
  
}

