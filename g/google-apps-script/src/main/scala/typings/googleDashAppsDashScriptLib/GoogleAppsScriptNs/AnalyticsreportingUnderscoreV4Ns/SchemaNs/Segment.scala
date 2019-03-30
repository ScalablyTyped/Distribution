package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segment extends js.Object {
  var dynamicSegment: js.UndefOr[DynamicSegment] = js.undefined
  var segmentId: js.UndefOr[java.lang.String] = js.undefined
}

object Segment {
  @scala.inline
  def apply(dynamicSegment: DynamicSegment = null, segmentId: java.lang.String = null): Segment = {
    val __obj = js.Dynamic.literal()
    if (dynamicSegment != null) __obj.updateDynamic("dynamicSegment")(dynamicSegment)
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId)
    __obj.asInstanceOf[Segment]
  }
}

