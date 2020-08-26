package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TripOption extends js.Object {
  /** Identifier uniquely identifying this trip in a response. */
  var id: js.UndefOr[String] = js.native
  /** Identifies this as a trip information object. Value: the fixed string qpxexpress#tripOption. */
  var kind: js.UndefOr[String] = js.native
  /** Per passenger pricing information. */
  var pricing: js.UndefOr[js.Array[PricingInfo]] = js.native
  /** The total price for all passengers on the trip, in the form of a currency followed by an amount, e.g. USD253.35. */
  var saleTotal: js.UndefOr[String] = js.native
  /** The slices that make up this trip's itinerary. */
  var slice: js.UndefOr[js.Array[SliceInfo]] = js.native
}

object TripOption {
  @scala.inline
  def apply(): TripOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TripOption]
  }
  @scala.inline
  implicit class TripOptionOps[Self <: TripOption] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPricingVarargs(value: PricingInfo*): Self = this.set("pricing", js.Array(value :_*))
    @scala.inline
    def setPricing(value: js.Array[PricingInfo]): Self = this.set("pricing", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePricing: Self = this.set("pricing", js.undefined)
    @scala.inline
    def setSaleTotal(value: String): Self = this.set("saleTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaleTotal: Self = this.set("saleTotal", js.undefined)
    @scala.inline
    def setSliceVarargs(value: SliceInfo*): Self = this.set("slice", js.Array(value :_*))
    @scala.inline
    def setSlice(value: js.Array[SliceInfo]): Self = this.set("slice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlice: Self = this.set("slice", js.undefined)
  }
  
}

