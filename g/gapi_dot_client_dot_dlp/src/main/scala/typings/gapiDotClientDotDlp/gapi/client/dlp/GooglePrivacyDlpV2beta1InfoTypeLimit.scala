package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1InfoTypeLimit extends js.Object {
  /**
    * Type of information the findings limit applies to. Only one limit per
    * info_type should be provided. If InfoTypeLimit does not have an
    * info_type, the DLP API applies the limit against all info_types that are
    * found but not specified in another InfoTypeLimit.
    */
  var infoType: js.UndefOr[GooglePrivacyDlpV2beta1InfoType] = js.undefined
  /** Max findings limit for the given infoType. */
  var maxFindings: js.UndefOr[Double] = js.undefined
}

object GooglePrivacyDlpV2beta1InfoTypeLimit {
  @scala.inline
  def apply(infoType: GooglePrivacyDlpV2beta1InfoType = null, maxFindings: Int | Double = null): GooglePrivacyDlpV2beta1InfoTypeLimit = {
    val __obj = js.Dynamic.literal()
    if (infoType != null) __obj.updateDynamic("infoType")(infoType.asInstanceOf[js.Any])
    if (maxFindings != null) __obj.updateDynamic("maxFindings")(maxFindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InfoTypeLimit]
  }
}

