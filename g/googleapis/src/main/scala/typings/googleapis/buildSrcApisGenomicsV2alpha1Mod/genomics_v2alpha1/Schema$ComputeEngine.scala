package typings.googleapis.buildSrcApisGenomicsV2alpha1Mod.genomics_v2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a Compute Engine resource that is being managed by a running
  * pipeline.
  */
@js.native
trait Schema$ComputeEngine extends js.Object {
  /**
    * The names of the disks that were created for this pipeline.
    */
  var diskNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The instance on which the operation is running.
    */
  var instanceName: js.UndefOr[String] = js.native
  /**
    * The machine type of the instance.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * The availability zone in which the instance resides.
    */
  var zone: js.UndefOr[String] = js.native
}

object Schema$ComputeEngine {
  @scala.inline
  def apply(
    diskNames: js.Array[String] = null,
    instanceName: String = null,
    machineType: String = null,
    zone: String = null
  ): Schema$ComputeEngine = {
    val __obj = js.Dynamic.literal()
    if (diskNames != null) __obj.updateDynamic("diskNames")(diskNames.asInstanceOf[js.Any])
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (machineType != null) __obj.updateDynamic("machineType")(machineType.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ComputeEngine]
  }
}

