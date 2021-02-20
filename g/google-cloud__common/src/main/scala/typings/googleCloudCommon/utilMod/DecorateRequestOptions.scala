package typings.googleCloudCommon.utilMod

import typings.googleCloudCommon.serviceObjectMod.Interceptor
import typings.teenyRequest.mod.CoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecorateRequestOptions extends CoreOptions {
  
  var autoPaginate: js.UndefOr[Boolean] = js.native
  
  var autoPaginateVal: js.UndefOr[Boolean] = js.native
  
  var interceptors_ : js.UndefOr[js.Array[Interceptor]] = js.native
  
  var maxRetries: js.UndefOr[Double] = js.native
  
  var objectMode: js.UndefOr[Boolean] = js.native
  
  var shouldReturnStream: js.UndefOr[Boolean] = js.native
  
  var uri: String = js.native
}
object DecorateRequestOptions {
  
  @scala.inline
  def apply(uri: String): DecorateRequestOptions = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorateRequestOptions]
  }
  
  @scala.inline
  implicit class DecorateRequestOptionsMutableBuilder[Self <: DecorateRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoPaginate(value: Boolean): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPaginateUndefined: Self = StObject.set(x, "autoPaginate", js.undefined)
    
    @scala.inline
    def setAutoPaginateVal(value: Boolean): Self = StObject.set(x, "autoPaginateVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPaginateValUndefined: Self = StObject.set(x, "autoPaginateVal", js.undefined)
    
    @scala.inline
    def setInterceptors_(value: js.Array[Interceptor]): Self = StObject.set(x, "interceptors_", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterceptors_Undefined: Self = StObject.set(x, "interceptors_", js.undefined)
    
    @scala.inline
    def setInterceptors_Varargs(value: Interceptor*): Self = StObject.set(x, "interceptors_", js.Array(value :_*))
    
    @scala.inline
    def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    @scala.inline
    def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    
    @scala.inline
    def setShouldReturnStream(value: Boolean): Self = StObject.set(x, "shouldReturnStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldReturnStreamUndefined: Self = StObject.set(x, "shouldReturnStream", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
