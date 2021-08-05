package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ItemCopied event.
  */
trait ASPxClientFileManagerItemCopiedEventArgs
  extends StObject
     with ASPxClientFileManagerActionEventArgsBase {
  
  /**
    * Gets the full name of the folder from which an item is copied.
    */
  var oldFolderFullName: String
}
object ASPxClientFileManagerItemCopiedEventArgs {
  
  inline def apply(fullName: String, isFolder: Boolean, name: String, oldFolderFullName: String): ASPxClientFileManagerItemCopiedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oldFolderFullName = oldFolderFullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemCopiedEventArgs]
  }
  
  extension [Self <: ASPxClientFileManagerItemCopiedEventArgs](x: Self) {
    
    inline def setOldFolderFullName(value: String): Self = StObject.set(x, "oldFolderFullName", value.asInstanceOf[js.Any])
  }
}
