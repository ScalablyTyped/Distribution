package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadControlDropZoneEnterEventArgs
  extends StObject
     with EventArgs {
  
  val dropZone: Any
}
object UploadControlDropZoneEnterEventArgs {
  
  inline def apply(dropZone: Any, sender: Control): UploadControlDropZoneEnterEventArgs = {
    val __obj = js.Dynamic.literal(dropZone = dropZone.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlDropZoneEnterEventArgs]
  }
  
  extension [Self <: UploadControlDropZoneEnterEventArgs](x: Self) {
    
    inline def setDropZone(value: Any): Self = StObject.set(x, "dropZone", value.asInstanceOf[js.Any])
  }
}
