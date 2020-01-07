package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * l-diversity metric, used for analysis of reidentification risk.
  */
@js.native
trait Schema$GooglePrivacyDlpV2LDiversityConfig extends js.Object {
  /**
    * Set of quasi-identifiers indicating how equivalence classes are defined
    * for the l-diversity computation. When multiple fields are specified, they
    * are considered a single composite key.
    */
  var quasiIds: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2FieldId]] = js.native
  /**
    * Sensitive field for computing the l-value.
    */
  var sensitiveAttribute: js.UndefOr[Schema$GooglePrivacyDlpV2FieldId] = js.native
}

object Schema$GooglePrivacyDlpV2LDiversityConfig {
  @scala.inline
  def apply(
    quasiIds: js.Array[Schema$GooglePrivacyDlpV2FieldId] = null,
    sensitiveAttribute: Schema$GooglePrivacyDlpV2FieldId = null
  ): Schema$GooglePrivacyDlpV2LDiversityConfig = {
    val __obj = js.Dynamic.literal()
    if (quasiIds != null) __obj.updateDynamic("quasiIds")(quasiIds.asInstanceOf[js.Any])
    if (sensitiveAttribute != null) __obj.updateDynamic("sensitiveAttribute")(sensitiveAttribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2LDiversityConfig]
  }
}

