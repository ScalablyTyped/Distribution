package typings.firebaseStorageTypes.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettableMetadata extends StObject {
  
  var cacheControl: js.UndefOr[String | Null] = js.undefined
  
  var contentDisposition: js.UndefOr[String | Null] = js.undefined
  
  var contentEncoding: js.UndefOr[String | Null] = js.undefined
  
  var contentLanguage: js.UndefOr[String | Null] = js.undefined
  
  var contentType: js.UndefOr[String | Null] = js.undefined
  
  var customMetadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SettableMetadata {
  
  inline def apply(): SettableMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettableMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SettableMetadata] (val x: Self) extends AnyVal {
    
    inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlNull: Self = StObject.set(x, "cacheControl", null)
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
    
    inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
    
    inline def setContentDispositionNull: Self = StObject.set(x, "contentDisposition", null)
    
    inline def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
    
    inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingNull: Self = StObject.set(x, "contentEncoding", null)
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
    
    inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageNull: Self = StObject.set(x, "contentLanguage", null)
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCustomMetadata(value: StringDictionary[String]): Self = StObject.set(x, "customMetadata", value.asInstanceOf[js.Any])
    
    inline def setCustomMetadataNull: Self = StObject.set(x, "customMetadata", null)
    
    inline def setCustomMetadataUndefined: Self = StObject.set(x, "customMetadata", js.undefined)
  }
}
