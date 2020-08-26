package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicSegment extends js.Object {
  var name: js.UndefOr[String] = js.native
  var sessionSegment: js.UndefOr[SegmentDefinition] = js.native
  var userSegment: js.UndefOr[SegmentDefinition] = js.native
}

object DynamicSegment {
  @scala.inline
  def apply(): DynamicSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicSegment]
  }
  @scala.inline
  implicit class DynamicSegmentOps[Self <: DynamicSegment] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSessionSegment(value: SegmentDefinition): Self = this.set("sessionSegment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionSegment: Self = this.set("sessionSegment", js.undefined)
    @scala.inline
    def setUserSegment(value: SegmentDefinition): Self = this.set("userSegment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserSegment: Self = this.set("userSegment", js.undefined)
  }
  
}

