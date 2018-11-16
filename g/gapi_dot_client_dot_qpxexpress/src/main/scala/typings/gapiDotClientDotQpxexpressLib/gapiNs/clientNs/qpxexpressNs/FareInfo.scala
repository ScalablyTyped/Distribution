package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FareInfo extends js.Object {
  var basisCode: js.UndefOr[java.lang.String] = js.undefined
  /** The carrier of the aircraft or other vehicle commuting between two points. */
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  /** The city code of the city the trip ends at. */
  var destination: js.UndefOr[java.lang.String] = js.undefined
  /** A unique identifier of the fare. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies this as a fare object. Value: the fixed string qpxexpress#fareInfo. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The city code of the city the trip begins at. */
  var origin: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this is a private fare, for example one offered only to select customers rather than the general public. */
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
}

