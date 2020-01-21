package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1Conditions extends js.Object {
  var conditions: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Condition]] = js.undefined
}

object GooglePrivacyDlpV2beta1Conditions {
  @scala.inline
  def apply(conditions: js.Array[GooglePrivacyDlpV2beta1Condition] = null): GooglePrivacyDlpV2beta1Conditions = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Conditions]
  }
}

