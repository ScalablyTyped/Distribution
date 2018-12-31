package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resources extends js.Object {
  /** Number of CPU cores needed. */
  var cpu: js.UndefOr[scala.Double] = js.undefined
  /** Disk size (GB) needed. */
  var diskGb: js.UndefOr[scala.Double] = js.undefined
  /** Memory (GB) needed. */
  var memoryGb: js.UndefOr[scala.Double] = js.undefined
  /** User specified volumes. */
  var volumes: js.UndefOr[js.Array[Volume]] = js.undefined
}

