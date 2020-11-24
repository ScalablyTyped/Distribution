package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.SelectedTabPageChanged event.
  */
@js.native
trait ASPxClientSelectedTabPageChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the tab page that was selected.
    */
  var PreviousPage: String = js.native
  
  /**
    * Gets the tab page that is selected.
    */
  var SelectedPage: String = js.native
  
  /**
    * Gets the name of the tab container that contains the selected tab page.
    */
  var TabContainerName: String = js.native
}
object ASPxClientSelectedTabPageChangedEventArgs {
  
  @scala.inline
  def apply(PreviousPage: String, SelectedPage: String, TabContainerName: String): ASPxClientSelectedTabPageChangedEventArgs = {
    val __obj = js.Dynamic.literal(PreviousPage = PreviousPage.asInstanceOf[js.Any], SelectedPage = SelectedPage.asInstanceOf[js.Any], TabContainerName = TabContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSelectedTabPageChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientSelectedTabPageChangedEventArgsOps[Self <: ASPxClientSelectedTabPageChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setPreviousPage(value: String): Self = this.set("PreviousPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedPage(value: String): Self = this.set("SelectedPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabContainerName(value: String): Self = this.set("TabContainerName", value.asInstanceOf[js.Any])
  }
}
