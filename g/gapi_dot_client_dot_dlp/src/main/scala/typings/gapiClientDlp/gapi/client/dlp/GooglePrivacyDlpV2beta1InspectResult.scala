package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1InspectResult extends js.Object {
  /** List of findings for an item. */
  var findings: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Finding]] = js.native
  /**
    * If true, then this item might have more findings than were returned,
    * and the findings returned are an arbitrary subset of all findings.
    * The findings list might be truncated because the input items were too
    * large, or because the server reached the maximum amount of resources
    * allowed for a single API call. For best results, divide the input into
    * smaller batches.
    */
  var findingsTruncated: js.UndefOr[Boolean] = js.native
}

object GooglePrivacyDlpV2beta1InspectResult {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1InspectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InspectResult]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1InspectResultOps[Self <: GooglePrivacyDlpV2beta1InspectResult] (val x: Self) extends AnyVal {
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
    def setFindingsVarargs(value: GooglePrivacyDlpV2beta1Finding*): Self = this.set("findings", js.Array(value :_*))
    @scala.inline
    def setFindings(value: js.Array[GooglePrivacyDlpV2beta1Finding]): Self = this.set("findings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindings: Self = this.set("findings", js.undefined)
    @scala.inline
    def setFindingsTruncated(value: Boolean): Self = this.set("findingsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingsTruncated: Self = this.set("findingsTruncated", js.undefined)
  }
  
}

