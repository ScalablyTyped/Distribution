package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnResizeSettings extends js.Object {
  
  /** Specifies the mode for column resizing
    * @Default {ej.TreeGrid.ColumnResizeMode.Normal}
    */
  var columnResizeMode: js.UndefOr[ColumnResizeMode | String] = js.native
}
object ColumnResizeSettings {
  
  @scala.inline
  def apply(): ColumnResizeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnResizeSettings]
  }
  
  @scala.inline
  implicit class ColumnResizeSettingsOps[Self <: ColumnResizeSettings] (val x: Self) extends AnyVal {
    
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
    def setColumnResizeMode(value: ColumnResizeMode | String): Self = this.set("columnResizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnResizeMode: Self = this.set("columnResizeMode", js.undefined)
  }
}
