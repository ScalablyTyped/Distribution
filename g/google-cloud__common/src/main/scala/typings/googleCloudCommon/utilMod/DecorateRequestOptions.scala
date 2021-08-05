package typings.googleCloudCommon.utilMod

import typings.googleCloudCommon.serviceObjectMod.Interceptor
import typings.teenyRequest.mod.CoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecorateRequestOptions
  extends StObject
     with CoreOptions {
  
  var autoPaginate: js.UndefOr[Boolean] = js.undefined
  
  var autoPaginateVal: js.UndefOr[Boolean] = js.undefined
  
  var interceptors_ : js.UndefOr[js.Array[Interceptor]] = js.undefined
  
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  var objectMode: js.UndefOr[Boolean] = js.undefined
  
  var shouldReturnStream: js.UndefOr[Boolean] = js.undefined
  
  var uri: String
}
object DecorateRequestOptions {
  
  inline def apply(uri: String): DecorateRequestOptions = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorateRequestOptions]
  }
  
  extension [Self <: DecorateRequestOptions](x: Self) {
    
    inline def setAutoPaginate(value: Boolean): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
    
    inline def setAutoPaginateUndefined: Self = StObject.set(x, "autoPaginate", js.undefined)
    
    inline def setAutoPaginateVal(value: Boolean): Self = StObject.set(x, "autoPaginateVal", value.asInstanceOf[js.Any])
    
    inline def setAutoPaginateValUndefined: Self = StObject.set(x, "autoPaginateVal", js.undefined)
    
    inline def setInterceptors_(value: js.Array[Interceptor]): Self = StObject.set(x, "interceptors_", value.asInstanceOf[js.Any])
    
    inline def setInterceptors_Undefined: Self = StObject.set(x, "interceptors_", js.undefined)
    
    inline def setInterceptors_Varargs(value: Interceptor*): Self = StObject.set(x, "interceptors_", js.Array(value :_*))
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    
    inline def setShouldReturnStream(value: Boolean): Self = StObject.set(x, "shouldReturnStream", value.asInstanceOf[js.Any])
    
    inline def setShouldReturnStreamUndefined: Self = StObject.set(x, "shouldReturnStream", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
