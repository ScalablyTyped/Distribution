package typings.ejDotWebDotAll.ej.datavisualization.Chart

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
  var fill: js.UndefOr[String] = js.undefined
  /** The URL for the Image to be displayed as marker. In order to display image as marker, set series.marker.shape as â€˜imageâ€™.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /** Opacity of the marker.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies the shape of the marker.
    * @Default {circle. See Shape}
    */
  var shape: js.UndefOr[Shape | String] = js.undefined
  /** Options for customizing the size of the marker shape.
    */
  var size: js.UndefOr[CommonSeriesOptionsMarkerSize] = js.undefined
  /** Controls the visibility of the marker shape.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object CommonSeriesOptionsMarker {
  @scala.inline
  def apply(
    border: CommonSeriesOptionsMarkerBorder = null,
    dataLabel: CommonSeriesOptionsMarkerDataLabel = null,
    fill: String = null,
    imageUrl: String = null,
    opacity: Int | Double = null,
    shape: Shape | String = null,
    size: CommonSeriesOptionsMarkerSize = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): CommonSeriesOptionsMarker = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (dataLabel != null) __obj.updateDynamic("dataLabel")(dataLabel)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[CommonSeriesOptionsMarker]
  }
}

