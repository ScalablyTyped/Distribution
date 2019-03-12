package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUpload extends BulkUpload[FileUpload] {
  @JSName("apply")
  def apply(): scala.Unit
}

object FileUpload {
  @scala.inline
  def apply(
    apply: () => scala.Unit,
    forCampaignManagement: () => FileUpload,
    forOfflineConversions: () => FileUpload,
    preview: () => scala.Unit,
    setFileName: java.lang.String => FileUpload
  ): FileUpload = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction0(apply), forCampaignManagement = js.Any.fromFunction0(forCampaignManagement), forOfflineConversions = js.Any.fromFunction0(forOfflineConversions), preview = js.Any.fromFunction0(preview), setFileName = js.Any.fromFunction1(setFileName))
  
    __obj.asInstanceOf[FileUpload]
  }
}

