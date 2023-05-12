package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectKey extends StObject {
  
  var `If-Modified-Since`: js.UndefOr[js.Date] = js.undefined
  
  var `If-None-Match`: js.UndefOr[String] = js.undefined
  
  var objectKey: String
  
  var `response-cache-control`: js.UndefOr[String] = js.undefined
  
  var `response-content-disposition`: js.UndefOr[String] = js.undefined
  
  var `response-content-type`: js.UndefOr[String] = js.undefined
}
object ObjectKey {
  
  inline def apply(objectKey: String): ObjectKey = {
    val __obj = js.Dynamic.literal(objectKey = objectKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectKey] (val x: Self) extends AnyVal {
    
    inline def `setIf-Modified-Since`(value: js.Date): Self = StObject.set(x, "If-Modified-Since", value.asInstanceOf[js.Any])
    
    inline def `setIf-Modified-SinceUndefined`: Self = StObject.set(x, "If-Modified-Since", js.undefined)
    
    inline def `setIf-None-Match`(value: String): Self = StObject.set(x, "If-None-Match", value.asInstanceOf[js.Any])
    
    inline def `setIf-None-MatchUndefined`: Self = StObject.set(x, "If-None-Match", js.undefined)
    
    inline def setObjectKey(value: String): Self = StObject.set(x, "objectKey", value.asInstanceOf[js.Any])
    
    inline def `setResponse-cache-control`(value: String): Self = StObject.set(x, "response-cache-control", value.asInstanceOf[js.Any])
    
    inline def `setResponse-cache-controlUndefined`: Self = StObject.set(x, "response-cache-control", js.undefined)
    
    inline def `setResponse-content-disposition`(value: String): Self = StObject.set(x, "response-content-disposition", value.asInstanceOf[js.Any])
    
    inline def `setResponse-content-dispositionUndefined`: Self = StObject.set(x, "response-content-disposition", js.undefined)
    
    inline def `setResponse-content-type`(value: String): Self = StObject.set(x, "response-content-type", value.asInstanceOf[js.Any])
    
    inline def `setResponse-content-typeUndefined`: Self = StObject.set(x, "response-content-type", js.undefined)
  }
}
