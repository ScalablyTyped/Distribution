package typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs

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
  var content: js.UndefOr[String] = js.undefined
  /** Set the dockPosition value for navigation control
    * @Default {centerleft}
    */
  var dockPosition: js.UndefOr[Position | String] = js.undefined
  /** Enables or Disables the Navigation for handling zooming map
    * @Default {false}
    */
  var enableNavigation: js.UndefOr[Boolean] = js.undefined
  /** Set the orientation value for navigation control
    * @Default {vertical}
    */
  var orientation: js.UndefOr[LabelOrientation | String] = js.undefined
}

object NavigationControl {
  @scala.inline
  def apply(
    absolutePosition: js.Any = null,
    content: String = null,
    dockPosition: Position | String = null,
    enableNavigation: js.UndefOr[Boolean] = js.undefined,
    orientation: LabelOrientation | String = null
  ): NavigationControl = {
    val __obj = js.Dynamic.literal()
    if (absolutePosition != null) __obj.updateDynamic("absolutePosition")(absolutePosition)
    if (content != null) __obj.updateDynamic("content")(content)
    if (dockPosition != null) __obj.updateDynamic("dockPosition")(dockPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNavigation)) __obj.updateDynamic("enableNavigation")(enableNavigation)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationControl]
  }
}

