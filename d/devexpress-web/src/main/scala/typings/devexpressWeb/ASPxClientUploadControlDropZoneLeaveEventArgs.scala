package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientUploadControl.DropZoneLeave event.
  */
trait ASPxClientUploadControlDropZoneLeaveEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a drop zone object related to the processed event.
    */
  var dropZone: js.Any
}
object ASPxClientUploadControlDropZoneLeaveEventArgs {
  
  @scala.inline
  def apply(dropZone: js.Any): ASPxClientUploadControlDropZoneLeaveEventArgs = {
    val __obj = js.Dynamic.literal(dropZone = dropZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlDropZoneLeaveEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientUploadControlDropZoneLeaveEventArgsMutableBuilder[Self <: ASPxClientUploadControlDropZoneLeaveEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropZone(value: js.Any): Self = StObject.set(x, "dropZone", value.asInstanceOf[js.Any])
  }
}
