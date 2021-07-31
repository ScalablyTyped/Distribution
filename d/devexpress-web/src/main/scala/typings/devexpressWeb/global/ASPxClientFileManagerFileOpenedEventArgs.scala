package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.SelectedFileOpened event.
  */
@JSGlobal("ASPxClientFileManagerFileOpenedEventArgs")
@js.native
class ASPxClientFileManagerFileOpenedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFileManagerFileOpenedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerFileOpenedEventArgs class.
    * @param file An ASPxClientFileManagerFile object is the file related to the event.
    */
  def this(file: typings.devexpressWeb.ASPxClientFileManagerFile) = this()
  
  /**
    * Gets a file related to the event.
    */
  /* CompleteClass */
  var file: typings.devexpressWeb.ASPxClientFileManagerFile = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
