package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemsCopied event.
  */
trait ASPxClientFileManagerItemsCopiedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an array of the currently processed items.
    * Value: An array of ASPxClientFileManagerItem objects that are items currently being processed.
    */
  var items: js.Array[ASPxClientFileManagerItem]
  /**
    * Gets the full name of the folder from which items are copied.
    * Value: A string value that specifies the folder's full name.
    */
  var oldFolderFullName: java.lang.String
}

object ASPxClientFileManagerItemsCopiedEventArgs {
  @scala.inline
  def apply(items: js.Array[ASPxClientFileManagerItem], oldFolderFullName: java.lang.String): ASPxClientFileManagerItemsCopiedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("oldFolderFullName")(oldFolderFullName)
    __obj.asInstanceOf[ASPxClientFileManagerItemsCopiedEventArgs]
  }
}

