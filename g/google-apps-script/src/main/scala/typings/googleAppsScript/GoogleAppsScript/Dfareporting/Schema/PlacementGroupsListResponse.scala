package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementGroupsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var placementGroups: js.UndefOr[js.Array[PlacementGroup]] = js.undefined
}

object PlacementGroupsListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    placementGroups: js.Array[PlacementGroup] = null
  ): PlacementGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (placementGroups != null) __obj.updateDynamic("placementGroups")(placementGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementGroupsListResponse]
  }
}

