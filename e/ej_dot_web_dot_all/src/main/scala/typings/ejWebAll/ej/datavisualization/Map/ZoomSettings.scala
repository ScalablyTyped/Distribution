package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomSettings extends js.Object {
  
  /** Specifies animation duration for map shapes while zooming.
    * @Default {600}
    */
  var animationDuration: js.UndefOr[String] = js.native
  
  /** Enables or Disables the zoom on mouse wheel the map.
    * @Default {true}
    */
  var enableMouseWheelZoom: js.UndefOr[Boolean] = js.native
  
  /** Enables or Disables the zooming of map
    * @Default {true}
    */
  var enableZoom: js.UndefOr[Boolean] = js.native
  
  /** Enables or Disables the zoom on selecting the map shape
    * @Default {false}
    */
  var enableZoomOnSelection: js.UndefOr[Boolean] = js.native
  
  /** Specifies the zoom factor for map zoom value.
    * @Default {1}
    */
  var factor: js.UndefOr[Double] = js.native
  
  /** Specifies the zoom level value for which map to be zoomed
    * @Default {1}
    */
  var level: js.UndefOr[Double] = js.native
  
  /** Specifies the maximum zoom level of the map
    * @Default {100}
    */
  var maxValue: js.UndefOr[Double] = js.native
  
  /** Specifies the minimum zoomSettings level of the map
    * @Default {1}
    */
  var minValue: js.UndefOr[Double] = js.native
}
object ZoomSettings {
  
  @scala.inline
  def apply(): ZoomSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomSettings]
  }
  
  @scala.inline
  implicit class ZoomSettingsOps[Self <: ZoomSettings] (val x: Self) extends AnyVal {
    
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
    def setAnimationDuration(value: String): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setEnableMouseWheelZoom(value: Boolean): Self = this.set("enableMouseWheelZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMouseWheelZoom: Self = this.set("enableMouseWheelZoom", js.undefined)
    
    @scala.inline
    def setEnableZoom(value: Boolean): Self = this.set("enableZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableZoom: Self = this.set("enableZoom", js.undefined)
    
    @scala.inline
    def setEnableZoomOnSelection(value: Boolean): Self = this.set("enableZoomOnSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableZoomOnSelection: Self = this.set("enableZoomOnSelection", js.undefined)
    
    @scala.inline
    def setFactor(value: Double): Self = this.set("factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFactor: Self = this.set("factor", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
  }
}
