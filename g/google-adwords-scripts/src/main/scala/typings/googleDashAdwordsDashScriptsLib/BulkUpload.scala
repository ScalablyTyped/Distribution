package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkUpload[T] extends js.Object {
  def forCampaignManagement(): T
  def forOfflineConversions(): T
  def preview(): scala.Unit
  def setFileName(fileName: java.lang.String): T
}

object BulkUpload {
  @scala.inline
  def apply[T](
    forCampaignManagement: js.Function0[T],
    forOfflineConversions: js.Function0[T],
    preview: js.Function0[scala.Unit],
    setFileName: js.Function1[java.lang.String, T]
  ): BulkUpload[T] = {
    val __obj = js.Dynamic.literal(forCampaignManagement = forCampaignManagement, forOfflineConversions = forOfflineConversions, preview = preview, setFileName = setFileName)
  
    __obj.asInstanceOf[BulkUpload[T]]
  }
}

