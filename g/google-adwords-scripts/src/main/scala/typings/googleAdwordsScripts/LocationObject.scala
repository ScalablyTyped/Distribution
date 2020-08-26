package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationObject extends js.Object {
  var bidModifier: js.UndefOr[Double] = js.native
  var id: Double = js.native
}

object LocationObject {
  @scala.inline
  def apply(id: Double): LocationObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationObject]
  }
  @scala.inline
  implicit class LocationObjectOps[Self <: LocationObject] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setBidModifier(value: Double): Self = this.set("bidModifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBidModifier: Self = this.set("bidModifier", js.undefined)
  }
  
}

