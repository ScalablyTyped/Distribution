package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAdsMetaCacheControl extends StObject {
  
  var xAdsMetaCacheControl: js.UndefOr[String] = js.undefined
  
  var xAdsMetaContentDisposition: js.UndefOr[String] = js.undefined
  
  var xAdsMetaContentEncoding: js.UndefOr[String] = js.undefined
  
  var xAdsMetaContentType: js.UndefOr[String] = js.undefined
}
object XAdsMetaCacheControl {
  
  inline def apply(): XAdsMetaCacheControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAdsMetaCacheControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XAdsMetaCacheControl] (val x: Self) extends AnyVal {
    
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
