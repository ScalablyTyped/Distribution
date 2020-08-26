package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingsettingsGetSupportedCarriersResponse extends js.Object {
  /** A list of supported carriers. May be empty. */
  var carriers: js.UndefOr[js.Array[CarriersCarrier]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "content#shippingsettingsGetSupportedCarriersResponse". */
  var kind: js.UndefOr[String] = js.native
}

object ShippingsettingsGetSupportedCarriersResponse {
  @scala.inline
  def apply(): ShippingsettingsGetSupportedCarriersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingsettingsGetSupportedCarriersResponse]
  }
  @scala.inline
  implicit class ShippingsettingsGetSupportedCarriersResponseOps[Self <: ShippingsettingsGetSupportedCarriersResponse] (val x: Self) extends AnyVal {
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
    def setCarriersVarargs(value: CarriersCarrier*): Self = this.set("carriers", js.Array(value :_*))
    @scala.inline
    def setCarriers(value: js.Array[CarriersCarrier]): Self = this.set("carriers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarriers: Self = this.set("carriers", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

