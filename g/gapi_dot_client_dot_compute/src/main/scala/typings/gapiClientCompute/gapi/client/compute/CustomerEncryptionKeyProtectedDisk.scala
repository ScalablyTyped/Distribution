package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerEncryptionKeyProtectedDisk extends js.Object {
  /** Decrypts data associated with the disk with a customer-supplied encryption key. */
  var diskEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.native
  /** Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks. */
  var source: js.UndefOr[String] = js.native
}

object CustomerEncryptionKeyProtectedDisk {
  @scala.inline
  def apply(): CustomerEncryptionKeyProtectedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerEncryptionKeyProtectedDisk]
  }
  @scala.inline
  implicit class CustomerEncryptionKeyProtectedDiskOps[Self <: CustomerEncryptionKeyProtectedDisk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDiskEncryptionKey(value: CustomerEncryptionKey): Self = this.set("diskEncryptionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskEncryptionKey: Self = this.set("diskEncryptionKey", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

