package typings.gapiDotClientDotQpxexpress.gapiNs.clientNs.qpxexpressNs

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
    if (basisCode != null) __obj.updateDynamic("basisCode")(basisCode)
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[FareInfo]
  }
}

