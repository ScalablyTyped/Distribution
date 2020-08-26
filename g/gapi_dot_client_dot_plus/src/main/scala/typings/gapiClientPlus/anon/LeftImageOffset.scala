package typings.gapiClientPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeftImageOffset extends js.Object {
  /** The difference between the left position of the cover image and the actual displayed cover image. Only valid for banner layout. */
  var leftImageOffset: js.UndefOr[Double] = js.native
  /** The difference between the top position of the cover image and the actual displayed cover image. Only valid for banner layout. */
  var topImageOffset: js.UndefOr[Double] = js.native
}

object LeftImageOffset {
  @scala.inline
  def apply(): LeftImageOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeftImageOffset]
  }
  @scala.inline
  implicit class LeftImageOffsetOps[Self <: LeftImageOffset] (val x: Self) extends AnyVal {
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
    def setLeftImageOffset(value: Double): Self = this.set("leftImageOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftImageOffset: Self = this.set("leftImageOffset", js.undefined)
    @scala.inline
    def setTopImageOffset(value: Double): Self = this.set("topImageOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopImageOffset: Self = this.set("topImageOffset", js.undefined)
  }
  
}

