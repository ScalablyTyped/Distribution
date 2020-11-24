package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridMapping extends js.Object {
  
  var dataField: js.UndefOr[String] = js.native
  
  var totalRecordsField: js.UndefOr[String] = js.native
}
object GridMapping {
  
  @scala.inline
  def apply(): GridMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridMapping]
  }
  
  @scala.inline
  implicit class GridMappingOps[Self <: GridMapping] (val x: Self) extends AnyVal {
    
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
    def setDataField(value: String): Self = this.set("dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataField: Self = this.set("dataField", js.undefined)
    
    @scala.inline
    def setTotalRecordsField(value: String): Self = this.set("totalRecordsField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalRecordsField: Self = this.set("totalRecordsField", js.undefined)
  }
}
