package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotHeader extends js.Object {
  
  var pivotHeaderEntries: js.UndefOr[js.Array[PivotHeaderEntry]] = js.native
  
  var totalPivotGroupsCount: js.UndefOr[Double] = js.native
}
object PivotHeader {
  
  @scala.inline
  def apply(): PivotHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotHeader]
  }
  
  @scala.inline
  implicit class PivotHeaderOps[Self <: PivotHeader] (val x: Self) extends AnyVal {
    
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
    def setPivotHeaderEntriesVarargs(value: PivotHeaderEntry*): Self = this.set("pivotHeaderEntries", js.Array(value :_*))
    
    @scala.inline
    def setPivotHeaderEntries(value: js.Array[PivotHeaderEntry]): Self = this.set("pivotHeaderEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotHeaderEntries: Self = this.set("pivotHeaderEntries", js.undefined)
    
    @scala.inline
    def setTotalPivotGroupsCount(value: Double): Self = this.set("totalPivotGroupsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalPivotGroupsCount: Self = this.set("totalPivotGroupsCount", js.undefined)
  }
}
