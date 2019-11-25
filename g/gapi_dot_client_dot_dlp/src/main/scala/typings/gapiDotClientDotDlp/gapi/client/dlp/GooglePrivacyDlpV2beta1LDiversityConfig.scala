package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1LDiversityConfig extends js.Object {
  /**
    * Set of quasi-identifiers indicating how equivalence classes are
    * defined for the l-diversity computation. When multiple fields are
    * specified, they are considered a single composite key.
    */
  var quasiIds: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldId]] = js.undefined
  /** Sensitive field for computing the l-value. */
  var sensitiveAttribute: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.undefined
}

object GooglePrivacyDlpV2beta1LDiversityConfig {
  @scala.inline
  def apply(
    quasiIds: js.Array[GooglePrivacyDlpV2beta1FieldId] = null,
    sensitiveAttribute: GooglePrivacyDlpV2beta1FieldId = null
  ): GooglePrivacyDlpV2beta1LDiversityConfig = {
    val __obj = js.Dynamic.literal()
    if (quasiIds != null) __obj.updateDynamic("quasiIds")(quasiIds.asInstanceOf[js.Any])
    if (sensitiveAttribute != null) __obj.updateDynamic("sensitiveAttribute")(sensitiveAttribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1LDiversityConfig]
  }
}

