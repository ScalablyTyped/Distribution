package typings.gaugejs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined gaugejs.gaugejs.StaticZoneOptions & {  height :number} */
@js.native
trait StaticZoneOptionsheightnu extends js.Object {
  var height: Double = js.native
  var max: Double = js.native
  var min: Double = js.native
  var strokeStyle: String = js.native
}

object StaticZoneOptionsheightnu {
  @scala.inline
  def apply(height: Double, max: Double, min: Double, strokeStyle: String): StaticZoneOptionsheightnu = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticZoneOptionsheightnu]
  }
  @scala.inline
  implicit class StaticZoneOptionsheightnuOps[Self <: StaticZoneOptionsheightnu] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeStyle(value: String): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
  }
  
}

