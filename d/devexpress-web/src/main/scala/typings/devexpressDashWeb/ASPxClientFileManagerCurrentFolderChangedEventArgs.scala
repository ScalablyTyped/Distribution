package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CurrentFolderChanged event.
  */
trait ASPxClientFileManagerCurrentFolderChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the full name of the folder currently being processed.
    * Value: A string value that is the folder's full name.
    */
  var fullName: String
  /**
    * Gets the name of the currently processed folder.
    * Value: A string value that specifies the folder's name.
    */
  var name: String
}

object ASPxClientFileManagerCurrentFolderChangedEventArgs {
  @scala.inline
  def apply(fullName: String, name: String): ASPxClientFileManagerCurrentFolderChangedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName, name = name)
  
    __obj.asInstanceOf[ASPxClientFileManagerCurrentFolderChangedEventArgs]
  }
}

