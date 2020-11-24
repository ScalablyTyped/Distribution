package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorStyleSettingsHighlightSettings extends js.Object {
  
  /** Contains the border properties for highlighting rectangle.
    */
  var border: js.UndefOr[NavigatorStyleSettingsHighlightSettingsBorder] = js.native
  
  /** To set the color to the highlight.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Enable the highlight settings in range navigator.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  
  /** To set the opacity to the highlight.
    * @Default {0.5}
    */
  var opacity: js.UndefOr[Double] = js.native
}
object NavigatorStyleSettingsHighlightSettings {
  
  @scala.inline
  def apply(): NavigatorStyleSettingsHighlightSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorStyleSettingsHighlightSettings]
  }
  
  @scala.inline
  implicit class NavigatorStyleSettingsHighlightSettingsOps[Self <: NavigatorStyleSettingsHighlightSettings] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: NavigatorStyleSettingsHighlightSettingsBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
}
