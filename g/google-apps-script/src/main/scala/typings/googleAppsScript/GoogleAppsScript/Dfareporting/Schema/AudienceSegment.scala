package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudienceSegment extends js.Object {
  var allocation: js.UndefOr[Double] = js.native
  var id: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
}

object AudienceSegment {
  @scala.inline
  def apply(): AudienceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudienceSegment]
  }
  @scala.inline
  implicit class AudienceSegmentOps[Self <: AudienceSegment] (val x: Self) extends AnyVal {
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
    def setAllocation(value: Double): Self = this.set("allocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocation: Self = this.set("allocation", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

