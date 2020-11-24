package typings.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplaySettings extends js.Object {
  
  /** Allows you to customize the display of the pivot chart and pivot grid widgets in the tabs or tiles.
    * @Default {ej.PivotClient.ControlPlacement.Tab}
    */
  var controlPlacement: js.UndefOr[ControlPlacement | String] = js.native
  
  /** Allows you to set either the chart or grid as the start-up widget.
    * @Default {ej.PivotClient.DefaultView.Grid}
    */
  var defaultView: js.UndefOr[DefaultView | String] = js.native
  
  /** Allows you to switch to full screen view of the pivot chart and the pivot grid from default view in the pivot client.
    * @Default {false}
    */
  var enableFullScreen: js.UndefOr[Boolean] = js.native
  
  /** Enables an option to enhance the space for the pivot grid and pivot chart by hiding the cube browser and the axis element builder.
    * @Default {false}
    */
  var enableTogglePanel: js.UndefOr[Boolean] = js.native
  
  /** Sets the display mode (only chart/only grid/both) in the pivot client.
    * @Default {ej.PivotClient.DisplayMode.ChartAndGrid}
    */
  var mode: js.UndefOr[DisplayMode | String] = js.native
}
object DisplaySettings {
  
  @scala.inline
  def apply(): DisplaySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplaySettings]
  }
  
  @scala.inline
  implicit class DisplaySettingsOps[Self <: DisplaySettings] (val x: Self) extends AnyVal {
    
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
    def setControlPlacement(value: ControlPlacement | String): Self = this.set("controlPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlPlacement: Self = this.set("controlPlacement", js.undefined)
    
    @scala.inline
    def setDefaultView(value: DefaultView | String): Self = this.set("defaultView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultView: Self = this.set("defaultView", js.undefined)
    
    @scala.inline
    def setEnableFullScreen(value: Boolean): Self = this.set("enableFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableFullScreen: Self = this.set("enableFullScreen", js.undefined)
    
    @scala.inline
    def setEnableTogglePanel(value: Boolean): Self = this.set("enableTogglePanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTogglePanel: Self = this.set("enableTogglePanel", js.undefined)
    
    @scala.inline
    def setMode(value: DisplayMode | String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
