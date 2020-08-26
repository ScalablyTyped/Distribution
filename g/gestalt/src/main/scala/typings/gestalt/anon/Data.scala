package typings.gestalt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: js.Any = js.native
  var isMeasuring: js.UndefOr[Boolean] = js.native
  var itemIdx: js.UndefOr[Double] = js.native
}

object Data {
  @scala.inline
  def apply(data: js.Any): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMeasuring(value: Boolean): Self = this.set("isMeasuring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMeasuring: Self = this.set("isMeasuring", js.undefined)
    @scala.inline
    def setItemIdx(value: Double): Self = this.set("itemIdx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemIdx: Self = this.set("itemIdx", js.undefined)
  }
  
}

