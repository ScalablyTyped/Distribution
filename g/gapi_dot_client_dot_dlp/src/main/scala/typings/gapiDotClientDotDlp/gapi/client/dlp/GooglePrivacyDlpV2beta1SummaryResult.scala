package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1SummaryResult extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var count: js.UndefOr[String] = js.undefined
  /**
    * A place for warnings or errors to show up if a transformation didn't
    * work as expected.
    */
  var details: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1SummaryResult {
  @scala.inline
  def apply(code: String = null, count: String = null, details: String = null): GooglePrivacyDlpV2beta1SummaryResult = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1SummaryResult]
  }
}

