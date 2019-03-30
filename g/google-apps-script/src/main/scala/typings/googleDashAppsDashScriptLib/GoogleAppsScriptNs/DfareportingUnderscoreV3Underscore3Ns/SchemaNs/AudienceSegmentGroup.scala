package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudienceSegmentGroup extends js.Object {
  var audienceSegments: js.UndefOr[js.Array[AudienceSegment]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object AudienceSegmentGroup {
  @scala.inline
  def apply(
    audienceSegments: js.Array[AudienceSegment] = null,
    id: java.lang.String = null,
    name: java.lang.String = null
  ): AudienceSegmentGroup = {
    val __obj = js.Dynamic.literal()
    if (audienceSegments != null) __obj.updateDynamic("audienceSegments")(audienceSegments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AudienceSegmentGroup]
  }
}

