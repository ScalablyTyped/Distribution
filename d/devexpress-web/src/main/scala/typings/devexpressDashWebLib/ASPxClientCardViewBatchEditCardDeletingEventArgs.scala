package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditCardDeleting event.
  */
trait ASPxClientCardViewBatchEditCardDeletingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about deleted cells.
    * Value: A hashtable that stores information about deleted cells.
    */
  var cardValues: js.Object
  /**
    * Gets the processed card visible index.
    * Value: An integer value that specifies the processed card visible index.
    */
  var visibleIndex: scala.Double
}

