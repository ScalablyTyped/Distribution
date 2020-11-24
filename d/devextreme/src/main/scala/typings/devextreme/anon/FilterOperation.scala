package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterOperation extends js.Object {
  
  var field: js.UndefOr[this.type] = js.native
  
  var filterOperation: js.UndefOr[String] = js.native
  
  var setValue: js.UndefOr[js.Function] = js.native
  
  var value: js.UndefOr[String | Double | typings.std.Date] = js.native
}
object FilterOperation {
  
  @scala.inline
  def apply(): FilterOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOperation]
  }
  
  @scala.inline
  implicit class FilterOperationOps[Self <: FilterOperation] (val x: Self) extends AnyVal {
    
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
    def setField(value: FilterOperation): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFilterOperation(value: String): Self = this.set("filterOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterOperation: Self = this.set("filterOperation", js.undefined)
    
    @scala.inline
    def setSetValue(value: js.Function): Self = this.set("setValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double | typings.std.Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
