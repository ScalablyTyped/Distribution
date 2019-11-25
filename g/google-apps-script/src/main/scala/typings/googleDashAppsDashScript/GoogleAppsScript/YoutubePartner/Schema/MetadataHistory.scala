package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataHistory extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[Metadata] = js.undefined
  var origination: js.UndefOr[Origination] = js.undefined
  var timeProvided: js.UndefOr[String] = js.undefined
}

object MetadataHistory {
  @scala.inline
  def apply(
    kind: String = null,
    metadata: Metadata = null,
    origination: Origination = null,
    timeProvided: String = null
  ): MetadataHistory = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (origination != null) __obj.updateDynamic("origination")(origination.asInstanceOf[js.Any])
    if (timeProvided != null) __obj.updateDynamic("timeProvided")(timeProvided.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataHistory]
  }
}

