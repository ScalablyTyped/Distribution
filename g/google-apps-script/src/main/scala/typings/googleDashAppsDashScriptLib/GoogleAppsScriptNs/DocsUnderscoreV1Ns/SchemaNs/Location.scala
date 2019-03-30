package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  var segmentId: js.UndefOr[java.lang.String] = js.undefined
}

object Location {
  @scala.inline
  def apply(index: scala.Int | scala.Double = null, segmentId: java.lang.String = null): Location = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId)
    __obj.asInstanceOf[Location]
  }
}

