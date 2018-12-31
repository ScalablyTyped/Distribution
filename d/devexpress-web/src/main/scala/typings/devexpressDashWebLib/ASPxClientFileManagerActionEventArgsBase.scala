package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for classes that are used as arguments for events generated on the client side.
  */
trait ASPxClientFileManagerActionEventArgsBase extends ASPxClientEventArgs {
  /**
    * Gets the full name of the item currently being processed.
    * Value: A string value that is the item's full name.
    */
  var fullName: java.lang.String
  /**
    * Gets a value specifying whether the current processed item is a folder.
    * Value: true if the processed  item is a folder; false if the processed item is a file.
    */
  var isFolder: scala.Boolean
  /**
    * Gets the name of the currently processed item.
    * Value: A string value that specifies the item's name.
    */
  var name: java.lang.String
}

