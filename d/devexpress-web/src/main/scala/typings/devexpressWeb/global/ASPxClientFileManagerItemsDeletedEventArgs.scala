package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ItemsDeleted event.
  */
@JSGlobal("ASPxClientFileManagerItemsDeletedEventArgs")
@js.native
class ASPxClientFileManagerItemsDeletedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientFileManagerItemsDeletedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerItemsDeletedEventArgs object.
    * @param items An array of ASPxClientFileManagerItem objects that are items currently being processed.
    */
  def this(items: js.Array[typings.devexpressWeb.ASPxClientFileManagerItem]) = this()
  /**
    * Gets an array of the currently processed items.
    */
  /* CompleteClass */
  override var items: js.Array[typings.devexpressWeb.ASPxClientFileManagerItem] = js.native
}

