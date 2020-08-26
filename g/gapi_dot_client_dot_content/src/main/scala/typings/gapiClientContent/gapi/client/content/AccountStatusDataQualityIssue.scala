package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountStatusDataQualityIssue extends js.Object {
  /** Country for which this issue is reported. */
  var country: js.UndefOr[String] = js.native
  /** A more detailed description of the issue. */
  var detail: js.UndefOr[String] = js.native
  /** Actual value displayed on the landing page. */
  var displayedValue: js.UndefOr[String] = js.native
  /** Example items featuring the issue. */
  var exampleItems: js.UndefOr[js.Array[AccountStatusExampleItem]] = js.native
  /** Issue identifier. */
  var id: js.UndefOr[String] = js.native
  /** Last time the account was checked for this issue. */
  var lastChecked: js.UndefOr[String] = js.native
  /** The attribute name that is relevant for the issue. */
  var location: js.UndefOr[String] = js.native
  /** Number of items in the account found to have the said issue. */
  var numItems: js.UndefOr[Double] = js.native
  /** Severity of the problem. */
  var severity: js.UndefOr[String] = js.native
  /** Submitted value that causes the issue. */
  var submittedValue: js.UndefOr[String] = js.native
}

object AccountStatusDataQualityIssue {
  @scala.inline
  def apply(): AccountStatusDataQualityIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountStatusDataQualityIssue]
  }
  @scala.inline
  implicit class AccountStatusDataQualityIssueOps[Self <: AccountStatusDataQualityIssue] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setDisplayedValue(value: String): Self = this.set("displayedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayedValue: Self = this.set("displayedValue", js.undefined)
    @scala.inline
    def setExampleItemsVarargs(value: AccountStatusExampleItem*): Self = this.set("exampleItems", js.Array(value :_*))
    @scala.inline
    def setExampleItems(value: js.Array[AccountStatusExampleItem]): Self = this.set("exampleItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExampleItems: Self = this.set("exampleItems", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLastChecked(value: String): Self = this.set("lastChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastChecked: Self = this.set("lastChecked", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setNumItems(value: Double): Self = this.set("numItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumItems: Self = this.set("numItems", js.undefined)
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    @scala.inline
    def setSubmittedValue(value: String): Self = this.set("submittedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmittedValue: Self = this.set("submittedValue", js.undefined)
  }
  
}

