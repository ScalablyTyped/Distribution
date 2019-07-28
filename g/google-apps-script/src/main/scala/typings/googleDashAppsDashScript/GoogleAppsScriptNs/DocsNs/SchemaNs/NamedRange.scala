package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedRange extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var namedRangeId: js.UndefOr[String] = js.undefined
  var ranges: js.UndefOr[js.Array[Range]] = js.undefined
}

object NamedRange {
  @scala.inline
  def apply(name: String = null, namedRangeId: String = null, ranges: js.Array[Range] = null): NamedRange = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId)
    if (ranges != null) __obj.updateDynamic("ranges")(ranges)
    __obj.asInstanceOf[NamedRange]
  }
}

