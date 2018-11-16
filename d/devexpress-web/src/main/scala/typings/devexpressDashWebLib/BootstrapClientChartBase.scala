package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of the BootstrapChartBase class.
 */

trait BootstrapClientChartBase extends BootstrapUIWidgetBase {
  /**
       * Fires when a user clicks a label on the argument axis.
       */
  var ArgumentAxisClick: ASPxClientEvent[
    BootstrapClientCoordinateSystemChartArgumentAxisClickEventHandler[BootstrapClientChartBase]
  ]
  /**
       * Fires when the Series and Points chart elements are ready to be accessed.
       */
  var Done: ASPxClientEvent[BootstrapClientChartBaseDoneEventHandler[BootstrapClientChartBase]]
  /**
       * Fires when an item on the chart legend is clicked.
       */
  var LegendClick: ASPxClientEvent[BootstrapClientChartBaseLegendClickEventHandler[BootstrapClientChartBase]]
  /**
       * Fires when a user clicks a series point.
       */
  var PointClick: ASPxClientEvent[BootstrapClientChartBasePointClickEventHandler[BootstrapClientChartBase]]
  /**
       * Fires when the hover state of a series point has been changed.
       */
  var PointHoverChanged: ASPxClientEvent[BootstrapClientChartBasePointHoverChangedEventHandler[BootstrapClientChartBase]]
  /**
       * Fires when the selection state of a series point has been changed.
       */
  var PointSelectionChanged: ASPxClientEvent[
    BootstrapClientChartBasePointSelectionChangedEventHandler[BootstrapClientChartBase]
  ]
  /**
       * Fires when a user clicks a series.
       */
  var SeriesClick: ASPxClientEvent[
    BootstrapClientCoordinateSystemChartSeriesClickEventHandler[BootstrapClientChartBase]
  ]
  /**
       * Fires when the hover state of a series has been changed.
       */
  var SeriesHoverChanged: ASPxClientEvent[
    BootstrapClientCoordinateSystemChartSeriesHoverChangedEventHandler[BootstrapClientChartBase]
  ]
  /**
       * Fires when the selection state of a series has been changed.
       */
  var SeriesSelectionChanged: ASPxClientEvent[
    BootstrapClientCoordinateSystemChartSeriesSelectionChangedEventHandler[BootstrapClientChartBase]
  ]
  /**
       * Fires when a point's tooltip becomes hidden.
       */
  var TooltipHidden: ASPxClientEvent[BootstrapClientChartBaseTooltipHiddenEventHandler[BootstrapClientChartBase]]
  /**
       * Fires when a point's tooltip appears.
       */
  var TooltipShown: ASPxClientEvent[BootstrapClientChartBaseTooltipShownEventHandler[BootstrapClientChartBase]]
}

