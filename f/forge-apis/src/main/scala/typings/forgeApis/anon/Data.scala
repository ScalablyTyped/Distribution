package typings.forgeApis.anon

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: String | Buffer
  
  var eTags: js.UndefOr[js.Array[String]] = js.undefined
  
  var objectKey: String
  
  var xAdsMetaCacheControl: js.UndefOr[String] = js.undefined
  
  var xAdsMetaContentDisposition: js.UndefOr[String] = js.undefined
  
  var xAdsMetaContentEncoding: js.UndefOr[String] = js.undefined
  
  var xAdsMetaContentType: js.UndefOr[String] = js.undefined
}
object Data {
  
  inline def apply(data: String | Buffer, objectKey: String): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], objectKey = objectKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setData(value: String | Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setETags(value: js.Array[String]): Self = StObject.set(x, "eTags", value.asInstanceOf[js.Any])
    
    inline def setETagsUndefined: Self = StObject.set(x, "eTags", js.undefined)
    
    inline def setETagsVarargs(value: String*): Self = StObject.set(x, "eTags", js.Array(value*))
    
    inline def setObjectKey(value: String): Self = StObject.set(x, "objectKey", value.asInstanceOf[js.Any])
    
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
