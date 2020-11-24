package typings.googleCloudCommon.serviceObjectMod

import typings.googleCloudCommon.utilMod.BodyResponseCallback
import typings.googleCloudCommon.utilMod.DecorateRequestOptions
import typings.teenyRequest.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceObjectParent extends js.Object {
  
  def getRequestInterceptors(): js.Array[js.Function] = js.native
  
  var interceptors: js.Array[Interceptor] = js.native
  
  def request(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit = js.native
  
  def requestStream(reqOpts: DecorateRequestOptions): Request = js.native
}
object ServiceObjectParent {
  
  @scala.inline
  def apply(
    getRequestInterceptors: () => js.Array[js.Function],
    interceptors: js.Array[Interceptor],
    request: (DecorateRequestOptions, BodyResponseCallback) => Unit,
    requestStream: DecorateRequestOptions => Request
  ): ServiceObjectParent = {
    val __obj = js.Dynamic.literal(getRequestInterceptors = js.Any.fromFunction0(getRequestInterceptors), interceptors = interceptors.asInstanceOf[js.Any], request = js.Any.fromFunction2(request), requestStream = js.Any.fromFunction1(requestStream))
    __obj.asInstanceOf[ServiceObjectParent]
  }
  
  @scala.inline
  implicit class ServiceObjectParentOps[Self <: ServiceObjectParent] (val x: Self) extends AnyVal {
    
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
    def setGetRequestInterceptors(value: () => js.Array[js.Function]): Self = this.set("getRequestInterceptors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInterceptorsVarargs(value: Interceptor*): Self = this.set("interceptors", js.Array(value :_*))
    
    @scala.inline
    def setInterceptors(value: js.Array[Interceptor]): Self = this.set("interceptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: (DecorateRequestOptions, BodyResponseCallback) => Unit): Self = this.set("request", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRequestStream(value: DecorateRequestOptions => Request): Self = this.set("requestStream", js.Any.fromFunction1(value))
  }
}
