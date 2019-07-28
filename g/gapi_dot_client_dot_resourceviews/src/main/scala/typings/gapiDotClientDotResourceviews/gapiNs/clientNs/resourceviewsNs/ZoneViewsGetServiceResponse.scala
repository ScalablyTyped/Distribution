package typings.gapiDotClientDotResourceviews.gapiNs.clientNs.resourceviewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneViewsGetServiceResponse extends js.Object {
  /** The service information. */
  var endpoints: js.UndefOr[js.Array[ServiceEndpoint]] = js.undefined
  /** The fingerprint of the service information. */
  var fingerprint: js.UndefOr[String] = js.undefined
}

object ZoneViewsGetServiceResponse {
  @scala.inline
  def apply(endpoints: js.Array[ServiceEndpoint] = null, fingerprint: String = null): ZoneViewsGetServiceResponse = {
    val __obj = js.Dynamic.literal()
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    __obj.asInstanceOf[ZoneViewsGetServiceResponse]
  }
}

