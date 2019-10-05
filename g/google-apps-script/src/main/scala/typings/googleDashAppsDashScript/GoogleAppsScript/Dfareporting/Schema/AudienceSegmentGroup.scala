package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudienceSegmentGroup extends js.Object {
  var audienceSegments: js.UndefOr[js.Array[AudienceSegment]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object AudienceSegmentGroup {
  @scala.inline
  def apply(audienceSegments: js.Array[AudienceSegment] = null, id: String = null, name: String = null): AudienceSegmentGroup = {
    val __obj = js.Dynamic.literal()
    if (audienceSegments != null) __obj.updateDynamic("audienceSegments")(audienceSegments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AudienceSegmentGroup]
  }
}

