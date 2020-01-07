package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection that informs the user the number of times a particular
  * `TransformationResultCode` and error details occurred.
  */
@js.native
trait Schema$GooglePrivacyDlpV2SummaryResult extends js.Object {
  var code: js.UndefOr[String] = js.native
  var count: js.UndefOr[String] = js.native
  /**
    * A place for warnings or errors to show up if a transformation didn&#39;t
    * work as expected.
    */
  var details: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2SummaryResult {
  @scala.inline
  def apply(code: String = null, count: String = null, details: String = null): Schema$GooglePrivacyDlpV2SummaryResult = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2SummaryResult]
  }
}

