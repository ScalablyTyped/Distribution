package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ShippingsettingsGetSupportedCarriersResponse extends js.Object {
  /**
    * A list of supported carriers. May be empty.
    */
  var carriers: js.UndefOr[js.Array[Schema$CarriersCarrier]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#shippingsettingsGetSupportedCarriersResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$ShippingsettingsGetSupportedCarriersResponse {
  @scala.inline
  def apply(carriers: js.Array[Schema$CarriersCarrier] = null, kind: String = null): Schema$ShippingsettingsGetSupportedCarriersResponse = {
    val __obj = js.Dynamic.literal()
    if (carriers != null) __obj.updateDynamic("carriers")(carriers.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ShippingsettingsGetSupportedCarriersResponse]
  }
}

