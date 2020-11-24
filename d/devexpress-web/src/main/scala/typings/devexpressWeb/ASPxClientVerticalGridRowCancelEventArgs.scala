package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the cancelable events of a client ASPxVerticalGrid row.
  */
@js.native
trait ASPxClientVerticalGridRowCancelEventArgs extends ASPxClientCancelEventArgs {
  
  /**
    * Gets the processed client row.
    */
  var row: ASPxClientVerticalGridRow = js.native
}
object ASPxClientVerticalGridRowCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, row: ASPxClientVerticalGridRow): ASPxClientVerticalGridRowCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridRowCancelEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientVerticalGridRowCancelEventArgsOps[Self <: ASPxClientVerticalGridRowCancelEventArgs] (val x: Self) extends AnyVal {
    
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
    def setRow(value: ASPxClientVerticalGridRow): Self = this.set("row", value.asInstanceOf[js.Any])
  }
}
