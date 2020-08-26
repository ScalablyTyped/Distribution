package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prorate extends js.Object {
  /**
    * Default price cannot be zero and must be less than the full subscription price. Default price is always in the developer's Checkout merchant currency.
    * Targeted countries have their prices set automatically based on the default_price.
    */
  var defaultPrice: js.UndefOr[Price] = js.native
  /** Defines the first day on which the price takes effect. */
  var start: js.UndefOr[MonthDay] = js.native
}

object Prorate {
  @scala.inline
  def apply(): Prorate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prorate]
  }
  @scala.inline
  implicit class ProrateOps[Self <: Prorate] (val x: Self) extends AnyVal {
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
    def setDefaultPrice(value: Price): Self = this.set("defaultPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPrice: Self = this.set("defaultPrice", js.undefined)
    @scala.inline
    def setStart(value: MonthDay): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

