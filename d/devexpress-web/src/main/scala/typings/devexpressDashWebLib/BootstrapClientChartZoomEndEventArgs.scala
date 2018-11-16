package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the ZoomEnd event.
 */

trait BootstrapClientChartZoomEndEventArgs extends BootstrapUIWidgetEventArgsBase {
  /**
       * The value that became the end of the argument axis after zooming or scrolling ended.
       * Value: An object specifying the end of the argument axis.
       */
  var rangeEnd: js.Object
  /**
       * The value that became the start of the argument axis after zooming or scrolling ended.
       * Value: An object specifying the start of the argument axis.
       */
  var rangeStart: js.Object
}

