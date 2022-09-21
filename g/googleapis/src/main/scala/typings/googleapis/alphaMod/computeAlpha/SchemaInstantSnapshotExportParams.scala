package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstantSnapshotExportParams extends StObject {
  
  /**
    * An optional base instant snapshot that this resource is compared against. If not specified, all blocks of this resource are exported. The base instant snapshot and this resource must be created from the same disk. The base instant snapshot must be created earlier in time than this resource.
    */
  var baseInstantSnapshot: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of an existing bucket in Cloud Storage where the changed blocks will be stored. The Google Service Account must have read and write access to this bucket. The bucket has to be in the same region as this resource.
    */
  var bucketName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Encryption key used to encrypt the instant snapshot.
    */
  var encryptionKey: js.UndefOr[SchemaCustomerEncryptionKey] = js.undefined
  
  /**
    * Name of the output Bigstore object storing the changed blocks. Object name must be less than 1024 bytes in length.
    */
  var objectName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The format of the output file.
    */
  var outputType: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstantSnapshotExportParams {
  
  inline def apply(): SchemaInstantSnapshotExportParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstantSnapshotExportParams]
  }
  
  extension [Self <: SchemaInstantSnapshotExportParams](x: Self) {
    
    inline def setBaseInstantSnapshot(value: String): Self = StObject.set(x, "baseInstantSnapshot", value.asInstanceOf[js.Any])
    
    inline def setBaseInstantSnapshotNull: Self = StObject.set(x, "baseInstantSnapshot", null)
    
    inline def setBaseInstantSnapshotUndefined: Self = StObject.set(x, "baseInstantSnapshot", js.undefined)
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameNull: Self = StObject.set(x, "bucketName", null)
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setEncryptionKey(value: SchemaCustomerEncryptionKey): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
    
    inline def setObjectNameNull: Self = StObject.set(x, "objectName", null)
    
    inline def setObjectNameUndefined: Self = StObject.set(x, "objectName", js.undefined)
    
    inline def setOutputType(value: String): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
    
    inline def setOutputTypeNull: Self = StObject.set(x, "outputType", null)
    
    inline def setOutputTypeUndefined: Self = StObject.set(x, "outputType", js.undefined)
  }
}
