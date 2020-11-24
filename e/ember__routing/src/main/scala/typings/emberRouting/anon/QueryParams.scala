package typings.emberRouting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryParams extends js.Object {
  
  var queryParams: js.Object = js.native
}
object QueryParams {
  
  @scala.inline
  def apply(queryParams: js.Object): QueryParams = {
    val __obj = js.Dynamic.literal(queryParams = queryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParams]
  }
  
  @scala.inline
  implicit class QueryParamsOps[Self <: QueryParams] (val x: Self) extends AnyVal {
    
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
    def setQueryParams(value: js.Object): Self = this.set("queryParams", value.asInstanceOf[js.Any])
  }
}
