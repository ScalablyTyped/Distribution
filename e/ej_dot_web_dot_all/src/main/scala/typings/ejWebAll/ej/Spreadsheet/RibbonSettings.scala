package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RibbonSettings extends js.Object {
  
  /** Gets or sets an object that indicates application tab settings in Spreadsheet.
    */
  var applicationTab: js.UndefOr[RibbonSettingsApplicationTab] = js.native
}
object RibbonSettings {
  
  @scala.inline
  def apply(): RibbonSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RibbonSettings]
  }
  
  @scala.inline
  implicit class RibbonSettingsOps[Self <: RibbonSettings] (val x: Self) extends AnyVal {
    
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
    def setApplicationTab(value: RibbonSettingsApplicationTab): Self = this.set("applicationTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationTab: Self = this.set("applicationTab", js.undefined)
  }
}
