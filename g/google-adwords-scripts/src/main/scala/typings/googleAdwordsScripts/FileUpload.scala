package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUpload extends BulkUpload[FileUpload] {
  @JSName("apply")
  def apply(): Unit = js.native
}

object FileUpload {
  @scala.inline
  def apply(
    apply: () => Unit,
    forCampaignManagement: () => FileUpload,
    forOfflineConversions: () => FileUpload,
    preview: () => Unit,
    setFileName: String => FileUpload
  ): FileUpload = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction0(apply), forCampaignManagement = js.Any.fromFunction0(forCampaignManagement), forOfflineConversions = js.Any.fromFunction0(forOfflineConversions), preview = js.Any.fromFunction0(preview), setFileName = js.Any.fromFunction1(setFileName))
    __obj.asInstanceOf[FileUpload]
  }
  @scala.inline
  implicit class FileUploadOps[Self <: FileUpload] (val x: Self) extends AnyVal {
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
    def setApply(value: () => Unit): Self = this.set("apply", js.Any.fromFunction0(value))
  }
  
}

