package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCustomerEncryptionKeyProtectedDisk extends StObject {
  
  /**
    * Decrypts data associated with the disk with a customer-supplied
    * encryption key.
    */
  var diskEncryptionKey: js.UndefOr[SchemaCustomerEncryptionKey] = js.native
  
  /**
    * Specifies a valid partial or full URL to an existing Persistent Disk
    * resource. This field is only applicable for persistent disks.
    */
  var source: js.UndefOr[String] = js.native
}
object SchemaCustomerEncryptionKeyProtectedDisk {
  
  @scala.inline
  def apply(): SchemaCustomerEncryptionKeyProtectedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerEncryptionKeyProtectedDisk]
  }
  
  @scala.inline
  implicit class SchemaCustomerEncryptionKeyProtectedDiskMutableBuilder[Self <: SchemaCustomerEncryptionKeyProtectedDisk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskEncryptionKey(value: SchemaCustomerEncryptionKey): Self = StObject.set(x, "diskEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskEncryptionKeyUndefined: Self = StObject.set(x, "diskEncryptionKey", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
