package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$StreetSegmentList extends js.Object {
  var segments: js.UndefOr[js.Array[Schema$StreetSegment]] = js.native
}

object Schema$StreetSegmentList {
  @scala.inline
  def apply(segments: js.Array[Schema$StreetSegment] = null): Schema$StreetSegmentList = {
    val __obj = js.Dynamic.literal()
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StreetSegmentList]
  }
}

