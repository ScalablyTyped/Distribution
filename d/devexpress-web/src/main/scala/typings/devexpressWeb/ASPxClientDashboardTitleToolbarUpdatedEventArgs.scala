package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.DashboardTitleToolbarUpdated event.
  */
@js.native
trait ASPxClientDashboardTitleToolbarUpdatedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Provides access to dashboard title options.
    */
  var Options: js.Any = js.native
}
object ASPxClientDashboardTitleToolbarUpdatedEventArgs {
  
  @scala.inline
  def apply(Options: js.Any): ASPxClientDashboardTitleToolbarUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardTitleToolbarUpdatedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardTitleToolbarUpdatedEventArgsOps[Self <: ASPxClientDashboardTitleToolbarUpdatedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: js.Any): Self = this.set("Options", value.asInstanceOf[js.Any])
  }
}
