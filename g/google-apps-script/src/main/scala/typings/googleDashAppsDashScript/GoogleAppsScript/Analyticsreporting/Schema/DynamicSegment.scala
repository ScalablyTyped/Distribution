package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicSegment extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var sessionSegment: js.UndefOr[SegmentDefinition] = js.undefined
  var userSegment: js.UndefOr[SegmentDefinition] = js.undefined
}

object DynamicSegment {
  @scala.inline
  def apply(
    name: String = null,
    sessionSegment: SegmentDefinition = null,
    userSegment: SegmentDefinition = null
  ): DynamicSegment = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sessionSegment != null) __obj.updateDynamic("sessionSegment")(sessionSegment.asInstanceOf[js.Any])
    if (userSegment != null) __obj.updateDynamic("userSegment")(userSegment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicSegment]
  }
}

