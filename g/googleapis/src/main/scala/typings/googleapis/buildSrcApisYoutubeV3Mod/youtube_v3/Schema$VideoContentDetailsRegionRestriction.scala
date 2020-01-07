package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED Region restriction of the video.
  */
@js.native
trait Schema$VideoContentDetailsRegionRestriction extends js.Object {
  /**
    * A list of region codes that identify countries where the video is
    * viewable. If this property is present and a country is not listed in its
    * value, then the video is blocked from appearing in that country. If this
    * property is present and contains an empty list, the video is blocked in
    * all countries.
    */
  var allowed: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of region codes that identify countries where the video is
    * blocked. If this property is present and a country is not listed in its
    * value, then the video is viewable in that country. If this property is
    * present and contains an empty list, the video is viewable in all
    * countries.
    */
  var blocked: js.UndefOr[js.Array[String]] = js.native
}

object Schema$VideoContentDetailsRegionRestriction {
  @scala.inline
  def apply(allowed: js.Array[String] = null, blocked: js.Array[String] = null): Schema$VideoContentDetailsRegionRestriction = {
    val __obj = js.Dynamic.literal()
    if (allowed != null) __obj.updateDynamic("allowed")(allowed.asInstanceOf[js.Any])
    if (blocked != null) __obj.updateDynamic("blocked")(blocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoContentDetailsRegionRestriction]
  }
}

