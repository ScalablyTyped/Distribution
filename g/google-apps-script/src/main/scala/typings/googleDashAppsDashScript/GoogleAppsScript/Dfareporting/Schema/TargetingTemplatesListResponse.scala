package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingTemplatesListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var targetingTemplates: js.UndefOr[js.Array[TargetingTemplate]] = js.undefined
}

object TargetingTemplatesListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    targetingTemplates: js.Array[TargetingTemplate] = null
  ): TargetingTemplatesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (targetingTemplates != null) __obj.updateDynamic("targetingTemplates")(targetingTemplates)
    __obj.asInstanceOf[TargetingTemplatesListResponse]
  }
}

