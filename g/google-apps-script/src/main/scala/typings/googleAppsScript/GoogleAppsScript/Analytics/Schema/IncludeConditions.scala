package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeConditions extends js.Object {
  var daysToLookBack: js.UndefOr[Double] = js.native
  var isSmartList: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var membershipDurationDays: js.UndefOr[Double] = js.native
  var segment: js.UndefOr[String] = js.native
}

object IncludeConditions {
  @scala.inline
  def apply(): IncludeConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeConditions]
  }
  @scala.inline
  implicit class IncludeConditionsOps[Self <: IncludeConditions] (val x: Self) extends AnyVal {
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
    def setDaysToLookBack(value: Double): Self = this.set("daysToLookBack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaysToLookBack: Self = this.set("daysToLookBack", js.undefined)
    @scala.inline
    def setIsSmartList(value: Boolean): Self = this.set("isSmartList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSmartList: Self = this.set("isSmartList", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMembershipDurationDays(value: Double): Self = this.set("membershipDurationDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembershipDurationDays: Self = this.set("membershipDurationDays", js.undefined)
    @scala.inline
    def setSegment(value: String): Self = this.set("segment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
  }
  
}

