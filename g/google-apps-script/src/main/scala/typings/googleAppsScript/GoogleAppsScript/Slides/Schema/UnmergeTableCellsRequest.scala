package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmergeTableCellsRequest extends js.Object {
  
  var objectId: js.UndefOr[String] = js.native
  
  var tableRange: js.UndefOr[TableRange] = js.native
}
object UnmergeTableCellsRequest {
  
  @scala.inline
  def apply(): UnmergeTableCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmergeTableCellsRequest]
  }
  
  @scala.inline
  implicit class UnmergeTableCellsRequestOps[Self <: UnmergeTableCellsRequest] (val x: Self) extends AnyVal {
    
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
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setTableRange(value: TableRange): Self = this.set("tableRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRange: Self = this.set("tableRange", js.undefined)
  }
}
