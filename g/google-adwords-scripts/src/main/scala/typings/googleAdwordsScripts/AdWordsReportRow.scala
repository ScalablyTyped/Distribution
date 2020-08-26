package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdWordsReportRow extends js.Object {
  def formatForUpload(): js.Object = js.native
}

object AdWordsReportRow {
  @scala.inline
  def apply(formatForUpload: () => js.Object): AdWordsReportRow = {
    val __obj = js.Dynamic.literal(formatForUpload = js.Any.fromFunction0(formatForUpload))
    __obj.asInstanceOf[AdWordsReportRow]
  }
  @scala.inline
  implicit class AdWordsReportRowOps[Self <: AdWordsReportRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormatForUpload(value: () => js.Object): Self = this.set("formatForUpload", js.Any.fromFunction0(value))
  }
  
}

