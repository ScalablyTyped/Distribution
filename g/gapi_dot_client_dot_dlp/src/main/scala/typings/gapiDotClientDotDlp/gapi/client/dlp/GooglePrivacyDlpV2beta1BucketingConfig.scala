package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1BucketingConfig extends js.Object {
  var buckets: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Bucket]] = js.undefined
}

object GooglePrivacyDlpV2beta1BucketingConfig {
  @scala.inline
  def apply(buckets: js.Array[GooglePrivacyDlpV2beta1Bucket] = null): GooglePrivacyDlpV2beta1BucketingConfig = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1BucketingConfig]
  }
}

