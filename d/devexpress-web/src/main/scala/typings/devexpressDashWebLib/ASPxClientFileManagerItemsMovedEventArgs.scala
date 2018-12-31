package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemsMoved event.
  */
trait ASPxClientFileManagerItemsMovedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an array of the currently processed items.
    * Value: An array of ASPxClientFileManagerItem objects that are items currently being processed.
    */
  var items: js.Array[ASPxClientFileManagerItem]
  /**
    * Gets the full name of the folder from which items are moved.
    * Value: A string value that specifies the folder's full name.
    */
  var oldFolderFullName: java.lang.String
}

