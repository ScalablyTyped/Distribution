package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.analytics.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Affiliation
  extends /* key */ StringDictionary[js.Any] {
  var affiliation: js.UndefOr[String] = js.native
  var coupon: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[Item]] = js.native
  var shipping: js.UndefOr[typings.firebase.mod.analytics.Currency] = js.native
  var tax: js.UndefOr[typings.firebase.mod.analytics.Currency] = js.native
  var transaction_id: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
}

object Affiliation {
  @scala.inline
  def apply(): Affiliation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Affiliation]
  }
  @scala.inline
  implicit class AffiliationOps[Self <: Affiliation] (val x: Self) extends AnyVal {
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
    def setAffiliation(value: String): Self = this.set("affiliation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAffiliation: Self = this.set("affiliation", js.undefined)
    @scala.inline
    def setCoupon(value: String): Self = this.set("coupon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoupon: Self = this.set("coupon", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Item*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Item]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setShipping(value: typings.firebase.mod.analytics.Currency): Self = this.set("shipping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
    @scala.inline
    def setTax(value: typings.firebase.mod.analytics.Currency): Self = this.set("tax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax: Self = this.set("tax", js.undefined)
    @scala.inline
    def setTransaction_id(value: String): Self = this.set("transaction_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransaction_id: Self = this.set("transaction_id", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

