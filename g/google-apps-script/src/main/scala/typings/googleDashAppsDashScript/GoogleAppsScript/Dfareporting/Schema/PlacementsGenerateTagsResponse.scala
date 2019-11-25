package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementsGenerateTagsResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var placementTags: js.UndefOr[js.Array[PlacementTag]] = js.undefined
}

object PlacementsGenerateTagsResponse {
  @scala.inline
  def apply(kind: String = null, placementTags: js.Array[PlacementTag] = null): PlacementsGenerateTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (placementTags != null) __obj.updateDynamic("placementTags")(placementTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementsGenerateTagsResponse]
  }
}

