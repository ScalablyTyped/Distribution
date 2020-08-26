package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesGradientRadialGradient extends js.Object {
  /** Defines the position of the outermost circle
    * @Default {0}
    */
  var cx: js.UndefOr[Double] = js.native
  /** Defines the outer most circle of the radial gradient
    * @Default {0}
    */
  var cy: js.UndefOr[Double] = js.native
  /** Defines the innermost circle of the radial gradient
    * @Default {0}
    */
  var fx: js.UndefOr[Double] = js.native
  /** Defines the innermost circle of the radial gradient
    * @Default {0}
    */
  var fy: js.UndefOr[Double] = js.native
  /** Defines the different colors and the region of color transitions.
    * @Default {[]}
    */
  var stops: js.UndefOr[js.Array[_]] = js.native
  /** Defines the type of gradient
    * @Default {radial}
    */
  var `type`: js.UndefOr[String] = js.native
}

object NodesGradientRadialGradient {
  @scala.inline
  def apply(): NodesGradientRadialGradient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesGradientRadialGradient]
  }
  @scala.inline
  implicit class NodesGradientRadialGradientOps[Self <: NodesGradientRadialGradient] (val x: Self) extends AnyVal {
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
    def setCx(value: Double): Self = this.set("cx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    @scala.inline
    def setCy(value: Double): Self = this.set("cy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
    @scala.inline
    def setFx(value: Double): Self = this.set("fx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFx: Self = this.set("fx", js.undefined)
    @scala.inline
    def setFy(value: Double): Self = this.set("fy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFy: Self = this.set("fy", js.undefined)
    @scala.inline
    def setStopsVarargs(value: js.Any*): Self = this.set("stops", js.Array(value :_*))
    @scala.inline
    def setStops(value: js.Array[_]): Self = this.set("stops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

