package typings.expressVersionRequest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetVersionByQueryParamOptions extends js.Object {
  
  var removeQueryParam: Boolean = js.native
}
object SetVersionByQueryParamOptions {
  
  @scala.inline
  def apply(removeQueryParam: Boolean): SetVersionByQueryParamOptions = {
    val __obj = js.Dynamic.literal(removeQueryParam = removeQueryParam.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVersionByQueryParamOptions]
  }
  
  @scala.inline
  implicit class SetVersionByQueryParamOptionsOps[Self <: SetVersionByQueryParamOptions] (val x: Self) extends AnyVal {
    
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
    def setRemoveQueryParam(value: Boolean): Self = this.set("removeQueryParam", value.asInstanceOf[js.Any])
  }
}
