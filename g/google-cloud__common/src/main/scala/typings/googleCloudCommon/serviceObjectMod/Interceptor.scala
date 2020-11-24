package typings.googleCloudCommon.serviceObjectMod

import typings.googleCloudCommon.utilMod.DecorateRequestOptions
import typings.teenyRequest.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interceptor extends js.Object {
  
  def request(opts: Options): DecorateRequestOptions = js.native
}
object Interceptor {
  
  @scala.inline
  def apply(request: Options => DecorateRequestOptions): Interceptor = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
    __obj.asInstanceOf[Interceptor]
  }
  
  @scala.inline
  implicit class InterceptorOps[Self <: Interceptor] (val x: Self) extends AnyVal {
    
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
    def setRequest(value: Options => DecorateRequestOptions): Self = this.set("request", js.Any.fromFunction1(value))
  }
}
