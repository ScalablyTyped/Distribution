package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsGetSupportedCarriersResponse extends js.Object {
  var carriers: js.UndefOr[js.Array[CarriersCarrier]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object ShippingsettingsGetSupportedCarriersResponse {
  @scala.inline
  def apply(carriers: js.Array[CarriersCarrier] = null, kind: String = null): ShippingsettingsGetSupportedCarriersResponse = {
    val __obj = js.Dynamic.literal()
    if (carriers != null) __obj.updateDynamic("carriers")(carriers.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingsettingsGetSupportedCarriersResponse]
  }
}

