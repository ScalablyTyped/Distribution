package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarriersCarrier extends js.Object {
  var country: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var services: js.UndefOr[js.Array[String]] = js.undefined
}

object CarriersCarrier {
  @scala.inline
  def apply(country: String = null, name: String = null, services: js.Array[String] = null): CarriersCarrier = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarriersCarrier]
  }
}

