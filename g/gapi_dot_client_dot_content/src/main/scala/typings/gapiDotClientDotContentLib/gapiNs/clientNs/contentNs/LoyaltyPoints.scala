package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoyaltyPoints extends js.Object {
  /** Name of loyalty points program. It is recommended to limit the name to 12 full-width characters or 24 Roman characters. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The retailer's loyalty points in absolute value. */
  var pointsValue: js.UndefOr[java.lang.String] = js.undefined
  /** The ratio of a point when converted to currency. Google assumes currency based on Merchant Center settings. If ratio is left out, it defaults to 1.0. */
  var ratio: js.UndefOr[scala.Double] = js.undefined
}

