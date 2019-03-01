package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputeEngine extends js.Object {
  /** The names of the disks that were created for this pipeline. */
  var diskNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The instance on which the operation is running. */
  var instanceName: js.UndefOr[java.lang.String] = js.undefined
  /** The machine type of the instance. */
  var machineType: js.UndefOr[java.lang.String] = js.undefined
  /** The availability zone in which the instance resides. */
  var zone: js.UndefOr[java.lang.String] = js.undefined
}

object ComputeEngine {
  @scala.inline
  def apply(
    diskNames: js.Array[java.lang.String] = null,
    instanceName: java.lang.String = null,
    machineType: java.lang.String = null,
    zone: java.lang.String = null
  ): ComputeEngine = {
    val __obj = js.Dynamic.literal()
    if (diskNames != null) __obj.updateDynamic("diskNames")(diskNames)
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName)
    if (machineType != null) __obj.updateDynamic("machineType")(machineType)
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[ComputeEngine]
  }
}

