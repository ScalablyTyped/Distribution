package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tooltip extends js.Object {
  
  /** enable showCustomLabelTooltip of circular gauge
    * @Default {false}
    */
  var showCustomLabelTooltip: js.UndefOr[Boolean] = js.native
  
  /** enable showLabelTooltip of circular gauge
    * @Default {false}
    */
  var showLabelTooltip: js.UndefOr[Boolean] = js.native
  
  /** Specify tooltip templateID of circular gauge
    * @Default {false}
    */
  var templateID: js.UndefOr[String] = js.native
}
object Tooltip {
  
  @scala.inline
  def apply(): Tooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tooltip]
  }
  
  @scala.inline
  implicit class TooltipOps[Self <: Tooltip] (val x: Self) extends AnyVal {
    
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
    def setShowCustomLabelTooltip(value: Boolean): Self = this.set("showCustomLabelTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCustomLabelTooltip: Self = this.set("showCustomLabelTooltip", js.undefined)
    
    @scala.inline
    def setShowLabelTooltip(value: Boolean): Self = this.set("showLabelTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLabelTooltip: Self = this.set("showLabelTooltip", js.undefined)
    
    @scala.inline
    def setTemplateID(value: String): Self = this.set("templateID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateID: Self = this.set("templateID", js.undefined)
  }
}
