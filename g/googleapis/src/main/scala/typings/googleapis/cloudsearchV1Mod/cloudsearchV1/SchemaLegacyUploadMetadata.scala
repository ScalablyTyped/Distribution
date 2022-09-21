package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLegacyUploadMetadata extends StObject {
  
  /**
    * A unique ID generated from legacy UploadMetadata. This is used for interopping URLs after uploading blob to shared drive. Links in Classic might break without this. go/drive-file-attachment-interop-from-dynamite.
    */
  var legacyUniqueId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The blob in this UploadMetadata has been uploaded to shared drive. This UploadMetadata is no longer attached to a message. go/shared-drive-data-migration.
    */
  var uploadMetadata: js.UndefOr[SchemaUploadMetadata] = js.undefined
}
object SchemaLegacyUploadMetadata {
  
  inline def apply(): SchemaLegacyUploadMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLegacyUploadMetadata]
  }
  
  extension [Self <: SchemaLegacyUploadMetadata](x: Self) {
    
    inline def setLegacyUniqueId(value: String): Self = StObject.set(x, "legacyUniqueId", value.asInstanceOf[js.Any])
    
    inline def setLegacyUniqueIdNull: Self = StObject.set(x, "legacyUniqueId", null)
    
    inline def setLegacyUniqueIdUndefined: Self = StObject.set(x, "legacyUniqueId", js.undefined)
    
    inline def setUploadMetadata(value: SchemaUploadMetadata): Self = StObject.set(x, "uploadMetadata", value.asInstanceOf[js.Any])
    
    inline def setUploadMetadataUndefined: Self = StObject.set(x, "uploadMetadata", js.undefined)
  }
}
