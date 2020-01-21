package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaStreetSegmentList extends js.Object {
  var segments: js.UndefOr[js.Array[SchemaStreetSegment]] = js.native
}

object SchemaStreetSegmentList {
  @scala.inline
  def apply(segments: js.Array[SchemaStreetSegment] = null): SchemaStreetSegmentList = {
    val __obj = js.Dynamic.literal()
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStreetSegmentList]
  }
}

