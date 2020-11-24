package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client ASPxClientControlCollection.ControlsInitialized event.
  */
@js.native
trait ASPxClientControlsInitializedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a value that specifies whether a callback is sent during a controls initialization.
    */
  var isCallback: Boolean = js.native
}
object ASPxClientControlsInitializedEventArgs {
  
  @scala.inline
  def apply(isCallback: Boolean): ASPxClientControlsInitializedEventArgs = {
    val __obj = js.Dynamic.literal(isCallback = isCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientControlsInitializedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientControlsInitializedEventArgsOps[Self <: ASPxClientControlsInitializedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setIsCallback(value: Boolean): Self = this.set("isCallback", value.asInstanceOf[js.Any])
  }
}
