package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkUpload[T] extends js.Object {
  def forCampaignManagement(): T = js.native
  def forOfflineConversions(): T = js.native
  def preview(): Unit = js.native
  def setFileName(fileName: String): T = js.native
}

object BulkUpload {
  @scala.inline
  def apply[T](
    forCampaignManagement: () => T,
    forOfflineConversions: () => T,
    preview: () => Unit,
    setFileName: String => T
  ): BulkUpload[T] = {
    val __obj = js.Dynamic.literal(forCampaignManagement = js.Any.fromFunction0(forCampaignManagement), forOfflineConversions = js.Any.fromFunction0(forOfflineConversions), preview = js.Any.fromFunction0(preview), setFileName = js.Any.fromFunction1(setFileName))
    __obj.asInstanceOf[BulkUpload[T]]
  }
  @scala.inline
  implicit class BulkUploadOps[Self <: BulkUpload[_], T] (val x: Self with BulkUpload[T]) extends AnyVal {
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
    def setForCampaignManagement(value: () => T): Self = this.set("forCampaignManagement", js.Any.fromFunction0(value))
    @scala.inline
    def setForOfflineConversions(value: () => T): Self = this.set("forOfflineConversions", js.Any.fromFunction0(value))
    @scala.inline
    def setPreview(value: () => Unit): Self = this.set("preview", js.Any.fromFunction0(value))
    @scala.inline
    def setSetFileName(value: String => T): Self = this.set("setFileName", js.Any.fromFunction1(value))
  }
  
}

