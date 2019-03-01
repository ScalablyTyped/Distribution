package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1SummaryResult extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var count: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A place for warnings or errors to show up if a transformation didn't
    * work as expected.
    */
  var details: js.UndefOr[java.lang.String] = js.undefined
}

object GooglePrivacyDlpV2beta1SummaryResult {
  @scala.inline
  def apply(code: java.lang.String = null, count: java.lang.String = null, details: java.lang.String = null): GooglePrivacyDlpV2beta1SummaryResult = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (count != null) __obj.updateDynamic("count")(count)
    if (details != null) __obj.updateDynamic("details")(details)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1SummaryResult]
  }
}

