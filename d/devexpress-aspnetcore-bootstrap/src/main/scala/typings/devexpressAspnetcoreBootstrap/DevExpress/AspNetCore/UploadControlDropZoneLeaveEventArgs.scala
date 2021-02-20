package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadControlDropZoneLeaveEventArgs extends EventArgs {
  
  val dropZone: js.Any = js.native
}
object UploadControlDropZoneLeaveEventArgs {
  
  @scala.inline
  def apply(dropZone: js.Any, sender: Control): UploadControlDropZoneLeaveEventArgs = {
    val __obj = js.Dynamic.literal(dropZone = dropZone.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlDropZoneLeaveEventArgs]
  }
  
  @scala.inline
  implicit class UploadControlDropZoneLeaveEventArgsMutableBuilder[Self <: UploadControlDropZoneLeaveEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropZone(value: js.Any): Self = StObject.set(x, "dropZone", value.asInstanceOf[js.Any])
  }
}
