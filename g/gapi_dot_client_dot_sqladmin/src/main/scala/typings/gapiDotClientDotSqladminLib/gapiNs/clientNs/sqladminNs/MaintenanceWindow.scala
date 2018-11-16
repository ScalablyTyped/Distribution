package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MaintenanceWindow extends js.Object {
  /** day of week (1-7), starting on Monday. */
  var day: js.UndefOr[scala.Double] = js.undefined
  /** hour of day - 0 to 23. */
  var hour: js.UndefOr[scala.Double] = js.undefined
  /** This is always sql#maintenanceWindow. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var updateTrack: js.UndefOr[java.lang.String] = js.undefined
}

