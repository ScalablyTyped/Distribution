package typings.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Analytics stats of a Dynamic Link for a given timeframe.
  */
@js.native
trait Schema$DynamicLinkStats extends js.Object {
  /**
    * Dynamic Link event stats.
    */
  var linkEventStats: js.UndefOr[js.Array[Schema$DynamicLinkEventStat]] = js.native
}

object Schema$DynamicLinkStats {
  @scala.inline
  def apply(linkEventStats: js.Array[Schema$DynamicLinkEventStat] = null): Schema$DynamicLinkStats = {
    val __obj = js.Dynamic.literal()
    if (linkEventStats != null) __obj.updateDynamic("linkEventStats")(linkEventStats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DynamicLinkStats]
  }
}

