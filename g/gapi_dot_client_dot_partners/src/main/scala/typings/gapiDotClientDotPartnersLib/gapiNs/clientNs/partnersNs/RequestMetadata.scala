package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMetadata extends js.Object {
  /** Experiment IDs the current request belongs to. */
  var experimentIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Locale to use for the current request. */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Google Partners session ID. */
  var partnersSessionId: js.UndefOr[java.lang.String] = js.undefined
  /** Source of traffic for the current request. */
  var trafficSource: js.UndefOr[TrafficSource] = js.undefined
  /**
    * Values to use instead of the user's respective defaults for the current
    * request. These are only honored by whitelisted products.
    */
  var userOverrides: js.UndefOr[UserOverrides] = js.undefined
}

