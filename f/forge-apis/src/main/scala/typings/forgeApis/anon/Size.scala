package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var eTags: js.UndefOr[js.Array[String]] = js.undefined
  
  var objectKey: String
  
  var size: js.UndefOr[Double] = js.undefined
  
  var uploadKey: js.UndefOr[String] = js.undefined
  
  var xAdsMetaCacheControl: js.UndefOr[String] = js.undefined
  
  var xAdsMetaContentDisposition: js.UndefOr[String] = js.undefined
  
  var xAdsMetaContentEncoding: js.UndefOr[String] = js.undefined
  
  var xAdsMetaContentType: js.UndefOr[String] = js.undefined
}
object Size {
  
  inline def apply(objectKey: String): Size = {
    val __obj = js.Dynamic.literal(objectKey = objectKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    inline def setETags(value: js.Array[String]): Self = StObject.set(x, "eTags", value.asInstanceOf[js.Any])
    
    inline def setETagsUndefined: Self = StObject.set(x, "eTags", js.undefined)
    
    inline def setETagsVarargs(value: String*): Self = StObject.set(x, "eTags", js.Array(value*))
    
    inline def setObjectKey(value: String): Self = StObject.set(x, "objectKey", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUploadKey(value: String): Self = StObject.set(x, "uploadKey", value.asInstanceOf[js.Any])
    
    inline def setUploadKeyUndefined: Self = StObject.set(x, "uploadKey", js.undefined)
    
    inline def setXAdsMetaCacheControl(value: String): Self = StObject.set(x, "xAdsMetaCacheControl", value.asInstanceOf[js.Any])
    
    inline def setXAdsMetaCacheControlUndefined: Self = StObject.set(x, "xAdsMetaCacheControl", js.undefined)
    
    inline def setXAdsMetaContentDisposition(value: String): Self = StObject.set(x, "xAdsMetaContentDisposition", value.asInstanceOf[js.Any])
    
    inline def setXAdsMetaContentDispositionUndefined: Self = StObject.set(x, "xAdsMetaContentDisposition", js.undefined)
    
    inline def setXAdsMetaContentEncoding(value: String): Self = StObject.set(x, "xAdsMetaContentEncoding", value.asInstanceOf[js.Any])
    
    inline def setXAdsMetaContentEncodingUndefined: Self = StObject.set(x, "xAdsMetaContentEncoding", js.undefined)
    
    inline def setXAdsMetaContentType(value: String): Self = StObject.set(x, "xAdsMetaContentType", value.asInstanceOf[js.Any])
    
    inline def setXAdsMetaContentTypeUndefined: Self = StObject.set(x, "xAdsMetaContentType", js.undefined)
  }
}
