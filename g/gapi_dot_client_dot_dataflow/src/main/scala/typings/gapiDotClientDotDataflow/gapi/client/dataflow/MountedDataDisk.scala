package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountedDataDisk extends js.Object {
  /**
    * The name of the data disk.
    * This name is local to the Google Cloud Platform project and uniquely
    * identifies the disk within that project, for example
    * "myproject-1014-104817-4c2-harness-0-disk-1".
    */
  var dataDisk: js.UndefOr[String] = js.undefined
}

object MountedDataDisk {
  @scala.inline
  def apply(dataDisk: String = null): MountedDataDisk = {
    val __obj = js.Dynamic.literal()
    if (dataDisk != null) __obj.updateDynamic("dataDisk")(dataDisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountedDataDisk]
  }
}

