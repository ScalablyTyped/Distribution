package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarriersCarrier extends js.Object {
  /** The CLDR country code of the carrier (e.g., "US"). Always present. */
  var country: js.UndefOr[String] = js.undefined
  /** The name of the carrier (e.g., "UPS"). Always present. */
  var name: js.UndefOr[String] = js.undefined
  /** A list of supported services (e.g., "ground") for that carrier. Contains at least one service. */
  var services: js.UndefOr[js.Array[String]] = js.undefined
}

object CarriersCarrier {
  @scala.inline
  def apply(country: String = null, name: String = null, services: js.Array[String] = null): CarriersCarrier = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (name != null) __obj.updateDynamic("name")(name)
    if (services != null) __obj.updateDynamic("services")(services)
    __obj.asInstanceOf[CarriersCarrier]
  }
}

