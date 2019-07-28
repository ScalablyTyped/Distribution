package typings.gapiDotClientDotAnalyticsreporting.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segment extends js.Object {
  /** A dynamic segment definition in the request. */
  var dynamicSegment: js.UndefOr[DynamicSegment] = js.undefined
  /** The segment ID of a built-in or custom segment, for example `gaid::-3`. */
  var segmentId: js.UndefOr[String] = js.undefined
}

object Segment {
  @scala.inline
  def apply(dynamicSegment: DynamicSegment = null, segmentId: String = null): Segment = {
    val __obj = js.Dynamic.literal()
    if (dynamicSegment != null) __obj.updateDynamic("dynamicSegment")(dynamicSegment)
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId)
    __obj.asInstanceOf[Segment]
  }
}

