package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedDocument extends StObject {
  
  /**
    * Unique file ID.
    */
  var fileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Justification to explain why this document is being suggested.
    */
  var justification: js.UndefOr[SchemaAppsDynamiteSharedJustification] = js.undefined
  
  /**
    * Time the document was last modified.
    */
  var lastModifiedTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Used to determine which icon to render (e.g. docs, slides, sheets)
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title of the document.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of the document.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedDocument {
  
  inline def apply(): SchemaAppsDynamiteSharedDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedDocument]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedDocument](x: Self) {
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdNull: Self = StObject.set(x, "fileId", null)
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setJustification(value: SchemaAppsDynamiteSharedJustification): Self = StObject.set(x, "justification", value.asInstanceOf[js.Any])
    
    inline def setJustificationUndefined: Self = StObject.set(x, "justification", js.undefined)
    
    inline def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeNull: Self = StObject.set(x, "lastModifiedTime", null)
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
