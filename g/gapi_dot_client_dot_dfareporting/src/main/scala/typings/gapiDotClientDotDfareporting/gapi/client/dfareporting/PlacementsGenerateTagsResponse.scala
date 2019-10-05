package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementsGenerateTagsResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#placementsGenerateTagsResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Set of generated tags for the specified placements. */
  var placementTags: js.UndefOr[js.Array[PlacementTag]] = js.undefined
}

object PlacementsGenerateTagsResponse {
  @scala.inline
  def apply(kind: String = null, placementTags: js.Array[PlacementTag] = null): PlacementsGenerateTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (placementTags != null) __obj.updateDynamic("placementTags")(placementTags)
    __obj.asInstanceOf[PlacementsGenerateTagsResponse]
  }
}

