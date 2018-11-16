package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A method that will handle the splitter's client events concerning manipulations with a pane.
 */

trait ASPxClientSplitterPaneEventArgs extends ASPxClientEventArgs {
  /**
       * Gets the pane object related to the event.
       * Value: An ASPxClientSplitterPane object, manipulations on which forced the event to be raised.
       */
  var pane: ASPxClientSplitterPane
}

