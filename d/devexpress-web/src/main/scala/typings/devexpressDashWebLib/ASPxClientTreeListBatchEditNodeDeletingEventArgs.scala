package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the BatchEditNodeDeleting event.
 */

trait ASPxClientTreeListBatchEditNodeDeletingEventArgs extends ASPxClientCancelEventArgs {
  /**
       * Gets the processed node's key value.
       * Value: A String value that identifies the processed node.
       */
  var nodeKey: java.lang.String
  /**
       * Gets the value of the processed cell.
       * Value: A String value that identifies the node values.
       */
  var nodeValues: js.Object
}

