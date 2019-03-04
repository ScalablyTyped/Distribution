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
    apply: js.Function0[scala.Unit],
    forCampaignManagement: js.Function0[FileUpload],
    forOfflineConversions: js.Function0[FileUpload],
    preview: js.Function0[scala.Unit],
    setFileName: js.Function1[java.lang.String, FileUpload]
  ): FileUpload = {
    val __obj = js.Dynamic.literal(apply = apply, forCampaignManagement = forCampaignManagement, forOfflineConversions = forOfflineConversions, preview = preview, setFileName = setFileName)
  
    __obj.asInstanceOf[FileUpload]
  }
}

