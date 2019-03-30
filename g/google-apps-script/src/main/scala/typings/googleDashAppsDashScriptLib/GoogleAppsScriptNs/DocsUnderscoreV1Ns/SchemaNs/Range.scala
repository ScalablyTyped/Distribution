package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var endIndex: js.UndefOr[scala.Double] = js.undefined
  var segmentId: js.UndefOr[java.lang.String] = js.undefined
  var startIndex: js.UndefOr[scala.Double] = js.undefined
}

object Range {
  @scala.inline
  def apply(
    endIndex: scala.Int | scala.Double = null,
    segmentId: java.lang.String = null,
    startIndex: scala.Int | scala.Double = null
  ): Range = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

