package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortedDimension extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
}

object SortedDimension {
  @scala.inline
  def apply(kind: java.lang.String = null, name: java.lang.String = null, sortOrder: java.lang.String = null): SortedDimension = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    __obj.asInstanceOf[SortedDimension]
  }
}

