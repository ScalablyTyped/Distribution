package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulerSettings extends js.Object {
  
  /** Defines the appearance of horizontal ruler
    */
  var horizontalRuler: js.UndefOr[RulerSettingsHorizontalRuler] = js.native
  
  /** Enables or disables both the horizontal and vertical ruler.
    * @Default {false}
    */
  var showRulers: js.UndefOr[Boolean] = js.native
  
  /** Defines the appearance of vertical ruler
    */
  var verticalRuler: js.UndefOr[RulerSettingsVerticalRuler] = js.native
}
object RulerSettings {
  
  @scala.inline
  def apply(): RulerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RulerSettings]
  }
  
  @scala.inline
  implicit class RulerSettingsOps[Self <: RulerSettings] (val x: Self) extends AnyVal {
    
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
    def setHorizontalRuler(value: RulerSettingsHorizontalRuler): Self = this.set("horizontalRuler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalRuler: Self = this.set("horizontalRuler", js.undefined)
    
    @scala.inline
    def setShowRulers(value: Boolean): Self = this.set("showRulers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRulers: Self = this.set("showRulers", js.undefined)
    
    @scala.inline
    def setVerticalRuler(value: RulerSettingsVerticalRuler): Self = this.set("verticalRuler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalRuler: Self = this.set("verticalRuler", js.undefined)
  }
}
