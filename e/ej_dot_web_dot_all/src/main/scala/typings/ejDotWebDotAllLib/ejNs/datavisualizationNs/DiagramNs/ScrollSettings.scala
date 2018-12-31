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

