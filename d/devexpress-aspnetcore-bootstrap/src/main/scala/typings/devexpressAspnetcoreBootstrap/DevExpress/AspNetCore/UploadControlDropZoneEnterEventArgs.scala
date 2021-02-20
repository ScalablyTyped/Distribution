package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadControlDropZoneEnterEventArgs extends EventArgs {
  
  val dropZone: js.Any = js.native
}
object UploadControlDropZoneEnterEventArgs {
  
  @scala.inline
  def apply(dropZone: js.Any, sender: Control): UploadControlDropZoneEnterEventArgs = {
    val __obj = js.Dynamic.literal(dropZone = dropZone.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlDropZoneEnterEventArgs]
  }
  
  @scala.inline
  implicit class UploadControlDropZoneEnterEventArgsMutableBuilder[Self <: UploadControlDropZoneEnterEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropZone(value: js.Any): Self = StObject.set(x, "dropZone", value.asInstanceOf[js.Any])
  }
}
