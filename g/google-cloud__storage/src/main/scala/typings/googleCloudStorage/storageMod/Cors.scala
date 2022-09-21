package typings.googleCloudStorage.storageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cors extends StObject {
  
  var maxAgeSeconds: js.UndefOr[Double] = js.undefined
  
  var method: js.UndefOr[js.Array[String]] = js.undefined
  
  var origin: js.UndefOr[js.Array[String]] = js.undefined
  
  var responseHeader: js.UndefOr[js.Array[String]] = js.undefined
}
object Cors {
  
  inline def apply(): Cors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cors]
  }
  
  extension [Self <: Cors](x: Self) {
    
    inline def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
    
    inline def setMethod(value: js.Array[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMethodVarargs(value: String*): Self = StObject.set(x, "method", js.Array(value*))
    
    inline def setOrigin(value: js.Array[String]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOriginVarargs(value: String*): Self = StObject.set(x, "origin", js.Array(value*))
    
    inline def setResponseHeader(value: js.Array[String]): Self = StObject.set(x, "responseHeader", value.asInstanceOf[js.Any])
    
    inline def setResponseHeaderUndefined: Self = StObject.set(x, "responseHeader", js.undefined)
    
    inline def setResponseHeaderVarargs(value: String*): Self = StObject.set(x, "responseHeader", js.Array(value*))
  }
}
