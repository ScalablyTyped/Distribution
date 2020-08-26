package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterProperties extends js.Object {
  var measure: js.UndefOr[MeasureObject] = js.native
  var members: js.UndefOr[js.Array[FilterItem]] = js.native
  var quantity: js.UndefOr[Double] = js.native
  var `type`: String = js.native
}

object FilterProperties {
  @scala.inline
  def apply(`type`: String): FilterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterProperties]
  }
  @scala.inline
  implicit class FilterPropertiesOps[Self <: FilterProperties] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeasure(value: MeasureObject): Self = this.set("measure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasure: Self = this.set("measure", js.undefined)
    @scala.inline
    def setMembersVarargs(value: FilterItem*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[FilterItem]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
  
}

