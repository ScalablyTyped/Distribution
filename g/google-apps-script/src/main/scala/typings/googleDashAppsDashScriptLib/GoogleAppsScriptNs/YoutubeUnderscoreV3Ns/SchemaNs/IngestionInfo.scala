package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IngestionInfo extends js.Object {
  var backupIngestionAddress: js.UndefOr[java.lang.String] = js.undefined
  var ingestionAddress: js.UndefOr[java.lang.String] = js.undefined
  var streamName: js.UndefOr[java.lang.String] = js.undefined
}

object IngestionInfo {
  @scala.inline
  def apply(
    backupIngestionAddress: java.lang.String = null,
    ingestionAddress: java.lang.String = null,
    streamName: java.lang.String = null
  ): IngestionInfo = {
    val __obj = js.Dynamic.literal()
    if (backupIngestionAddress != null) __obj.updateDynamic("backupIngestionAddress")(backupIngestionAddress)
    if (ingestionAddress != null) __obj.updateDynamic("ingestionAddress")(ingestionAddress)
    if (streamName != null) __obj.updateDynamic("streamName")(streamName)
    __obj.asInstanceOf[IngestionInfo]
  }
}

