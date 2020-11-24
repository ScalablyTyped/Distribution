package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderSettings extends js.Object {
  
  /** Allows you to enable/disable the column header names in the PivotGrid control.
    * @Default {false}
    */
  var showColumnItems: js.UndefOr[Boolean] = js.native
  
  /** Allows you to enable/disable the row header names in the PivotGrid control.
    * @Default {false}
    */
  var showRowItems: js.UndefOr[Boolean] = js.native
}
object HeaderSettings {
  
  @scala.inline
  def apply(): HeaderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderSettings]
  }
  
  @scala.inline
  implicit class HeaderSettingsOps[Self <: HeaderSettings] (val x: Self) extends AnyVal {
    
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
    def setShowColumnItems(value: Boolean): Self = this.set("showColumnItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowColumnItems: Self = this.set("showColumnItems", js.undefined)
    
    @scala.inline
    def setShowRowItems(value: Boolean): Self = this.set("showRowItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRowItems: Self = this.set("showRowItems", js.undefined)
  }
}
