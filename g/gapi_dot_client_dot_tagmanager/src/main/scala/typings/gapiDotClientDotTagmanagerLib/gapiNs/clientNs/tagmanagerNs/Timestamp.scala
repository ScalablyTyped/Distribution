package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timestamp extends js.Object {
  /**
    * Non-negative fractions of a second at nanosecond resolution. Negative second values with fractions must still have non-negative nanos values that count
    * forward in time. Must be from 0 to 999,999,999 inclusive.
    */
  var nanos: js.UndefOr[scala.Double] = js.undefined
  /** Represents seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive. */
  var seconds: js.UndefOr[java.lang.String] = js.undefined
}

