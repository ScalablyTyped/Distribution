package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSettings extends js.Object {
  /** Allows to read the zoom value of diagram
    * @Default {0}
    */
  var currentZoom: js.UndefOr[scala.Double] = js.undefined
  /** Sets the horizontal scroll offset
    * @Default {0}
    */
  var horizontalOffset: js.UndefOr[scala.Double] = js.undefined
  /** Allows to extend the scrollable region that is based on the scroll limit
    * @Default {{left: 0, right: 0, top:0, bottom: 0}}
    */
  var padding: js.UndefOr[js.Any] = js.undefined
  /** Sets the vertical scroll offset
    * @Default {0}
    */
  var verticalOffset: js.UndefOr[scala.Double] = js.undefined
  /** Allows to read the view port height of the diagram
    * @Default {0}
    */
  var viewPortHeight: js.UndefOr[scala.Double] = js.undefined
  /** Allows to read the view port width of the diagram
    * @Default {0}
    */
  var viewPortWidth: js.UndefOr[scala.Double] = js.undefined
}

object ScrollSettings {
  @scala.inline
  def apply(
    currentZoom: scala.Int | scala.Double = null,
    horizontalOffset: scala.Int | scala.Double = null,
    padding: js.Any = null,
    verticalOffset: scala.Int | scala.Double = null,
    viewPortHeight: scala.Int | scala.Double = null,
    viewPortWidth: scala.Int | scala.Double = null
  ): ScrollSettings = {
    val __obj = js.Dynamic.literal()
    if (currentZoom != null) __obj.updateDynamic("currentZoom")(currentZoom.asInstanceOf[js.Any])
    if (horizontalOffset != null) __obj.updateDynamic("horizontalOffset")(horizontalOffset.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (verticalOffset != null) __obj.updateDynamic("verticalOffset")(verticalOffset.asInstanceOf[js.Any])
    if (viewPortHeight != null) __obj.updateDynamic("viewPortHeight")(viewPortHeight.asInstanceOf[js.Any])
    if (viewPortWidth != null) __obj.updateDynamic("viewPortWidth")(viewPortWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollSettings]
  }
}

