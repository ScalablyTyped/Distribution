package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkUpload[T] extends js.Object {
  def forCampaignManagement(): T
  def forOfflineConversions(): T
  def preview(): Unit
  def setFileName(fileName: String): T
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
}

