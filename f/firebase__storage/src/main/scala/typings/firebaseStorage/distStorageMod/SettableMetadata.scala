package typings.firebaseStorage.distStorageMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettableMetadata extends StObject {
  
  /**
    * Served as the 'Cache-Control' header on object download.
    */
  var cacheControl: js.UndefOr[String] = js.undefined
  
  /**
    * Served as the 'Content-Disposition' header on object download.
    */
  var contentDisposition: js.UndefOr[String] = js.undefined
  
  /**
    * Served as the 'Content-Encoding' header on object download.
    */
  var contentEncoding: js.UndefOr[String] = js.undefined
  
  /**
    * Served as the 'Content-Language' header on object download.
    */
  var contentLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Served as the 'Content-Type' header on object download.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * Additional user-defined custom metadata.
    */
  var customMetadata: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SettableMetadata {
  
  inline def apply(): SettableMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettableMetadata]
  }
  
  extension [Self <: SettableMetadata](x: Self) {
    
    inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
    
    inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
    
    inline def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
    
    inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
    
    inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCustomMetadata(value: StringDictionary[String]): Self = StObject.set(x, "customMetadata", value.asInstanceOf[js.Any])
    
    inline def setCustomMetadataUndefined: Self = StObject.set(x, "customMetadata", js.undefined)
  }
}
