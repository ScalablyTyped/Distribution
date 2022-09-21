package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstancesStartWithEncryptionKeyRequest extends StObject {
  
  /**
    * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
    */
  var disks: js.UndefOr[js.Array[SchemaCustomerEncryptionKeyProtectedDisk]] = js.undefined
  
  /**
    * Decrypts data associated with an instance that is protected with a customer-supplied encryption key. If the instance you are starting is protected with a customer-supplied encryption key, the correct key must be provided otherwise the instance start will not succeed.
    */
  var instanceEncryptionKey: js.UndefOr[SchemaCustomerEncryptionKey] = js.undefined
}
object SchemaInstancesStartWithEncryptionKeyRequest {
  
  inline def apply(): SchemaInstancesStartWithEncryptionKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesStartWithEncryptionKeyRequest]
  }
  
  extension [Self <: SchemaInstancesStartWithEncryptionKeyRequest](x: Self) {
    
    inline def setDisks(value: js.Array[SchemaCustomerEncryptionKeyProtectedDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setDisksVarargs(value: SchemaCustomerEncryptionKeyProtectedDisk*): Self = StObject.set(x, "disks", js.Array(value*))
    
    inline def setInstanceEncryptionKey(value: SchemaCustomerEncryptionKey): Self = StObject.set(x, "instanceEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setInstanceEncryptionKeyUndefined: Self = StObject.set(x, "instanceEncryptionKey", js.undefined)
  }
}
