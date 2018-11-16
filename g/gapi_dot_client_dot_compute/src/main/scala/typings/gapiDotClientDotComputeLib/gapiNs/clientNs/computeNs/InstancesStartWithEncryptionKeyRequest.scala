package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InstancesStartWithEncryptionKeyRequest extends js.Object {
  /**
               * Array of disks associated with this instance that are protected with a customer-supplied encryption key.
               *
               * In order to start the instance, the disk url and its corresponding key must be provided.
               *
               * If the disk is not protected with a customer-supplied encryption key it should not be specified.
               */
  var disks: js.UndefOr[js.Array[CustomerEncryptionKeyProtectedDisk]] = js.undefined
}

