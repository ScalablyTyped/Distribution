package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for cancellable events which concern manipulations on groups.
  */
@js.native
trait ASPxClientNavBarGroupCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  
  /**
    * Gets the group object related to the event.
    */
  var group: ASPxClientNavBarGroup = js.native
}
object ASPxClientNavBarGroupCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, group: ASPxClientNavBarGroup, processOnServer: Boolean): ASPxClientNavBarGroupCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBarGroupCancelEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientNavBarGroupCancelEventArgsOps[Self <: ASPxClientNavBarGroupCancelEventArgs] (val x: Self) extends AnyVal {
    
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
    def setGroup(value: ASPxClientNavBarGroup): Self = this.set("group", value.asInstanceOf[js.Any])
  }
}
