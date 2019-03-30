package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementGroupsListResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var placementGroups: js.UndefOr[js.Array[PlacementGroup]] = js.undefined
}

object PlacementGroupsListResponse {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    placementGroups: js.Array[PlacementGroup] = null
  ): PlacementGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (placementGroups != null) __obj.updateDynamic("placementGroups")(placementGroups)
    __obj.asInstanceOf[PlacementGroupsListResponse]
  }
}

