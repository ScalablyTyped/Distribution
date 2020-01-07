package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Machine resources for a version.
  */
@js.native
trait Schema$Resources extends js.Object {
  /**
    * Number of CPU cores needed.
    */
  var cpu: js.UndefOr[Double] = js.native
  /**
    * Disk size (GB) needed.
    */
  var diskGb: js.UndefOr[Double] = js.native
  /**
    * Memory (GB) needed.
    */
  var memoryGb: js.UndefOr[Double] = js.native
  /**
    * User specified volumes.
    */
  var volumes: js.UndefOr[js.Array[Schema$Volume]] = js.native
}

object Schema$Resources {
  @scala.inline
  def apply(
    cpu: Int | Double = null,
    diskGb: Int | Double = null,
    memoryGb: Int | Double = null,
    volumes: js.Array[Schema$Volume] = null
  ): Schema$Resources = {
    val __obj = js.Dynamic.literal()
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (diskGb != null) __obj.updateDynamic("diskGb")(diskGb.asInstanceOf[js.Any])
    if (memoryGb != null) __obj.updateDynamic("memoryGb")(memoryGb.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Resources]
  }
}

