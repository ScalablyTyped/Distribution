package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TrackAxisToolTipEventArgs extends js.Object {
  /** Set this option to true to cancel the event
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** location - Location of the crosshair label in pixels    axisIndex - Index of the axis for which crosshair label is displayed    crossAxis - Instance of the chart axis object
               * for which cross hair label is displayed    currentTrackText - Text to be displayed in crosshair label. Use this option to add custom text in crosshair label
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Instance of the chart model object
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

