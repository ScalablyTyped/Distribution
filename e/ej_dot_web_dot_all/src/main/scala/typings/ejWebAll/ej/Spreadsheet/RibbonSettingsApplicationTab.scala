package typings.ejWebAll.ej.Spreadsheet

import typings.ejWebAll.ej.Ribbon.ApplicationTabType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RibbonSettingsApplicationTab extends js.Object {
  
  /** Gets or sets an object that indicates menu settings for application tab in Spreadsheet.
    */
  var menuSettings: js.UndefOr[RibbonSettingsApplicationTabMenuSettings] = js.native
  
  /** Gets or sets a value that indicates to set application tab type in Spreadsheet. It has two types, Menu and Backstage.
    * @Default {ej.Ribbon.ApplicationTabType.Backstage}
    */
  var `type`: js.UndefOr[ApplicationTabType | String] = js.native
}
object RibbonSettingsApplicationTab {
  
  @scala.inline
  def apply(): RibbonSettingsApplicationTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RibbonSettingsApplicationTab]
  }
  
  @scala.inline
  implicit class RibbonSettingsApplicationTabOps[Self <: RibbonSettingsApplicationTab] (val x: Self) extends AnyVal {
    
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
    def setMenuSettings(value: RibbonSettingsApplicationTabMenuSettings): Self = this.set("menuSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuSettings: Self = this.set("menuSettings", js.undefined)
    
    @scala.inline
    def setType(value: ApplicationTabType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
