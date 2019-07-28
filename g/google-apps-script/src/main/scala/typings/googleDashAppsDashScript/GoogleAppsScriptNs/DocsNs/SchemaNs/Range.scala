package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var endIndex: js.UndefOr[Double] = js.undefined
  var segmentId: js.UndefOr[String] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
}

object Range {
  @scala.inline
  def apply(endIndex: Int | Double = null, segmentId: String = null, startIndex: Int | Double = null): Range = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

