package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectFilter extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var objectIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object ObjectFilter {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    objectIds: js.Array[java.lang.String] = null,
    status: java.lang.String = null
  ): ObjectFilter = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ObjectFilter]
  }
}

