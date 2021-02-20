package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
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
  implicit class ASPxClientUploadControlDropZoneEnterEventArgsMutableBuilder[Self <: ASPxClientUploadControlDropZoneEnterEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropZone(value: js.Any): Self = StObject.set(x, "dropZone", value.asInstanceOf[js.Any])
  }
}
