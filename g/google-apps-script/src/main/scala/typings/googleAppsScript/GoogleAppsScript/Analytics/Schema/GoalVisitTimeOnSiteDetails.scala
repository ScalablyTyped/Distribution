package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoalVisitTimeOnSiteDetails extends js.Object {
  var comparisonType: js.UndefOr[String] = js.native
  var comparisonValue: js.UndefOr[String] = js.native
}

object GoalVisitTimeOnSiteDetails {
  @scala.inline
  def apply(): GoalVisitTimeOnSiteDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoalVisitTimeOnSiteDetails]
  }
  @scala.inline
  implicit class GoalVisitTimeOnSiteDetailsOps[Self <: GoalVisitTimeOnSiteDetails] (val x: Self) extends AnyVal {
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
    def setComparisonType(value: String): Self = this.set("comparisonType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparisonType: Self = this.set("comparisonType", js.undefined)
    @scala.inline
    def setComparisonValue(value: String): Self = this.set("comparisonValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparisonValue: Self = this.set("comparisonValue", js.undefined)
  }
  
}

