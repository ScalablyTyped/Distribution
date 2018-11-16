package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides base data for the client-side events.
 */

trait BootstrapUIWidgetEventArgsBase extends ASPxClientEventArgs {
  /**
       * The widget instance.
       * Value: An object specifying the widget instance.
       */
  var component: js.Object
  /**
       * The widget's container.
       * Value: An object specifying the widget's container.
       */
  var element: js.Object
}

