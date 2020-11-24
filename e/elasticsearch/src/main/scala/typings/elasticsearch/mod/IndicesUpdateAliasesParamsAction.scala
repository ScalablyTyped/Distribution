package typings.elasticsearch.mod

import typings.elasticsearch.anon.Alias
import typings.elasticsearch.anon.IndexString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesUpdateAliasesParamsAction extends js.Object {
  
  var add: js.UndefOr[Alias] = js.native
  
  var remove: js.UndefOr[typings.elasticsearch.anon.Indices] = js.native
  
  var remove_index: js.UndefOr[IndexString] = js.native
}
object IndicesUpdateAliasesParamsAction {
  
  @scala.inline
  def apply(): IndicesUpdateAliasesParamsAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesUpdateAliasesParamsAction]
  }
  
  @scala.inline
  implicit class IndicesUpdateAliasesParamsActionOps[Self <: IndicesUpdateAliasesParamsAction] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: Alias): Self = this.set("add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setRemove(value: typings.elasticsearch.anon.Indices): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setRemove_index(value: IndexString): Self = this.set("remove_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove_index: Self = this.set("remove_index", js.undefined)
  }
}
