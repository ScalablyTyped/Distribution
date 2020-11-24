package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstancesStartWithEncryptionKeyRequest extends js.Object {
  
  /**
    * Array of disks associated with this instance that are protected with a
    * customer-supplied encryption key.  In order to start the instance, the
    * disk url and its corresponding key must be provided.  If the disk is not
    * protected with a customer-supplied encryption key it should not be
    * specified.
    */
  var disks: js.UndefOr[js.Array[SchemaCustomerEncryptionKeyProtectedDisk]] = js.native
  
  /**
    * Decrypts data associated with an instance that is protected with a
    * customer-supplied encryption key.  If the instance you are starting is
    * protected with a customer-supplied encryption key, the correct key must
    * be provided otherwise the instance start will not succeed.
    */
  var instanceEncryptionKey: js.UndefOr[SchemaCustomerEncryptionKey] = js.native
}
object SchemaInstancesStartWithEncryptionKeyRequest {
  
  @scala.inline
  def apply(): SchemaInstancesStartWithEncryptionKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesStartWithEncryptionKeyRequest]
  }
  
  @scala.inline
  implicit class SchemaInstancesStartWithEncryptionKeyRequestOps[Self <: SchemaInstancesStartWithEncryptionKeyRequest] (val x: Self) extends AnyVal {
    
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
    def setDisksVarargs(value: SchemaCustomerEncryptionKeyProtectedDisk*): Self = this.set("disks", js.Array(value :_*))
    
    @scala.inline
    def setDisks(value: js.Array[SchemaCustomerEncryptionKeyProtectedDisk]): Self = this.set("disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisks: Self = this.set("disks", js.undefined)
    
    @scala.inline
    def setInstanceEncryptionKey(value: SchemaCustomerEncryptionKey): Self = this.set("instanceEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceEncryptionKey: Self = this.set("instanceEncryptionKey", js.undefined)
  }
}
