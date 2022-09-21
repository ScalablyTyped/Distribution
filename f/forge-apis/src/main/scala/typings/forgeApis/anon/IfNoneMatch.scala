package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfNoneMatch extends StObject {
  
  var acceptEncoding: js.UndefOr[String] = js.undefined
  
  var ifModifiedSince: js.UndefOr[js.Date] = js.undefined
  
  var ifNoneMatch: js.UndefOr[String] = js.undefined
  
  var range: js.UndefOr[String] = js.undefined
}
object IfNoneMatch {
  
  inline def apply(): IfNoneMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IfNoneMatch]
  }
  
  extension [Self <: IfNoneMatch](x: Self) {
    
    inline def setAcceptEncoding(value: String): Self = StObject.set(x, "acceptEncoding", value.asInstanceOf[js.Any])
    
    inline def setAcceptEncodingUndefined: Self = StObject.set(x, "acceptEncoding", js.undefined)
    
    inline def setIfModifiedSince(value: js.Date): Self = StObject.set(x, "ifModifiedSince", value.asInstanceOf[js.Any])
    
    inline def setIfModifiedSinceUndefined: Self = StObject.set(x, "ifModifiedSince", js.undefined)
    
    inline def setIfNoneMatch(value: String): Self = StObject.set(x, "ifNoneMatch", value.asInstanceOf[js.Any])
    
    inline def setIfNoneMatchUndefined: Self = StObject.set(x, "ifNoneMatch", js.undefined)
    
    inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
