package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataHistory extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var metadata: js.UndefOr[Metadata] = js.undefined
  var origination: js.UndefOr[Origination] = js.undefined
  var timeProvided: js.UndefOr[java.lang.String] = js.undefined
}

object MetadataHistory {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    metadata: Metadata = null,
    origination: Origination = null,
    timeProvided: java.lang.String = null
  ): MetadataHistory = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (origination != null) __obj.updateDynamic("origination")(origination)
    if (timeProvided != null) __obj.updateDynamic("timeProvided")(timeProvided)
    __obj.asInstanceOf[MetadataHistory]
  }
}

