package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesContainer extends js.Object {
  /** Defines the orientation of the container. Applicable, if the group is a container.
    * @Default {vertical}
    */
  var orientation: js.UndefOr[String] = js.native
  /** Sets the type of the container. Applicable if the group is a container.
    * @Default {ej.datavisualization.Diagram.ContainerType.Canvas}
    */
  var `type`: js.UndefOr[ContainerType | String] = js.native
}

object NodesContainer {
  @scala.inline
  def apply(): NodesContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesContainer]
  }
  @scala.inline
  implicit class NodesContainerOps[Self <: NodesContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setType(value: ContainerType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

