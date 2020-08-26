package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoOffset extends js.Object {
  var offsetPercentage: js.UndefOr[Double] = js.native
  var offsetSeconds: js.UndefOr[Double] = js.native
}

object VideoOffset {
  @scala.inline
  def apply(): VideoOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoOffset]
  }
  @scala.inline
  implicit class VideoOffsetOps[Self <: VideoOffset] (val x: Self) extends AnyVal {
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
    def setOffsetPercentage(value: Double): Self = this.set("offsetPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetPercentage: Self = this.set("offsetPercentage", js.undefined)
    @scala.inline
    def setOffsetSeconds(value: Double): Self = this.set("offsetSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetSeconds: Self = this.set("offsetSeconds", js.undefined)
  }
  
}

