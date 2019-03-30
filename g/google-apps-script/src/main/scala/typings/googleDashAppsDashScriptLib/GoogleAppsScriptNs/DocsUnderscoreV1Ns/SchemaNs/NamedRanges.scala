package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedRanges extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var namedRanges: js.UndefOr[js.Array[NamedRange]] = js.undefined
}

object NamedRanges {
  @scala.inline
  def apply(name: java.lang.String = null, namedRanges: js.Array[NamedRange] = null): NamedRanges = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (namedRanges != null) __obj.updateDynamic("namedRanges")(namedRanges)
    __obj.asInstanceOf[NamedRanges]
  }
}

