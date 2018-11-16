package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the BatchEditEndEditing event.
 */

trait ASPxClientGridViewBatchEditEndEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
       * Gets a hashtable that maintains information about editable cells.
       * Value: A hashtable that stores information about editable cells.
       */
  var rowValues: js.Object
  /**
       * Gets the visible index of the row whose cells has been edited.
       * Value: An <see cref="Int32" /> value that specifies the visible index of the row.
       */
  var visibleIndex: scala.Double
}

