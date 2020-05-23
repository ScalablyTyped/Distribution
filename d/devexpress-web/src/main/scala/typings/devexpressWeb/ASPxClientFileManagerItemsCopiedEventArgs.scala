package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ItemsCopied event.
  */
trait ASPxClientFileManagerItemsCopiedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an array of the currently processed items.
    */
  var items: js.Array[ASPxClientFileManagerItem]
  /**
    * Gets the full name of the folder from which items are copied.
    */
  var oldFolderFullName: String
}

object ASPxClientFileManagerItemsCopiedEventArgs {
  @scala.inline
  def apply(items: js.Array[ASPxClientFileManagerItem], oldFolderFullName: String): ASPxClientFileManagerItemsCopiedEventArgs = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], oldFolderFullName = oldFolderFullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemsCopiedEventArgs]
  }
}

