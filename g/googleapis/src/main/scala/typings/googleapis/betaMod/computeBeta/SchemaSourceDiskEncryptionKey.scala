package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceDiskEncryptionKey extends StObject {
  
  /**
    * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
    */
  var diskEncryptionKey: js.UndefOr[SchemaCustomerEncryptionKey] = js.undefined
  
  /**
    * URL of the disk attached to the source instance. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
    */
  var sourceDisk: js.UndefOr[String | Null] = js.undefined
}
object SchemaSourceDiskEncryptionKey {
  
  inline def apply(): SchemaSourceDiskEncryptionKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceDiskEncryptionKey]
  }
  
  extension [Self <: SchemaSourceDiskEncryptionKey](x: Self) {
    
    inline def setDiskEncryptionKey(value: SchemaCustomerEncryptionKey): Self = StObject.set(x, "diskEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setDiskEncryptionKeyUndefined: Self = StObject.set(x, "diskEncryptionKey", js.undefined)
    
    inline def setSourceDisk(value: String): Self = StObject.set(x, "sourceDisk", value.asInstanceOf[js.Any])
    
    inline def setSourceDiskNull: Self = StObject.set(x, "sourceDisk", null)
    
    inline def setSourceDiskUndefined: Self = StObject.set(x, "sourceDisk", js.undefined)
  }
}
