package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TargetingValue extends js.Object {
  /** The creative size value to exclude/include. */
  var creativeSizeValue: js.UndefOr[TargetingValueCreativeSize] = js.undefined
  /** The daypart targeting to include / exclude. Filled in when the key is GOOG_DAYPART_TARGETING. */
  var dayPartTargetingValue: js.UndefOr[TargetingValueDayPartTargeting] = js.undefined
  /** The long value to exclude/include. */
  var longValue: js.UndefOr[java.lang.String] = js.undefined
  /** The string value to exclude/include. */
  var stringValue: js.UndefOr[java.lang.String] = js.undefined
}

