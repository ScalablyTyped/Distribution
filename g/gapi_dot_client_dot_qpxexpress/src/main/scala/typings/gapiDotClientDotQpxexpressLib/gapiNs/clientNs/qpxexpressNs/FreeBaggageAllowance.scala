package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBaggageAllowance extends js.Object {
  /** A representation of a type of bag, such as an ATPCo subcode, Commercial Name, or other description. */
  var bagDescriptor: js.UndefOr[js.Array[BagDescriptor]] = js.undefined
  /** The maximum number of kilos all the free baggage together may weigh. */
  var kilos: js.UndefOr[scala.Double] = js.undefined
  /** The maximum number of kilos any one piece of baggage may weigh. */
  var kilosPerPiece: js.UndefOr[scala.Double] = js.undefined
  /** Identifies this as free baggage object, allowed on one segment of a trip. Value: the fixed string qpxexpress#freeBaggageAllowance. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The number of free pieces of baggage allowed. */
  var pieces: js.UndefOr[scala.Double] = js.undefined
  /** The number of pounds of free baggage allowed. */
  var pounds: js.UndefOr[scala.Double] = js.undefined
}

object FreeBaggageAllowance {
  @scala.inline
  def apply(
    bagDescriptor: js.Array[BagDescriptor] = null,
    kilos: scala.Int | scala.Double = null,
    kilosPerPiece: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    pieces: scala.Int | scala.Double = null,
    pounds: scala.Int | scala.Double = null
  ): FreeBaggageAllowance = {
    val __obj = js.Dynamic.literal()
    if (bagDescriptor != null) __obj.updateDynamic("bagDescriptor")(bagDescriptor)
    if (kilos != null) __obj.updateDynamic("kilos")(kilos.asInstanceOf[js.Any])
    if (kilosPerPiece != null) __obj.updateDynamic("kilosPerPiece")(kilosPerPiece.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (pieces != null) __obj.updateDynamic("pieces")(pieces.asInstanceOf[js.Any])
    if (pounds != null) __obj.updateDynamic("pounds")(pounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBaggageAllowance]
  }
}

