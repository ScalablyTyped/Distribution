package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the NodeClick event.
 */

trait BootstrapClientTreeViewNodeClickEventArgs extends BootstrapClientTreeViewNodeProcessingModeEventArgs {
  /**
       * Gets an HTML object that contains the processed Tree View node.
       * Value: An HTML object.
       */
  var htmlElement: js.Object
  /**
       * Gets a DHTML event object that relates to the processed event.
       * Value: A DHTML event object.
       */
  var htmlEvent: js.Object
}

