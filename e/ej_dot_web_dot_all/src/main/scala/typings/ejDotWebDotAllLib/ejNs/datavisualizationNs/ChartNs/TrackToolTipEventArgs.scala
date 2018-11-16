package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TrackToolTipEventArgs extends js.Object {
  /** Set this option to true to cancel the event
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** location - Location of the trackball tooltip in pixels    pointIndex - Index of the point for which trackball tooltip is displayed    seriesIndex - Index of the series in
               * series collection    currentText - Text to be displayed in trackball tooltip. Use this option to add custom text in trackball tooltip    series - Instance of the series object
               * for which trackball tooltip is displayed.
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Instance of the chart model object
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

