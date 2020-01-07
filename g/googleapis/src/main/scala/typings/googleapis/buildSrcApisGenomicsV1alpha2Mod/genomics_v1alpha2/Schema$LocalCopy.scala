package typings.googleapis.buildSrcApisGenomicsV1alpha2Mod.genomics_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LocalCopy defines how a remote file should be copied to and from the VM.
  */
@js.native
trait Schema$LocalCopy extends js.Object {
  /**
    * Required. The name of the disk where this parameter is located. Can be
    * the name of one of the disks specified in the Resources field, or
    * &quot;boot&quot;, which represents the Docker instance&#39;s boot disk
    * and has a mount point of `/`.
    */
  var disk: js.UndefOr[String] = js.native
  /**
    * Required. The path within the user&#39;s docker container where this
    * input should be localized to and from, relative to the specified
    * disk&#39;s mount point. For example: file.txt,
    */
  var path: js.UndefOr[String] = js.native
}

object Schema$LocalCopy {
  @scala.inline
  def apply(disk: String = null, path: String = null): Schema$LocalCopy = {
    val __obj = js.Dynamic.literal()
    if (disk != null) __obj.updateDynamic("disk")(disk.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LocalCopy]
  }
}

