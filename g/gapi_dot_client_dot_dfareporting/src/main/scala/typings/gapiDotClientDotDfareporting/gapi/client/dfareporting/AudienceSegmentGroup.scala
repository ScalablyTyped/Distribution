package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudienceSegmentGroup extends js.Object {
  /** Audience segments assigned to this group. The number of segments must be between 2 and 100. */
  var audienceSegments: js.UndefOr[js.Array[AudienceSegment]] = js.undefined
  /** ID of this audience segment group. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Name of this audience segment group. This is a required field and must be less than 65 characters long. */
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

