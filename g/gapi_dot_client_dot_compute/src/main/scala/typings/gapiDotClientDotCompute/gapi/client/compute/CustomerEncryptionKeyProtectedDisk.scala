package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerEncryptionKeyProtectedDisk extends js.Object {
  /** Decrypts data associated with the disk with a customer-supplied encryption key. */
  var diskEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.undefined
  /** Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks. */
  var source: js.UndefOr[String] = js.undefined
}

object CustomerEncryptionKeyProtectedDisk {
  @scala.inline
  def apply(diskEncryptionKey: CustomerEncryptionKey = null, source: String = null): CustomerEncryptionKeyProtectedDisk = {
    val __obj = js.Dynamic.literal()
    if (diskEncryptionKey != null) __obj.updateDynamic("diskEncryptionKey")(diskEncryptionKey)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[CustomerEncryptionKeyProtectedDisk]
  }
}

