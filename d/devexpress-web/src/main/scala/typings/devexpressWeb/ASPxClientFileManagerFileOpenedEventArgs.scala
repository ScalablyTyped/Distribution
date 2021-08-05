package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.SelectedFileOpened event.
  */
trait ASPxClientFileManagerFileOpenedEventArgs
  extends StObject
     with ASPxClientFileManagerFileEventArgs {
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  var processOnServer: Boolean
}
object ASPxClientFileManagerFileOpenedEventArgs {
  
  inline def apply(file: ASPxClientFileManagerFile, processOnServer: Boolean): ASPxClientFileManagerFileOpenedEventArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFileOpenedEventArgs]
  }
  
  extension [Self <: ASPxClientFileManagerFileOpenedEventArgs](x: Self) {
    
    inline def setProcessOnServer(value: Boolean): Self = StObject.set(x, "processOnServer", value.asInstanceOf[js.Any])
  }
}
