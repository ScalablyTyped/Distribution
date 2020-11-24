package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertTableRowsRequest extends js.Object {
  
  var cellLocation: js.UndefOr[TableCellLocation] = js.native
  
  var insertBelow: js.UndefOr[Boolean] = js.native
  
  var number: js.UndefOr[Double] = js.native
  
  var tableObjectId: js.UndefOr[String] = js.native
}
object InsertTableRowsRequest {
  
  @scala.inline
  def apply(): InsertTableRowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertTableRowsRequest]
  }
  
  @scala.inline
  implicit class InsertTableRowsRequestOps[Self <: InsertTableRowsRequest] (val x: Self) extends AnyVal {
    
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
    def setCellLocation(value: TableCellLocation): Self = this.set("cellLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellLocation: Self = this.set("cellLocation", js.undefined)
    
    @scala.inline
    def setInsertBelow(value: Boolean): Self = this.set("insertBelow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertBelow: Self = this.set("insertBelow", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setTableObjectId(value: String): Self = this.set("tableObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableObjectId: Self = this.set("tableObjectId", js.undefined)
  }
}
