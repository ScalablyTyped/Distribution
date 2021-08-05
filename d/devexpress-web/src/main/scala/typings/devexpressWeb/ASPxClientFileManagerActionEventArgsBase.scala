package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as a base for classes that are used as arguments for events generated on the client side.
  */
trait ASPxClientFileManagerActionEventArgsBase
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the full name of the item currently being processed.
    */
  var fullName: String
  
  /**
    * Gets a value specifying whether the current processed item is a folder.
    */
  var isFolder: Boolean
  
  /**
    * Gets the name of the currently processed item.
    */
  var name: String
}
object ASPxClientFileManagerActionEventArgsBase {
  
  inline def apply(fullName: String, isFolder: Boolean, name: String): ASPxClientFileManagerActionEventArgsBase = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerActionEventArgsBase]
  }
  
  extension [Self <: ASPxClientFileManagerActionEventArgsBase](x: Self) {
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setIsFolder(value: Boolean): Self = StObject.set(x, "isFolder", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
