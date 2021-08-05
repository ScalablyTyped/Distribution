package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientUploadControl.DropZoneEnter event.
  */
trait ASPxClientUploadControlDropZoneEnterEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a drop zone object related to the processed event.
    */
  var dropZone: js.Any
}
object ASPxClientUploadControlDropZoneEnterEventArgs {
  
  inline def apply(dropZone: js.Any): ASPxClientUploadControlDropZoneEnterEventArgs = {
    val __obj = js.Dynamic.literal(dropZone = dropZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlDropZoneEnterEventArgs]
  }
  
  extension [Self <: ASPxClientUploadControlDropZoneEnterEventArgs](x: Self) {
    
    inline def setDropZone(value: js.Any): Self = StObject.set(x, "dropZone", value.asInstanceOf[js.Any])
  }
}
