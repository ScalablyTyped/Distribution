package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TimeOfDayRange extends js.Object {
  /** The earliest time of day in HH:MM format. */
  var earliestTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Identifies this as a time of day range object, representing two times in a single day defining a time range. Value: the fixed string
               * qpxexpress#timeOfDayRange.
               */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The latest time of day in HH:MM format. */
  var latestTime: js.UndefOr[java.lang.String] = js.undefined
}

