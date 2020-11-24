package typings.emberRouting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryParam extends js.Object {
  
  var queryParam: js.Object = js.native
}
object QueryParam {
  
  @scala.inline
  def apply(queryParam: js.Object): QueryParam = {
    val __obj = js.Dynamic.literal(queryParam = queryParam.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParam]
  }
  
  @scala.inline
  implicit class QueryParamOps[Self <: QueryParam] (val x: Self) extends AnyVal {
    
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
    def setQueryParam(value: js.Object): Self = this.set("queryParam", value.asInstanceOf[js.Any])
  }
}
