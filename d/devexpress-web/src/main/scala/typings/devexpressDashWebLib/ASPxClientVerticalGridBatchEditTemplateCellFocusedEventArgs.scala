package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditTemplateCellFocused event.
  */
trait ASPxClientVerticalGridBatchEditTemplateCellFocusedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value specifying whether the event was handled.
    * Value: true if the event was handled and default processing should not occur; false if the event should be handled using default processing.
    */
  var handled: scala.Boolean
  /**
    * Gets the currently processed row.
    * Value: A <see cref="ASPxClientVerticalGridRow" /> object that is the client-side row object.
    */
  var row: ASPxClientVerticalGridRow
}

