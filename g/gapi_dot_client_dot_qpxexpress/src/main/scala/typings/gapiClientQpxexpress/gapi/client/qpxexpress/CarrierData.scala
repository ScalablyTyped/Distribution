package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarrierData extends js.Object {
  /** The IATA designator of a carrier (airline, etc). For example, for American Airlines, the code is AA. */
  var code: js.UndefOr[String] = js.native
  /** Identifies this as a kind of carrier (ie. an airline, bus line, railroad, etc). Value: the fixed string qpxexpress#carrierData. */
  var kind: js.UndefOr[String] = js.native
  /** The long, full name of a carrier. For example: American Airlines. */
  var name: js.UndefOr[String] = js.native
}

object CarrierData {
  @scala.inline
  def apply(): CarrierData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarrierData]
  }
  @scala.inline
  implicit class CarrierDataOps[Self <: CarrierData] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

