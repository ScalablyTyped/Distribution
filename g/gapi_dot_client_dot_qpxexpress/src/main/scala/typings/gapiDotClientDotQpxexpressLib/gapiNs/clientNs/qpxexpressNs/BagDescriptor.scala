package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BagDescriptor extends js.Object {
  /** Provides the commercial name for an optional service. */
  var commercialName: js.UndefOr[java.lang.String] = js.undefined
  /** How many of this type of bag will be checked on this flight. */
  var count: js.UndefOr[scala.Double] = js.undefined
  /** A description of the baggage. */
  var description: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Identifies this as a baggage object. Value: the fixed string qpxexpress#bagDescriptor. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The standard IATA subcode used to identify this optional service. */
  var subcode: js.UndefOr[java.lang.String] = js.undefined
}

