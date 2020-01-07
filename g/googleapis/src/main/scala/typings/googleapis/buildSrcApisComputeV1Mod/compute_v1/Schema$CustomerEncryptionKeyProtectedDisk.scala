package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$CustomerEncryptionKeyProtectedDisk extends js.Object {
  /**
    * Decrypts data associated with the disk with a customer-supplied
    * encryption key.
    */
  var diskEncryptionKey: js.UndefOr[Schema$CustomerEncryptionKey] = js.native
  /**
    * Specifies a valid partial or full URL to an existing Persistent Disk
    * resource. This field is only applicable for persistent disks.
    */
  var source: js.UndefOr[String] = js.native
}

object Schema$CustomerEncryptionKeyProtectedDisk {
  @scala.inline
  def apply(diskEncryptionKey: Schema$CustomerEncryptionKey = null, source: String = null): Schema$CustomerEncryptionKeyProtectedDisk = {
    val __obj = js.Dynamic.literal()
    if (diskEncryptionKey != null) __obj.updateDynamic("diskEncryptionKey")(diskEncryptionKey.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomerEncryptionKeyProtectedDisk]
  }
}

