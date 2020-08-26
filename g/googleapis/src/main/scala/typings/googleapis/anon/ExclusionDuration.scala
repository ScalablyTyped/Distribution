package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExclusionDuration extends js.Object {
  var exclusionDuration: js.UndefOr[String] = js.native
  var segment: js.UndefOr[String] = js.native
}

object ExclusionDuration {
  @scala.inline
  def apply(): ExclusionDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExclusionDuration]
  }
  @scala.inline
  implicit class ExclusionDurationOps[Self <: ExclusionDuration] (val x: Self) extends AnyVal {
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
    def setExclusionDuration(value: String): Self = this.set("exclusionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusionDuration: Self = this.set("exclusionDuration", js.undefined)
    @scala.inline
    def setSegment(value: String): Self = this.set("segment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
  }
  
}

