package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1RecordCondition extends js.Object {
  var expressions: js.UndefOr[GooglePrivacyDlpV2beta1Expressions] = js.undefined
}

object GooglePrivacyDlpV2beta1RecordCondition {
  @scala.inline
  def apply(expressions: GooglePrivacyDlpV2beta1Expressions = null): GooglePrivacyDlpV2beta1RecordCondition = {
    val __obj = js.Dynamic.literal()
    if (expressions != null) __obj.updateDynamic("expressions")(expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1RecordCondition]
  }
}

