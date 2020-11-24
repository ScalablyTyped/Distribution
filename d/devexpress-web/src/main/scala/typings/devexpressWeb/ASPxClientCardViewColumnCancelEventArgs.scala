package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the cancelable events of a client ASPxCardView column.
  */
@js.native
trait ASPxClientCardViewColumnCancelEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Gets the processed client column.
    */
  var column: ASPxClientCardViewColumn = js.native
}
object ASPxClientCardViewColumnCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, column: ASPxClientCardViewColumn): ASPxClientCardViewColumnCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewColumnCancelEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCardViewColumnCancelEventArgsOps[Self <: ASPxClientCardViewColumnCancelEventArgs] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: ASPxClientCardViewColumn): Self = this.set("column", value.asInstanceOf[js.Any])
  }
}
