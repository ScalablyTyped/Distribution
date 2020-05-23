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
    cpu: js.UndefOr[Double] = js.undefined,
    diskGb: js.UndefOr[Double] = js.undefined,
    memoryGb: js.UndefOr[Double] = js.undefined,
    volumes: js.Array[Volume] = null
  ): Resources = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cpu)) __obj.updateDynamic("cpu")(cpu.get.asInstanceOf[js.Any])
    if (!js.isUndefined(diskGb)) __obj.updateDynamic("diskGb")(diskGb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(memoryGb)) __obj.updateDynamic("memoryGb")(memoryGb.get.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resources]
  }
}

