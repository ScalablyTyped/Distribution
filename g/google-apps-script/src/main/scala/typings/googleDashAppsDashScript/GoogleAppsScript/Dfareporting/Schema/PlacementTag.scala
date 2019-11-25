package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementTag extends js.Object {
  var placementId: js.UndefOr[String] = js.undefined
  var tagDatas: js.UndefOr[js.Array[TagData]] = js.undefined
}

object PlacementTag {
  @scala.inline
  def apply(placementId: String = null, tagDatas: js.Array[TagData] = null): PlacementTag = {
    val __obj = js.Dynamic.literal()
    if (placementId != null) __obj.updateDynamic("placementId")(placementId.asInstanceOf[js.Any])
    if (tagDatas != null) __obj.updateDynamic("tagDatas")(tagDatas.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementTag]
  }
}

