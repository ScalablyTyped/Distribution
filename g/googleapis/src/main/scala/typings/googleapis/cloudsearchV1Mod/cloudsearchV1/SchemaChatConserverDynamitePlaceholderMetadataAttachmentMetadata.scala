package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChatConserverDynamitePlaceholderMetadataAttachmentMetadata extends StObject {
  
  var filename: js.UndefOr[String | Null] = js.undefined
}
object SchemaChatConserverDynamitePlaceholderMetadataAttachmentMetadata {
  
  inline def apply(): SchemaChatConserverDynamitePlaceholderMetadataAttachmentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChatConserverDynamitePlaceholderMetadataAttachmentMetadata]
  }
  
  extension [Self <: SchemaChatConserverDynamitePlaceholderMetadataAttachmentMetadata](x: Self) {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameNull: Self = StObject.set(x, "filename", null)
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
  }
}
