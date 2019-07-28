package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1RecordSuppression extends js.Object {
  var condition: js.UndefOr[GooglePrivacyDlpV2beta1RecordCondition] = js.undefined
}

object GooglePrivacyDlpV2beta1RecordSuppression {
  @scala.inline
  def apply(condition: GooglePrivacyDlpV2beta1RecordCondition = null): GooglePrivacyDlpV2beta1RecordSuppression = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1RecordSuppression]
  }
}

