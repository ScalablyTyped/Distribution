package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.CurrentFolderChanged event.
  */
@JSGlobal("ASPxClientFileManagerCurrentFolderChangedEventArgs")
@js.native
class ASPxClientFileManagerCurrentFolderChangedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFileManagerCurrentFolderChangedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerCurrentFolderChangedEventArgs class with the specified settings.
    * @param name A string value that specifies the folder's name. Initializes the ASPxClientFileManagerCurrentFolderChangedEventArgs.name property.
    * @param fullName A string value that specifies the folder's full name. Initializes the ASPxClientFileManagerCurrentFolderChangedEventArgs.fullName property.
    */
  def this(name: String, fullName: String) = this()
  
  /**
    * Gets the full name of the folder currently being processed.
    */
  /* CompleteClass */
  var fullName: String = js.native
  
  /**
    * Gets the name of the currently processed folder.
    */
  /* CompleteClass */
  var name: String = js.native
}
