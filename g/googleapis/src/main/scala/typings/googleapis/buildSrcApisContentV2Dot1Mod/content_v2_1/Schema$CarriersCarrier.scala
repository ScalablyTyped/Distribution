package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$CarriersCarrier extends js.Object {
  /**
    * The CLDR country code of the carrier (e.g., &quot;US&quot;). Always
    * present.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The name of the carrier (e.g., &quot;UPS&quot;). Always present.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A list of supported services (e.g., &quot;ground&quot;) for that carrier.
    * Contains at least one service.
    */
  var services: js.UndefOr[js.Array[String]] = js.native
}

object Schema$CarriersCarrier {
  @scala.inline
  def apply(country: String = null, name: String = null, services: js.Array[String] = null): Schema$CarriersCarrier = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CarriersCarrier]
  }
}

