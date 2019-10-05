package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesContainer extends js.Object {
  /** Defines the orientation of the container. Applicable, if the group is a container.
    * @Default {vertical}
    */
  var orientation: js.UndefOr[String] = js.undefined
  /** Sets the type of the container. Applicable if the group is a container.
    * @Default {ej.datavisualization.Diagram.ContainerType.Canvas}
    */
  var `type`: js.UndefOr[ContainerType | String] = js.undefined
}

object NodesContainer {
  @scala.inline
  def apply(orientation: String = null, `type`: ContainerType | String = null): NodesContainer = {
    val __obj = js.Dynamic.literal()
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesContainer]
  }
}

