package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Placement Tag
  */
@js.native
trait Schema$PlacementTag extends js.Object {
  /**
    * Placement ID
    */
  var placementId: js.UndefOr[String] = js.native
  /**
    * Tags generated for this placement.
    */
  var tagDatas: js.UndefOr[js.Array[Schema$TagData]] = js.native
}

object Schema$PlacementTag {
  @scala.inline
  def apply(placementId: String = null, tagDatas: js.Array[Schema$TagData] = null): Schema$PlacementTag = {
    val __obj = js.Dynamic.literal()
    if (placementId != null) __obj.updateDynamic("placementId")(placementId.asInstanceOf[js.Any])
    if (tagDatas != null) __obj.updateDynamic("tagDatas")(tagDatas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlacementTag]
  }
}

