package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DailyMaintenanceWindow extends js.Object {
  /**
    * [Output only] Duration of the time window, automatically chosen to be
    * smallest possible in the given scenario.
    * Duration will be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
    * format "PTnHnMnS".
    */
  var duration: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Time within the maintenance window to start the maintenance operations.
    * Time format should be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
    * format "HH:MM”, where HH : [00-23] and MM : [00-59] GMT.
    */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
}

