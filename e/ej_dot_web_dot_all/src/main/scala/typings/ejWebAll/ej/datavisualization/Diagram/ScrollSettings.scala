package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSettings extends js.Object {
  /** Allows to read the zoom value of diagram
    * @Default {0}
    */
  var currentZoom: js.UndefOr[Double] = js.undefined
  /** Sets the horizontal scroll offset
    * @Default {0}
    */
  var horizontalOffset: js.UndefOr[Double] = js.undefined
  /** Allows to extend the scrollable region that is based on the scroll limit
    * @Default {{left: 0, right: 0, top:0, bottom: 0}}
    */
  var padding: js.UndefOr[js.Any] = js.undefined
  /** Sets the vertical scroll offset
    * @Default {0}
    */
  var verticalOffset: js.UndefOr[Double] = js.undefined
  /** Allows to read the view port height of the diagram
    * @Default {0}
    */
  var viewPortHeight: js.UndefOr[Double] = js.undefined
  /** Allows to read the view port width of the diagram
    * @Default {0}
    */
  var viewPortWidth: js.UndefOr[Double] = js.undefined
}

object ScrollSettings {
  @scala.inline
  def apply(
    currentZoom: js.UndefOr[Double] = js.undefined,
    horizontalOffset: js.UndefOr[Double] = js.undefined,
    padding: js.Any = null,
    verticalOffset: js.UndefOr[Double] = js.undefined,
    viewPortHeight: js.UndefOr[Double] = js.undefined,
    viewPortWidth: js.UndefOr[Double] = js.undefined
  ): ScrollSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentZoom)) __obj.updateDynamic("currentZoom")(currentZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalOffset)) __obj.updateDynamic("horizontalOffset")(horizontalOffset.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalOffset)) __obj.updateDynamic("verticalOffset")(verticalOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewPortHeight)) __obj.updateDynamic("viewPortHeight")(viewPortHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewPortWidth)) __obj.updateDynamic("viewPortWidth")(viewPortWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollSettings]
  }
}

