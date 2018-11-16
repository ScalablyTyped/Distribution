package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the client events related to node processing, and allowing the event's processing to be passed to the server side.
 */

trait BootstrapClientTreeViewNodeProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
       * Gets a node object related to the event.
       * Value: A BootstrapClientTreeViewNode object, manipulations on which forced the event to be raised.
       */
  var node: BootstrapClientTreeViewNode
}

