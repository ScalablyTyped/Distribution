package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearScrollParams extends GenericParams {
  
  var scrollId: NameList = js.native
}
object ClearScrollParams {
  
  @scala.inline
  def apply(scrollId: NameList): ClearScrollParams = {
    val __obj = js.Dynamic.literal(scrollId = scrollId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearScrollParams]
  }
  
  @scala.inline
  implicit class ClearScrollParamsOps[Self <: ClearScrollParams] (val x: Self) extends AnyVal {
    
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
    def setScrollIdVarargs(value: String*): Self = this.set("scrollId", js.Array(value :_*))
    
    @scala.inline
    def setScrollId(value: NameList): Self = this.set("scrollId", value.asInstanceOf[js.Any])
  }
}
