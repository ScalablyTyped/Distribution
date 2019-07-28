package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedRanges extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var namedRanges: js.UndefOr[js.Array[NamedRange]] = js.undefined
}

object NamedRanges {
  @scala.inline
  def apply(name: String = null, namedRanges: js.Array[NamedRange] = null): NamedRanges = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (namedRanges != null) __obj.updateDynamic("namedRanges")(namedRanges)
    __obj.asInstanceOf[NamedRanges]
  }
}

