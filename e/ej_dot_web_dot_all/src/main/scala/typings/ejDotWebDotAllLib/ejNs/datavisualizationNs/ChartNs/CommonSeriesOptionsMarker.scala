package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommonSeriesOptionsMarker extends js.Object {
  /** Options for customizing the border of the marker shape.
               */
  var border: js.UndefOr[CommonSeriesOptionsMarkerBorder] = js.undefined
  /** Options for displaying and customizing data labels.
               */
  var dataLabel: js.UndefOr[CommonSeriesOptionsMarkerDataLabel] = js.undefined
  /** Color of the marker shape.
               * @Default {null}
               */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** The URL for the Image to be displayed as marker. In order to display image as marker, set series.marker.shape as â€˜imageâ€™.
               */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Opacity of the marker.
               * @Default {1}
               */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the shape of the marker.
               * @Default {circle. See Shape}
               */
  var shape: js.UndefOr[Shape | java.lang.String] = js.undefined
  /** Options for customizing the size of the marker shape.
               */
  var size: js.UndefOr[CommonSeriesOptionsMarkerSize] = js.undefined
  /** Controls the visibility of the marker shape.
               * @Default {false}
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

