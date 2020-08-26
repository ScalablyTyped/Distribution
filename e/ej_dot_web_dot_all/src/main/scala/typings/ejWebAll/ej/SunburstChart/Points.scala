package typings.ejWebAll.ej.SunburstChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Points extends js.Object {
  /** Points fill color of the sunburst.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.native
  /** Points text of the sunburst.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  /** Points x value of the sunburst.
    * @Default {null}
    */
  var x: js.UndefOr[String] = js.native
  /** Points y value of the sunburst.
    * @Default {null}
    */
  var y: js.UndefOr[Double] = js.native
}

object Points {
  @scala.inline
  def apply(): Points = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Points]
  }
  @scala.inline
  implicit class PointsOps[Self <: Points] (val x: Self) extends AnyVal {
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setX(value: String): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

