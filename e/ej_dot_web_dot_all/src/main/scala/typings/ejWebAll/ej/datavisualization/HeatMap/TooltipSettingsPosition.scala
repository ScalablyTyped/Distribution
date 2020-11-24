package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipSettingsPosition extends js.Object {
  
  /** Sets the arrow position again popup.
    */
  var stem: js.UndefOr[TooltipSettingsPositionStem] = js.native
  
  /** Sets the Tooltip position against target.
    */
  var target: js.UndefOr[TooltipSettingsPositionTarget] = js.native
}
object TooltipSettingsPosition {
  
  @scala.inline
  def apply(): TooltipSettingsPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipSettingsPosition]
  }
  
  @scala.inline
  implicit class TooltipSettingsPositionOps[Self <: TooltipSettingsPosition] (val x: Self) extends AnyVal {
    
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
    def setStem(value: TooltipSettingsPositionStem): Self = this.set("stem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStem: Self = this.set("stem", js.undefined)
    
    @scala.inline
    def setTarget(value: TooltipSettingsPositionTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
