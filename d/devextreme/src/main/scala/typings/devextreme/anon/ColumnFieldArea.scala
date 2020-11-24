package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnFieldArea extends js.Object {
  
  var columnFieldArea: js.UndefOr[String] = js.native
  
  var dataFieldArea: js.UndefOr[String] = js.native
  
  var filterFieldArea: js.UndefOr[String] = js.native
  
  var rowFieldArea: js.UndefOr[String] = js.native
}
object ColumnFieldArea {
  
  @scala.inline
  def apply(): ColumnFieldArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFieldArea]
  }
  
  @scala.inline
  implicit class ColumnFieldAreaOps[Self <: ColumnFieldArea] (val x: Self) extends AnyVal {
    
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
    def setColumnFieldArea(value: String): Self = this.set("columnFieldArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnFieldArea: Self = this.set("columnFieldArea", js.undefined)
    
    @scala.inline
    def setDataFieldArea(value: String): Self = this.set("dataFieldArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFieldArea: Self = this.set("dataFieldArea", js.undefined)
    
    @scala.inline
    def setFilterFieldArea(value: String): Self = this.set("filterFieldArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterFieldArea: Self = this.set("filterFieldArea", js.undefined)
    
    @scala.inline
    def setRowFieldArea(value: String): Self = this.set("rowFieldArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowFieldArea: Self = this.set("rowFieldArea", js.undefined)
  }
}
