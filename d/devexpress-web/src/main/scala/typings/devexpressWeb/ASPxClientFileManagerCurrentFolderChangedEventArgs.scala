package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.CurrentFolderChanged event.
  */
trait ASPxClientFileManagerCurrentFolderChangedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the full name of the folder currently being processed.
    */
  var fullName: String
  
  /**
    * Gets the name of the currently processed folder.
    */
  var name: String
}
object ASPxClientFileManagerCurrentFolderChangedEventArgs {
  
  inline def apply(fullName: String, name: String): ASPxClientFileManagerCurrentFolderChangedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerCurrentFolderChangedEventArgs]
  }
  
  extension [Self <: ASPxClientFileManagerCurrentFolderChangedEventArgs](x: Self) {
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
