package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ItemsDeleted event.
  */
trait ASPxClientFileManagerItemsDeletedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an array of the currently processed items.
    */
  var items: js.Array[ASPxClientFileManagerItem]
}

object ASPxClientFileManagerItemsDeletedEventArgs {
  @scala.inline
  def apply(items: js.Array[ASPxClientFileManagerItem]): ASPxClientFileManagerItemsDeletedEventArgs = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemsDeletedEventArgs]
  }
}

