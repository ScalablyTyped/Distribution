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

