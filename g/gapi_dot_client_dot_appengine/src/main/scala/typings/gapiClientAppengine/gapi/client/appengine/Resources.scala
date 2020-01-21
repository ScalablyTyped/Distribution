package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resources extends js.Object {
  /** Number of CPU cores needed. */
  var cpu: js.UndefOr[Double] = js.undefined
  /** Disk size (GB) needed. */
  var diskGb: js.UndefOr[Double] = js.undefined
  /** Memory (GB) needed. */
  var memoryGb: js.UndefOr[Double] = js.undefined
  /** User specified volumes. */
  var volumes: js.UndefOr[js.Array[Volume]] = js.undefined
}

object Resources {
  @scala.inline
  def apply(
    cpu: Int | Double = null,
    diskGb: Int | Double = null,
    memoryGb: Int | Double = null,
    volumes: js.Array[Volume] = null
  ): Resources = {
    val __obj = js.Dynamic.literal()
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (diskGb != null) __obj.updateDynamic("diskGb")(diskGb.asInstanceOf[js.Any])
    if (memoryGb != null) __obj.updateDynamic("memoryGb")(memoryGb.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resources]
  }
}

