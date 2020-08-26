package typings.gapiClientAdsensehost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Currency extends js.Object {
  /** The currency of this column. Only present if the header type is METRIC_CURRENCY. */
  var currency: js.UndefOr[String] = js.native
  /** The name of the header. */
  var name: js.UndefOr[String] = js.native
  /** The type of the header; one of DIMENSION, METRIC_TALLY, METRIC_RATIO, or METRIC_CURRENCY. */
  var `type`: js.UndefOr[String] = js.native
}

object Currency {
  @scala.inline
  def apply(): Currency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Currency]
  }
  @scala.inline
  implicit class CurrencyOps[Self <: Currency] (val x: Self) extends AnyVal {
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

