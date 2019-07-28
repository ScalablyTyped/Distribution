package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeGroupsListResponse extends js.Object {
  var creativeGroups: js.UndefOr[js.Array[CreativeGroup]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object CreativeGroupsListResponse {
  @scala.inline
  def apply(creativeGroups: js.Array[CreativeGroup] = null, kind: String = null, nextPageToken: String = null): CreativeGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (creativeGroups != null) __obj.updateDynamic("creativeGroups")(creativeGroups)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[CreativeGroupsListResponse]
  }
}

