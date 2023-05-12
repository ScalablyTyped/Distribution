package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinutesExpiration extends StObject {
  
  var ifModifiedSince: js.UndefOr[js.Date] = js.undefined
  
  var ifNoneMatch: js.UndefOr[String] = js.undefined
  
  var minutesExpiration: js.UndefOr[Double] = js.undefined
  
  var publicResourceFallback: js.UndefOr[Boolean] = js.undefined
  
  var responseCacheControl: js.UndefOr[String] = js.undefined
  
  var responseContentDisposition: js.UndefOr[String] = js.undefined
  
  var responseContentType: js.UndefOr[String] = js.undefined
  
  var useCdn: js.UndefOr[Boolean] = js.undefined
}
object MinutesExpiration {
  
  inline def apply(): MinutesExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinutesExpiration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MinutesExpiration] (val x: Self) extends AnyVal {
    
    inline def setIfModifiedSince(value: js.Date): Self = StObject.set(x, "ifModifiedSince", value.asInstanceOf[js.Any])
    
    inline def setIfModifiedSinceUndefined: Self = StObject.set(x, "ifModifiedSince", js.undefined)
    
    inline def setIfNoneMatch(value: String): Self = StObject.set(x, "ifNoneMatch", value.asInstanceOf[js.Any])
    
    inline def setIfNoneMatchUndefined: Self = StObject.set(x, "ifNoneMatch", js.undefined)
    
    inline def setMinutesExpiration(value: Double): Self = StObject.set(x, "minutesExpiration", value.asInstanceOf[js.Any])
    
    inline def setMinutesExpirationUndefined: Self = StObject.set(x, "minutesExpiration", js.undefined)
    
    inline def setPublicResourceFallback(value: Boolean): Self = StObject.set(x, "publicResourceFallback", value.asInstanceOf[js.Any])
    
    inline def setPublicResourceFallbackUndefined: Self = StObject.set(x, "publicResourceFallback", js.undefined)
    
    inline def setResponseCacheControl(value: String): Self = StObject.set(x, "responseCacheControl", value.asInstanceOf[js.Any])
    
    inline def setResponseCacheControlUndefined: Self = StObject.set(x, "responseCacheControl", js.undefined)
    
    inline def setResponseContentDisposition(value: String): Self = StObject.set(x, "responseContentDisposition", value.asInstanceOf[js.Any])
    
    inline def setResponseContentDispositionUndefined: Self = StObject.set(x, "responseContentDisposition", js.undefined)
    
    inline def setResponseContentType(value: String): Self = StObject.set(x, "responseContentType", value.asInstanceOf[js.Any])
    
    inline def setResponseContentTypeUndefined: Self = StObject.set(x, "responseContentType", js.undefined)
    
    inline def setUseCdn(value: Boolean): Self = StObject.set(x, "useCdn", value.asInstanceOf[js.Any])
    
    inline def setUseCdnUndefined: Self = StObject.set(x, "useCdn", js.undefined)
  }
}
