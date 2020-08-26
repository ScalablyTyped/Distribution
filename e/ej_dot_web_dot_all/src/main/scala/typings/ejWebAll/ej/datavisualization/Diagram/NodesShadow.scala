package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesShadow extends js.Object {
  /** Defines the angle of the shadow relative to node
    * @Default {45}
    */
  var angle: js.UndefOr[Double] = js.native
  /** Sets the distance to move the shadow relative to node
    * @Default {5}
    */
  var distance: js.UndefOr[Double] = js.native
  /** Defines the opaque of the shadow
    * @Default {0.7}
    */
  var opacity: js.UndefOr[Double] = js.native
}

object NodesShadow {
  @scala.inline
  def apply(): NodesShadow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesShadow]
  }
  @scala.inline
  implicit class NodesShadowOps[Self <: NodesShadow] (val x: Self) extends AnyVal {
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
  
}

