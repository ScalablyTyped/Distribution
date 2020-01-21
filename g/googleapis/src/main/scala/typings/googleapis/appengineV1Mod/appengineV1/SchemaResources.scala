package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Machine resources for a version.
  */
@js.native
trait SchemaResources extends js.Object {
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
  var volumes: js.UndefOr[js.Array[SchemaVolume]] = js.native
}

object SchemaResources {
  @scala.inline
  def apply(
    cpu: Int | Double = null,
    diskGb: Int | Double = null,
    memoryGb: Int | Double = null,
    volumes: js.Array[SchemaVolume] = null
  ): SchemaResources = {
    val __obj = js.Dynamic.literal()
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (diskGb != null) __obj.updateDynamic("diskGb")(diskGb.asInstanceOf[js.Any])
    if (memoryGb != null) __obj.updateDynamic("memoryGb")(memoryGb.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResources]
  }
}

