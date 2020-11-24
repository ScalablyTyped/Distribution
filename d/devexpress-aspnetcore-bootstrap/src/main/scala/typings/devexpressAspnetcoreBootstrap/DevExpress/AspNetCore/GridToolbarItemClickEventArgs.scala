package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridToolbarItemClickEventArgs extends ProcessingModeEventArgs {
  
  val item: BootstrapMenuItem = js.native
  
  val toolbarIndex: Double = js.native
  
  val toolbarName: String = js.native
  
  var usePostBack: Boolean = js.native
}
object GridToolbarItemClickEventArgs {
  
  @scala.inline
  def apply(
    item: BootstrapMenuItem,
    processOnServer: Boolean,
    sender: Control,
    toolbarIndex: Double,
    toolbarName: String,
    usePostBack: Boolean
  ): GridToolbarItemClickEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], toolbarIndex = toolbarIndex.asInstanceOf[js.Any], toolbarName = toolbarName.asInstanceOf[js.Any], usePostBack = usePostBack.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridToolbarItemClickEventArgs]
  }
  
  @scala.inline
  implicit class GridToolbarItemClickEventArgsOps[Self <: GridToolbarItemClickEventArgs] (val x: Self) extends AnyVal {
    
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
    def setItem(value: BootstrapMenuItem): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarIndex(value: Double): Self = this.set("toolbarIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarName(value: String): Self = this.set("toolbarName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePostBack(value: Boolean): Self = this.set("usePostBack", value.asInstanceOf[js.Any])
  }
}
