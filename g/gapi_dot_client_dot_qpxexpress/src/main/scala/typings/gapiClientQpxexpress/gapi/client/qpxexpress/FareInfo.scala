package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FareInfo extends js.Object {
  var basisCode: js.UndefOr[String] = js.undefined
  /** The carrier of the aircraft or other vehicle commuting between two points. */
  var carrier: js.UndefOr[String] = js.undefined
  /** The city code of the city the trip ends at. */
  var destination: js.UndefOr[String] = js.undefined
  /** A unique identifier of the fare. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies this as a fare object. Value: the fixed string qpxexpress#fareInfo. */
  var kind: js.UndefOr[String] = js.undefined
  /** The city code of the city the trip begins at. */
  var origin: js.UndefOr[String] = js.undefined
  /** Whether this is a private fare, for example one offered only to select customers rather than the general public. */
  var `private`: js.UndefOr[Boolean] = js.undefined
}

object FareInfo {
  @scala.inline
  def apply(
    basisCode: String = null,
    carrier: String = null,
    destination: String = null,
    id: String = null,
    kind: String = null,
    origin: String = null,
    `private`: js.UndefOr[Boolean] = js.undefined
  ): FareInfo = {
    val __obj = js.Dynamic.literal()
    if (basisCode != null) __obj.updateDynamic("basisCode")(basisCode.asInstanceOf[js.Any])
    if (carrier != null) __obj.updateDynamic("carrier")(carrier.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FareInfo]
  }
}

