package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1ReplaceConfig extends js.Object {
  /**
    * Type of information to replace. Only one ReplaceConfig per info_type
    * should be provided. If ReplaceConfig does not have an info_type, the DLP
    * API matches it against all info_types that are found but not specified in
    * another ReplaceConfig.
    */
  var infoType: js.UndefOr[GooglePrivacyDlpV2beta1InfoType] = js.undefined
  /** Content replacing sensitive information of given type. Max 256 chars. */
  var replaceWith: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1ReplaceConfig {
  @scala.inline
  def apply(infoType: GooglePrivacyDlpV2beta1InfoType = null, replaceWith: String = null): GooglePrivacyDlpV2beta1ReplaceConfig = {
    val __obj = js.Dynamic.literal()
    if (infoType != null) __obj.updateDynamic("infoType")(infoType)
    if (replaceWith != null) __obj.updateDynamic("replaceWith")(replaceWith)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1ReplaceConfig]
  }
}

