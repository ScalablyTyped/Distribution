package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleTypeTimeOfDay extends js.Object {
  /**
    * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
    * to allow the value "24:00:00" for scenarios like business closing time.
    */
  var hours: js.UndefOr[scala.Double] = js.undefined
  /** Minutes of hour of day. Must be from 0 to 59. */
  var minutes: js.UndefOr[scala.Double] = js.undefined
  /** Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999. */
  var nanos: js.UndefOr[scala.Double] = js.undefined
  /**
    * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
    * allow the value 60 if it allows leap-seconds.
    */
  var seconds: js.UndefOr[scala.Double] = js.undefined
}

