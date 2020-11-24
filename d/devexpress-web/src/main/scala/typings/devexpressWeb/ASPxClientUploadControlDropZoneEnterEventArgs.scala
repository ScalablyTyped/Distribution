package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientUploadControl.DropZoneEnter event.
  */
@js.native
trait ASPxClientUploadControlDropZoneEnterEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a drop zone object related to the processed event.
    */
  var dropZone: js.Any = js.native
}
object ASPxClientUploadControlDropZoneEnterEventArgs {
  
  @scala.inline
  def apply(dropZone: js.Any): ASPxClientUploadControlDropZoneEnterEventArgs = {
    val __obj = js.Dynamic.literal(dropZone = dropZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlDropZoneEnterEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientUploadControlDropZoneEnterEventArgsOps[Self <: ASPxClientUploadControlDropZoneEnterEventArgs] (val x: Self) extends AnyVal {
    
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
    def setDropZone(value: js.Any): Self = this.set("dropZone", value.asInstanceOf[js.Any])
  }
}
