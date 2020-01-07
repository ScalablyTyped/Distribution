package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstancesResumeRequest extends js.Object {
  /**
    * Array of disks associated with this instance that are protected with a
    * customer-supplied encryption key.  In order to resume the instance, the
    * disk url and its corresponding key must be provided.  If the disk is not
    * protected with a customer-supplied encryption key it should not be
    * specified.
    */
  var disks: js.UndefOr[js.Array[Schema$CustomerEncryptionKeyProtectedDisk]] = js.native
  /**
    * Decrypts data associated with an instance that is protected with a
    * customer-supplied encryption key.  If the instance you are starting is
    * protected with a customer-supplied encryption key, the correct key must
    * be provided otherwise the instance resume will not succeed.
    */
  var instanceEncryptionKey: js.UndefOr[Schema$CustomerEncryptionKey] = js.native
}

object Schema$InstancesResumeRequest {
  @scala.inline
  def apply(
    disks: js.Array[Schema$CustomerEncryptionKeyProtectedDisk] = null,
    instanceEncryptionKey: Schema$CustomerEncryptionKey = null
  ): Schema$InstancesResumeRequest = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    if (instanceEncryptionKey != null) __obj.updateDynamic("instanceEncryptionKey")(instanceEncryptionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstancesResumeRequest]
  }
}

