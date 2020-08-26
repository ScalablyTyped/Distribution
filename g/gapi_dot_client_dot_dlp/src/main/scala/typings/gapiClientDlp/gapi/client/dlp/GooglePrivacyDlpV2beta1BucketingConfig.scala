package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1BucketingConfig extends js.Object {
  var buckets: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Bucket]] = js.native
}

object GooglePrivacyDlpV2beta1BucketingConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1BucketingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1BucketingConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1BucketingConfigOps[Self <: GooglePrivacyDlpV2beta1BucketingConfig] (val x: Self) extends AnyVal {
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
    def setBucketsVarargs(value: GooglePrivacyDlpV2beta1Bucket*): Self = this.set("buckets", js.Array(value :_*))
    @scala.inline
    def setBuckets(value: js.Array[GooglePrivacyDlpV2beta1Bucket]): Self = this.set("buckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuckets: Self = this.set("buckets", js.undefined)
  }
  
}

