package typings.googleapisCommon.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIRequestParams[T] extends js.Object {
  
  var context: APIRequestContext = js.native
  
  var mediaUrl: js.UndefOr[String | Null] = js.native
  
  var options: MethodOptions = js.native
  
  var params: T = js.native
  
  var pathParams: js.Array[String] = js.native
  
  var requiredParams: js.Array[String] = js.native
}
object APIRequestParams {
  
  @scala.inline
  def apply[T](
    context: APIRequestContext,
    options: MethodOptions,
    params: T,
    pathParams: js.Array[String],
    requiredParams: js.Array[String]
  ): APIRequestParams[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], pathParams = pathParams.asInstanceOf[js.Any], requiredParams = requiredParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIRequestParams[T]]
  }
  
  @scala.inline
  implicit class APIRequestParamsOps[Self <: APIRequestParams[_], T] (val x: Self with APIRequestParams[T]) extends AnyVal {
    
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
    def setContext(value: APIRequestContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: MethodOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: T): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathParamsVarargs(value: String*): Self = this.set("pathParams", js.Array(value :_*))
    
    @scala.inline
    def setPathParams(value: js.Array[String]): Self = this.set("pathParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredParamsVarargs(value: String*): Self = this.set("requiredParams", js.Array(value :_*))
    
    @scala.inline
    def setRequiredParams(value: js.Array[String]): Self = this.set("requiredParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUrl(value: String): Self = this.set("mediaUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaUrl: Self = this.set("mediaUrl", js.undefined)
    
    @scala.inline
    def setMediaUrlNull: Self = this.set("mediaUrl", null)
  }
}
