package typings.googleCloudCommon.utilMod

import typings.googleCloudCommon.serviceObjectMod.Interceptor
import typings.teenyRequest.mod.CoreOptions
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
  implicit class DecorateRequestOptionsOps[Self <: DecorateRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPaginate(value: Boolean): Self = this.set("autoPaginate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPaginate: Self = this.set("autoPaginate", js.undefined)
    
    @scala.inline
    def setAutoPaginateVal(value: Boolean): Self = this.set("autoPaginateVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPaginateVal: Self = this.set("autoPaginateVal", js.undefined)
    
    @scala.inline
    def setInterceptors_Varargs(value: Interceptor*): Self = this.set("interceptors_", js.Array(value :_*))
    
    @scala.inline
    def setInterceptors_(value: js.Array[Interceptor]): Self = this.set("interceptors_", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterceptors_ : Self = this.set("interceptors_", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setObjectMode(value: Boolean): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectMode: Self = this.set("objectMode", js.undefined)
    
    @scala.inline
    def setShouldReturnStream(value: Boolean): Self = this.set("shouldReturnStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldReturnStream: Self = this.set("shouldReturnStream", js.undefined)
  }
}
