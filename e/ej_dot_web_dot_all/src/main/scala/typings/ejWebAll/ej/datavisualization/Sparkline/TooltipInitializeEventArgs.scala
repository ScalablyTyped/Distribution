package typings.ejWebAll.ej.datavisualization.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipInitializeEventArgs extends js.Object {
  
  /** Set this option to true to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Text to be displayed in trackball tooltip. Use this option to add custom text in trackball tooltip
    */
  var currentText: js.UndefOr[String] = js.native
  
  /** X Location of the trackball tooltip in pixels
    */
  var locationX: js.UndefOr[js.Any] = js.native
  
  /** Y Location of the trackball tooltip in pixels
    */
  var locationY: js.UndefOr[js.Any] = js.native
  
  /** Instance of the sparkline model object
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Index of the point for which trackball tooltip is displayed
    */
  var pointIndex: js.UndefOr[Double] = js.native
  
  /** Name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}
object TooltipInitializeEventArgs {
  
  @scala.inline
  def apply(): TooltipInitializeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipInitializeEventArgs]
  }
  
  @scala.inline
  implicit class TooltipInitializeEventArgsOps[Self <: TooltipInitializeEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setCurrentText(value: String): Self = this.set("currentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentText: Self = this.set("currentText", js.undefined)
    
    @scala.inline
    def setLocationX(value: js.Any): Self = this.set("locationX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationX: Self = this.set("locationX", js.undefined)
    
    @scala.inline
    def setLocationY(value: js.Any): Self = this.set("locationY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationY: Self = this.set("locationY", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setPointIndex(value: Double): Self = this.set("pointIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointIndex: Self = this.set("pointIndex", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
