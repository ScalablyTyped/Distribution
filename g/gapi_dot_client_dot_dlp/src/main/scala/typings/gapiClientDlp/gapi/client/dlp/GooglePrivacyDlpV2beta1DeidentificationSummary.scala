package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1DeidentificationSummary extends js.Object {
  /** Transformations applied to the dataset. */
  var transformationSummaries: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1TransformationSummary]] = js.native
  /** Total size in bytes that were transformed in some way. */
  var transformedBytes: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1DeidentificationSummary {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1DeidentificationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1DeidentificationSummary]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1DeidentificationSummaryOps[Self <: GooglePrivacyDlpV2beta1DeidentificationSummary] (val x: Self) extends AnyVal {
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
    def setTransformationSummariesVarargs(value: GooglePrivacyDlpV2beta1TransformationSummary*): Self = this.set("transformationSummaries", js.Array(value :_*))
    @scala.inline
    def setTransformationSummaries(value: js.Array[GooglePrivacyDlpV2beta1TransformationSummary]): Self = this.set("transformationSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformationSummaries: Self = this.set("transformationSummaries", js.undefined)
    @scala.inline
    def setTransformedBytes(value: String): Self = this.set("transformedBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformedBytes: Self = this.set("transformedBytes", js.undefined)
  }
  
}

