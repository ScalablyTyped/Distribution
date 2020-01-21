package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstancesResumeRequest extends js.Object {
  /**
    * Array of disks associated with this instance that are protected with a
    * customer-supplied encryption key.  In order to resume the instance, the
    * disk url and its corresponding key must be provided.  If the disk is not
    * protected with a customer-supplied encryption key it should not be
    * specified.
    */
  var disks: js.UndefOr[js.Array[SchemaCustomerEncryptionKeyProtectedDisk]] = js.native
  /**
    * Decrypts data associated with an instance that is protected with a
    * customer-supplied encryption key.  If the instance you are starting is
    * protected with a customer-supplied encryption key, the correct key must
    * be provided otherwise the instance resume will not succeed.
    */
  var instanceEncryptionKey: js.UndefOr[SchemaCustomerEncryptionKey] = js.native
}

object SchemaInstancesResumeRequest {
  @scala.inline
  def apply(
    disks: js.Array[SchemaCustomerEncryptionKeyProtectedDisk] = null,
    instanceEncryptionKey: SchemaCustomerEncryptionKey = null
  ): SchemaInstancesResumeRequest = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    if (instanceEncryptionKey != null) __obj.updateDynamic("instanceEncryptionKey")(instanceEncryptionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstancesResumeRequest]
  }
}

