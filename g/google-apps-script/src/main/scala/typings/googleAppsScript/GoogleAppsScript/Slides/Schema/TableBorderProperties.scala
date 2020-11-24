package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableBorderProperties extends js.Object {
  
  var dashStyle: js.UndefOr[String] = js.native
  
  var tableBorderFill: js.UndefOr[TableBorderFill] = js.native
  
  var weight: js.UndefOr[Dimension] = js.native
}
object TableBorderProperties {
  
  @scala.inline
  def apply(): TableBorderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderProperties]
  }
  
  @scala.inline
  implicit class TableBorderPropertiesOps[Self <: TableBorderProperties] (val x: Self) extends AnyVal {
    
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
    def setDashStyle(value: String): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    
    @scala.inline
    def setTableBorderFill(value: TableBorderFill): Self = this.set("tableBorderFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBorderFill: Self = this.set("tableBorderFill", js.undefined)
    
    @scala.inline
    def setWeight(value: Dimension): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
