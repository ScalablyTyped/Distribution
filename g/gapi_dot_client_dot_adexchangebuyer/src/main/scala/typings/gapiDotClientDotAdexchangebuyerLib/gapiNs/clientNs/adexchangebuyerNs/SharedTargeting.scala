package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedTargeting extends js.Object {
  /** The list of values to exclude from targeting. Each value is AND'd together. */
  var exclusions: js.UndefOr[js.Array[TargetingValue]] = js.undefined
  /** The list of value to include as part of the targeting. Each value is OR'd together. */
  var inclusions: js.UndefOr[js.Array[TargetingValue]] = js.undefined
  /** The key representing the shared targeting criterion. */
  var key: js.UndefOr[java.lang.String] = js.undefined
}

