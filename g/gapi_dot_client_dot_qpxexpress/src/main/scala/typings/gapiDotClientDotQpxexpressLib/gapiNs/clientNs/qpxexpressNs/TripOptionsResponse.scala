package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripOptionsResponse extends js.Object {
  /** Informational data global to list of solutions. */
  var data: js.UndefOr[Data] = js.undefined
  /** Identifies this as a QPX Express trip response object, which consists of zero or more solutions. Value: the fixed string qpxexpress#tripOptions. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** An identifier uniquely identifying this response. */
  var requestId: js.UndefOr[java.lang.String] = js.undefined
  /** A list of priced itinerary solutions to the QPX Express query. */
  var tripOption: js.UndefOr[js.Array[TripOption]] = js.undefined
}

