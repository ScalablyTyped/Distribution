package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinLogCoordinates extends js.Object {
  /** Name of the binary log file for a Cloud SQL instance. */
  var binLogFileName: js.UndefOr[java.lang.String] = js.undefined
  /** Position (offset) within the binary log file. */
  var binLogPosition: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#binLogCoordinates. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

