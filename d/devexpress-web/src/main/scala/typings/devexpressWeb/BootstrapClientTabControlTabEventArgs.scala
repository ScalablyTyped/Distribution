package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to manipulations on tabs.
  */
@js.native
trait BootstrapClientTabControlTabEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the tab object related to the event.
    */
  var tab: BootstrapClientTab = js.native
}
object BootstrapClientTabControlTabEventArgs {
  
  @scala.inline
  def apply(tab: BootstrapClientTab): BootstrapClientTabControlTabEventArgs = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTabControlTabEventArgs]
  }
  
  @scala.inline
  implicit class BootstrapClientTabControlTabEventArgsOps[Self <: BootstrapClientTabControlTabEventArgs] (val x: Self) extends AnyVal {
    
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
    def setTab(value: BootstrapClientTab): Self = this.set("tab", value.asInstanceOf[js.Any])
  }
}
