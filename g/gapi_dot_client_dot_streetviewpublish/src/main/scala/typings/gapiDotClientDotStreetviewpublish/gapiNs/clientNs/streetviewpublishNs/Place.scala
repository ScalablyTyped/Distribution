package typings.gapiDotClientDotStreetviewpublish.gapiNs.clientNs.streetviewpublishNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Place extends js.Object {
  /**
    * Place identifier, as described in
    * https://developers.google.com/places/place-id.
    */
  var placeId: js.UndefOr[String] = js.undefined
}

object Place {
  @scala.inline
  def apply(placeId: String = null): Place = {
    val __obj = js.Dynamic.literal()
    if (placeId != null) __obj.updateDynamic("placeId")(placeId)
    __obj.asInstanceOf[Place]
  }
}

