package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Chart control.
  */
trait BootstrapClientChart extends BootstrapClientChartBase {
  /**
    * Fires when a chart zooming or scrolling ends.
    */
  var ZoomEnd: ASPxClientEvent[BootstrapClientChartZoomEndEventHandler[BootstrapClientChart]]
  /**
    * Fires when a chart zooming or scrolling begins.
    */
  var ZoomStart: ASPxClientEvent[BootstrapClientChartZoomStartEventHandler[BootstrapClientChart]]
}

