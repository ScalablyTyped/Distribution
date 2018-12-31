package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationControl extends js.Object {
  /** Set the absolutePosition for navigation control
    * @Default {{x:0,y:0}}
    */
  var absolutePosition: js.UndefOr[js.Any] = js.undefined
  /** Specifies the navigation control template for map
    * @Default {null}
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** Set the dockPosition value for navigation control
    * @Default {centerleft}
    */
  var dockPosition: js.UndefOr[Position | java.lang.String] = js.undefined
  /** Enables or Disables the Navigation for handling zooming map
    * @Default {false}
    */
  var enableNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** Set the orientation value for navigation control
    * @Default {vertical}
    */
  var orientation: js.UndefOr[LabelOrientation | java.lang.String] = js.undefined
}

