package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateItem extends js.Object {
  
  var data: js.UndefOr[CreateItemData] = js.native
  
  var included: js.Array[CreateItemIncluded] = js.native
  
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.native
}
object CreateItem {
  
  @scala.inline
  def apply(included: js.Array[CreateItemIncluded]): CreateItem = {
    val __obj = js.Dynamic.literal(included = included.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItem]
  }
  
  @scala.inline
  implicit class CreateItemOps[Self <: CreateItem] (val x: Self) extends AnyVal {
    
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
    def setIncludedVarargs(value: CreateItemIncluded*): Self = this.set("included", js.Array(value :_*))
    
    @scala.inline
    def setIncluded(value: js.Array[CreateItemIncluded]): Self = this.set("included", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: CreateItemData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setJsonapi(value: JsonApiVersionJsonapi): Self = this.set("jsonapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonapi: Self = this.set("jsonapi", js.undefined)
  }
}
