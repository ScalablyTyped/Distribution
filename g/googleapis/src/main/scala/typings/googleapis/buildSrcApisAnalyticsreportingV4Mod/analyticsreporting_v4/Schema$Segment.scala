package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The segment definition, if the report needs to be segmented. A Segment is a
  * subset of the Analytics data. For example, of the entire set of users, one
  * Segment might be users from a particular country or city.
  */
@js.native
trait Schema$Segment extends js.Object {
  /**
    * A dynamic segment definition in the request.
    */
  var dynamicSegment: js.UndefOr[Schema$DynamicSegment] = js.native
  /**
    * The segment ID of a built-in or custom segment, for example `gaid::-3`.
    */
  var segmentId: js.UndefOr[String] = js.native
}

object Schema$Segment {
  @scala.inline
  def apply(dynamicSegment: Schema$DynamicSegment = null, segmentId: String = null): Schema$Segment = {
    val __obj = js.Dynamic.literal()
    if (dynamicSegment != null) __obj.updateDynamic("dynamicSegment")(dynamicSegment.asInstanceOf[js.Any])
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Segment]
  }
}

