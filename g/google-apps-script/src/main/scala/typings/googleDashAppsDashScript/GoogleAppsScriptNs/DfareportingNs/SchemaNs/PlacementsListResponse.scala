package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var placements: js.UndefOr[js.Array[Placement]] = js.undefined
}

object PlacementsListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, placements: js.Array[Placement] = null): PlacementsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (placements != null) __obj.updateDynamic("placements")(placements)
    __obj.asInstanceOf[PlacementsListResponse]
  }
}

