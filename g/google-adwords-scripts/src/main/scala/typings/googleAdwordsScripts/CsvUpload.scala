package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CsvUpload extends BulkUpload[CsvUpload] {
  def append(row: js.Object): CsvUpload = js.native
  @JSName("apply")
  def apply(): Unit = js.native
}

object CsvUpload {
  @scala.inline
  def apply(
    append: js.Object => CsvUpload,
    apply: () => Unit,
    forCampaignManagement: () => CsvUpload,
    forOfflineConversions: () => CsvUpload,
    preview: () => Unit,
    setFileName: String => CsvUpload
  ): CsvUpload = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), apply = js.Any.fromFunction0(apply), forCampaignManagement = js.Any.fromFunction0(forCampaignManagement), forOfflineConversions = js.Any.fromFunction0(forOfflineConversions), preview = js.Any.fromFunction0(preview), setFileName = js.Any.fromFunction1(setFileName))
    __obj.asInstanceOf[CsvUpload]
  }
  @scala.inline
  implicit class CsvUploadOps[Self <: CsvUpload] (val x: Self) extends AnyVal {
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
    def setAppend(value: js.Object => CsvUpload): Self = this.set("append", js.Any.fromFunction1(value))
    @scala.inline
    def setApply(value: () => Unit): Self = this.set("apply", js.Any.fromFunction0(value))
  }
  
}

