package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Placement GenerateTags Response
  */
@js.native
trait Schema$PlacementsGenerateTagsResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placementsGenerateTagsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Set of generated tags for the specified placements.
    */
  var placementTags: js.UndefOr[js.Array[Schema$PlacementTag]] = js.native
}

object Schema$PlacementsGenerateTagsResponse {
  @scala.inline
  def apply(kind: String = null, placementTags: js.Array[Schema$PlacementTag] = null): Schema$PlacementsGenerateTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (placementTags != null) __obj.updateDynamic("placementTags")(placementTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlacementsGenerateTagsResponse]
  }
}

