package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatMapCell extends js.Object {
  
  /** Specifies whether the cell color can be visible or not.
    * @Default {true}
    */
  var showColor: js.UndefOr[Boolean] = js.native
  
  /** Specifies whether the cell content can be visible or not.
    * @Default {ej.HeatMap.CellVisibility.Visible}
    */
  var showContent: js.UndefOr[CellVisibility | String] = js.native
}
object HeatMapCell {
  
  @scala.inline
  def apply(): HeatMapCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatMapCell]
  }
  
  @scala.inline
  implicit class HeatMapCellOps[Self <: HeatMapCell] (val x: Self) extends AnyVal {
    
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
    def setShowColor(value: Boolean): Self = this.set("showColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowColor: Self = this.set("showColor", js.undefined)
    
    @scala.inline
    def setShowContent(value: CellVisibility | String): Self = this.set("showContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowContent: Self = this.set("showContent", js.undefined)
  }
}
