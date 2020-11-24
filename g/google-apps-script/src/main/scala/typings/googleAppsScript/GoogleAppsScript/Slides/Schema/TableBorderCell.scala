package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableBorderCell extends js.Object {
  
  var location: js.UndefOr[TableCellLocation] = js.native
  
  var tableBorderProperties: js.UndefOr[TableBorderProperties] = js.native
}
object TableBorderCell {
  
  @scala.inline
  def apply(): TableBorderCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderCell]
  }
  
  @scala.inline
  implicit class TableBorderCellOps[Self <: TableBorderCell] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: TableCellLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setTableBorderProperties(value: TableBorderProperties): Self = this.set("tableBorderProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBorderProperties: Self = this.set("tableBorderProperties", js.undefined)
  }
}
