package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Major extends js.Object {
  var major: js.UndefOr[Double] = js.native
  var minor: js.UndefOr[Double] = js.native
}

object Major {
  @scala.inline
  def apply(): Major = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Major]
  }
  @scala.inline
  implicit class MajorOps[Self <: Major] (val x: Self) extends AnyVal {
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
    def setMajor(value: Double): Self = this.set("major", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajor: Self = this.set("major", js.undefined)
    @scala.inline
    def setMinor(value: Double): Self = this.set("minor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinor: Self = this.set("minor", js.undefined)
  }
  
}

