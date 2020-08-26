package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1Bucket extends js.Object {
  /** Upper bound of the range, exclusive; type must match min. */
  var max: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.native
  /**
    * Lower bound of the range, inclusive. Type should be the same as max if
    * used.
    */
  var min: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.native
  /**
    * Replacement value for this bucket. If not provided
    * the default behavior will be to hyphenate the min-max range.
    */
  var replacementValue: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.native
}

object GooglePrivacyDlpV2beta1Bucket {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Bucket]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1BucketOps[Self <: GooglePrivacyDlpV2beta1Bucket] (val x: Self) extends AnyVal {
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
    def setMax(value: GooglePrivacyDlpV2beta1Value): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: GooglePrivacyDlpV2beta1Value): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setReplacementValue(value: GooglePrivacyDlpV2beta1Value): Self = this.set("replacementValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplacementValue: Self = this.set("replacementValue", js.undefined)
  }
  
}

