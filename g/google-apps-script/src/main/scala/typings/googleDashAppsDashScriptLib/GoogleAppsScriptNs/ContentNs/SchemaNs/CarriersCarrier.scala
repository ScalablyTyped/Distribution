package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarriersCarrier extends js.Object {
  var country: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var services: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object CarriersCarrier {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    name: java.lang.String = null,
    services: js.Array[java.lang.String] = null
  ): CarriersCarrier = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (name != null) __obj.updateDynamic("name")(name)
    if (services != null) __obj.updateDynamic("services")(services)
    __obj.asInstanceOf[CarriersCarrier]
  }
}

