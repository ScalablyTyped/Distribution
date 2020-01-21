package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segment extends js.Object {
  var dynamicSegment: js.UndefOr[DynamicSegment] = js.undefined
  var segmentId: js.UndefOr[String] = js.undefined
}

object Segment {
  @scala.inline
  def apply(dynamicSegment: DynamicSegment = null, segmentId: String = null): Segment = {
    val __obj = js.Dynamic.literal()
    if (dynamicSegment != null) __obj.updateDynamic("dynamicSegment")(dynamicSegment.asInstanceOf[js.Any])
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
}

