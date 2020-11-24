package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalFormat extends js.Object {
  
  var column: js.UndefOr[Double] = js.native
  
  var format: js.UndefOr[Style] = js.native
  
  var formatCSS: js.UndefOr[String] = js.native
  
  var formula: js.UndefOr[String] = js.native
  
  var hierarchy: js.UndefOr[String] = js.native
  
  var isTotal: js.UndefOr[Double] = js.native
  
  var measureName: js.UndefOr[String] = js.native
  
  var member: js.UndefOr[String] = js.native
  
  var row: js.UndefOr[Double] = js.native
}
object ConditionalFormat {
  
  @scala.inline
  def apply(): ConditionalFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormat]
  }
  
  @scala.inline
  implicit class ConditionalFormatOps[Self <: ConditionalFormat] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setFormat(value: Style): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatCSS(value: String): Self = this.set("formatCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatCSS: Self = this.set("formatCSS", js.undefined)
    
    @scala.inline
    def setFormula(value: String): Self = this.set("formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormula: Self = this.set("formula", js.undefined)
    
    @scala.inline
    def setHierarchy(value: String): Self = this.set("hierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHierarchy: Self = this.set("hierarchy", js.undefined)
    
    @scala.inline
    def setIsTotal(value: Double): Self = this.set("isTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTotal: Self = this.set("isTotal", js.undefined)
    
    @scala.inline
    def setMeasureName(value: String): Self = this.set("measureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureName: Self = this.set("measureName", js.undefined)
    
    @scala.inline
    def setMember(value: String): Self = this.set("member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMember: Self = this.set("member", js.undefined)
    
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
  }
}
