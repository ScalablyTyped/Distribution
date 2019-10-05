package typings.gapiDotClientDotQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BagDescriptor extends js.Object {
  /** Provides the commercial name for an optional service. */
  var commercialName: js.UndefOr[String] = js.undefined
  /** How many of this type of bag will be checked on this flight. */
  var count: js.UndefOr[Double] = js.undefined
  /** A description of the baggage. */
  var description: js.UndefOr[js.Array[String]] = js.undefined
  /** Identifies this as a baggage object. Value: the fixed string qpxexpress#bagDescriptor. */
  var kind: js.UndefOr[String] = js.undefined
  /** The standard IATA subcode used to identify this optional service. */
  var subcode: js.UndefOr[String] = js.undefined
}

object BagDescriptor {
  @scala.inline
  def apply(
    commercialName: String = null,
    count: Int | Double = null,
    description: js.Array[String] = null,
    kind: String = null,
    subcode: String = null
  ): BagDescriptor = {
    val __obj = js.Dynamic.literal()
    if (commercialName != null) __obj.updateDynamic("commercialName")(commercialName)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (subcode != null) __obj.updateDynamic("subcode")(subcode)
    __obj.asInstanceOf[BagDescriptor]
  }
}

