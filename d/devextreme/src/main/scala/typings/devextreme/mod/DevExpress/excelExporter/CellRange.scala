package typings.devextreme.mod.DevExpress.excelExporter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellRange extends js.Object {
  
  /**
    * [descr:CellRange.from]
    */
  var from: js.UndefOr[CellAddress] = js.native
  
  /**
    * [descr:CellRange.to]
    */
  var to: js.UndefOr[CellAddress] = js.native
}
object CellRange {
  
  @scala.inline
  def apply(): CellRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellRange]
  }
  
  @scala.inline
  implicit class CellRangeOps[Self <: CellRange] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: CellAddress): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setTo(value: CellAddress): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
