package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBabelPlaceholderMetadata extends StObject {
  
  var deleteMetadata: js.UndefOr[SchemaDeleteMetadata] = js.undefined
  
  var editMetadata: js.UndefOr[SchemaEditMetadata] = js.undefined
  
  var hangoutVideoMetadata: js.UndefOr[SchemaHangoutVideoEventMetadata] = js.undefined
}
object SchemaBabelPlaceholderMetadata {
  
  inline def apply(): SchemaBabelPlaceholderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBabelPlaceholderMetadata]
  }
  
  extension [Self <: SchemaBabelPlaceholderMetadata](x: Self) {
    
    inline def setDeleteMetadata(value: SchemaDeleteMetadata): Self = StObject.set(x, "deleteMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeleteMetadataUndefined: Self = StObject.set(x, "deleteMetadata", js.undefined)
    
    inline def setEditMetadata(value: SchemaEditMetadata): Self = StObject.set(x, "editMetadata", value.asInstanceOf[js.Any])
    
    inline def setEditMetadataUndefined: Self = StObject.set(x, "editMetadata", js.undefined)
    
    inline def setHangoutVideoMetadata(value: SchemaHangoutVideoEventMetadata): Self = StObject.set(x, "hangoutVideoMetadata", value.asInstanceOf[js.Any])
    
    inline def setHangoutVideoMetadataUndefined: Self = StObject.set(x, "hangoutVideoMetadata", js.undefined)
  }
}
