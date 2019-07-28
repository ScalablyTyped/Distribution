package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsReportRow extends js.Object {
  def formatForUpload(): js.Object
}

object AdWordsReportRow {
  @scala.inline
  def apply(formatForUpload: () => js.Object): AdWordsReportRow = {
    val __obj = js.Dynamic.literal(formatForUpload = js.Any.fromFunction0(formatForUpload))
  
    __obj.asInstanceOf[AdWordsReportRow]
  }
}

