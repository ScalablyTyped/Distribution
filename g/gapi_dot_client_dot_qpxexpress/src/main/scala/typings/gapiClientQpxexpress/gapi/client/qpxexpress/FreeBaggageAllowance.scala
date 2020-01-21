package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBaggageAllowance extends js.Object {
  /** A representation of a type of bag, such as an ATPCo subcode, Commercial Name, or other description. */
  var bagDescriptor: js.UndefOr[js.Array[BagDescriptor]] = js.undefined
  /** The maximum number of kilos all the free baggage together may weigh. */
  var kilos: js.UndefOr[Double] = js.undefined
  /** The maximum number of kilos any one piece of baggage may weigh. */
  var kilosPerPiece: js.UndefOr[Double] = js.undefined
  /** Identifies this as free baggage object, allowed on one segment of a trip. Value: the fixed string qpxexpress#freeBaggageAllowance. */
  var kind: js.UndefOr[String] = js.undefined
  /** The number of free pieces of baggage allowed. */
  var pieces: js.UndefOr[Double] = js.undefined
  /** The number of pounds of free baggage allowed. */
  var pounds: js.UndefOr[Double] = js.undefined
}

object FreeBaggageAllowance {
  @scala.inline
  def apply(
    bagDescriptor: js.Array[BagDescriptor] = null,
    kilos: Int | Double = null,
    kilosPerPiece: Int | Double = null,
    kind: String = null,
    pieces: Int | Double = null,
    pounds: Int | Double = null
  ): FreeBaggageAllowance = {
    val __obj = js.Dynamic.literal()
    if (bagDescriptor != null) __obj.updateDynamic("bagDescriptor")(bagDescriptor.asInstanceOf[js.Any])
    if (kilos != null) __obj.updateDynamic("kilos")(kilos.asInstanceOf[js.Any])
    if (kilosPerPiece != null) __obj.updateDynamic("kilosPerPiece")(kilosPerPiece.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pieces != null) __obj.updateDynamic("pieces")(pieces.asInstanceOf[js.Any])
    if (pounds != null) __obj.updateDynamic("pounds")(pounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBaggageAllowance]
  }
}

