package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurePaneSettings extends js.Object {
  
  /** Shows or hides the grouped items in the configuration pane with the help of enum ej.ReportDesigner.ConfigureItems
    * @Default {ej.ReportDesigner.ConfigureItems.All}
    */
  var items: js.UndefOr[ConfigureItems | String] = js.native
  
  /** Shows or hides the configuration pane in ReportDesigner control.
    * @Default {true}
    */
  var showConfigurePane: js.UndefOr[Boolean] = js.native
}
object ConfigurePaneSettings {
  
  @scala.inline
  def apply(): ConfigurePaneSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurePaneSettings]
  }
  
  @scala.inline
  implicit class ConfigurePaneSettingsOps[Self <: ConfigurePaneSettings] (val x: Self) extends AnyVal {
    
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
    def setItems(value: ConfigureItems | String): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setShowConfigurePane(value: Boolean): Self = this.set("showConfigurePane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowConfigurePane: Self = this.set("showConfigurePane", js.undefined)
  }
}
