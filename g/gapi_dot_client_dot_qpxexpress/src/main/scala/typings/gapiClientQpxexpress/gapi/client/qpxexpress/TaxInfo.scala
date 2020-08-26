package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaxInfo extends js.Object {
  /** Whether this is a government charge or a carrier surcharge. */
  var chargeType: js.UndefOr[String] = js.native
  /** The code to enter in the ticket's tax box. */
  var code: js.UndefOr[String] = js.native
  /** For government charges, the country levying the charge. */
  var country: js.UndefOr[String] = js.native
  /** Identifier uniquely identifying this tax in a response. Not present for unnamed carrier surcharges. */
  var id: js.UndefOr[String] = js.native
  /** Identifies this as a tax information object. Value: the fixed string qpxexpress#taxInfo. */
  var kind: js.UndefOr[String] = js.native
  /** The price of the tax in the sales or equivalent currency. */
  var salePrice: js.UndefOr[String] = js.native
}

object TaxInfo {
  @scala.inline
  def apply(): TaxInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaxInfo]
  }
  @scala.inline
  implicit class TaxInfoOps[Self <: TaxInfo] (val x: Self) extends AnyVal {
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
    def setChargeType(value: String): Self = this.set("chargeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChargeType: Self = this.set("chargeType", js.undefined)
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSalePrice(value: String): Self = this.set("salePrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSalePrice: Self = this.set("salePrice", js.undefined)
  }
  
}

