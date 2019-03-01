package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerEncryptionKeyProtectedDisk extends js.Object {
  /** Decrypts data associated with the disk with a customer-supplied encryption key. */
  var diskEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.undefined
  /** Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks. */
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object CustomerEncryptionKeyProtectedDisk {
  @scala.inline
  def apply(diskEncryptionKey: CustomerEncryptionKey = null, source: java.lang.String = null): CustomerEncryptionKeyProtectedDisk = {
    val __obj = js.Dynamic.literal()
    if (diskEncryptionKey != null) __obj.updateDynamic("diskEncryptionKey")(diskEncryptionKey)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[CustomerEncryptionKeyProtectedDisk]
  }
}

