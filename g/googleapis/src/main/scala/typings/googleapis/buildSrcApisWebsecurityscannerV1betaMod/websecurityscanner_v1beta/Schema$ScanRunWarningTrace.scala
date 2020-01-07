package typings.googleapis.buildSrcApisWebsecurityscannerV1betaMod.websecurityscanner_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only. Defines a warning trace message for ScanRun. Warning traces
  * provide customers with useful information that helps make the scanning
  * process more effective.
  */
@js.native
trait Schema$ScanRunWarningTrace extends js.Object {
  /**
    * Output only. Indicates the warning code.
    */
  var code: js.UndefOr[String] = js.native
}

object Schema$ScanRunWarningTrace {
  @scala.inline
  def apply(code: String = null): Schema$ScanRunWarningTrace = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ScanRunWarningTrace]
  }
}

