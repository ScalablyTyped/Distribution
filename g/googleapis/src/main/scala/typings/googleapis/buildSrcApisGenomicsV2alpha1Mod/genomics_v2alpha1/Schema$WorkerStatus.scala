package typings.googleapis.buildSrcApisGenomicsV2alpha1Mod.genomics_v2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of the worker VM.
  */
@js.native
trait Schema$WorkerStatus extends js.Object {
  /**
    * Status of attached disks.
    */
  var attachedDisks: js.UndefOr[StringDictionary[Schema$DiskStatus]] = js.native
  /**
    * Status of the boot disk.
    */
  var bootDisk: js.UndefOr[Schema$DiskStatus] = js.native
  /**
    * Free RAM.
    */
  var freeRamBytes: js.UndefOr[String] = js.native
  /**
    * Total RAM.
    */
  var totalRamBytes: js.UndefOr[String] = js.native
  /**
    * System uptime.
    */
  var uptimeSeconds: js.UndefOr[String] = js.native
}

object Schema$WorkerStatus {
  @scala.inline
  def apply(
    attachedDisks: StringDictionary[Schema$DiskStatus] = null,
    bootDisk: Schema$DiskStatus = null,
    freeRamBytes: String = null,
    totalRamBytes: String = null,
    uptimeSeconds: String = null
  ): Schema$WorkerStatus = {
    val __obj = js.Dynamic.literal()
    if (attachedDisks != null) __obj.updateDynamic("attachedDisks")(attachedDisks.asInstanceOf[js.Any])
    if (bootDisk != null) __obj.updateDynamic("bootDisk")(bootDisk.asInstanceOf[js.Any])
    if (freeRamBytes != null) __obj.updateDynamic("freeRamBytes")(freeRamBytes.asInstanceOf[js.Any])
    if (totalRamBytes != null) __obj.updateDynamic("totalRamBytes")(totalRamBytes.asInstanceOf[js.Any])
    if (uptimeSeconds != null) __obj.updateDynamic("uptimeSeconds")(uptimeSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WorkerStatus]
  }
}

