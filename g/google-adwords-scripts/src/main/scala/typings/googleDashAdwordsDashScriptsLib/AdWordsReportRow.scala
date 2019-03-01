package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsReportRow extends js.Object {
  def formatForUpload(): js.Object
}

object AdWordsReportRow {
  @scala.inline
  def apply(formatForUpload: js.Function0[js.Object]): AdWordsReportRow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("formatForUpload")(formatForUpload)
    __obj.asInstanceOf[AdWordsReportRow]
  }
}

