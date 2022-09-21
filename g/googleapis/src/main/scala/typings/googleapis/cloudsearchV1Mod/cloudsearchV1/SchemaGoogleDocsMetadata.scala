package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDocsMetadata extends StObject {
  
  /**
    * Contains number of users and groups which can access the document.
    */
  var aclInfo: js.UndefOr[SchemaAclInfo] = js.undefined
  
  /**
    * The conceptual type (presentation, document, etc.) of this document.
    */
  var documentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The file extension of the document. NOTE: As of October 2018 this field is not backfilled for old documents.
    */
  var fileExtension: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last time this document was modified, in seconds since epoch. Only counts content modifications.
    */
  var lastContentModifiedTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional per-result information, akin to Gmail's SingleThreadResponse. Note: GWS no longer seems to use this field, but there's still one reference to it for Scribe, so we can't remove it.
    */
  var resultInfo: js.UndefOr[SchemaGoogleDocsResultInfo] = js.undefined
  
  /**
    * Contains additional information about the document depending on its type.
    */
  var typeInfo: js.UndefOr[SchemaTypeInfo] = js.undefined
}
object SchemaGoogleDocsMetadata {
  
  inline def apply(): SchemaGoogleDocsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDocsMetadata]
  }
  
  extension [Self <: SchemaGoogleDocsMetadata](x: Self) {
    
    inline def setAclInfo(value: SchemaAclInfo): Self = StObject.set(x, "aclInfo", value.asInstanceOf[js.Any])
    
    inline def setAclInfoUndefined: Self = StObject.set(x, "aclInfo", js.undefined)
    
    inline def setDocumentType(value: String): Self = StObject.set(x, "documentType", value.asInstanceOf[js.Any])
    
    inline def setDocumentTypeNull: Self = StObject.set(x, "documentType", null)
    
    inline def setDocumentTypeUndefined: Self = StObject.set(x, "documentType", js.undefined)
    
    inline def setFileExtension(value: String): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
    
    inline def setFileExtensionNull: Self = StObject.set(x, "fileExtension", null)
    
    inline def setFileExtensionUndefined: Self = StObject.set(x, "fileExtension", js.undefined)
    
    inline def setLastContentModifiedTimestamp(value: String): Self = StObject.set(x, "lastContentModifiedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastContentModifiedTimestampNull: Self = StObject.set(x, "lastContentModifiedTimestamp", null)
    
    inline def setLastContentModifiedTimestampUndefined: Self = StObject.set(x, "lastContentModifiedTimestamp", js.undefined)
    
    inline def setResultInfo(value: SchemaGoogleDocsResultInfo): Self = StObject.set(x, "resultInfo", value.asInstanceOf[js.Any])
    
    inline def setResultInfoUndefined: Self = StObject.set(x, "resultInfo", js.undefined)
    
    inline def setTypeInfo(value: SchemaTypeInfo): Self = StObject.set(x, "typeInfo", value.asInstanceOf[js.Any])
    
    inline def setTypeInfoUndefined: Self = StObject.set(x, "typeInfo", js.undefined)
  }
}
