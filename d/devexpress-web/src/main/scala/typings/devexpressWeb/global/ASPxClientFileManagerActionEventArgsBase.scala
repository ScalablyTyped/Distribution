package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as a base for classes that are used as arguments for events generated on the client side.
  */
@JSGlobal("ASPxClientFileManagerActionEventArgsBase")
@js.native
class ASPxClientFileManagerActionEventArgsBase protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFileManagerActionEventArgsBase {
  /**
    * Initializes a new instance of the ASPxClientFileManagerActionEventArgsBase class with the specified settings.
    * @param fullName A string value that specifies the new full item's name. Initializes the ASPxClientFileManagerActionEventArgsBase.fullName property.
    * @param name A string value that specifies the item's name. Initializes the ASPxClientFileManagerActionEventArgsBase.name property.
    * @param isFolder true if the processed  item is a folder; otherwise, false. Initializes the ASPxClientFileManagerActionEventArgsBase.isFolder property.
    */
  def this(fullName: String, name: String, isFolder: Boolean) = this()
  
  /**
    * Gets the full name of the item currently being processed.
    */
  /* CompleteClass */
  var fullName: String = js.native
  
  /**
    * Gets a value specifying whether the current processed item is a folder.
    */
  /* CompleteClass */
  var isFolder: Boolean = js.native
  
  /**
    * Gets the name of the currently processed item.
    */
  /* CompleteClass */
  var name: String = js.native
}
