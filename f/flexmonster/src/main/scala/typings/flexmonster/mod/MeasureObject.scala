package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeasureObject extends js.Object {
  var aggregation: js.UndefOr[String] = js.native
  var uniqueName: String = js.native
}

object MeasureObject {
  @scala.inline
  def apply(uniqueName: String): MeasureObject = {
    val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureObject]
  }
  @scala.inline
  implicit class MeasureObjectOps[Self <: MeasureObject] (val x: Self) extends AnyVal {
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
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAggregation(value: String): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
  }
  
}

