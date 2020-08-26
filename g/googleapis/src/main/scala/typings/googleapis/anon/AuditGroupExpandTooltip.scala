package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditGroupExpandTooltip extends js.Object {
  var auditGroupExpandTooltip: js.UndefOr[String] = js.native
  var crcInitialNavigation: js.UndefOr[String] = js.native
  var crcLongestDurationLabel: js.UndefOr[String] = js.native
  var errorLabel: js.UndefOr[String] = js.native
  var errorMissingAuditInfo: js.UndefOr[String] = js.native
  var labDataTitle: js.UndefOr[String] = js.native
  var lsPerformanceCategoryDescription: js.UndefOr[String] = js.native
  var manualAuditsGroupTitle: js.UndefOr[String] = js.native
  var notApplicableAuditsGroupTitle: js.UndefOr[String] = js.native
  var opportunityResourceColumnLabel: js.UndefOr[String] = js.native
  var opportunitySavingsColumnLabel: js.UndefOr[String] = js.native
  var passedAuditsGroupTitle: js.UndefOr[String] = js.native
  var scorescaleLabel: js.UndefOr[String] = js.native
  var toplevelWarningsMessage: js.UndefOr[String] = js.native
  var varianceDisclaimer: js.UndefOr[String] = js.native
  var warningHeader: js.UndefOr[String] = js.native
}

object AuditGroupExpandTooltip {
  @scala.inline
  def apply(): AuditGroupExpandTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditGroupExpandTooltip]
  }
  @scala.inline
  implicit class AuditGroupExpandTooltipOps[Self <: AuditGroupExpandTooltip] (val x: Self) extends AnyVal {
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
    def setAuditGroupExpandTooltip(value: String): Self = this.set("auditGroupExpandTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuditGroupExpandTooltip: Self = this.set("auditGroupExpandTooltip", js.undefined)
    @scala.inline
    def setCrcInitialNavigation(value: String): Self = this.set("crcInitialNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrcInitialNavigation: Self = this.set("crcInitialNavigation", js.undefined)
    @scala.inline
    def setCrcLongestDurationLabel(value: String): Self = this.set("crcLongestDurationLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrcLongestDurationLabel: Self = this.set("crcLongestDurationLabel", js.undefined)
    @scala.inline
    def setErrorLabel(value: String): Self = this.set("errorLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorLabel: Self = this.set("errorLabel", js.undefined)
    @scala.inline
    def setErrorMissingAuditInfo(value: String): Self = this.set("errorMissingAuditInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMissingAuditInfo: Self = this.set("errorMissingAuditInfo", js.undefined)
    @scala.inline
    def setLabDataTitle(value: String): Self = this.set("labDataTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabDataTitle: Self = this.set("labDataTitle", js.undefined)
    @scala.inline
    def setLsPerformanceCategoryDescription(value: String): Self = this.set("lsPerformanceCategoryDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLsPerformanceCategoryDescription: Self = this.set("lsPerformanceCategoryDescription", js.undefined)
    @scala.inline
    def setManualAuditsGroupTitle(value: String): Self = this.set("manualAuditsGroupTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualAuditsGroupTitle: Self = this.set("manualAuditsGroupTitle", js.undefined)
    @scala.inline
    def setNotApplicableAuditsGroupTitle(value: String): Self = this.set("notApplicableAuditsGroupTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotApplicableAuditsGroupTitle: Self = this.set("notApplicableAuditsGroupTitle", js.undefined)
    @scala.inline
    def setOpportunityResourceColumnLabel(value: String): Self = this.set("opportunityResourceColumnLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpportunityResourceColumnLabel: Self = this.set("opportunityResourceColumnLabel", js.undefined)
    @scala.inline
    def setOpportunitySavingsColumnLabel(value: String): Self = this.set("opportunitySavingsColumnLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpportunitySavingsColumnLabel: Self = this.set("opportunitySavingsColumnLabel", js.undefined)
    @scala.inline
    def setPassedAuditsGroupTitle(value: String): Self = this.set("passedAuditsGroupTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassedAuditsGroupTitle: Self = this.set("passedAuditsGroupTitle", js.undefined)
    @scala.inline
    def setScorescaleLabel(value: String): Self = this.set("scorescaleLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScorescaleLabel: Self = this.set("scorescaleLabel", js.undefined)
    @scala.inline
    def setToplevelWarningsMessage(value: String): Self = this.set("toplevelWarningsMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToplevelWarningsMessage: Self = this.set("toplevelWarningsMessage", js.undefined)
    @scala.inline
    def setVarianceDisclaimer(value: String): Self = this.set("varianceDisclaimer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVarianceDisclaimer: Self = this.set("varianceDisclaimer", js.undefined)
    @scala.inline
    def setWarningHeader(value: String): Self = this.set("warningHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarningHeader: Self = this.set("warningHeader", js.undefined)
  }
  
}

