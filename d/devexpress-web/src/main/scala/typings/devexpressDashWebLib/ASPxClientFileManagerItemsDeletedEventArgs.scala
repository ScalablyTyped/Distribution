package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemsDeleted event.
  */
trait ASPxClientFileManagerItemsDeletedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an array of the currently processed items.
    * Value: An array of ASPxClientFileManagerItem objects that are items currently being processed.
    */
  var items: js.Array[ASPxClientFileManagerItem]
}

