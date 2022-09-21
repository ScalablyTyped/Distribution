package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericParams extends StObject {
  
  var body: js.UndefOr[Any] = js.undefined
  
  var filterPath: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var ignore: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var requestTimeout: js.UndefOr[Double] = js.undefined
}
object GenericParams {
  
  inline def apply(): GenericParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericParams]
  }
  
  extension [Self <: GenericParams](x: Self) {
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setFilterPath(value: String | js.Array[String]): Self = StObject.set(x, "filterPath", value.asInstanceOf[js.Any])
    
    inline def setFilterPathUndefined: Self = StObject.set(x, "filterPath", js.undefined)
    
    inline def setFilterPathVarargs(value: String*): Self = StObject.set(x, "filterPath", js.Array(value*))
    
    inline def setIgnore(value: Double | js.Array[Double]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setIgnoreVarargs(value: Double*): Self = StObject.set(x, "ignore", js.Array(value*))
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
  }
}
