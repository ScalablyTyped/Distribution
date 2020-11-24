package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionSettings extends js.Object {
  
  /** Shows or hides the create, edit and delete options in data source pane with the help of ej.ReportDesigner.Permission enum.
    * @Default {ej.ReportDesigner.Permission.All}
    */
  var dataSource: js.UndefOr[Permission | String] = js.native
}
object PermissionSettings {
  
  @scala.inline
  def apply(): PermissionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionSettings]
  }
  
  @scala.inline
  implicit class PermissionSettingsOps[Self <: PermissionSettings] (val x: Self) extends AnyVal {
    
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
    def setDataSource(value: Permission | String): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
  }
}
