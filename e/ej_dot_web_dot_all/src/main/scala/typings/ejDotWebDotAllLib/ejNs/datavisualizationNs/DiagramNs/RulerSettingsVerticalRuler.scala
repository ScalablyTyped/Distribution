package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulerSettingsVerticalRuler extends js.Object {
  /** Defines the method which used to position and arrange the tick elements of the vertical ruler.
    * @Default {null}
    */
  var arrangeTick: js.UndefOr[js.Any] = js.undefined
  /** Defines the number of intervals to be present on the each segment of the vertical ruler.
    * @Default {5}
    */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /** Defines the height of the vertical ruler.
    * @Default {null}
    */
  var length: js.UndefOr[scala.Double] = js.undefined
  /** Defines the color of the vertical marker brush.
    * @Default {red}
    */
  var markerColor: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the textual description of the ruler segment, and the appearance of the ruler ticks of the vertical ruler.
    * @Default {100}
    */
  var segmentWidth: js.UndefOr[scala.Double] = js.undefined
  /** Defines the width of the vertical ruler.
    * @Default {25}
    */
  var thickness: js.UndefOr[scala.Double] = js.undefined
  /** Defines and sets the tick alignment of the ruler scale.
    * @Default {ej.datavisualization.Diagram.TickAlignment.RightOrBottom}
    */
  var tickAlignment: js.UndefOr[TickAlignment | java.lang.String] = js.undefined
}

