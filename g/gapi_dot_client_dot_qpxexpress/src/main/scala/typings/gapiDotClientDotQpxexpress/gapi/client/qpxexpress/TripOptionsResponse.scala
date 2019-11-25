package typings.gapiDotClientDotQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripOptionsResponse extends js.Object {
  /** Informational data global to list of solutions. */
  var data: js.UndefOr[Data] = js.undefined
  /** Identifies this as a QPX Express trip response object, which consists of zero or more solutions. Value: the fixed string qpxexpress#tripOptions. */
  var kind: js.UndefOr[String] = js.undefined
  /** An identifier uniquely identifying this response. */
  var requestId: js.UndefOr[String] = js.undefined
  /** A list of priced itinerary solutions to the QPX Express query. */
  var tripOption: js.UndefOr[js.Array[TripOption]] = js.undefined
}

object TripOptionsResponse {
  @scala.inline
  def apply(
    data: Data = null,
    kind: String = null,
    requestId: String = null,
    tripOption: js.Array[TripOption] = null
  ): TripOptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (tripOption != null) __obj.updateDynamic("tripOption")(tripOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[TripOptionsResponse]
  }
}

