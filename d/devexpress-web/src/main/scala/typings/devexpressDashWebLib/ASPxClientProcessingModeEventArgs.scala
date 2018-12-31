package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client events which can't be cancelled and allow the event's processing to be passed to the server side.
  */
trait ASPxClientProcessingModeEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    * Value: true to process the event on the server side; false to completely handle it on the client side.
    */
  var processOnServer: scala.Boolean
}

