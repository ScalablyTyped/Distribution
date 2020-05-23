package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.CurrentFolderChanged event.
  */
trait ASPxClientFileManagerCurrentFolderChangedEventArgs extends ASPxClientEventArgs {
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
  @scala.inline
  def apply(fullName: String, name: String): ASPxClientFileManagerCurrentFolderChangedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerCurrentFolderChangedEventArgs]
  }
}

