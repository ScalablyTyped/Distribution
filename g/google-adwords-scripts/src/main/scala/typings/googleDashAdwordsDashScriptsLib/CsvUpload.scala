package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvUpload extends BulkUpload[CsvUpload] {
  def append(row: js.Object): CsvUpload
  @JSName("apply")
  def apply(): scala.Unit
}

object CsvUpload {
  @scala.inline
  def apply(
    append: js.Function1[js.Object, CsvUpload],
    apply: js.Function0[scala.Unit],
    forCampaignManagement: js.Function0[CsvUpload],
    forOfflineConversions: js.Function0[CsvUpload],
    preview: js.Function0[scala.Unit],
    setFileName: js.Function1[java.lang.String, CsvUpload]
  ): CsvUpload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("append")(append)
    __obj.updateDynamic("apply")(apply)
    __obj.updateDynamic("forCampaignManagement")(forCampaignManagement)
    __obj.updateDynamic("forOfflineConversions")(forOfflineConversions)
    __obj.updateDynamic("preview")(preview)
    __obj.updateDynamic("setFileName")(setFileName)
    __obj.asInstanceOf[CsvUpload]
  }
}

