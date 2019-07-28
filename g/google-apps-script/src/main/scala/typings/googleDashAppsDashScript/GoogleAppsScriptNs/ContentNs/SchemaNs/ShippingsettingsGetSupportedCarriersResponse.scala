package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

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
    if (carriers != null) __obj.updateDynamic("carriers")(carriers)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ShippingsettingsGetSupportedCarriersResponse]
  }
}

